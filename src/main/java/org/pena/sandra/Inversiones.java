package org.pena.sandra;

/**
 * @author Sandra Pena.
 * @version Abril de 2015.
 */
public class Inversiones {
    /**
     * Procesa el arreglo y cuenta las inversiones
     */
    public long countSplitInversion(int[] v) {
        int centro = v.length / 2;
        long contIzq; 
        long contDer; 
        long contMerge;
        
        if (v.length <= 1) { //si la lista tiene 1 o 0 elementos, no se procesa, devuelve 0
            return 0;
        }
    
        int[] izq = new int[centro];
        int[] der = new int[v.length - centro];

        for (int i = 0; i < centro; i++) //guardo los valores de la izquierda del vector
        {
            izq[i] = v[i];
        }
        for (int i = 0; i < v.length - centro; i++) // guardo los valores de la derecha del vector
        {
            der[i] = v[centro + i];
        }
        
        //Cuento recursivamente las inversiones en cada parte 
        contIzq = countSplitInversion(izq);
        contDer = countSplitInversion(der);

        int[] res = new int[v.length];
        contMerge = count(izq, der, res);

        for (int i = 0; i < v.length; i++) {
            v[i] = res[i];
        }

        return (contIzq + contDer + contMerge); //retorno el total de inversiones del vector

    }

     /**
     * Junto los dos subvectores (derecho e izquierdo)
     * Cuento inversiones de izquierdo con derecho
     */
    public long count(int[] izq, int[] der, int[] res) {
        int a = 0;
        int b = 0;
        long count = 0;
        int i;
        int j = 0;
        
        //cuento las inversiones que surjen del subvector izquierdo con el derecho
        while ((a < izq.length) && (b < der.length)) {
            if (izq[a] <= der[b]) {
                res[j] = izq[a++];
            } else {
                res[j] = der[b++];
                count += izq.length - a;
            }
            j++;
        }
        
       if (a == izq.length) {
            for (i = b; i < der.length; i++) {
                res[j++] = der[i];
            }
        } else {
            for (i = a; i < izq.length; i++) {
                res[j++] = izq[i];
            }
        }
        return count; //retorno cantidad de inversiones
    }
    
    public long getInvCount(int arr[], int n)
    {
      long inv_count = 0;
      int i, j;
     
      for(i = 0; i < n - 1; i++)
        for(j = i+1; j < n; j++)
          if(arr[i] > arr[j])
            inv_count++;
     
      return inv_count;
    }
    
}


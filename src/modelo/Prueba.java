package modelo;

/**
 * Prueba de la clase Arreglo.
 *
 * @author Ing. Valerio Frittelli.
 * @version Agosto 2004.
 */
public class Prueba {

    private static int n, op;
    private static long t1, t2, tf;
    private static Arreglo arreglo = new Arreglo();
    private static int[] v;

    /**
     * Punto de entrada de la aplicacion
     */
    public static void main(String[] args) {
        /*System.out.print ("Ingrese cantidad del elementos del vector: ");
         n = Consola.readInt ();
         */
        do {
            System.out.println("\nOpciones: ");
            System.out.println("0. Generar el Arreglo");
            System.out.println("1. Cantidad de inversiones");
            System.out.println("9. Salir");
            System.out.print("Ingrese opcion: ");
            op = Consola.readInt();

            switch (op) {
                case 0:
                    System.out.print("Ingrese cantidad del elementos del vector: ");
                    n = Consola.readInt();
                    System.out.print("\nSe genera el vector...");
                    v = arreglo.generar(n);
                    System.out.print("\nVector generado: ");
                    for (int i = 0; i < v.length; i += 1) {
                        System.out.print(" " + v[i]);
                    }
                    break;

                case 1:

                    if (v != null) {
                        int inv = arreglo.countSplitInversion(v);
                        System.out.print("Cantidad de inversiones:" + inv);
                    }
                    break;

                case 9: ;
            }
        } while (op != 9);

    }
}

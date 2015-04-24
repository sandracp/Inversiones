1- El objetivo de esta consigna es implementar y luego testear un algoritmo eficiente para el problema del Conteo de Inversiones en un Arreglo, que se basa en una defición sencilla: dado un arreglo v cualquiera de n componentes, se designa como una inversión a todo par de componentes ( v[i] , v[j] ) para el cual se cumpla que i < j pero v[i] > v[j]. En definitiva, una inversión es un par de componentes para el cual el elemento de la izquierda es mayor que el de la derecha. Ejemplo:

Sea v = {3, 5, 2, 7, 6, 8}  =>  hay  3  inversiones:  (3,2)  –  (5,2)  y  (7,6)

El problema del Conteo de Inversiones es entonces el siguiente: dado un arreglo v de n componentes, determinar cuántas inversiones tiene v.


2- Para el conteo de inversiones en un arrreglo, en la asignatura anterior se planteó un desafío similar y en el mismo simplemente se pedía aplicar una estrategia de fuerza bruta basada en el algoritmo de ordenamiento por Selección Directa. En esta nueva versión del desafío, se pide a los alumnos que desarrollen el algoritmo basado en divide y vencerás tal como se explicó en la ficha de clase correspondiente.

El archivo comprimido lotesD01.zip contiene 3 (tres) archivos de texto plano. Cada uno de ellos tiene grabada una secuencia aleatoria de números: el archivo lote01.txt contiene 250000 (doscientos cincuenta mil) números entre 1 y 250000 en forma desordenada. El archivo lote02.txt contiene 500000 (quinientos mil) números entre 1 y 500000 en forma desordenada. Y el archivo lote03.txt contiene 1000000 (un millón) de números entre 1 y 1000000 en forma desordenada.

En cada archivo los números se presentan a razón de uno por línea, con un salto de línea al final.

Con cada lote de prueba, se debe crear un arreglo unidimensional (vector) que contenga a cada uno de los n números que figuran en ese lote, y contar la cantidad de inversiones que ese arreglo tiene, aplicando la estrategia basada en divide y vencerás que se explicó en la ficha de estudio. Es decir, con el archivo lote01.txt debe crearse un arreglo con los 250000 números de ese archivo y determinar cuántas inversiones tenía ese vector, y luego repetir el proceso con los archivos restantes.

Los conteos así obtenidos, deben registrarse en cada uno de los 3 casilleros de respuesta que figuran en este cuestionario, en forma exacta. No deje espacios en blanco ni escriba ninguna palabra o caracter extraño: sólo escriba cada número entero que haya obtenido al procesar cada lote.

Como siempre, el cuestionario tiene la flexibilidad suficiente como para que el alumno pueda escribir una respuesta, presionar el botón "Siguiente", dejarla grabada y volver más tarde u otro día a completar el resto. Su intento de completar el desafío se dará por terminado cuando presione el botón "Enviar todo y terminar", en cuyo caso obtendrá de inmediato su calificación. Dispondrá de hasta 8(ocho) intentos para subir las respuestas correctas, quedando registrada la nota más alta. 

La idea de este Desafío en particular, está inspirada en tareas de programación similares, que surgen del material del curso "Design and Analysis of Algorithms I" – Stanford University (a cargo de Tim Roughgarden, Associate Professor): https://www.coursera.org/courses. 

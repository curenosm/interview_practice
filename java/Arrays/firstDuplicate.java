/*
    Given an array a that contains only numbers in the range from 
    1 to a.length, find the first duplicate number for which the 
    second occurrence has the minimal index. In other words, if there 
    are more than 1 duplicated numbers, return the number for which 
    the second occurrence has a smaller index than the second occurrence 
    of the other number does. If there are no such elements, return -1.
    
    

    [execution time limit] 4 seconds (py3)

    [input] array.integer a

    Guaranteed constraints:
    1 ≤ a.length ≤ 105,
    1 ≤ a[i] ≤ a.length.
*/

int firstDuplicate(int[] a) {
    // Recorre cada elemento del array
    for(int i = 0; i < a.length; i++){
        // Nota lo siguiente
        // si hay dos valores repetidos en el array,
        // Entonces esto implica que para dos indices
        // la expresion abs(a[i]) - 1 es la misma, pues
        // coinciden en valor.

        // OBS: esta expresion siempre es >= 0, por los
        // constraints por lo que está definida para todos
        // los elementos del arreglo entonces si hacemos que
        // el elemento a[abs(a[i]) - 1] vaya cambiando conforme el
        // indice recorre el arreglo encontraremos el primer elemento
        // repetido facilmente checando si es no-positivo
        if (a[Math.abs(a[i])- 1] < 0){
            return Math.abs(a[i]);
        }
        else {
            a[Math.abs(a[i]) - 1] = -a[Math.abs(a[i]) - 1];
        }
    }
    // Si no se repite
    return -1;
}

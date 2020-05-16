/*
    You are given an array of integers in which every element
    appears twice, except for one. Find the element that only
    appears one time. Your solution should have a linear runtime
    complexity (O(n)). Try to implement it without using extra memory.
*/

int singleNumber(int[] nums) {
    int res = 0;
    for (int num : nums) {
        // XOR es conmutativo, por lo que si agrupamos los numeros repetidos
        // como cada bit correspondiente de los numero repetidos es el mismo
        // Se anulan y devuelven 0 todos, por lo que al aplicarselo al numero
        // que no se repite, es lo mismo que no hacer nada, dado que x ^ 0 = x \forall x
        res = res ^ num;
    }
    return res;
}

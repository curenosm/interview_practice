/*
    Note: Avoid using built-in functions that convert
    integers to their binary representations. Write the
    solution that uses O(k) operations per test, where k
    is the number of bits set to 1.

    Write a function that takes an unsigned (positive)
    integer and returns the number of 1 bits its binary
    representation contains. This value is also known as
    the integer's Hamming weight.
*/

int numberOf1Bits(int n) {
    int res = 0;
    while (n != 0) {
        // Desplazate al siguiente 1 P.e.
        // Si n = 1101010101 => (n - 1) = 1101010100
        // Por lo que si aplicamos un & todos los bits
        // "ya contados" se van cancelando, quedando 
        // los 1's que no hemos contado
        n &= (n - 1);
        res++;
    }
    return res;
}

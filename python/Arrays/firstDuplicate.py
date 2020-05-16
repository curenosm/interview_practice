def firstDuplicate(a):
    """
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

    """
    conjunto = set()
    for numero in lista:
        if numero in conjunto:
            return numero
        conjunto.add(numero)
    return -1
    

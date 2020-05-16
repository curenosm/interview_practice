# Definition for singly-linked list:
# class ListNode(object):
#   def __init__(self, x):
#     self.value = x
#     self.next = None
#

def removeKFromList(l, k):
	"""
	Note: Try to solve this task in O(n) time using O(1) additional space,
	where n is the number of elements in the list, since this is what
	you'll be asked to do during an interview.

	Given a singly linked list of integers l and an integer k, remove
	all elements from list l that have a value equal to k.
	"""

    res = []
    while l:
		# Obten el valor actual en la lista
        cur = l.value
		# Si se queda entonces agregalo al resultado
        if cur != k:
            res.append(cur)
		# Si no, pasate al siguiente
        l = l.next
    return res



# Otra solucion
def removeKFromList(l, k):
	# Apuntan al mismo objeto, pues no se hizo deepcopy
    c = l
	# Mientras la lista no haya terminado
    while c:
		# Si la lista aun no termina y el proximo valor es k
        if c.next and c.next.value == k:
			# Saltate el que sigue
            c.next = c.next.next
        else:
			# Si no, simplemente continua normal
            c = c.next
	
		# Como existe la posibilidad de el primer elemento
		# fuese k y no se eliminó, pues se consideró siempre el
		# siguiente, imprime desde el segundo si es k, si no
		# imprime la lista entera (con el primer elemento)
		return l.next if l and l.value == k else l

# Recibe el grafo
def hasDeadlock(g):
    """
    Note: Try to solve this task in O(m + n) or O(n) time, where n is a
    number of vertices and m is a number of edges, since this is what you'll
    be asked to do during an interview.

    In a multithreaded environment, it's possible that different processes will need
    to use the same resource. A wait-for graph represents the different processes as nodes
    in a directed graph, where an edge from node i to node j means that the node j is using
    a resource that node i needs to use (and cannot use until node j releases it).

    We are interested in whether or not this digraph has any cycles in it. If it does, it
    is possible for the system to get into a state where no process can complete.

    We will represent the processes by integers 0, ...., n - 1. We represent the edges
    using a two-dimensional list connections. If j is in the list connections[i], then
    there is a directed edge from process i to process j.

    Write a function that returns True if connections describes a graph with a directed cycle,
    or False otherwise.
    """

    # Basta con que para alguno de los vertices la función cycle devuelva true
    return any(cycle(g, from_, [False]*len(g)) for from_ in range(len(g)))

# Funcion para verificar si para un vertice dado (from_) algun camino (path) en
# el grafo (g) vuelve a él mismo.
def cycle(g, from_, path):
    # Todos empezaban siendo False, así que indicamos de donde estamos partiendo
    # De la posición from_
    path[from_] = True
    # Después recorrecoremos todos los elementos conectados a nuestro vertice origen
    for v in g[from_]:
        # Si sucede que path[v] == True, eso quiere decir que ya habiamos pasado por ahí
        # Por lo que encontramos un ciclo, y terminamos el trabajo, si no, verificamos todos
        # los ciclos desde el nuevo elemento, y usamos recursion
        if path[v] or cycle(g, v, path.copy()):
            return True
    # Si terminó de recorrer todos los camino y aun no devolvió True, pues entonces no existe
    # ningun ciclo
    return False
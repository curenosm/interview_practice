boolean hasDeadlock(int[][] g) {
    boolean[] path = new boolean[g.length];

    // Llena el camino con falsos
    for (int i = 0; i < g.length; i++) path[i] = false;

    // Recorre cada vertice
    for (int i = 0; i < g.length; i++){
        if (cycle(g, i, path.clone())){
            return true;
        }
    }

    return false;
}

boolean cycle(int[][] g, int from_, boolean[] path){

    path[from_] = true;

    for (int v: g[from_]){
        if (path[v] || cycle(g, v, path.clone())){
            return true;
        }
    }

    return false;
}

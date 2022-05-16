//Kotlin functions can be declared at the top level in a file,

//Kotlin functions can also be declared locally as member functions and extension functions.

fun dfs(graph: Graph) {
    fun dfs(current: Vertex, visited: MutableSet<Vertex>) {
        if (!visited.add(current)) return
        for (v in current.neighbors)
            dfs(v, visited)
    }

    dfs(graph.vertices[0], HashSet())
}
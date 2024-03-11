class Graphs:

    def __init__(self):
        self.graph_dict = {}
    
    # adding a vertex or node
    def addVertex(self, value):
        
        self.graph_dict.setdefault(value, [])

    # adding an edge or line that connects two nodes
    def addEdge(self, vertex1, vertex2):
        
        self.graph_dict.setdefault(vertex1, []).append(vertex2)
        self.graph_dict.setdefault(vertex2, []).append(vertex1)


    """
    BFS GRAPH TRAVERSAL - USES QUEUES
    1. Add a node/vertex from the graph to a queue of nodes to be “visited”.
    2. Visit the topmost node in the queue, and mark it as such.
    3. If that node has any neighbors, check to see if they have been “visited” or not.
    4. Add any neighboring nodes that still need to be “visited” to the queue.
    5. Remove the node we've visited from the queue and mark it as visited.
    """

    # BFS ITERATIVE WAY
    def bfsIteration(self, node):

        queue = [node]
        visited = []
        output = []

        while queue:

            val = queue.pop(0)
            output.append(val)
            visited.append(val)

            for i in self.graph_dict[val]:

                if i in visited or i in queue:
                    pass
                else:
                    queue.append(i)
            
        return output 


    # BFS RECURSIVE WAY
    def bfsRecursion(self, node):
        output = []
        visited = set()
        queue = [node]

        def bfs():
            if not queue:  
                return

            while queue:  
                val = queue.pop(0)
                if val not in visited:  # If the node hasn't been visited
                    visited.add(val)  # Mark as visited
                    output.append(val)  # Add to output

                    for i in self.graph_dict[val]:  # Add unvisited neighbors
                        if i not in visited and i not in queue:
                            queue.append(i)

            bfs()  # Recalling the function to check if there's more to do (not really needed in true BFS)

        bfs()  # Initial call to the recursive function
        return output

    
            
            

            


    """
    DFS GRAPH TRAVERSAL - USES STACKS
    1. Add the node to the top of the “visited” vertices stack.
    2. Marked it as “visited”.
    3. Check to see if it had any children:
    4. if it did, we ensure that they had not been visited already, and then visited it. 
    5. If not, we popped it off the stack.
    """

    # DFS ITERATIVE WAY
    def dfsIteration(self, node):
        
        stack = [node]
        output = []
        visited = set()

        while stack:
                
                val = stack.pop()
                if val not in visited:
                    output.append(val)
                    visited.add(val)

                for curr in self.graph_dict[val]:
                    if curr not in visited:
                        stack.append(curr)

        return output

                         
    # DFS RECURSIVE WAY
    def dfsRecursion(self, node):
        
        visited = set()
        output = []
        
        def dfs(node):

            if self.graph_dict[node] == []:
                return
             
            if node in visited:
                return
            
            output.append(node)
            visited.add(node)

            for curr in self.graph_dict[node]:
                dfs(curr)

        dfs(node) 
        return output


    def printGraph(self):
        return self.graph_dict
    
myGraph = Graphs()
myGraph.addVertex("0")
myGraph.addVertex("1")
myGraph.addVertex("2")
myGraph.addVertex("3")
myGraph.addVertex("4")
myGraph.addVertex("5")
myGraph.addVertex("6")
myGraph.addEdge("3", "1")
myGraph.addEdge("3", "4")
myGraph.addEdge("4", "2")
myGraph.addEdge("4", "5")
myGraph.addEdge("1", "2")
myGraph.addEdge("1", "0")
myGraph.addEdge("0", "2")
myGraph.addEdge("6", "5")

print("Reference Adjacency List")
print(myGraph.printGraph())
print()
print("Breadth First Search..")
print("Iteration")
print(myGraph.bfsIteration("0"))
print("recursion")
print(myGraph.bfsRecursion("0"))
print()
print("Depth First Search..")
print("Iteration")
print(myGraph.dfsIteration("0"))
print("recursion")
print(myGraph.dfsRecursion("0"))


class Graph:

    def __init__(self, edges):
        self.edges = edges
        self.graph_dict = {}

        for start, end in self.edges:     
            if start not in self.graph_dict:
                self.graph_dict[start] = [end]
            else:
                self.graph_dict[start] += [end]
        
    def getPaths():
        pass
    


if __name__ == '__main__':
    routes = [
        [0, 1], 
        [2, 3],
        [2, 1],
        [1,3]
        ]
    

"""
####  Edge list is a list of lists showing how each element is connected to another in a
 graph This shows how the edges in the graph are connected to each other and that is why it is called an edge list.
[
    [0, 2], 0 is connected to 2 and vice versa
    [2, 3], 2 is connected to 3 and vice versa
    [2, 1], 2 is conected to 1 and vice versa; it is also connected to 0
    [1, 3] 1 is connected to 3 and vice versa; it is also connected to 2
]

####  Adjacent list (adjacency) shows what a particular index is connected to. In an adjacecny list we are 
saying;

[
[2], Node 0 is connected to 2
[2, 3], Node 1 is connected to 2 and 3                               
[0, 1, 3], Node 2 is connected to 0, 1, and 3
[1,2] Node 4 is connected to 1 and 2
]
Note that it could also be a hashmap where the index is the node and the value is the Nodes neighbors.


#### Adjacent matrix shows whether a node x is connected to a node y, basically if there is a connection or not. 
A node (index we are currently looking at), is connected to a value where there is a 1 and not connected to a value with 0

[
[0, 0, 1, 0], node 0 is connected to 2 and vice versa
[0, 0, 1, 1], node 1 is connected to 2 and 3
[1, 1, 0, 1], node 2 is connected to 0, 1 and 3 
[0, 1, 1, 1] node 4 is connected to 1, 2, and 3
] 
Note that it could also be a hashmap where the index is the node and the value is the Nodes neighbors.

"""
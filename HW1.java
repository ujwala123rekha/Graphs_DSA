//These are the basic practice questions 


//Count Number of Nodes

System.out.println("Number of nodes: " + adj.size());

//Check if Graph is Empty

 if (adj.size() == 0) {
            System.out.println("Graph is empty");
        } else {
            System.out.println("Graph is not empty");
        }


or System.out.print(adj.isEmpty());

//Check if Edge Exists

 if (adj.get(u).contains(v)) {
            System.out.println("Edge exists");
        } else {
            System.out.println("Edge does not exist");
        }

//Find Neighbour Nodes

 System.out.println("Neighbors of node " + node + ": " + adj.get(node));


//Print Graph
  
 for (int i = 0; i < n; i++) {
            System.out.println(i + " -> " + adj.get(i));
        }

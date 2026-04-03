import java.util.*;
public class Main
{
    public static void addEdges(ArrayList<ArrayList<Integer>>adj ,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		int n = 5;
		for(int i =0;i<n;i++){
		    adj.add(new ArrayList<>());
		}
		addEdges(adj, 0, 1);
        addEdges(adj, 0, 2);
        addEdges(adj, 1, 3);
        addEdges(adj, 2, 4);
        for(int i =0;i<n;i++){
            System.out.print(i+"-> ");
            for(int node:adj.get(i)){
                System.out.print(node+" ");
            }
            System.out.println();
        }
	}
}

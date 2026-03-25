import java.util.*;

public class Main{
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int edges = sc.nextInt();
        for(int i =0;i<nodes;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int c = 0;c<edges;c++){   //connection
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
       
        System.out.print(adj);
    }
}

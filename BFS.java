class Solution {
    public void bfs(ArrayList<ArrayList<Integer>> adj,Queue<Integer> q , int[] vis,int i, ArrayList<Integer> result ){
        vis[i] =1;
        q.offer(i);
        while(!q.isEmpty()){
            int cell = q.poll();
            result.add(cell);
            for(int neigh:adj.get(cell)){
               if(vis[neigh]==0){
                   vis[neigh] =1;
                 q.offer(neigh);
               }
            }
        }
    }
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
       int V = adj.size();
       int[] vis = new int[V];
       Queue<Integer> q = new LinkedList<>();
       ArrayList<Integer> result = new ArrayList<>();
       for(int i =0;i<V ;i++){
           if(vis[i] ==0){
               bfs(adj,q,vis,i,result);
           }
       }
       return result;
    }
}
//Ref : GFG

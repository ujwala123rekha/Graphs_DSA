class Solution {
    public void dfs(int start,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> result,int[] vis){
        vis[start] =1;
        result.add(start);
        for(int neigh : adj.get(start)){
            if(vis[neigh] ==0){
               dfs(neigh,adj,result,vis);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
       int[] vis = new int[V];
       ArrayList<Integer> result = new ArrayList<>();
       for(int i =0;i<V;i++){
           if(vis[i] ==0){
               dfs(i,adj,result,vis);
           }
       }
       return result;
    }





//  Ref : GFG 
}

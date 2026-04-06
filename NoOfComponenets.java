
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        ArrayList<ArrayList<Integer>> adjL = new ArrayList<>();
        for(int i =0;i<V;i++){
            adjL.add(new ArrayList<>());
        }
        for(int i =0;i<V;i++){
            for(int j = 0;j<V;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjL.get(i).add(j);
                }
            }
        }
        int components = 0;
        int[] vis = new int[V];
        for(int i =0;i<V;i++){
            if(vis[i]==0){
                components++;
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            vis[i] = 1;
            while(!q.isEmpty()){
                int cell = q.poll();
                for(int neigh:adjL.get(cell)){
                    if(vis[neigh] == 0){
                        vis[neigh] =1;
                        q.offer(neigh);
                    }
                }
            }
        }
        }
        return components;
    }
}


class Solution {
    public int findCircleNum(int[][] adjMatrix) {
        int n = adjMatrix.length;
        boolean[] visited = new boolean[n];
        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, visited, adjMatrix);
                components++;
            }
        }
        return components;
    }

    private void dfs(int node, boolean[] visited, int[][] adjMatrix) {
        visited[node] = true;

        for (int i = 0; i < visited.length; i++) {
            if (i == node) continue;

            if (adjMatrix[node][i] == 1 && !visited[i]) {
                dfs(i, visited, adjMatrix);
            }
        }
    }
}


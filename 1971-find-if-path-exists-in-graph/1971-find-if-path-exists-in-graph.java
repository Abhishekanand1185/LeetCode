class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        boolean vis[] = new boolean[n];
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        vis[source] = true;

        while(q.size()>0){
            int node = q.poll();
            if(node == destination){
                return true;
            }
            for(int neighbour: graph.get(node)){
                if(!vis[neighbour]){
                    q.offer(neighbour);
                    vis[neighbour] = true;
                }
            }
        }
    return false;
    }

}
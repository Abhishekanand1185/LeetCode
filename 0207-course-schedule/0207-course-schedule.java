class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge: prerequisites){
            graph.get(edge[0]).add(edge[1]);
        }
        return topologicalSort(graph, numCourses);
    }

    public boolean topologicalSort(List<List<Integer>> graph, int n){
        int inDeg[] = new int[n];
        for(int i=0; i<n; i++){
            List<Integer> nbor = graph.get(i);
            for(int v: nbor){
                inDeg[v]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(inDeg[i] == 0){
                q.add(i);
            }
        }
        int count = 0;
        while(!q.isEmpty()){
            int rem = q.poll();
            count+=1;
            List<Integer> nbor = graph.get(rem);
            for(int v: nbor){
                inDeg[v]--;
                if(inDeg[v] == 0){
                    q.add(v);
                }
            }
        }
    return n == count;
    }
}
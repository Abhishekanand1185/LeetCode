class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int inDig[] = new int[numCourses];
        int ans[] = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for(int edge[] : prerequisites){
            graph.get(edge[1]).add(edge[0]);
            inDig[edge[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(inDig[i] == 0){
                q.offer(i);
            }
        }
        int count = 0;
        int idx = 0;
        while(!q.isEmpty()){
            int rem = q.poll();
            ans[idx] = rem;
            idx++;
            count++;
            List<Integer> nbor = graph.get(rem);
            for(int v: nbor){
                inDig[v]--;
                if(inDig[v] == 0){
                    q.offer(v);
                }
            }
        }
    return (count == numCourses) ? ans : new int[0];
    }
}
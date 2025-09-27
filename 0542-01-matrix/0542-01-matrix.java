class Solution {
    int m, n;
    int directions[][] = {{-1, 0}, {1,0}, {0, -1}, {0, 1}};
    public int[][] updateMatrix(int[][] mat) {
        m = mat.length;
        n = mat[0].length;
        int res[][] = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i, j});
                    res[i][j] = 0;
                }
                else{
                    res[i][j] = -1;
                }
            }
        }
        while(!q.isEmpty()){
            int temp[] = q.poll();
            int i = temp[0];
            int j = temp[1];
            for(int dir[] : directions){
                int new_i = i + dir[0];
                int new_j = j + dir[1];

                if(new_i >= 0 && new_i < m && new_j >= 0 && new_j < n && res[new_i][new_j] == -1){
                    res[new_i][new_j] = res[i][j] + 1;
                    q.add(new int[]{new_i, new_j});
                }
            }
        }
    return res;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dir[][] = {{1,1}, {1, 0}, {0,1}, {-1, 0}, {0, -1}, {-1, -1}, {1, -1}, {-1, 1}};
        if(m == 0 || n == 0 || grid[0][0] == 1 || grid[m-1][n-1] == 1){
            return -1;
        }
        if(m == 1 && n == 1) return 1;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        grid[0][0] = 1;
        int level = 0;
        while(!q.isEmpty()){
            int N = q.size();
            while(N > 0){
                int temp[] = q.remove();
                int x = temp[0];
                int y = temp[1];
                if(x == m-1 && y == n-1){
                    return level + 1;
                }
                for(int d[]: dir){
                    int new_x = x + d[0];
                    int new_y = y + d[1];
                    
                    if(new_x >= 0 && new_x < m && new_y >=0 && new_y < n && grid[new_x][new_y] == 0){
                        q.add(new int[]{new_x, new_y});
                        grid[new_x][new_y] = 1;
                    }
                }
                N--;
            }

        level++;
        }
    return -1;
    }
}
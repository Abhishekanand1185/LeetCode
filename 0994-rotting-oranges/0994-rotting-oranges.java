class Solution {
    static class pair{
        int row; 
        int col;
        int time;
        pair(int row, int col, int time){
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<pair> q = new LinkedList<>();
        int count1=0, count2 = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 2){
                    q.add(new pair(i, j, 0));
                    count2++;
                } if(grid[i][j] == 1){
                    count1++;
                }
            }
        }

        if(count1 == 0){
            return 0;
        }
        
        if(count2 == 0){
            return -1;
        }
        int ans = -1;
        while(q.size() > 0){
            pair removed = q.poll();
            int r = removed.row;
            int c = removed.col;
            int t = removed.time;

            ans = t; 
            if(r-1 >= 0 && grid[r-1][c] == 1){
                q.add(new pair(r-1, c, t+1));
                grid[r-1][c] = 2;
            }
            if(c-1 >= 0 && grid[r][c-1] == 1){
                q.add(new pair(r, c-1, t+1));
                grid[r][c-1] = 2;
            }
             if(r+1 < m && grid[r+1][c] == 1){
                q.add(new pair(r+1, c, t+1));
                grid[r+1][c] = 2;
            }
            if(c+1 < n && grid[r][c+1] == 1){
                q.add(new pair(r, c+1, t+1));
                grid[r][c+1] = 2;
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                   return -1;
                }
            }
        }
        return ans;
    }
}
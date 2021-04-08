package hot100;

public class Hot200 {

    int result=0;
    public int numIslands(char[][] grid) {
        int l = grid.length,r = grid[0].length;

        for(int i=0;i<l;i++)
            for(int j=0;j<r;j++){
                if(grid[i][j]=='1'){
                    result++;
                    dfs(grid,i,j);
                }
            }

        return result;
    }

    public void dfs(char[][] grid,int i,int j){
        grid[i][j]='0';
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        for(int[] dir:directions) {
            int newi = i + dir[0], newj = j + dir[1];
            if(newi>=0&&newi<grid.length&&newj>=0&&newj<grid[0].length){
                if(grid[newi][newj]=='1')dfs(grid,newi,newj);
            }
        }

    }
}

// To mark the number of islands present.

class Solution {
    
    void rec(char grid[][], int x,int y,int m,int n){    // to mark the island given in the matrix.
        if(x<0 || y<0 || x>=m || y>=n || grid[x][y] != '1'){ // x,y are the marked indices already visited. 
            return ;    //boundary elements checking condition.
        }
            
        grid[x][y] = '2';  // to track whether the element is visited or not.
            
        rec(grid,x+1,y,m,n);  // to move to right.
        rec(grid,x,y+1,m,n);  // to move down.
        rec(grid,x-1,y,m,n);  // to move to left.  
        rec(grid,x,y-1,m,n);  // to move up.
        }
    
    
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int i,j,no_of_island = 0;
        if(m == 0)   // row cannot be 0 , if row is 0 then there is no element.
            return 0;
        
        for(i=0;i<m;i++){   // to traverse the 2-D matrix.
            for(j=0;j<n;j++){
                if(grid[i][j] == '1'){   //if we find 1 that means we got an island , hence increase it.
                    no_of_island = no_of_island + 1;
                    rec(grid,i,j,m,n);
                }
            }
        }
        return no_of_island;
    }
}
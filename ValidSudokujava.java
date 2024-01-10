class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> rowAndColumn=new HashSet<String>();

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j] !='.')
                {
                if(!rowAndColumn.add(board[i][j]+"value in row"+i) || !rowAndColumn.add(board[i][j]+" value in column"+j) || !rowAndColumn.add(board[i][j]+"box"+(i/3)*3+j/3))
                {
return false;

                }
                }
            }
        }
        return true;
    }
}
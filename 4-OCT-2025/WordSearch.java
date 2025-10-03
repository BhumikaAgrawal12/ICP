class Solution {
    public boolean WordSearch(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        char ch=word.charAt(0);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==ch){

                    if(isItPossible(board,i,j,word,0)){
                        return true;
                    }
                
                }
            }
        }
        return false;
    }
    boolean isItPossible(char[][] board,int cr,int cc,String word,int indx){
        int er=board.length;
        int ec=board[0].length;
       if(indx==word.length()){
        return true;
       }

       if(cr<0 || cc<0 || cr>=er || cc>=ec || board[cr][cc]!=word.charAt(indx)){
            return false;
       }
        char temp=board[cr][cc];
        board[cr][cc]='*';
        boolean found=isItPossible(board,cr-1,cc,word,indx+1)||isItPossible(board,cr+1,cc,word,indx+1) || isItPossible(board,cr,cc-1,word,indx+1) || isItPossible(board,cr,cc+1,word,indx+1);

        board[cr][cc]=temp;
        return found;

    }
}
//Using Recursion(TLE)
// class Solution {
//     public int uniquePaths(int m, int n) {
//         return validPath(m,n,0,0);
//     }
//     public int validPath(int m,int n,int cr,int cc){
//         if(cr>=m || cc>=n){
//             return 0;
//         }
//         if(cr==m-1 || cc==n-1){
//             return 1;
//         }
//         int right=validPath(m,n,cr,cc+1);
//         int down=validPath(m,n,cr+1,cc);
//         return right+down;
//     }

// }

//USING 2-D DP
// class Solution {
//     public int uniquePaths(int m, int n) {
//        int[][] dp=new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(i==0 || j==0){
//                     dp[i][j]=1;
//                 }
//                 else{
//                     dp[i][j]=dp[i-1][j]+dp[i][j-1];
//                 }
//             }
//         }
//         return dp[m-1][n-1];

//     }
// }

//USING 1D DP
class Solution {
    public int uniquePaths(int m, int n) {
       int[] dp=new int[n];
       dp[0]=1;
       for(int i=0;i<m;i++){
        for(int j=1;j<n;j++){
            dp[j]=dp[j]+dp[j-1];
        }
       }
       return dp[n-1];
    
    }
}
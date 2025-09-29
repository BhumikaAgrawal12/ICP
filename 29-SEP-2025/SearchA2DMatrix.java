class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Brute force
        // int m=matrix.length;
        // int n=matrix[0].length;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //BINARY SEARCH(OPTIMISED)
        int m=matrix.length;
        int n=matrix[0].length;
        int start=0;
        int end=m*n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int row=mid/n;
            int col=mid%n;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}
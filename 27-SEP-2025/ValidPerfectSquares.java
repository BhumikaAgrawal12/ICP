class ValidPerfectSquares {
    public boolean isPerfectSquare(int num) {
        // if(Math.sqrt(num)==(int)Math.sqrt(num)){
        //     return true;
        // }
        // return false;
        int start=0;
        int end=num;
        while(start<=end){
            int mid=start+(end-start)/2;
            long square=(long)mid*mid;
            if(num==square){
                return true;
            }
            else if(square>num){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}
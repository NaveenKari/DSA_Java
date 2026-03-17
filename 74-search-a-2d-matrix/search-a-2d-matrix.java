class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        boolean res = false;

        if(n == 1){
            return binarySearch(matrix[0],target);
        }
        //System.out.println(m);
        for(int i = 0; i < n;i++){
            if(matrix[i][m-1] == target) return true;
            if(matrix[i][m-1] > target){
                res = binarySearch(matrix[i],target);
                break;
            }
        }
        return res;
    }
    private boolean binarySearch(int[] nums,int target){
        int start = 0;
        int end = nums.length - 1;

        while(start <=end){
            int mid = start + (end - start) / 2;

            if(target == nums[mid]) return true;

            if(target> nums[mid]){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return false;
    }
}
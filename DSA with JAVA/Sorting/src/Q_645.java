class Q_645 {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1){
                return new int[] {nums[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
    void  swap(int[] arr, int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
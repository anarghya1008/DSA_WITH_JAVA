class Q_287 {
    public int findDuplicate(int[] nums) {
        int i = 0 ;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int CorrectIndex= nums[i]-1;  // Here we take arr[i] because in Cyclic sort value are at the (index-1)th index but in this question the value are at arr[i]
                // mtlb ye h ki 0 value o index pr hogi 1 value 1st index pr and so on.
                if(nums[i] != nums[CorrectIndex]){
                    swap(nums,i,CorrectIndex);
                }
                else {
                    return nums[i];
                }}
            else {
                i++;
            }
        }

        return -1;
    }
    static void swap(int[] arr, int start , int last) {
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] =temp;
    }
}
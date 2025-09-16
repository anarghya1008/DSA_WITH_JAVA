//Qyestion Number-268;
//Question link -> https://leetcode.com/problems/missing-number/description/

class Q_268 {
    public int missingNumber(int[] nums) {
        int i = 0 ;
        while(i<nums.length){
            int CorrectIndex= nums[i];  // Here we take arr[i] because in Cyclic sort value are at the (index-1)th index but in this question the value are at arr[i]
            // mtlb ye h ki 0 value o index pr hogi 1 value 1st index pr and so on.
            if(nums[i]< nums.length && nums[i] != nums[CorrectIndex]){
                swap(nums,i,CorrectIndex);

            }
            else {
                i++;
            }}
        // Return the answer
        for (int index= 0; index <nums.length ; index++) {
            if(nums[index]!=index){
                return index;
            }
        }


        return nums.length;
    }         
    static void swap(int[] arr, int start , int last) {
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] =temp;
    }}
//Question 41:
//link-https://leetcode.com/problems/first-missing-positive/

public class Q_41 {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]>0&&nums[i]<= nums.length&&nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1){
                return index+1;
            }
        }
        return nums.length+1;
    }
    void swap(int[] arr, int start , int last) {
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] =temp;
    }

}

//Qyestion Number-448;
//Question link -> https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/



import java.util.ArrayList;
import java.util.List;

class Q_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {

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

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                ans.add(index+1);
            }

        }
        return ans;
    }
    void  swap(int[] arr, int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
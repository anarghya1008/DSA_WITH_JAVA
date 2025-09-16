import java.util.ArrayList;
import java.util.List;

class Q_442 {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }}


        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1){
                ans.add(nums[index]);
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
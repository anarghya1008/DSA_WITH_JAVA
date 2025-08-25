public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 3;
        System.out.println(RBS(arr,target));

    }
    static int RBS(int[] nums, int target){
        int pivot=findPivot(nums);
        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return search(nums, target, 0 , nums.length - 1);
        }


        //Now here also three cases to find the target element.
        //Case-1
        if(target==nums[pivot]){
            return pivot;
        }
        //Case-2
        if(target>=nums[0]){
            return search(nums,target,0,pivot-1);
            
        }
        //Case-3-target<nums[start]
        else {
            return search(nums,target,pivot+1,nums.length-1);
        }
    }
    static int search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }

   static int findPivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            //As there is four cases to find Pivot Elements;
            //Case-1
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;   //pivot = mid
            }
            //Case-2
            if(mid>end && arr[mid]<arr[mid-1]){
                return mid-1;  //pivot = mid-1
            }
            //Case 3 and 4
            if(arr[start]>arr[mid]){
                end= mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;  //if we not found the pivot element.
   }
}

public class PeakIndexInMountain {
    public static void main(String[] args) {


    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{   //which is arr[mid]<arr[mid+1]
                start=mid+1;
            }
        }
    return start;  //yha hm end bhi return krwa skte h kyuki jb dono ki index same hogi tabhi largest element milega
    }

    }

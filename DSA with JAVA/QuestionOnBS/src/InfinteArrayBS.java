public class InfinteArrayBS {
    public static void main(String[] args) {

    }
    static int ans(int[] arr,int target){
        //first start with box of size 2
        int start=0;
        int end=1;

        // abh hm check karenge ki target kha lie kr rha h!!
        while(target>arr[end]){   // yha hm check kr rhe h ki jo target element h bo is box k andar lie kr rha h ya n ye to simple h ki agr target element bda h arr[end] se to bo usse phle nhi aa skta yaani hme new box lena padega
            int newStart=end+1;   //yha hmne newstart isliye liya h kyuki hme puarni start ki value ka kaam hoga neeche
            end=end+(end-start+1);//this is formula of doubling the size of box.
            start=newStart;
        }
        return search(arr,target,start,end);
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
}

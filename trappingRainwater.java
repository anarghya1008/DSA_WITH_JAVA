import java.util.*;
public class trappingRainwater {
    public static void main(String[] args) {
        int[] height={4,2,0,6,3,2,5};
        trap(height);
    }
    public static void trap(int[] height){
        // Step - 1 Calculate Auxillary Arrays(LeftMAxBoundary and RightMaxBoundary)
        int[] leftMaxBoundary=new int[height.length];
        leftMaxBoundary[0]=height[0];
        for (int i = 1; i < leftMaxBoundary.length; i++) {
            leftMaxBoundary[i]=Math.max(height[i],leftMaxBoundary[i-1]); //current bar ki height or phle wali ki height m se jo bda hoga bo store hoga
        }
        int[] rightMaxBoundary=new int[height.length];
        rightMaxBoundary[height.length-1]=height[height.length-1];
        for (int i = height.length-2; i >=0; i--) { // i = height.length-2 start is liye kyuki height.length-1 yani last element to same rahega jaise leftarray m phla element same tha
            rightMaxBoundary[i]=Math.max(height[i],rightMaxBoundary[i+1]); //current bar ki height or phle wali ki height m se jo bda hoga bo store hoga
        }
        //Step-2 find water level
        int[] waterLevel = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            waterLevel[i]=Math.min(leftMaxBoundary[i],rightMaxBoundary[i]);
        }
        //Step-3 Calculate Trapped water
        int[] trappedWater=new int[height.length];
        for (int i = 0; i < height.length; i++) {
            trappedWater[i]=waterLevel[i]-height[i];
        }
        //Step-4 Find total Trapped Water
        int totalTrappedWater=0;
        for (int i = 0; i < trappedWater.length; i++) {
            totalTrappedWater+=trappedWater[i];
        }
        System.out.println("The total Trapped Water is : "+totalTrappedWater);
    }
}

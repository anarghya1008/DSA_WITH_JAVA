class Q_1929 {
    public int[] getConcatenation(int[] nums) {
        int[] num1 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            num1[i] = nums[i];
        }


        int[] num2 = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            num2[i] = nums[i];
        }

        int[] ans = new int[2*nums.length];
        for (int i= 0 ;i<nums.length;i++){
            ans[i]=num1[i];
        }
        for (int i= 0 ;i<nums.length;i++){
            ans[i+num1.length]=num2[i];

        }




        return ans;
    }

}
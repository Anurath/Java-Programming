class LeetCodeSolution_Q66 {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(i==digits.length-1)
            {
                int temp = digits[digits.length-1]+1;
                if(temp>9)
                {
                    carry = 1;
                    digits[digits.length-1] = temp%10;
                }
                else{
                    digits[digits.length-1] = temp;
                }
            }
            else{
                int temp = digits[i]+carry;
                if(temp>=10)
                {
                    carry =1;
                    digits[i] = temp%10;
                }
                else{
                    digits[i] = temp;
                    carry=0;
                }
            }
        }
        if(carry!=0)
        {
            int[] ans = new int[digits.length+1];
            for(int i=0;i<digits.length;i++)
            {
                ans[i+1] = digits[i];
            }
            ans[0] = carry;
            return ans;
        }
        return digits;
    }
}
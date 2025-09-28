class LeetCodeSolution_Q476 {
    public int findComplement(int num) {
        String binary = "";
        while(num!=0)
        {
            if(num%2==0)
            {
                binary = 1+binary;
            }
            else{
                binary = 0+binary;
            }
            num/=2;
        }
        return Integer.parseInt(binary,2);
    }
}
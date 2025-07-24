class LeetCodeSolution_Q2011{
    public int finalValueAfterOperations(String[] operations) {
        byte x=0;

        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("X++") || operations[i].equals("++X"))
            {
                x++;
            }
            else if(operations[i].equals("--X")|| operations[i].equals("X--"))
            {
                x--;
            }
        }
        return x;
    }
}
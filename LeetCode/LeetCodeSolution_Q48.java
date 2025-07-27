class LeetCodeSolution_Q48{
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(j>i)
                {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            reverse(matrix[i]);
        }
    }

    public static void reverse(int[] arr)
    {
        for(int i=0,j=arr.length-1;i<j;i++,j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
        }
    }
}
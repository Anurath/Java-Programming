class LeetCodeSolution_Q832{
   public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[i].length;j++)
            {
                if(image[i][j]==0)
                {
                    image[i][j]=1;
                }
                else
                {
                    image[i][j]=0;
                }
            }
        }
        for(int i=0;i<image.length;i++)
        {
            reverse(image[i]);
        }
        return image;
    }

    public static void reverse(int[] arr)
    {
        for(int i=0,j=arr.length-1;i<j;i++,j--)
        {
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
        }
    }
}
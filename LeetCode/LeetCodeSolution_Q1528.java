class LeetCodeSolution_Q1528 {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];

        for(int i=0,j=s.length()-1;i<=j;i++,j--)
        {
            ch[indices[i]]=s.charAt(i);
            ch[indices[j]]=s.charAt(j);
        }

        return new String(ch);
    }
}
class find_unique_words{
    public static void main(String args[])
    {
        String str = "hey you look good you look you";
        String arr[] = str.split(" ");
        int brr[] = new int[arr.length];
        
        for(int i=0; i<arr.length; i++)
        {
            brr[i] = 1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] .equals(arr[j]))
                {
                    brr[i]++;
                    arr[j] = "@";
                }
            }
        }
        for(int i=0; i<brr.length; i++)
        {
            if(arr[i] != "@" && brr[i]==1)
            {
                System.out.println(arr[i]+" => "+brr[i]);
            }
        }
    }
}
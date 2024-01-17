class demo{
    public static void main(String args[])
    {
        String str = "abcdbd";
        char arr[] = str.toCharArray();
        int brr[] = new int[arr.length];
        //int crr[] = new int[arr.length];

        for(int i=0; i<arr.length; i++)
        {
            brr[i] = 1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    brr[i]++;
                    arr[j] = '@';
                }
            }
        }
        for(int i=0; i<brr.length; i++)
        {
            if(arr[i] != '@')
            {
                System.out.println(arr[i]+" => "+brr[i]);
            }
            if(brr[i] == 1)
            {
                System.out.println(arr[i]+" is the first non-repeated character");
                break;
            }
        }
    }
}
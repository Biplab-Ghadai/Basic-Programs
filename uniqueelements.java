class find_unique_elements{
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 2, 1, 6, 8, 9, 6, 78};
        int brr[] = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            brr[i] = 1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    brr[i]++;
                    arr[j] = '@';
                }
            }
        }
        for(int i=0; i<brr.length; i++)
        {
            if(brr[i]==1 && arr[i] != '@')
            {
                System.out.println(arr[i]+" => "+brr[i]);
            }
        }
    }
}

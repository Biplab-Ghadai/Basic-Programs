class ArrayPrinter{
    static void ov(int arr[], int i)
    {
        if(i >= arr.length)
            return ;
        int num = arr[i];
        if(num%2==0)
        {
            System.out.println("Even : "+num);
        }
        else{
            System.out.println("Odd : "+num);
        }
        ov(arr, i+1);
    }
    public static void main(String args[])
    {
        int i=0;
        int arr[] = {1, 2, 3, 4, 5, 6};
        ov(arr, i);
    }
}
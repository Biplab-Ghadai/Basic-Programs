class prime_recursion{
    static boolean prime(int num, int div)
    {
        if(div <= 1)
        {
            return true;
        }
        if(num % div == 0)
        {
            return false;
        }
        
        return prime(num, div-1);
        
    }
    public static void main(String args[])
    {
        int arr[] = {2, 4, 5, 6, 7, 8, 9};
        for(int num : arr)
        {
            if(prime(num, num-1))
            {
                System.out.println(num);
            }
        }
    }
}
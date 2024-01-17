public class prime{
    public static void main(String args[])
    {
        int n=0;
        for(int i=2; i<100; i++)
        {
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    n = n+1;
                }
            }
            if(n==0)
            {
                System.out.print(i+" ");
            }
            else{
                n=0;
            }
        }
    }
}
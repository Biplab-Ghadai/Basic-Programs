public class fibonacciusingrec {
    
    static int a=0, b = 1, c = 0;
    static void fibo(int n)
    {
        if(n > 0)
        {
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
            fibo(n-1);
        }
    }
    public static void main(String args[])
    {
        System.out.print(a+" "+b+" ");
        int n = 10;
        fibo(n-2);
    }

}

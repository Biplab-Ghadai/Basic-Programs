class demo{
    static void rec(int a, int b)
    {
        if(a >= b)
        {
            return ;
        }
        int num = a;
        if(num <= 100)
        {
            if(num%2 == 0)
            {
                System.out.print(num+" ");
            }
        }
        else if(num > 100 && num <=200){
            if(num%2==1)
            {
                System.out.print(num+" ");
            }
        }
        rec(a+1, b);
    }
    public static void main(String args[])
    {
        int a = 1;
        int b = 200;
        rec(a, b);
    }
}
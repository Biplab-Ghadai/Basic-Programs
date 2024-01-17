class GCD{
    public static void main(String args[])
    {
        int n1 = 12, n2 = 13;
        int gcd = (n1 > n2) ? n1 : n2;
        while(true)
        {
            if(n1%gcd == 0 && n2%gcd==0)
            {
                System.out.println(gcd);
                break;
            }
            else{
                gcd--;
            }
        }
    }
}
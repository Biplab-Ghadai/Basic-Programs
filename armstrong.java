public class armstrong{
    public static void main(String args[])
    {
        int num = 371;
        int org = num;
        int rem, res = 0;
        while(org != 0)
        {
            rem = org%10;
            res += Math.pow(rem, 3);
            org = org/10;
        }
        System.out.println(res);
    }
}
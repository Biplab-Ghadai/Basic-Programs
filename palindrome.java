
public class palindrome{
    public static void main(String args[])
    {
        int num = 121;
        int org = num;
        int rem, res = 0;
        while(org != 0)
        {
            rem = org%10;
            res = res * 10 + rem;
            org = org/10;
        }
        System.out.println(res);
    }
}
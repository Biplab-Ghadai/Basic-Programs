// Write a program to check if a number is odd or even without using modulo operator.

class demo{
    public static void main(String args[])
    {
        int num = 73;
        
        int a = num / 2;
        int b = a * 2;
        
        if(b == num)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
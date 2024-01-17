
import java.util.Scanner;
class vending_machine{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int stock = 10;
        int rs = sc.nextInt();
        int c = 0;
        //boolean flag = true;
        while(rs != c)
        {
            if(rs <= stock)
            {
                System.out.println("Candy...!!!");
            }
            else if(rs > stock){
                System.out.println("Out of Stock!!");
                break;
            }
            else{
                System.out.println("Inavalid!!");
                break;
            }
            c++;
        }
    }
}
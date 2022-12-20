import java.util.Scanner;
import java.utli.*;
class prime{
    public static void main(String[] agrs)
    {
        Scanner sc= new Scanner(System.in);
        int n, a=0;
        System.out.println("Enter any integer");
        n= sc.nextInt();
        for (int i=1; i<=n;i++)
        {
            if (n%i==0)
            {
                a++;
            }
        }
        if (a==2)
        {
            System.out.println("the number is prime");
        }
        else{
            System.out.println("The number is composite");
        }
    

    }
}
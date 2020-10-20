import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args)
    {
        int n,i=0;
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        n = input.nextInt();


        for(i=0;i<=n;i=i+2)
        {
            System.out.println(i);
        }
    }
}

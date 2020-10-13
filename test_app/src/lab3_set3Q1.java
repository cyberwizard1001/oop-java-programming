import java.util.Scanner;

public class lab3_set3Q1 {
    static public void main(String[] args)
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int num = input.nextInt();

        int array[][] = new int[num][2];

        for(int i=0;i<num;i++)
        {
            for(int j=0;j<2;j++)
                array[i][j] = input.nextInt();
        }

        for(int i=0;i<num;i++)
        {
            if(array[i][1]%array[i][0]==0)
                System.out.println("Yes");

            else System.out.println("No");

        }

    }
}

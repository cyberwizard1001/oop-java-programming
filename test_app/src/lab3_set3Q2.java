import java.util.Scanner;

public class lab3_set3Q2 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int size = input.nextInt();

        long array[] = new long[size];
        long sum = 0;

        for(int i=0;i<size;i++)
        {
            array[i] = input.nextLong();
            sum+=array[i];
        }

        System.out.println(sum);
        

    }
}

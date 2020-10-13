import java.util.Scanner;

public class lab3_set2Q1 {

    static public void main(String[] args)
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Enter N: ");
        int num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Enter "+num+" numbers: ");
        for(int i=0;i<num;i++)
        {
            array[i] = input.nextInt();
        }

        double cavg = 0;
        double arrsum = 0, j=1;
        for(int i=0;i<num;i++)
        {

            arrsum = arrsum+array[i];
            cavg = arrsum/j;
            System.out.printf(array[i]+"\t"+cavg+"\n");
            j++;
        }
    }
}

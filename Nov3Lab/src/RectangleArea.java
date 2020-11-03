import java.util.Scanner;

public class RectangleArea extends Rectangle{

    public void read_input()
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        width = input.nextInt();
        height = input.nextInt();
    }

    public void display()
    {
        System.out.println(width*height);
    }
}

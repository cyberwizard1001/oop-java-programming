import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    public void display()
    {
        System.out.println(width + " " + height);

    }

    public void read_input() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        width = input.nextInt();
        height = input.nextInt();
    }
}

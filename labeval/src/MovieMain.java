import java.util.Scanner;

public class MovieMain {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String movname;
        String studname;
        String rating;

        Movie[] array = new Movie[3];

        array[0] = new Movie();

        for(int i=1;i<3;i++)
        {

                movname = input.next();
                studname = input.next();
                rating = input.next();
                array[i] = new Movie(movname,studname,rating);

        }

        check(array[0],array[1]);
        for (int i = 0; i < 2; i++) {
            check(array[i],array[2]);
        }


    }

    public static void check(Movie mov1,Movie mov2)
    {
        if(mov1.studio.equals(mov2.studio))
        {
            System.out.println("True");

        }


        else
        {
            System.out.println(mov1.studio);
            System.out.println(mov2.studio);
            System.out.println("False");


        }

    }
}

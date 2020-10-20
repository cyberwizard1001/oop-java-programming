
      import java.util.Scanner;
    class Movie
    {
        String title;
        String studio;
        String rating;
        Movie()
        {
            title = "Casino Royale";
            studio = "Eon Productions";
            rating = "R";
        }
        Movie(String title, String studio,String rating)
        {
            this.title = title;
            this.studio = studio;
            this.rating = rating;
        }


        static void check(String a, String b)
        {
            if((a.equals(b))) // Since when equal it gives zero
            {
                System.out.println("True");
            }
        else
            {
                System.out.println("False");
            }
        }
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            String title;
            String studio;
            String rating;
            Movie one = new Movie();
            title = input.nextLine();
            studio = input.nextLine();
            rating = input.nextLine();
            Movie two = new Movie(title,studio,rating);
            title = input.nextLine();
            studio = input.nextLine();
            rating = input.nextLine();
            Movie three = new Movie(title,studio,rating);
            check(one.studio,two.studio);
            check(one.studio,three.studio);
            check(two.studio,three.studio);
            input.close();
        }
    }








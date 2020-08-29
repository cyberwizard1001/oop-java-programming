import java.util.Scanner;

public class lab1_2 {

    public static void main(String[] args){

/*RollNo
Name
English
Physics
Chemistry
Average
Grade*/

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Name: ");
        String name = input.next();

        System.out.print("Roll no: ");
        String roll = input.next();

        System.out.print("English: ");
        int english = input.nextInt();

        System.out.print("Physics: ");
        int physics = input.nextInt();

        System.out.print("Chemistry: ");
        int chemistry = input.nextInt();

        System.out.print("Average: ");
        int average = (english+chemistry+physics)/3;

        String grade = "not_assigned";

        if(average>90) grade = "O";

        else if (average > 80) grade = "A+";

        else if (average > 70) grade = "A-";

        else if (average > 60) grade = "B+";

        else if (average > 50) grade = "B-";

        else if (average > 40) grade = "P";

        else if (average <=30) grade = "F";



        System.out.println("Name: " + name);

        System.out.println("Roll no: " + roll);

        System.out.println("English: " + english);

        System.out.println("Physics: " + physics);

        System.out.println("Chemistry: " + chemistry);

        System.out.println("Average: " + average);

        System.out.println("Grade: " + grade);


    }
}

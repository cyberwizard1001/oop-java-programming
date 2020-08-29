import java.util.*;
class lab1{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;

        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();

        System.out.printf("The product of the given three numbers is %d",number1*number2*number3);
        input.close();
    }

}
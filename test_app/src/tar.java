import java.io.BufferedReader;
import java.util.*;

public class tar {

        static Scanner input = new Scanner (System.in).useDelimiter("\n");
        public static void main(String[] args) {

            int i,j;
            double ac=0,sc,t;
            System.out.println("enter customer id:");
            i=input.nextInt();
            System.out.println("enter customer name:");
            String e= input.next();
            System.out.println("enter units consumed:");
            j=input.nextInt();
            if(j<=199)
            {
                ac=j*(1.2);

            }
            else if(j>=200 && j<400)
            {
                ac=j*(1.5);

            }
            else if(j>=400 && j<600)
            {
                ac=j*(1.8);

            }
            else if(j>600)
            {
                ac=j*2;

            }
            System.out.println("Actual charges:"+ac);



        }

    }


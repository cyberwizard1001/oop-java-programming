public class lab2_5 {

    static void Lines() {
        for (int i = 0; i < 75; i = i + 1) {
            System.out.print("_");
        }
        System.out.println();

    }
    public static void main(String[] args)
    {
        System.out.println("Bill No: 1012");
        System.out.println("Date: 9-Aug-2020");
        Lines();
        System.out.println("ItemNo       Name         Quantity        Amount");
        System.out.println(" 1           Cinthol       12              200  ");
        System.out.println(" 2           Dettol        10              100  ");
        System.out.println(" 3           Oil            2              100  ");
        Lines();
        System.out.println(" Total                                     400  ");
        Lines();
        System.out.println();



    }
}

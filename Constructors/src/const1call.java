public class const1call {
    public static void main(String[] args)
    {
        const1 p1 = new const1(5,2);
        const1 p2 = new const1(4,3);
        const1 p3 = new const1();

        System.out.println("p1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("p2: (" + p2.x + ", " + p2.y + ")");
        System.out.println("p3: (" + p3.x + ", " + p3.y + ")");

        p2.translate(2,4);
        System.out.println("p2: (" + p2.x + ", " + p2.y + ")");

    }
}

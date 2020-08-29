public class MyFirstApp{

    public static void main (String[] args){

        String[] wordListOne = {"this","is","a","word","list"};
        String[] wordListTwo = {"this","is","another","word","list"};
        String[] wordListThree = {"this","is","yet","another","word","list"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        System.out.println("this is a combined statement: " + wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]);

    }
}

/* System.out.print("I rule ");
        System.out.println("the world!");
        int z = 12;
        while(z < 24)
        {
            System.out.println(z + " is the current value of x");
            z = z+1;
        }
        System.out.println("Loop is over!");

        if(z==24)
            System.out.println("The value of z is 24");*/
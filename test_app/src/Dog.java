class Dog {
        int size;
        String name;

        void bark(int NoofBarks) {
                if (size > 60) {
                        for(int i=0;i<NoofBarks;i++)
                        System.out.println("Wooof! Wooof!");
                } else if (size > 14) {
                        for(int i=0;i<NoofBarks;i++)
                        System.out.println("Ruff! Ruff!");
                } else {
                        for(int i=0;i<NoofBarks;i++)
                        System.out.println("Yip! Yip!");
                }
        }
}
class parent {
    int a = 15, b = 30;

    void display() {
        int c = a + b;
        System.out.println("The sum " + c);
    }
}
    class child extends parent {
        void display() {
            super.display();
            int d = a * b;
            System.out.println("the product is " + d);
        }
    }

        class M_Overrid {
            public static void main(String args[]) {
                child ob = new child();
                ob.display();
            }
        }




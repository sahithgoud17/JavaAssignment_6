package assignment6;

public class Constructor
    {
        public Constructor(int a,int b)
        {
            this(5);
            System.out.println("Constructor with two parameters: " + a + " and " + b);
        }
        public Constructor(int number)
        {
            System.out.println("Constructor with one parameter: " + number);
        }

        public static void main(String[] args)
        {
            Constructor obj = new Constructor(6,9);
        }
    }



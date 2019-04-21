//Write a Java Program to demonstrate use of nested class

class OuterClass{
        static int sNumber = 10;
        
        int dNumber = 20;

        private static int psNumber = 30;

        static class Inner{
                void display(){
                        System.out.println("Outer Class:\n");
                        System.out.println("Static Number:\t" + sNumber + "\n");
                        //System.out.println("Default Number:\t" + dNumber + "\n");
                        System.out.println("Private Statics Numbers:\t" + psNumber + "\n");
                }
        }
}

class Driver{
        public static void main(String[] args) {
                OuterClass.Inner instance = new OuterClass.Inner();

                instance.display();
        }
}
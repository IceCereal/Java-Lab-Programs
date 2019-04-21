//Write a Java Program to demonstrate use of sub class

public class baseClass{
        private int private_number;
        protected int protected_number;
        public int public_number;
        int default_number;

        static private int s_private_number = 9;
        static protected int s_protected_number = 19;
        static public int s_public_number = 29;
        static int s_default_number = 39;

        public static void main(String[] args){
                s_private_number = 10;
                s_protected_number = 20;
                s_public_number = 30;
                s_default_number = 40;

                baseClass ins_bC = new baseClass();
                ins_bC.private_number = 11;
                ins_bC.protected_number = 21;
                ins_bC.public_number = 31;
                ins_bC.default_number = 41;

                System.out.println("Static:");
                System.out.println("Private:\t" + s_private_number);
                System.out.println("Public:\t\t" + s_public_number);
                System.out.println("Protected:\t" + s_protected_number);
                System.out.println("Default:\t" + s_default_number);

                System.out.println("\nInstance:");
                System.out.println("Private:\t" + ins_bC.private_number);
                System.out.println("Public:\t\t" + ins_bC.public_number);
                System.out.println("Protected:\t" + ins_bC.protected_number);
                System.out.println("Default:\t" + ins_bC.default_number);

        }
}

class derivedClass extends baseClass{
        public static void main(String[] args){
                System.out.println("Static:");
                //System.out.println("Private:\t" + s_private_number);
                System.out.println("Public:\t\t" + s_public_number);
                System.out.println("Protected:\t" + s_protected_number);
                System.out.println("Default:\t" + s_default_number);

                baseClass ins_bC = new baseClass();
                //ins_bC.private_number = 13;
                ins_bC.protected_number = 23;
                ins_bC.public_number = 33;
                ins_bC.default_number = 43;

                System.out.println("\nInstance:");
                //System.out.println("Private:\t" + ins_bC.private_number);
                System.out.println("Public:\t\t" + ins_bC.public_number);
                System.out.println("Protected:\t" + ins_bC.protected_number);
                System.out.println("Default:\t" + ins_bC.default_number);
        }
}
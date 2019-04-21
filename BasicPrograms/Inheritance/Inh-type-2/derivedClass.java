import p1.baseClass;

class derivedClass{
        public static void main(String[] args) {
                baseClass ins_bC = new baseClass();
                //ins_bC.private_number = 11;
                //ins_bC.protected_number = 21;
                ins_bC.public_number = 31;
                //ins_bC.default_number = 41;

                System.out.println("Static:");
                //System.out.println("Private:\t" + ins_bC.s_private_number);
                System.out.println("Public:\t\t" + ins_bC.s_public_number);
                //System.out.println("Protected:\t" + ins_bC.s_protected_number);
                //System.out.println("Default:\t" + ins_bC.s_default_number);

                System.out.println("\nInstance:");
                //System.out.println("Private:\t" + ins_bC.private_number);
                System.out.println("Public:\t\t" + ins_bC.public_number);
                //System.out.println("Protected:\t" + ins_bC.protected_number);
                //System.out.println("Default:\t" + ins_bC.default_number);
        }
}
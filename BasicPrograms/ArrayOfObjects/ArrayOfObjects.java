//Write a Java Program to implement array of objects.

class Base{
        int iNumber;
}

class Derived{
        public static void main(String[] args) {
                Base[] object = new Base[10];

                for(int lv = 0; lv < object.length; ++lv){
                        object[lv] = new Base();
                        object[lv].iNumber = lv * 10;
                }

                for(int lv = 0; lv < object.length; ++lv){
                        System.out.println("\n" + object[lv].iNumber);
                }
        }
}
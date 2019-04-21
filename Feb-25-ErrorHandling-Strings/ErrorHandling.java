class in_BuiltErrorBoi{
    public static void main(String[] args){
        System.out.println("Error Handling:");

        int num = 0;
        int denom = 0;

        try{
            int result = num / denom;

        } catch (ArithmeticException E) {
            System.out.println("Whoopise!\n");
            E.printStackTrace();
            System.out.println("\nOr\n");
            System.out.println(E.toString());
            System.out.println("\nOr\n");
            System.out.println(E.getMessage());

        } finally {
            System.out.println("Finally Block");
        }
        
    }
}

class priceCheck extends Exception{
    
    private int price;

    public priceCheck(int price){
        this.price = price;
    }

    public String toString(){
        return "The price of any object cannot be negative! You entered:\t" + price;
    }

}

class user_DefinedErrorBoi{
    public static void main(String[] args){
        int[] price = {40, -20, 10, 22, -120};

        for (int i : price){
            try{
                if (i < 0){
                    throw new priceCheck(i);
            	}
        	} catch (priceCheck E){
            	E.printStackTrace();
        	}    
        }

        

    }
}
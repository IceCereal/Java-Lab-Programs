import java.util.StringTokenizer;
//import sun.util.locale.StringTokenIterator;

class stringTest{
    public static void main(String[] args){
		StringBuffer sBuff_1 = new StringBuffer("Hello");
		System.out.println(sBuff_1);
		System.out.println("Capacity:\t" + sBuff_1.capacity());
		
		sBuff_1.append(" from the other side!!!");
		System.out.println(sBuff_1);
		System.out.println("Capacity:\t" + sBuff_1.capacity());

		System.out.println("\nindexOf(other):\t" + sBuff_1.indexOf("other"));
		System.out.println("length:\t" + sBuff_1.length());
		System.out.println("toString:\t" + sBuff_1.toString());

		StringTokenizer sT = new StringTokenizer("\nHello from the other StringTokenizer", " ");
		
		while (sT.hasMoreTokens()){
			System.out.println(sT.nextToken());
		}
	}
}

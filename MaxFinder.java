public class MaxFinder {
    public static void main(String[] args) {
    	Integer a = 2, b = 4, c =5;
    	findMaximum(a,b,c);
    }
    private static void findMaximum(Integer a, Integer b, Integer c) {
    	
        Integer max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("max");
    
    }
}
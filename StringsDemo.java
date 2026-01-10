public class StringsDemo {
    public static void main(String[] args) {

        String lit1 = "hello"; 
        String lit2 = "hello";
        String new1 = new String("hello");
        
        System.out.println("lit1 == lit2: " + (lit1 == lit2)); // true
        System.out.println("lit1 == new1: " + (lit1 == new1)); // false
        
        // Methods
        String s = "PlacementPrep";
        System.out.println("Length: " + s.length()); // 12
        System.out.println("Char at 0: " + s.charAt(0)); // P
        System.out.println("Index of e: " + s.indexOf('e')); // 5
        System.out.println("Upper: " + s.toUpperCase()); // PLACEMENTPREP
        System.out.println("Lower: " + s.toLowerCase()); // placementprep
        
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Placement"); // Java Placement
        System.out.println("StringBuilder: " + sb.toString()); 


    }
}

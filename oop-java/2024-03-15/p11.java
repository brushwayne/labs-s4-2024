public class p11 {

    public static void main(String[] args) {
        String str = "This is a sample string.";

        boolean match = str.regionMatches(true, 10, "sample", 0, 6); 
        System.out.println("Does 'sample' (ignore case) match from index 10 (exclusive) for 6 characters? " + match);

        match = str.regionMatches(false, 5, "is", 0, 2); 
        System.out.println("Does 'is' match from index 5 (exclusive) for 2 characters? " + match);

        System.out.println("Does the string start with 'This'? " + str.startsWith("This"));

        System.out.println("Does the string end with 'string.'? " + str.endsWith("string."));

        int comparison = str.compareTo("This is a smaller string.");
        System.out.println("Comparison result (str vs 'This is a smaller string.'): " + comparison);

        comparison = str.compareTo("This is a larger string.");
        System.out.println("Comparison result (str vs 'This is a larger string.'): " + comparison);

        int index = str.indexOf("is");
        System.out.println("Index of the first occurrence of 'is': " + index);

        index = str.indexOf("is", 10);
        System.out.println("Index of the second occurrence of 'is' (starting from index 10): " + index);
    }
}

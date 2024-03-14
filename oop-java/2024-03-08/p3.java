class p3 {
   public static void main(String args[]) {

    int arr[] = new int[5];

    try {
        arr[6] = 1234;
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array Overflow: " + e);
    }
   } 
}

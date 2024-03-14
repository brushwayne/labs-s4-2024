class p4 {

    public static void main(String args[]) {

        int[] arr = null;

        try {
            for (int i: arr) {
                System.out.println(i);
            } 
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}

class p10 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java is my favorite Programming Language");

        sb.append(" for many reasons.");
        System.out.println("After append: " + sb);

        sb.insert(15, " object-oriented ");
        System.out.println("After insert: " + sb);

        sb.delete(25, 35);
        System.out.println("After delete: " + sb);

        sb.ensureCapacity(100);

        int capacity = sb.capacity();
        System.out.println("Capacity: " + capacity);

        sb.reverse();
        System.out.println("After reversing: " + sb);
    }
}

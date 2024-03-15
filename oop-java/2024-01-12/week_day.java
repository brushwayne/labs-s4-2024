class week_day {
    public static void main(String kekwa[]) {
        
        int day = 31;

        if (day > 31) {
            System.out.println("Such day does not exist!");
        }

        int week = day / 7 + 1;

        System.out.println(week);
        
    }
}

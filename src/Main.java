public class Main {

    public static void main(String[] args) {
        System.out.println("100 pages -> " + calculateReadingTime(100) + " min");
        System.out.println("500 pages -> " + calculateReadingTime(500) + " min");
        System.out.println("800 pages -> " + calculateReadingTime(800) + " min");
    }

    // Boundary decision: A book of exactly 500 pages is not fatiguing because the prompt 
    // specifies "over 500 pages", meaning strict inequality (> 500) applies.
    static int calculateReadingTime(int pages) {
        int minutes = pages * 2;

        if (pages > 500) {
            minutes = minutes + (minutes / 10); // add 10% fatigue penalty
        }

        return minutes;
    }
}
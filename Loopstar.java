public class Loopstar {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 7;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println(); // move to next line
        }
    }
}

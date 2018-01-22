import java.util.Scanner;

public class Bot {

    private Scanner scan = new Scanner(System.in);

    public void run() {
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.length() == 0) {
                continue;
            }
            String[] parts = line.split(" ");
            switch (parts[0]) {
                case "settings":
                    break;
                case "update":
                    break;
                case "action":
                    System.out.println("right");
                    break;
                default:
                    break;
            }
        }
    }
    public static void main(String[] args) {
        (new Bot()).run();
    }
}

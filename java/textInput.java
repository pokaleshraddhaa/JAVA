import java.util.Scanner;
public class textInput {
    public static void main(String[] args) {
        Scanner input = new
        Scanner(System.in);

        System.out.println("Enter text: ");
        String data = input.nextLine();
        System.out.println("Input Data:" + data);

        input.close();
    }
}

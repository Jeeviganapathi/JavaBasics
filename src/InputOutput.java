import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {
        //using Buffered Reader
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Enter your name and age:");
        String inputString = bufferedReader.readLine();
        int inputAge = Integer.parseInt(bufferedReader.readLine());

        System.out.printf("%s is %d years old", inputString, inputAge);

        //using Scanner class

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name and height: ");

        String name = scanner.next();
        int height = scanner.nextInt();

        System.out.printf("%s is %d cms tall", name, height);
    }
}

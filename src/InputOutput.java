import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    }
}

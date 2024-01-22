public class Loops {

    public static void main(String[] args){


        //while loop
        int i=0;
        while (i<5 && i>=0){
            System.out.println("Value of I is " + i);
            i++;
        }

        System.out.println();

        //For loop
        for (int j= 0; j<5; j++){
            System.out.println("Value of J is " + j);
        }

        // Do While loop
        int k = 0;
        do {
            System.out.println("Hi");
            k++;
        } while (k < 5);
    }

}

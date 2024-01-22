public class Operators {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;

        //Basic Arithmetic Operations
        System.out.println("Adding a and b = " + add(a, b));
        System.out.println("subtracting b from a= " + sub(a, b));
        System.out.println("Multiplying a and b = " + mul(a, b));
        System.out.println("Dividing b by a = " + div(a, b));
        System.out.println("Remainder while dividing b by a = " + findRemainder(a, b));

        System.out.println("Are A and B not equal to zero and A is greater than B " + isGreaterThan(a, b) );

        System.out.println("Is A greater than B" + isGreaterThanUsingTernaryOperator(a, b) );
    }

    //Basic Arithmetic Operations
    public static int add(int x, int y){
        return x+y;
    }
    public static int sub(int x, int y){
        return x-y;
    }

    public static int mul(int x, int y){
        return x*y;
    }
    public static int div(int x, int y){
        return y/x;
    }

    public static int findRemainder(int x, int y){
        return y%x;
    }

    //Logical Operations combined with Comparison operator

    public static boolean isGreaterThan(int x, int y){
        return x!=0 && y!=0 && x>y;
    }

    //ternary operator
    public static boolean isGreaterThanUsingTernaryOperator(int x, int y){
        return x>y ? true : false;
    }
}

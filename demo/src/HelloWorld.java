import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Input user entered is : " + x);
    }
}


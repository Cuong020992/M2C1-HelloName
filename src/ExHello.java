import java.util.Scanner;

public class ExHello {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}

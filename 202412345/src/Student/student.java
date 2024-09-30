package Student;

//202412343 김규민
import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        char c;
        System.out.print("첫번째 정수를 입력하세요: ");
        a = scanner.nextInt();
        System.out.print("두번째 정수를 입력하세요: ");
        b = scanner.nextInt();
        System.out.print("연산자를 입력하세요(+, -, *, /): ");
        c = scanner.next().charAt(0);

        if (c == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (c == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (c == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (c == '/') {
            if (b == 0) {
                System.out.println("오류: 0으로 나눌 수 없습니다.");
            } else {
                System.out.println(a + " / " + b + " = " + ((double)a / b));
            }
        } else {
            System.out.println("잘못된 연산자입니다.");
        }
        scanner.close();
    }
}

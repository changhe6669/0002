import java.util.Scanner;

public class InputCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入您的身份证号：");
        String code = scan.nextLine();
        System.out.println("原来你的身份证号码是："+code.length()+"位的啊");

    }
}

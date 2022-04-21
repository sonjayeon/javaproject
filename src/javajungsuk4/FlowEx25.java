package javajungsuk4;

import java.util.*;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0; int sum = 0;
        System.out.print("숫자를 입력하세요. (예:12345)>");

        Scanner sc = new Scanner(System.in);
        int tmp = sc.nextInt();
        num = tmp;

        while(num!=0) {
            sum += num%10;
            System.out.printf("sum=%3d num=%d%n", sum, num);

            num /= 10;
        }
        System.out.println("각 자리수의 합:" + sum);
    }
}

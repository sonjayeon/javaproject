package javajungsuk4;

import java.util.*;

public class FlowEx17 {
    public static void main(String[] args) {
        int num = 0;

        System.out.print("*을 출력할 라인 수를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int tmp = scanner.nextInt();
        num = tmp;

        for(int i=0; i<num; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

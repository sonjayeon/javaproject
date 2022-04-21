package javajungsuk6;

class Data2 {
    int value;
}
class Data3 {
    int value;

    Data3(int x) {
        value = x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data2 d2 = new Data2();
       // Data3 d3 = new Data3(); // 컴파일 에러발생. Data3에 생성자 Data3가 정의되지 않았기 때문
    }
}

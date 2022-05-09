package javajungsuk8;

class FinallyTest2 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        }
    }
    static void startInstall() {
        /* 프로그램 설치 */
    }
    static void copyFiles() {}
    static void deleteTempFiles() {}
}

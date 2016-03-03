public calss TestThread extends Thread {
    String message;
    public TestThread(String msg) {
        message = msg;
    }
    public void run() {
        for (;;) {
            System.out.println(message);
        }
    }
    public static void main(String[] argv) {
        TestThread s1, s2;
        s1 = new TestThread("我是憲一 ヽ(=^･ω･^=)丿");
        s2 = new TestThread("我是盈佳 ლ(╹◡╹ლ )");
        s1.start();        
        s2.start();
        for (;;) {
            System.out.println("我是主程式");
        }
    }
}

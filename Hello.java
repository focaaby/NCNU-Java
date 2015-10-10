import java.util.Scanner;
public class Hello {
    String message;
    public Hello(String m) {
        this.message = m;
    }
    public void sayHello() {
        System.out.println(message);
    }
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a word: ");
        if (input.hasNext()) {
            String s = input.next();
            Hello h = new Hello(s);
            h.sayHello();
        } else {
        }
    }
}
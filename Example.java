/* 
Java 的scope分成四種, 以class為單位
private(只能用於定義的Class)
package(預設, 同一個Package(目錄)內容的class可用)
protected(package + 子類別可用)
public(任何class都可用)


*/

public class Example {
    // because java compiler will creat a null constructor for you
    public Example() {
    }
    int i; //object var default is 0 for number
    //flse for boolean, null for reference
    public void fun() {
        while (i < 10) {
	    System.out.println(i);
	    i++;
	}
    }
    public static void main(String[] argv) {
        Example x = new Example();
	x.fun();
    }
}

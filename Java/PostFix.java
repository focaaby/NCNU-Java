import java.util.Scanner;
public class PostFix {
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String token = input.next();
            if (token.equals("+")) {
	        } else if(token.equals("-")) {
	        } else if(token.equals("*")) {
	        } else if(token.equals("/")) {
	        } else if(token.equals("%")) {
	        } else if(token.equals("^")) {
	        } else {
                int val;
                try {
                    val = Integer.parseInt(token);
		        } catch(Exception err) { 
                    System.out.println("你輸入啥鬼東西啊");
                    return;
                }
            }
        }
    }
}

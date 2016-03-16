import java.math.BigInteger;
public class Postfix {
    public static BigInteger eval(String[] ops) {
        Stack s = new Stack();
        for (int i = 0; i < ops.length ; i++) {
            if (ops[i].equals("+")) {
                s.push(s.pop().add(s.pop()));
            } else if (ops[i].equals("*")) {
                s.push(s.pop().multiply(s.pop()));
            } else {
                s.push(new BigInteger(ops[i]));
            }
        }
        return s.pop();
    }
    public static void main(String[] argv) {
        String[] expression = new String[] {"1", "3", "5", "*", "+"};
        System.out.print("Postfix.eval(expression).toString()");
    }
}

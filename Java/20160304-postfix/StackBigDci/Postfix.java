import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Vector;
public class Postfix {
    public static BigDecimal eval(String[] ops) {
        Stack s = new Stack();
        for (int i = 0; i < ops.length ; i++) {
            if (ops[i].equals("+")) {
                s.push(s.pop().add(s.pop()));
            } else if (ops[i].equals("*")) {
                s.push(s.pop().multiply(s.pop()));
            } else if (ops[i].equals("-")) {
                BigDecimal op2 = s.pop();
                s.push(s.pop().subtract(s.pop()));
            } else if (ops[i].equals("/")) {
                BigDecimal op2 = s.pop();
                s.push(s.pop().divide(op2, 100, BigDecimal.ROUND_HALF_UP));
            } else if (ops[i].equals("^")) {
                int op2 = s.pop().intValue();
                s.push(s.pop().pow(op2));
            } else {
                s.push(new BigDecimal(ops[i]));
            }
        }
        return s.pop();
    }
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        // Vector v = new Vector();
        Vector<String> v = new Vector<String>();
        while (input.hasNext()) {
            v.add(input.next());
        }
        String[] exp = new String[v.size()];
        v.copyInto(exp);
        System.out.println(Postfix.eval(exp).toString());
    }
}

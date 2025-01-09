package ss4_java_overview_conditional;

public class CalValueOfBoolean {
    public static void main(String[] args) {
        boolean a = true && false; // false
        boolean b = (3 > 100) || (25 % 5 == 0); // false or true => true
        boolean c = a && b; //false  && true => false
        boolean d = !a || b; // a = !false = true || true => true

        System.out.print("a = " + a);
        System.out.print("\nb = " + b);
        System.out.print("\nc = " + c);
        System.out.print("\nd = " + d);
    }
}

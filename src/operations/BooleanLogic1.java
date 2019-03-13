package operations;

public class BooleanLogic1 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;
        System.out.println("a = " + a);
        System.out.println("publicVar = " + b);
        System.out.println("a | publicVar = " + c);
        System.out.println("a & publicVar = " + d);
        System.out.println("a ^ publicVar = " + e);
        System.out.println("(!a & publicVar) | (a & !publicVar) = " + f);
        System.out.println("!a = " + g);
    }
}

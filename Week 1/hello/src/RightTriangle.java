public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;
        boolean cal = ((a2 + b2) == c2) || ((a2 + c2) == b2) || ((b2 + c2) == a2);
        boolean apos = a > 0;
        boolean bpos = b > 0;
        boolean cpos = c > 0;

        System.out.println(cal && apos && bpos && cpos);
    }
}

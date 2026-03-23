public class Type_Casting {
    public static void main(String[] args) {
        int a = 7;
        double b = a; // auto Widening (byte -> short -> char -> int -> long -> float -> double) casting
        
        int c = (int) b; // manual Narrowing (double -> float -> long -> int -> char -> short -> byte) casting
        System.out.println(c);
    }
}
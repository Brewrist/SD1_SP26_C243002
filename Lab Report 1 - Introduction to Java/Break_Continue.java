public class Break_Continue {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i%2==0) {
                break; //breaks the whole loop
            }
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i%2!=0) {
                continue; //skips only this round, loop continus
            }
            System.out.println(i);
        }
    }
}

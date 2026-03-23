public class Arrays {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String[] str = { "Tomatos", "Should", "Not", "Be", "Called", "Fruit", "Unfortunately", "It", "Isn't", "Vegetable"};
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + ". ");
            System.out.println(str[i]);
        }

    }
}
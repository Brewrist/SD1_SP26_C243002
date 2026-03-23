public class Strings {
    public static void main(String[] args) {
        String s = "It is a String";
        String ln = "Hello World";
        System.out.println(s + ln);
        System.out.println("Hello World - Length: " + ln.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println("Index of 'String: ' =" + s.indexOf("String"));
        System.out.println("Character At: " + s.charAt(9));
        System.out.println(s.equals(ln)); // returns if true else false
    }
}
public class math {
    public static void main(String[] args) {
        System.out.println(Math.max(100,200)); //returns max
        System.out.println(Math.min(34,27)); //returns min
        System.out.println(Math.abs(-125)); //returns absolute
        System.out.println(Math.sqrt(132)); //returns sqare root
        System.out.println(Math.pow(2,12)); //returns 2^12
        System.out.println(Math.round(3.7)); //returns rounds up to the nearest int
        System.out.println(Math.ceil(9.1)); //returns rounds up (returns the smallest integer greater than or equal to x)
        System.out.println(Math.floor(8.9)); //return  rounds down (returns the largest integer less than or equal to x)
        System.out.println(Math.random()); //return returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    }
}


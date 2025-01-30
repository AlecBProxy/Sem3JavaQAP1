public class TestTime {
    public static void main(String[] args) {
        //Constructing our initial variables
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 24);

        //Displaying our initial times
        System.out.println("Time t1: " + t1.toString());
        System.out.println("Time t2: " + t2.toString());

        //Utilizing our modification methods
        t1.nextSecond();
        t2.previousSecond();

        //Displaying our results of our modification methods
        System.out.println("1 second after t1's time: " + t1.toString());
        System.out.println("1 second before t2's time: " + t2.toString());
    }
}

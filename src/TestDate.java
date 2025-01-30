public class TestDate {
    public static void main(String[] args) {
        //Creating a new date object
        Date date = new Date(9, 2, 2002);

        //Displaying our date object
        System.out.println("Date: " + date.toString());

        //Change the date using our setDate method
        date.setDate(15, 6, 2006);

        //Display the modified date
        System.out.println("Modified date: " + date.toString());
    }
}

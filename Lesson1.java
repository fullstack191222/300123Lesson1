public class Main {
    public static void main(String[] args) {


        int x = 5;
        int y = 8;
        System.out.println("X: " + x + " Y: " + y);
        //changing values in the variables with third parameter.
        //logic starts here
        int z = x;
        x = y;
        y = z;
        System.out.println("X: " + x + " Y: " + y);
        //changing values in the variables without third parameter.
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("X: " + x + " Y: " + y);
        //Strings
        String name = "Arya";
        String familyName = "Stark";
        //+ with strings
        String fullName = name + " " + familyName;
        System.out.println(fullName);


    }
}

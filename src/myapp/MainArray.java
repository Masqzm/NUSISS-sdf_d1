package myapp;

public class MainArray {
    public static void main(String[] args) {
        String[] myList = new String[3];

        myList[0] = "hello";
        myList[1] = "world";
        myList[2] = "wwwww";

        // prints out address of array
        System.out.println(myList);
        System.out.printf(">> %s\n", myList[2]);
        // print allocated array size
        System.out.printf(">> size: %d\n", myList.length);
    }
}

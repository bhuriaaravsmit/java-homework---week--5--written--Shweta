
/*
Write a Java program to create a new array list, add some colours (string)
and printout the collection using for each loop.
 */


import java.util.ArrayList;

public class Programme_4_ColoursArrayList {

    public static void main(String[] args) {

        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Orange");
        colorList.add("Cyan");
        colorList.add("Brown");


        for (String colourList : colorList) {
            System.out.println(colorList + ",");
        }

    }
}

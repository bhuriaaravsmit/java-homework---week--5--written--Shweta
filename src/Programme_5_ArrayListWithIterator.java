
/*Write a Java program to iterate through all elements in an array list using Iterator.
 */


import java.util.ArrayList;
import java.util.ListIterator;

public class Programme_5_ArrayListWithIterator {


    public static void main(String[] args) {

        ArrayList<String > fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Strawberry");
        fruitList.add("Pineapple");
        fruitList.add("Watermelon");

        ListIterator<String> iterate = fruitList.listIterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next() + ",");
        }

    }
}

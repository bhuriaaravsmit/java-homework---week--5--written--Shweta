
/*
Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */

import java.util.ArrayList;

public class Programme_7_FruitNames {

        public void isEmpty(){
            ArrayList< String> fruitList = new ArrayList<>();
            fruitList.add("Banana");
            fruitList.add("Apple");
            fruitList.add("Cherry");
            fruitList.add("DragonFruit");
            fruitList.add("Grapes");
            fruitList.add("Kiwi");
            fruitList.add("Orange");
            fruitList.add("Watermelon");

            System.out.println("Given Array Lost :" +fruitList);
            if(fruitList.isEmpty())
            {
                System.out.println("Given Array List Empty!!");
            }
            else {
                System.out.println("Given Array List is not Empty!!");
            }

        }

    public static void main(String[] args) {

        Programme_7_FruitNames obj = new Programme_7_FruitNames();
obj.isEmpty();
    }


}

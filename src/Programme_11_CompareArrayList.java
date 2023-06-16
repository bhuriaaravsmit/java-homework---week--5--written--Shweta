import java.util.ArrayList;

public class Programme_11_CompareArrayList {


    public static void main(String[] args) {

        ArrayList<String >  c1=new ArrayList<>();

        c1.add("Red");
        c1.add("Green");
        c1.add("White");
        c1.add("Black");
        c1.add("Brown");
        c1.add("Blue");
        c1.add("Violate");
        ArrayList<String >  c2=new ArrayList<>();
       c2.add("Red");
       c2.add("Green");
       c2.add("White");
       c2.add("Black");
       c2.add("Blue");
        //String the comparison output in ArrayList<String>
        ArrayList<String> c3= new ArrayList<>();
        for(String e:c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);


    }



}

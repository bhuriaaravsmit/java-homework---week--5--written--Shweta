import java.util.Arrays;

public class Programme_3_ReverseArray {


    public static void main(String[] args) {

       int []array = new int [] {23,45,54,68,78};//Single dimension array
        System.out.println("original array : " + Arrays.toString(array));
        Programme_3_ReverseArray obj = new Programme_3_ReverseArray();
        System.out.println("Reverse array : ");
        obj.reverseArray(array);



    }

    //method to reverse an array
    public void reverseArray(int[] list){

        for(int i=0;i <(list.length) /2 ;i++)
        {
            int temp = list[i];
                    list[i] = list[list.length-1 -i];
            list[list.length-1 -i ] =temp;
        }
        System.out.println(Arrays.toString(list));
    }
}

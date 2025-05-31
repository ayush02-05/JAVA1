package DYNAMIC.ARRAY;

import java.util.ArrayList;

public class D_array {
    
    public static void main(String[] args) {
        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(5);
        arr.add(325);
        arr.add(45);  //To add an element in array 
        arr.add(556);
        System.out.println(arr);
       System.out.println( arr.get(1));   // to get the element of required index 
       arr.remove(3);   // to remove thee element of required index
       System.out.println(arr);
    }
}

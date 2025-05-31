package DYNAMIC.SET;

import java.util.HashSet;

public class set {
    
    // public static void main(String[] args) {
    //     HashSet<String> set = new HashSet<>();
    //     set.add("A");
    //     set.add("A");
    //     set.add("F");
    //     set.add("b");
    //     set.add("a");
    //     System.out.println(set);
    // }

    public static void main(String[] args) {
        
        int[] arr = {1,3,2,2,4,5,6,3};
        HashSet<Integer> set = new HashSet<>();
        int count =0;
        for(int i=0 ;i<arr.length;i++)
        {
            int a = arr[i];
            if(set.contains(a))
            {
                System.out.println( a  + " is the first repeating element");
                break;
            }
            else{
                set.add(a);
            }
        }
    }
}

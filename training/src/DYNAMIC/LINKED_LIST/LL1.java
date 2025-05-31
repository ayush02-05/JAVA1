package DYNAMIC.LINKED_LIST;

import java.util.LinkedList;

public class LL1 {
    public static void main(String[] args) {
        
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(23);
        System.out.println(LL);
        LL.push(43);
        System.out.println(LL);
        LL.pop();
        System.out.println(LL); 
    }
}

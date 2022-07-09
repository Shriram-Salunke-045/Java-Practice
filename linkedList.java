import java.util.*;
public class linkedList {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList <Integer>();

        list.add(12);
        list.add(13);
        list.add(15);

        System.out.println(list);

        // add a element
        list.add(2,14);
        System.out.println(list);

        // removing the elements
     list.remove(1);
     System.out.println(list);
     
     // update a elements
     list.set(0,11);
     System.out.println(list);
     
     // size of a list
     System.out.println(list.size());
     
     for(int i=0; i<list.size(); i++){
         System.out.println(list.get(i)); // list[i] == list.get(i)
    }
}
}

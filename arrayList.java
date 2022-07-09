import java.util.*;
public class Main{
 public static void main (String[] args) {
    
     ArrayList<Integer> list = new ArrayList<Integer>();
     
     
     list.add(12);
     list.add(15);
     list.add(18);
     
     
     System.out.println(list);
     
     // // Add elements
     list.add(2, 17);
     
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

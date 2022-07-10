import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.add(12);
        stack.add(13);
        stack.add(14);

        System.out.println(stack);

        // add a element
        stack.add(2,15);
        System.out.println(stack);

        // removing the elements
     stack.remove(1);
     System.out.println(stack);
     
     // update a elements
     stack.set(0,11);
     System.out.println(stack);
     
     // size of a list
     System.out.println(stack.size());
     
     for(int i=0; i<stack.size(); i++){
         System.out.println(stack.get(i)); // list[i] == list.get(i)
    }
    }
}

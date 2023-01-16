// To reverse a given String
import java.util.*;
class Main{
    public static void main(String[] args){
        
        String  s1="Ramraje";
        String r1="";
        
        for(int i=0; i<s1.length(); i++){
            r1=s1.charAt(i)+r1;
        }
        System.out.println(r1);
    }
}

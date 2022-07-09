// recursion in java . solving 5 factorial
public class Main
{
    public static int fact(int num){
        
        //base condition
        if(num==0){
            return 1;
        }
        
        // assumption
        int smallAns = fact(num-1);
        
        // small work
        return num * smallAns;
        
    }
	public static void main(String[] args) {
	    int num=5;
	    System.out.println(fact(num));
	}
}

class  Ass{

    int x; String y;

    // Parameterized  Constructor i.e with  parameter
    Ass(int a ,String b){
       x=a; y=b;
    }
    
    void show(){
       System.out.println(x+" "+y);
    }
}
class ParameterizedConstructor{
    public static void main(String[] args) {
        
        Ass obj = new Ass(100,"shriram");
        obj.show();
    }
}

class  A{

    int a; String name;

    // Constructor of class A
    A(){
        a=0;  name = "null";
    }
    
    void show(){
        System.out.print(a+" "+name);
    }
}
class Constructor{
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();
    }
}

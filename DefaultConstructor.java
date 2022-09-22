class  As{

    int a; String name;

    // default Constructor i.e without parameter
    As(){
        a=78;  name = "Shriram";
    }
    
    void show(){
        System.out.print(a+" "+name);
    }
}
class DefaultConstructor{
    public static void main(String[] args) {
        
        As obj = new As();
        obj.show();
    }
}

class B{
    int a,b;
    B(){
        a=30; b=40;
        System.out.println(a+" "+b);
    }
    {
        a=10; b=20;
        System.out.println(a+" "+b);
    }
}
class InstanceBlock{
    public static void main(String[] args) {
        B r = new B(); 
    }
    
}

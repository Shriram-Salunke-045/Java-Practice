class Ram{
    int a; double b; String c;

    Ram(){
        a=100; b=50.45; c = "Shri";

    }

    Ram(int x){
        a=x;
    }

    Ram( double y, String z){
        b=y; c=z;
    }
}

class ConstructorOverloading{
     public static void main(String[] args) {
        
     
    
        Ram r = new Ram();
        Ram r2 = new Ram(125);
        Ram r3 = new Ram(25.24,"Shriram");

        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r2.a+" "+r2.b+" "+r2.c);
        System.out.println(r3.a+" "+r3.b+" "+r3.c);
    }
}

class PrivateConstructor{
    int a; String b;
    
    
   private PrivateConstructor(){
        a=10; b="Shriram";
        System.out.println(a+" "+b);
   }

        public static void main(String[] args) {

            PrivateConstructor obj = new PrivateConstructor();
        
        }
   }

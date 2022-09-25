class Student{   // super class
    int rollNo; String name; int  marks;

    void input(){
        System.out.println("Enter the roll No , name and marks");
    }
}

class Simple_Inheritance extends Student{  // sub-class 
    
    void disp(){
        rollNo=54; name="Shriram"; marks=87;
        System.out.println(rollNo+" "+name+" "+marks);
    }
    public static void main(String[] args) {
        Simple_Inheritance obj = new Simple_Inheritance();
        obj.input();
        obj.disp();
    }
       
}

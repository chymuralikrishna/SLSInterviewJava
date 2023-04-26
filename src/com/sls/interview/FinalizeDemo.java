package com.sls.interview;

public class FinalizeDemo {
public static void main(String[] args) {
   
        MyClass obj = new MyClass(123);
        obj = null;
//        System.gc(); // request garbage collection
    

}
    
    
    


}
class MyClass {
    private int id;
    
    public MyClass(int id) {
        this.id = id;
    }
    
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object with ID " + id + " is being destroyed.");
    }
}
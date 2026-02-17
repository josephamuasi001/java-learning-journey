public class B extends A {

    @Override 
    public void greet(String message) {
       message = "Greeting from B: " + message;
       System.out.println(message);
    }
}
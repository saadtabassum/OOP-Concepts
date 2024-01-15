abstract class Language {

    // method of abstract class
    public void display() {
      System.out.println("This is Java code ");
    }
  }
  
  class Abstraction extends Language {
  
    public static void main(String[] args) {
      
      // create an object of Main
      Abstraction obj = new Abstraction();
  
      // access method of abstract class
      // using object of Main class
      obj.display();
    }
  }

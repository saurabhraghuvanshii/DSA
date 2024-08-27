public class OOPS {
   public static void main(String args[]){
    // Pen p1 = new Pen();
    // p1.setColor("Blue");
    // System.out.println(p1.getColor());
    // p1.setTip(5);
    // System.out.println(p1.getTip());
    // p1.setColor("yellow");
    // //p1.setColor ="yellow";
    // System.out.println(p1.getColor());

    // BankAccount myAcc = new BankAccount();
    // myAcc.username = "saurabh";
    // myAcc.setPassword("sdgasfdadfa");
    Fish shark = new Fish();
    shark.eat();
    

   }
}
// class BankAccount{ // access modifire
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password = pwd;
//     }
// }
class Pen{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int tip){
        this.tip = tip;
    }


}
// class Student{
//      String name;
//      int age;
//      float percent;
    
//      void calcPercentage(int phy, int chem , int math){
//         percent = (phy + chem + math) / 3;
//      }
// }



// inheritance
//base classs
class Animal{
    String color;
    void eat(){
        System.out.println("eats");

    }
    void breathe(){

        System.out.println("breathes");
    }
}
//derived class
class  Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
} 


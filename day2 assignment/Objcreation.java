public class Objcreation {
    public static void main(String args[]){
   student s1=new student();
   s1.name="jatin";
   s1.rollno=52;
   s1.display();

    }
    static class student{
     String name;
     int rollno;
     void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll_No : "+rollno);
     }
    }
}

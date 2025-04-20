public class Employee {
    double salary;
    double calculateSalary(double salary){
        return salary;
    }

   public  void DisplaySalary(){
         System.out.println( " Employee salary " + calculateSalary(450000));
     }


}



class Manager extends Employee{

    double calculateSalary(double salary) {
        return salary;

    }
      public  void DisplaySalary(){

          System.out.println(" Manager Salary = " + calculateSalary(50000));

}

class Worker extends Employee {

    double calculateSalary(double salary) {
        return salary;

    }

    public  void DisplaySalary(){
        System.out.println(" Worker Salary =" + calculateSalary(35000));

}
      } }

class main2 {
    public static void main (String [] args ){
Employee object = new Employee();
object.DisplaySalary();

Manager object2 = new Manager();
 object2.DisplaySalary();


    }
}
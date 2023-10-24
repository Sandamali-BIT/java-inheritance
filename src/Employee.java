public class Employee {
    int basic = 30000;
}
class Manager extends Employee{
    int bonus = 15000;
}
class inTest{
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println("The manager's basic salary is: " +manager.basic+".00");
        System.out.println("The manager's bonus is: " +manager.bonus+".00");
        System.out.println("The manager's total income is: " + (manager.basic + manager.bonus)+".00");
    }
}
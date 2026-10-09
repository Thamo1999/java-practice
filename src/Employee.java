public class Employee {
    private String name;
    private int age;
    private double salary;
    //getter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
        else {
            System.out.println("invalied age");
        }
    }
    public void setSalary(double salary){
        if (salary>0){
            this.salary=salary;
        }
        else {
            System.out.println("invalied salarey");
        }
    }
    //getter
    public String getName(){
        return name;
    }
    public  int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public static void main(String[] arg){
        Employee Emp1 = new Employee();
        Emp1.setName("thamo");
        Emp1.setAge(26);
        Emp1.setSalary(25000);
        System.out.println("Name " + Emp1.getName());
    }
}

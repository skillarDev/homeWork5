public class Employee {
    private String fullName;
    private String position;
    private String email;
    private long phoneNumber;
    private int salary;
    private int age;

    Employee(String fullName, String position, String email, long phoneNumber, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void employeeInfo(){
        System.out.println("Полное имя: "+fullName+", должность: "+position+", email: "+email+", номер телефона: "+phoneNumber+", зарплата: "+salary+", возраст: "+age);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иван Петров", "столяр", "ivanPetrov@company.com", 89914757899L, 42500, 32);
//        employee1.employeeInfo();

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иван Петров", "столяр", "ivanPetrov@company.com", 89914757899L, 42500, 32);
        employeesArray[1] = new Employee("Николай Ветров", "инженер", "nikVetrov@company.com", 89554126578L, 51000, 41);
        employeesArray[2] = new Employee("Людмила Васильева", "бухгалтер", "lydmilaVasil@company.com", 89412358788L, 34000, 29);
        employeesArray[3] = new Employee("Ирина Круглова", "маркетолог", "irinaKruglova@company.com", 89066445231L, 37500, 37);
        employeesArray[4] = new Employee("Василий Егоров", "водитель", "vasyaEgorov@company.com", 89034782145L, 40000, 48);

        for (Employee employee : employeesArray) {
            if(employee.getAge() > 40){
                employee.employeeInfo();
            }
        }
    }
}

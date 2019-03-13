package Homework_5;


public class Main {

    public static void main(String[] args) {//ДОПОЛНИТЕЛЬНОЕ ЗАДАНИЕ
        int[] arr = new int[]{5, 1, 5, 2, 2, 4, 1, 4, 5, 1, 5, 3, 2, 4, 4, 4, 5, 1, 3, 4, 2, 2, 1, 2, 4, 4, 4, 5, 4, 3, 5, 4, 4, 5, 5, 1, 4, 1, 5, 3, 1, 4, 5, 3, 3, 4, 2, 2, 4, 4, 5, 5, 1, 1, 1, 4, 5, 5,
                4, 4, 2, 4, 3, 1, 3, 3, 1, 1, 3, 1, 3, 4, 4, 3, 2, 2, 1, 3, 4, 4, 2, 3, 4, 2, 4, 4, 1, 4, 4, 4, 2, 1, 2, 4, 1, 5, 2, 2, 5, 4, 2, 2, 3, 1, 5, 5, 3, 5, 3, 1, 4, 5, 4, 2, 1, 3,
                1, 2, 1, 4, 1, 3, 4, 2, 2, 5, 2, 3, 1, 1, 2, 3, 3, 4, 4, 2, 4, 1, 2, 2, 2, 5, 1, 5, 1, 2, 2, 1, 3, 3, 4, 3, 5, 3, 5, 1, 2, 1, 3, 3, 2, 4, 1, 4, 3, 5, 1, 2, 1, 2, 3, 2, 1, 3,
                2, 2, 4, 3, 2, 1, 5, 1, 4, 5, 4, 4, 5, 5, 4, 2, 3, 5, 1, 3, 4, 3, 2, 4, 5, 2, 5, 2, 4, 1, 4, 5, 2, 3, 3, 4, 4, 3, 5, 2, 2, 3, 5, 1, 2, 4, 3, 4, 4, 3, 2, 2, 1, 4, 5, 5, 1, 5,
                2, 4, 5, 5, 4, 2, 2, 1, 5, 1, 3, 4, 2, 4, 2, 2, 4, 3, 5, 2, 2, 4, 4, 4, 5, 5, 2, 5, 5, 2, 5, 1, 1, 5, 5, 4, 1, 2, 4, 1, 2, 2, 5, 4, 5, 1, 5, 4, 4, 5, 5, 5, 3, 3, 4, 3, 3, 5,
                3, 2, 2, 2, 2, 2, 1, 2, 5, 2, 3, 4, 3, 5, 5, 2, 4, 5, 3, 4, 3, 1, 3, 2, 1, 1, 5, 4, 4, 2, 3, 1, 3, 4, 2, 4, 1, 3, 5, 1, 5, 3, 5, 2, 3, 4, 4, 1, 3, 1, 5, 5, 1, 2, 2, 1, 3, 1,
                5, 1, 2, 2, 1, 5, 1, 3, 3, 2, 1, 3, 2, 5, 1, 1, 2, 3, 5, 5, 4, 3, 1, 3, 3, 1, 5, 4, 2, 3, 4};
        Additional_Task.CheckArray(arr);


        Employee[] EmployeeArray = new Employee[5];//ОСНОВНОЕ ЗАДАНИЕ
        EmployeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        EmployeeArray[1] = new Employee("Petrov Viktor", "Doctor", "pviktor@mailbox.com", "892312123", 45000, 56);
        EmployeeArray[2] = new Employee("Kuznetsov Anatoliy", "Java-Developer", "kanatol@mailbox.com", "892312798", 90000, 48);
        EmployeeArray[3] = new Employee("Zhukov Pavel", "Janitor", "zpavel@mailbox.com", "892312000", 20000, 27);
        EmployeeArray[4] = new Employee("Zvyagincev Michael", "Director", "zmichael@mailbox.com", "892312555", 150000, 25);

        for (Employee Employee : EmployeeArray) {
            Employee.info();
        }
        System.out.println();
        System.out.println("The list of employees older than 40 years.");
        //Employee.OlderThan40(EmployeeArray);

        for (Employee Employee : EmployeeArray) {
            if (Employee.getAge() > 40) {
                Employee.info();
            }
        }
    }
}

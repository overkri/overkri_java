package Homework_5;

public class Employee {
    private String Name_SURNAME_FAMILYNAME;
    private String Profession;
    private String Email;
    private String CellNumber;
    private int Salary;
    private int Age;

    public Employee(String Name_SURNAME_FAMILYNAME, String Profession, String Email, String CellNumber, int Salary, int Age) {
        this.Name_SURNAME_FAMILYNAME = Name_SURNAME_FAMILYNAME;
        this.Profession = Profession;
        this.Email = Email;
        this.CellNumber = CellNumber;
        this.Salary = Salary;
        this.Age = Age;
    }

    public int getAge() {
        return Age;
    }

    void info() {
        System.out.println(Name_SURNAME_FAMILYNAME + ", " + Profession + ", " + Email + ", " + CellNumber + ", " + Salary + ", " + Age);
    }

    /*static void OlderThan40(String[] Employee_arr) {
        for (String i : Employee_arr) {
            if (getAge() > 40) {
                info();
            }
        }
    }*/
}

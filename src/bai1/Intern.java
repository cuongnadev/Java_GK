import java.util.Scanner;

public class Intern extends Employee implements IEmployee{
    private String majors;
    private String semeter;
    private String Uni_name;
    public Intern() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Majors: ");
        this.majors = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Semeter: ");
        this.semeter = sc.nextLine();
        System.out.println("Enter University Name: ");
        this.Uni_name = sc.nextLine();
    }

    

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemeter() {
        return semeter;
    }

    public void setSemeter(String semeter) {
        this.semeter = semeter;
    }

    public String getUni_name() {
        return Uni_name;
    }

    public void setUni_name(String uni_name) {
        Uni_name = uni_name;
    }

    @Override
    public void showInfo() {
        System.out.println("Employee[" + this.getFullName() + ", ID: " + this.getiD()  + ", birthDay=" +
         this.getBirthDay() + ", phone=" + this.getPhone() + ", email=" + this.getEmail() + ", employee_type=" + this.getEmployee_type()
          + ", Majors: " + this.majors + ", Semeter: " + this.semeter + "Uni_Name: " + this.Uni_name );
    }

    @Override
    public String toString() {
        return "Experience [" + super.toString() + ", Majors: " + this.majors + ", Semeter: " + this.semeter + "Uni_Name: " + this.Uni_name +"]";
    }
}

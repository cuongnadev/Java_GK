import java.util.Scanner;

public class Experience extends Employee implements IEmployee{

    private int ExplnYear;
    private String ProSkill;

    public Experience() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ExplnYear: ");
        this.ExplnYear = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter ProSkill: ");
        this.ProSkill = sc.nextLine();
    }

    public int getExplnYear() {
        return ExplnYear;
    }

    public void setExplnYear(int explnYear) {
        ExplnYear = explnYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }

    @Override
    public void showInfo() {
        System.out.println("Employee[" + this.getFullName() + ", ID: " + this.getiD()  + ", birthDay=" +
         this.getBirthDay() + ", phone=" + this.getPhone() + ", email=" + this.getEmail() + ", employee_type=" + this.getEmployee_type() + "ExplnYear=" + ExplnYear + ", ProSkill=" + ProSkill);
    }

    @Override
    public String toString() {
        return "Experience [" + super.toString() + "ExplnYear=" + ExplnYear + ", ProSkill=" + ProSkill + "]";
    }
    
}

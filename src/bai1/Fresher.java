import java.util.Scanner;

public class Fresher extends Employee implements IEmployee{
    private int Graduation_date;
    private String Graduation_rank;
    private String education;

    public Fresher() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Graduation_date: ");
        this.Graduation_date = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Graduation_rank: ");
        this.Graduation_rank = sc.nextLine();
        System.out.println("Enter Education: ");
        this.education = sc.nextLine();
    }

    

    public int getGraduation_date() {
        return Graduation_date;
    }



    public void setGraduation_date(int graduation_date) {
        Graduation_date = graduation_date;
    }



    public String getGraduation_rank() {
        return Graduation_rank;
    }



    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }
    
    public String getEducation() {
        return education;
    }



    public void setEducation(String education) {
        this.education = education;
    }


    @Override
    public void showInfo() {
        System.out.println("Employee[" + this.getFullName() + ", ID: " + this.getiD()  + ", birthDay=" +
         this.getBirthDay() + ", phone=" + this.getPhone() + ", email=" + this.getEmail() + ", employee_type=" + this.getEmployee_type() + " , Graduation_date: "+ Graduation_date + ", Rank=" + Graduation_rank + "Education: " + this.education );
    }

    @Override
    public String toString() {
        return "Experience [" + super.toString() + " , Graduation_date: "+ Graduation_date + ", Rank=" + Graduation_rank + "Education: " + this.education +"]";
    }



    
}

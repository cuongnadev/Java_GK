import java.util.Scanner;

public class Employee {
    private String iD;
    private String fullName;
    private String birthDay;
    private long phone;
    private String email;
    private String employee_type;
    static int employee_count = 0;

    
    public Employee() {
        employee_count++;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        String iD = sc.nextLine();
        System.out.println("Enter Full Name: ");
        String name = sc.nextLine();
        System.out.println("Enter BirthDay: ");
        String birth = sc.nextLine();
        System.out.println("Enter Phone: ");
        long phone = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        System.out.println("Enter Type Employee: ");
        String type = sc.nextLine();
    }

    public String getiD() {
        return iD;
    }
    public void setiD(String iD) {
        this.iD = iD;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmployee_type() {
        return employee_type;
    }
    public void setEmployee_type(String employee_type) {
        this.employee_type = employee_type;
    }
    public int getEmployee_count() {
        return employee_count;
    }
    public void setEmployee_count(int employee_count) {
        this.employee_count = employee_count;
    }
    @Override
    public String toString() {
        return "Employee [iD=" + iD + ", fullName=" + fullName + ", birthDay=" + birthDay + ", phone=" + phone
                + ", email=" + email + ", employee_type=" + employee_type + ", employee_count=" + employee_count + "]";
    }

    
}

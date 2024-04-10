import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Employee_Manager {
    ArrayList<Experience> listExperiences = new ArrayList<>();
    ArrayList<Fresher> listFreshers = new ArrayList<>();
    ArrayList<Intern> listInterns = new ArrayList<>();


    public ArrayList<Experience> getListExperiences() {
        return listExperiences;
    }

    public void setListExperiences(ArrayList<Experience> listExperiences) {
        this.listExperiences = listExperiences;
    }

    public ArrayList<Fresher> getListFreshers() {
        return listFreshers;
    }

    public void setListFreshers(ArrayList<Fresher> listFreshers) {
        this.listFreshers = listFreshers;
    }

    public ArrayList<Intern> getListInterns() {
        return listInterns;
    }

    public void setListInterns(ArrayList<Intern> listInterns) {
        this.listInterns = listInterns;
    }

    public void addEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Type Employee ======");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Intern");
        System.out.println("Choose: ");
        int type = sc.nextInt();
        switch (type) {
            case 1:
                Experience newExperience = new Experience();
                listExperiences.add(newExperience);
                break;
            case 2:
                Fresher newFresher = new Fresher();
                listFreshers.add(newFresher);
                break;
            case 3:
                Intern newIntern = new Intern();
                listInterns.add(newIntern);
                break;
            default:
                System.out.println("Invalid!");
                break;
        }
    }

    public void removeEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Type Employee ======");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Intern");
        System.out.println("Choose: ");
        int type = sc.nextInt();
        sc.nextLine();
        switch (type) {
            case 1:
                if (listExperiences.size() > 0){
                    System.out.println("Enter ID employee want remove: ");
                    String iD = sc.nextLine();
                    boolean check = false;
                    while (!check) {
                        for (Experience employee : listExperiences) {
                            if (employee.getiD().equals(iD)){
                                listExperiences.remove(employee);
                                employee.setEmployee_count(employee.getEmployee_count() - 1);
                                check = true;
                                break;
                            }
                        }
                        if (!check){
                            System.out.println("No have Employee ID: " + iD);
                        }
                    }
                }else {
                    System.out.println("List Employee Null!");
                }
                break;
            case 2:
                if (listFreshers.size() > 0){
                    System.out.println("Enter ID employee want remove: ");
                    String iD = sc.nextLine();
                    boolean check = false;
                    while (!check) {
                        for (Fresher employee : listFreshers) {
                            if (employee.getiD().equals(iD)){
                                listFreshers.remove(employee);
                                employee.setEmployee_count(employee.getEmployee_count() - 1);
                                check = true;
                                break;
                            }
                        }
                        if (!check){
                            System.out.println("No have Employee ID: " + iD);
                        }
                    }
                }else {
                    System.out.println("List Employee Null!");
                }
                break;
            case 3:
                if (listInterns.size() > 0){
                    System.out.println("Enter ID employee want remove: ");
                    String iD = sc.nextLine();
                    boolean check = false;
                    while (!check) {
                        for (Intern employee : listInterns) {
                            if (employee.getiD().equals(iD)){
                                listInterns.remove(employee);
                                employee.setEmployee_count(employee.getEmployee_count() - 1);
                                check = true;
                                break;
                            }
                        }
                        if (!check){
                            System.out.println("No have Employee ID: " + iD);
                        }
                    }
                }else {
                    System.out.println("List Employee Null!");
                }
                break;
            default:
                System.out.println("Invalid!");
                break;
        }
    }
    public void modifyIDEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Type Employee ======");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Intern");
        System.out.println("Choose: ");
        int type = sc.nextInt();
        sc.nextLine();
        switch (type) {
            case 1:
                if (listExperiences.size() > 0){
                    boolean check = false;
                    while (!check) {
                        System.out.println("Enter ID employee want remove: ");
                        String iD = sc.nextLine();
                        for (Experience employee : listExperiences) {
                            if (employee.getiD().equals(iD)){
                                System.out.println("Enter New ID: ");
                                employee.setiD(sc.nextLine());
                                check = true;
                                break;
                            }
                        }
                        if (!check){
                            System.out.println("No have Employee ID: " + iD);
                        }
                    }
                }else {
                    System.out.println("List Employee Null!");
                }
                break;
            case 2:
                if (listFreshers.size() > 0){
                    boolean check = false;
                    while (!check) {
                        System.out.println("Enter ID employee want remove: ");
                        String iD = sc.nextLine();
                        for (Fresher employee : listFreshers) {
                            if (employee.getiD().equals(iD)){
                                System.out.println("Enter New ID: ");
                                employee.setiD(sc.nextLine());
                                check = true;
                                break;
                            }
                        }
                        if (!check){
                            System.out.println("No have Employee ID: " + iD);
                        }
                    }
                }else {
                    System.out.println("List Employee Null!");
                }
                break;
            case 3:
                if (listInterns.size() > 0){
                    boolean check = false;
                    while (!check) {
                        System.out.println("Enter ID employee want remove: ");
                        String iD = sc.nextLine();
                        for (Intern employee : listInterns) {
                            if (employee.getiD().equals(iD)){
                                System.out.println("Enter New ID: ");
                                employee.setiD(sc.nextLine());
                                check = true;
                                break;
                            }
                        }
                        if (!check){
                            System.out.println("No have Employee ID: " + iD);
                        }
                    }
                }else {
                    System.out.println("List Employee Null!");
                }
                break;
            default:
                System.out.println("Invalid!");
                break;
        }
    }

    public void writeInfoToFile(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Type Employee ======");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Intern");
        System.out.println("Choose: ");
        int type = sc.nextInt();
        sc.nextLine();
        switch (type) {
            case 1:
                if (listExperiences.size() > 0){
                    boolean check = false;
                    while (!check) {
                        System.out.println("Enter ID employee want to write: ");
                        String iD = sc.nextLine();
                        for (Experience employee : listExperiences) {
                            if (employee.getiD().equals(iD)){
                                String filePath = "src/bai1/infoEmployee.txt";
                                String content = "Employee[" + employee.getFullName() + ", ID: " + employee.getiD()  + ", birthDay=" +
                                employee.getBirthDay() + ", phone=" + employee.getPhone() + ", email=" + employee.getEmail() + ", employee_type=" + employee.getEmployee_type() + "ExplnYear=" + employee.getExplnYear() + ", ProSkill=" + employee.getProSkill();
                                try {
                                    File file = new File(filePath);
                                    FileWriter fw = new FileWriter(file, true);
                                    BufferedWriter bw = new BufferedWriter(fw);
                                    bw.write(content);
                                    bw.close();
                                    System.out.println("Successfull!");
                                } catch (IOException e) {
                                    System.err.println("Error: " + e.getMessage());
                                    e.printStackTrace();
                                }
                                check = true;
                                break;
                            }
                        }
                        if (!check){
                            System.out.println("No have Employee ID: " + iD);
                        }
                    }
                }else {
                    System.out.println("List Employee Null!");
                }
                break;
            case 2:
                if (listFreshers.size() > 0){
                    boolean check = false;
                    while (!check) {
                        System.out.println("Enter ID employee want remove: ");
                        String iD = sc.nextLine();
                        for (Fresher employee : listFreshers) {
                            if (employee.getiD().equals(iD)){
                                String filePath = "src/bai1/infoEmployee.txt";
                                String content = "Employee[" + employee.getFullName() + ", ID: " + employee.getiD()  + ", birthDay=" +
                                employee.getBirthDay() + ", phone=" + employee.getPhone() + ", email=" + employee.getEmail() + ", employee_type=" + employee.getEmployee_type() + "Graduation_date: "+ employee.getGraduation_date() + ", Rank=" + employee.getGraduation_rank() + "Education: " + employee.getEducation();
                                try {
                                    File file = new File(filePath);
                                    FileWriter fw = new FileWriter(file, true);
                                    BufferedWriter bw = new BufferedWriter(fw);
                                    bw.write(content);
                                    bw.close();
                                    System.out.println("Successfull!");
                                } catch (IOException e) {
                                    System.err.println("Error: " + e.getMessage());
                                    e.printStackTrace();
                                }
                                check = true;
                                break;
                            }
                        }
                        if (!check){
                            System.out.println("No have Employee ID: " + iD);
                        }
                    }
                }else {
                    System.out.println("List Employee Null!");
                }
                break;
            case 3:
                if (listInterns.size() > 0){
                    boolean check = false;
                    while (!check) {
                        System.out.println("Enter ID employee want remove: ");
                        String iD = sc.nextLine();
                        for (Intern employee : listInterns) {
                            if (employee.getiD().equals(iD)){
                                String filePath = "src/bai1/infoEmployee.txt";
                                String content = "Employee[" + employee.getFullName() + ", ID: " + employee.getiD()  + ", birthDay=" +
                                employee.getBirthDay() + ", phone=" + employee.getPhone() + ", email=" + employee.getEmail() + ", employee_type=" + employee.getEmployee_type() + ", Majors: "+ employee.getMajors() + ", Semeter: " + employee.getSemeter() + "University Name: " + employee.getUni_name();
                                try {
                                    File file = new File(filePath);
                                    FileWriter fw = new FileWriter(file, true);
                                    BufferedWriter bw = new BufferedWriter(fw);
                                    bw.write(content);
                                    bw.close();
                                    System.out.println("Successfull!");
                                } catch (IOException e) {
                                    System.err.println("Error: " + e.getMessage());
                                    e.printStackTrace();
                                }
                                check = true;
                                break;
                            }
                        }
                        if (!check){
                            System.out.println("No have Employee ID: " + iD);
                        }
                    }
                }else {
                    System.out.println("List Employee Null!");
                }
                break;
            default:
                System.out.println("Invalid!");
                break;
        }
    }

}

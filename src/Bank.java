import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String iDNH;
    private String nameNH;
    public ArrayList<User> DSND = new ArrayList<>();
    public Bank() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID ngân hàng:");
        iDNH = sc.nextLine();
        System.out.println("Nhập tên ngân hàng:");
        nameNH = sc.nextLine();
    }
    public String getiDNH() {
        return iDNH;
    }
    public void setiDNH(String iDNH) {
        this.iDNH = iDNH;
    }
    public String getNameNH() {
        return nameNH;
    }
    public void setNameNH(String nameNH) {
        this.nameNH = nameNH;
    }
    public ArrayList<User> getDSND() {
        return DSND;
    }
    public void setDSND(ArrayList<User> dSND) {
        DSND = dSND;
    }
    @Override
    public String toString() {
        return "Bank [iDNH=" + iDNH + ", nameNH=" + nameNH + ", DSND=" + DSND.toString() + "]";
    }

    public double tongSoTien(){
        double tong = 0.0;
        for (User user : DSND) {
            tong += user.getSoDTK();
        }
        return tong;
    }

    public void SapXep() {
        User save = new User();
        for (int i = 0; i < this.DSND.size(); i++) {
            for (int j = i + 1; j < this.DSND.size(); j++) {
                if (DSND.get(i).getSoDTK() < DSND.get(j).getSoDTK()) {
                    save = DSND.get(i);
                    DSND.set(i, DSND.get(j));
                    DSND.set(j, save);
                }
            }
        }
    }
    
}

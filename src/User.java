import java.util.Scanner;

public class User implements User_Interface {

    private String iD;
    private String name;
    private int year;
    private String iDNH;
    private long sTK;
    private double soDTK;
    private String diaChi;
    private boolean kHTT;

    public User() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID người dùng:");
        iD = sc.nextLine();
        System.out.println("Nhập tên người dùng:");
        name = sc.nextLine();
        System.out.println("Nhập năm sinh người dùng:");
        year = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập id ngân hàng");
        iDNH = sc.nextLine();
        System.out.println("Nhập số tài khoản người dùng:");
        sTK = sc.nextLong();
        sc.nextLine();
        System.out.println("Nhập số dư tài khoản người dùng:");
        soDTK = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập địa chỉ người dùng:");
        diaChi = sc.nextLine();
        if (soDTK >= 10000000) {
            kHTT = true;
        } else {
            kHTT = false;
        }
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getiDNH() {
        return iDNH;
    }

    public void setiDNH(String iDNH) {
        this.iDNH = iDNH;
    }

    public long getsTK() {
        return sTK;
    }

    public void setsTK(long sTK) {
        this.sTK = sTK;
    }

    public double getSoDTK() {
        return soDTK;
    }

    public void setSoDTK(double soDTK) {
        this.soDTK = soDTK;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean iskHTT() {
        return kHTT;
    }

    public void setkHTT(boolean kHTT) {
        this.kHTT = kHTT;
    }

    @Override
    public String toString() {
        String soDu_format = String.format("%.2f", soDTK);
        return "User [iD=" + iD + ", name=" + name + ", year=" + year +
                ", iDNH=" + iDNH + ", sTK=" + sTK + ", soDTK=" + soDu_format +
                ", diaChi=" + diaChi + ", kHTT=" + kHTT + "]";
    }

    @Override
    public void chuyenTien(User otherUser) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền cần chuyển:");
        Double amount = 0.0;
        amount = sc.nextDouble();
        if (amount >= 10000) {
            if (kHTT) {
                if (amount > soDTK) {
                    System.out.println("Số dư của bạn không đủ!");
                } else {
                    this.soDTK = this.soDTK - amount;
                    otherUser.setSoDTK(otherUser.getSoDTK() + amount);
                    String soDu_format_gui = String.format("%.2f", this.soDTK);
                    String soDu_format_nhan = String.format("%.2f", otherUser.getSoDTK());
                    String soTienChuyen_format = String.format("%.2f", amount);

                    System.out
                            .println("Chuyển tiền thành công!\n Số dư của " + this.name + ": " 
                                    + soDu_format_gui + " -"+ soTienChuyen_format
                                    + "\n Số dư của " + otherUser.getName() + ": " + soDu_format_nhan);
                }
            } else {
                if (amount + 2000 > soDTK) {
                    System.out.println("Số dư của bạn không đủ!");
                } else {
                    this.soDTK = this.soDTK - amount - 2000;
                    otherUser.setSoDTK(otherUser.getSoDTK() + amount);
                    String soDu_format_gui = String.format("%.2f", this.soDTK);
                    String soDu_format_nhan = String.format("%.2f", otherUser.getSoDTK());
                    String soTienChuyen_format = String.format("%.2f", amount);
                    System.out.println("Chuyển tiền thành công!\n Số dư của " + this.name + ": " 
                                    + soDu_format_gui + " -"+ soTienChuyen_format
                                    + "\n Số dư của " + otherUser.getName() + ": " + soDu_format_nhan);
                }
            }
        } else {
            System.out.println("Số tiền không hợp lệ!");
        }
    }

    @Override
    public void kiemTraSoDu() {
        String soDu_format = String.format("%.2f", this.soDTK);
        System.out.println("Số dư tài khoản của bạn là: " + soDu_format);
    }

    @Override
    public void napTien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn nạp:");
        Double amount = 0.0;
        amount = sc.nextDouble();
        if (amount > 0) {
            this.soDTK = this.soDTK + amount;
            String soDu_format = String.format("%.2f", this.soDTK);
            String soTien = String.format("%.2f", amount);

            System.out.println("Nạp tiên thành công!\n Số dư tài khoản là: " + soDu_format + ", đã tăng: " + soTien);
        } else {
            System.out.println("Số tiền không hợp lệ!");
        }

    }

    @Override
    public void rutTien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn nạp:");
        Double amount = 0.0;
        amount = sc.nextDouble();
        if (amount >= 50000) {
            if (kHTT) {
                if (amount > soDTK) {
                    System.out.println("Số dư của bạn không đủ!");
                } else {
                    this.soDTK = this.soDTK - amount;
                    String soDu_format = String.format("%.2f", this.soDTK);
                    String soTien = String.format("%.2f", amount);
                    System.out.println("Rút tiên thành công!\n Số dư tài khoản là: " + soDu_format + ", đã giảm: " + soTien);
                }
            } else {
                if (amount + 2000 > soDTK) {
                    System.out.println("Số dư của bạn không đủ!");
                } else {
                    this.soDTK = this.soDTK - amount - 2000;
                    String soDu_format = String.format("%.2f", this.soDTK);
                    String soTien = String.format("%.2f", (amount + 2000));
                    System.out.println("Rút tiên thành công!\n Số dư tài khoản là: " + soDu_format + ", đã giảm: " + soTien);
                }
            }
        } else {
            System.out.println("Số tiền không hợp lệ!");
        }
    }
}

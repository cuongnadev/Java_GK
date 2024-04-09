import java.util.ArrayList;
import java.util.Scanner;

public class Bank_Manager {
    public ArrayList<Bank> Bank_List = new ArrayList<>();

    public Bank_Manager() {
    }

    public void newBank() {
        Bank newBank = new Bank();
        Bank_List.add(newBank);
    }

    public void newUser() {
        if (Bank_List.size() > 0) {
            User newUser = new User();
            boolean check = false;
            for (Bank bank : Bank_List) {
                if (bank.getiDNH().equals(newUser.getiDNH())) {
                    bank.DSND.add(newUser);
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Thêm người dùng thành công!");
                for (Bank bank : Bank_List) {
                    bank.SapXep();
                }
            } else {
                System.out.println("ID ngân hàng không hợp lệ!, Vui lòng thử lại");
            }
        } else {
            System.out.println("Chưa có ngân hàng nào!");
        }
        System.out.println();
    }

    public void DisplayUserOfBank() {
        int index = 0;
        Scanner sc = new Scanner(System.in);
        if (Bank_List.size() > 0) {
            boolean check = false;
            while (!check) {
                System.out.println("Hãy chọn ngân hàng bạn muốn hiện thị người dùng <3");
                for (Bank bank : Bank_List) {
                    System.out.println(bank.getiDNH() + "(" + bank.getNameNH() + ")");
                }
                System.out.println("Nhập ID ngân hàng: ");
                String chooseID = sc.nextLine();
                for (int i = 0; i < Bank_List.size(); i++) {
                    if (chooseID.equals(Bank_List.get(i).getiDNH())) {
                        index = i;
                        check = true;
                        break;
                    }
                }
            }
            if (Bank_List.get(index).getDSND().size() > 0) {
                for (User user : Bank_List.get(index).DSND) {
                    System.out.println(user.toString());
                }
            } else {
                System.out.println("Ngân hàng chưa có người dùng nào!");
            }
        } else {
            System.out.println("Chưa có ngân hàng nào!");
        }
    }

    public void tongSoTien() {
        if (Bank_List.size() > 0) {
            System.out.println("Tổng số tiền của: ");
            for (int i = 0; i < Bank_List.size(); i++) {
                String soDu_format = String.format("%.2f", Bank_List.get(i).tongSoTien());
                System.out.println("ID ngân hàng: " + Bank_List.get(i).getiDNH()
                        + "(" + Bank_List.get(i).getNameNH() + "), với tổng số tiền là: " + soDu_format);
            }
        } else {
            System.out.println("Chưa có ngân hàng nào!");
        }
        System.out.println();
    }

    public void InfoBank() {
        Scanner sc = new Scanner(System.in);
        if (Bank_List.size() > 0) {
            boolean check = false;
            System.out.println("Nhập số tài khoản người dùng muốn hiện thông tin ngân hàng");
            String iDND = sc.nextLine();
            while (!check) {
                for (Bank bank : Bank_List) {
                    for (User user : bank.DSND) {
                        if (user.getiD().equals(iDND)) {
                            System.out.println("Thông tin ngân hàng " + bank.getiDNH()
                                    + "(" + bank.getNameNH() + ") \n" + bank.toString());
                        } else {
                            System.out.println("Không có người dùng này!, vui lòng thử lại");
                        }
                    }
                }
            }
        } else {
            System.out.println("Chưa có ngân hàng nào!");
        }
    }

    public void napTien() {
        Scanner sc = new Scanner(System.in);
        if (Bank_List.size() > 0) {
            boolean check = false;
            boolean checkND = true;
            while (!check) {
                System.out.println("Hãy chọn ngân hàng người dùng <3");
                for (Bank bank : Bank_List) {
                    System.out.println(bank.getiDNH() + "(" + bank.getNameNH() + ")");
                }
                System.out.println("Nhập ID ngân hàng: ");
                String chooseID = sc.nextLine();
                for (Bank bank : Bank_List) {
                    if (bank.getiDNH().equals(chooseID)) {
                        System.out.println("Nhập STK người dùng muốn nạp tiền:");
                        long sTK = sc.nextLong();
                        for (User user : bank.DSND) {
                            if (user.getsTK() == sTK) {
                                user.napTien();
                                checkND = false;
                                break;
                            } else {
                                System.out.println("Không có người dùng này, vui lòng thử lại");
                            }
                        }
                        if (checkND) {
                            System.out.println("Không có người dùng này");
                        }
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    System.out.println("Không có ngân hàng này!");
                }
            }
        } else {
            System.out.println("Chưa có ngân hàng nào!");
        }
    }

    public void rutTien() {
        Scanner sc = new Scanner(System.in);
        if (Bank_List.size() > 0) {
            boolean check = false;
            boolean checkND = true;
            while (!check) {
                System.out.println("Hãy chọn ngân hàng người dùng <3");
                for (Bank bank : Bank_List) {
                    System.out.println(bank.getiDNH() + "(" + bank.getNameNH() + ")");
                }
                System.out.println("Nhập ID ngân hàng: ");
                String chooseID = sc.nextLine();
                for (Bank bank : Bank_List) {
                    if (bank.getiDNH().equals(chooseID)) {
                        System.out.println("Nhập STK người dùng muốn rút tiền:");
                        long sTK = sc.nextLong();
                        for (User user : bank.DSND) {
                            if (user.getsTK() == sTK) {
                                user.rutTien();
                                checkND = false;
                                break;
                            } else {
                                System.out.println("Không có người dùng này, vui lòng thử lại");
                            }
                        }
                        if (checkND) {
                            System.out.println("Không có người dùng này");
                        }
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    System.out.println("Không có ngân hàng này!");
                }
            }
        } else {
            System.out.println("Chưa có ngân hàng nào!");
        }
    }

    public void KtraSoDu() {
        Scanner k = new Scanner(System.in);
        if (Bank_List.size() > 0) {
            boolean check = false;
            while (!check) {
                System.out.println("Hãy chọn ID ngân hàng của người dùng <3:");
                for (Bank bank : Bank_List) {
                    System.out.println("ID ngân hàng: " + bank.getNameNH() + "("
                            + bank.getNameNH() + ")");
                }
                System.out.print("Nhập ID ngân hàng: ");
                int choose_id = k.nextInt();
                for (Bank bank : Bank_List) {
                    if (bank.getiDNH().equals(choose_id)) {
                        if (bank.DSND.size() > 0) {
                            k.nextLine();
                            System.out.print("Nhập STK người dùng: ");
                            String iDND = k.nextLine();
                            boolean check_user = true;
                            for (User user : bank.DSND) {
                                if (iDND.equals(user.getsTK())) {
                                    user.kiemTraSoDu();
                                    check_user = false;
                                }
                            }
                            if (check_user == true) {
                                System.out.println("Không tìm thấy STK cần tìm");
                            }
                        } else {
                            System.out.println("Ngân hàng chưa có người dùng!");
                        }
                        check = true;
                    }
                }
            }
        } else {
            System.out.println("Chưa có ngân hàng nào!");
        }
        System.out.println();
    }

    public void chuyenTien() {
        if (Bank_List.size() > 0) {
            Scanner k = new Scanner(System.in);
            boolean ktra = false;
            int index_of_bank_send = 0;
            int index_of_user_send = 0;
            while (ktra == false) {
                System.out.println("Hãy chọn ID ngân hàng chuyển:");
                for (Bank bank : Bank_List) {
                    System.out.println("ID ngân hàng: " + bank.getNameNH() + "("
                            + bank.getNameNH() + ")");
                }
                System.out.print("Nhập ID ngân hàng: ");
                int choose_id = k.nextInt();
                for (int i = 0; i < Bank_List.size(); i++) {
                    if (Bank_List.get(i).getiDNH().equals(choose_id)) {
                        index_of_bank_send = i;
                        ktra = true;
                    }
                }
            }
            ktra = false;
            int index_of_bank_recei = 0;
            int index_of_user_recei = 0;
            while (ktra == false) {
                System.out.println("Hãy chọn ID ngân hàng nhận:");
                for (Bank bank : Bank_List) {
                    System.out.println("ID ngân hàng: " + bank.getNameNH() + "("
                            + bank.getNameNH() + ")");
                }
                System.out.print("Nhập ID ngân hàng: ");
                int choose_id = k.nextInt();
                for (int i = 0; i < Bank_List.size(); i++) {
                    if (Bank_List.get(i).getiDNH().equals(choose_id)) {
                        index_of_bank_recei = i;
                        ktra = true;
                    }
                }
            }
            k.nextLine();
            System.out.print("Nhập STK người chuyển: ");
            String stk_chuyen = k.nextLine();
            System.out.print("Nhập STK người nhận: ");
            String stk_nhan = k.nextLine();
            boolean check_send = false;
            boolean check_recei = false;
            if (stk_chuyen.equals(stk_nhan) != true) {
                for (int i = 0; i < Bank_List.get(index_of_bank_send).getDSND().size(); i++) {
                    if (stk_chuyen.equals(Bank_List.get(index_of_bank_send).getDSND().get(i).getsTK())) {
                        index_of_user_send = i;
                        check_send = true;
                    }
                }
                for (int i = 0; i < Bank_List.get(index_of_bank_recei).getDSND().size(); i++) {
                    if (stk_nhan.equals(Bank_List.get(index_of_bank_recei).getDSND().get(i).getsTK())) {
                        index_of_user_recei = i;
                        check_recei = true;
                    }
                }
                if (check_send == false && check_recei == false) {
                    System.out.println("STK không tồn tại!");
                } else if (check_send == true) {
                    if (check_recei == false) {
                        System.out.println("STK người nhận không tồn tại!");
                    } else {
                        Bank_List.get(index_of_bank_send).getDSND().get(index_of_user_send)
                                .chuyenTien(Bank_List.get(index_of_bank_recei).getDSND().get(index_of_user_recei));
                    }
                } else if (check_recei == true) {
                    if (check_send == false) {
                        System.out.println("STK người gửi không tồn tại!");
                    } else {
                        Bank_List.get(index_of_bank_send).getDSND().get(index_of_user_send)
                                .chuyenTien(Bank_List.get(index_of_bank_recei).getDSND().get(index_of_user_recei));
                    }
                }
            } else {
                System.out.println("STK chuyển và nhận không được giống nhau!");
            }
        } else {
            System.out.println("Chưa có ngân hàng nào!");
        }
        for (int i = 0; i < Bank_List.size(); i++) {
            Bank_List.get(i).SapXep();
        }
        System.out.println();
    }
}

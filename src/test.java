import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Bank_Manager bank_Manager = new Bank_Manager();
        Scanner k = new Scanner(System.in);
        boolean check = true;
        int choose = 0;
        while (check == true) {
            System.out.println("\n-----------------BANK MANAGEMENT SYSTEM-----------------|");
            System.out.println("1. Tạo ngân hàng");
            System.out.println("2. Tạo người dùng");
            System.out.println("3. Xuất thông tin ngân hàng");
            System.out.println("4. hiện thị danh sách người dùng");
            System.out.println("5. Tính tổng số tiền ngan hàng hiện có");
            System.out.println("6. Nạp tiền");
            System.out.println("7. Rút tiền");
            System.out.println("8. Chuyển tiền");
            System.out.println("9. Kiểm tra số dư");
            System.out.println("10 and 0. Thoát");

            System.out.print("Chọn: ");
            choose = k.nextInt();
            switch (choose) {
                case 1:
                    bank_Manager.newBank();
                    break;
                case 2:
                    bank_Manager.newUser();
                    break;
                case 3:
                    bank_Manager.InfoBank();
                    break;
                case 4:
                    bank_Manager.DisplayUserOfBank();
                    break;
                case 5:
                    bank_Manager.tongSoTien();
                    break;
                case 6:
                    bank_Manager.napTien();
                    break;
                case 7:
                    bank_Manager.rutTien();
                    break;
                case 8:
                    bank_Manager.chuyenTien();
                    break;
                case 9:
                    bank_Manager.KtraSoDu();
                    break;
                case 10:
                    check = false;
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Chỉ chọn từ 0 đến 10!");
                    break;
            }
        }
    }
}

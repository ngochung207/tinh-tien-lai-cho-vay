import java.util.Scanner;

public class tien_gui_ngan_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money;
        int month;
        double interset_rate;

        System.out.println("Nhap vao so tien: ");
        money = sc.nextDouble();

        System.out.println("Nhap vao so thang gui: ");
        month = sc.nextInt();

        System.out.println("Nhap lai xuat ngan hang: ");
        interset_rate = sc.nextDouble();

//      Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi

        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset += money * interset_rate / 12 * month;

        }
        System.out.println(total_interset);
    }
}

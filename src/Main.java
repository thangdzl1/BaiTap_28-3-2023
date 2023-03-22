import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void nhapVao(ArrayList<SinhVien> danhSach, Scanner in) {
        for (SinhVien sach : danhSach) {
            System.out.print("Nhap ten: ");
            sach.Ten = in.nextLine();
            System.out.print("Nhap ma sv: ");
            sach.MaSV = in.nextLine();
            System.out.print("Nhap diem Toan: ");
            sach.diemToan = Integer.parseInt(in.nextLine());
            System.out.print("Nhap diem Ly: ");
            sach.diemLy = Integer.parseInt(in.nextLine());
            System.out.print("Nhap diem Hoa: ");
            sach.diemHoa = Integer.parseInt(in.nextLine());
        }
    }

    public static void inRaManHinh(ArrayList<SinhVien> danhSach) {
        for (SinhVien sv : danhSach) {
            sv.display();
        }
    }

    public static void inRaHocLuc(ArrayList<SinhVien> danhSach) {
        for (SinhVien sv : danhSach) {
                System.out.println("Hoc luc cua sinh vien "+ sv.Ten+" la :" +sv.hocLuc);
        }
    }

    public static void main(String[] args) {

        // Code dau vao

        Scanner in = new Scanner(System.in);
        System.out.println("nhap so sinh vien: ");
        int soSV = Integer.parseInt(in.nextLine());
        ArrayList<SinhVien> A = new ArrayList<SinhVien>();

        // Code xu ly
        for(int i=0; i<soSV;i++) {
            A.add(new SinhVien());
        }
        nhapVao(A, in);
        inRaManHinh(A);
        inRaHocLuc(A);
    }
}

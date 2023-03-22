
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void inputInfo(ArrayList<SinhVien> danhSach, Scanner in) throws Exception {
        for (SinhVien sach : danhSach) {
            System.out.print("Nhap ten: ");
            sach.setTen(in.nextLine());
            System.out.print("Nhap ma sv: ");
            sach.setMaSV(in.nextLine());
            while (true) {
                try {
                    System.out.print("Nhap diem Toan: ");
                    sach.setDiemToan(Double.parseDouble(in.nextLine()));
                    inputIsCorrect(sach.getDiemToan());
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage() + "\n");
                }
            }
            while (true) {
                try {
                    System.out.print("Nhap diem Ly: ");
                    sach.setDiemLy(Double.parseDouble(in.nextLine()));
                    inputIsCorrect(sach.getDiemLy());
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage() + "\n");
                }
            }
            while (true) {
                try {
                    System.out.print("Nhap diem Hoa: ");
                    sach.setDiemHoa(Double.parseDouble(in.nextLine()));
                    inputIsCorrect(sach.getDiemLy());
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage() + "\n");
                }
            }
        }
    }

    public static void inputIsCorrect(double n) throws Exception {
        if (n < 0 || n > 10) {
            throw new Exception("Vui long nhap diem trong khoang tu 0 den 10");
        }
    }

    public static void displaySinhVien(ArrayList<SinhVien> danhSach) {
        for (SinhVien sv : danhSach) {
            sv.display();
        }
    }

    public static void displayStudyType(ArrayList<SinhVien> danhSach) {
        for (SinhVien sv : danhSach) {
            System.out.println("Hoc luc cua sinh vien " + sv.getTen() + " la :" + sv.getHocLuc());
        }
    }

    public static void main(String[] args) throws Exception {

        // Code dau vao

        Scanner in = new Scanner(System.in);
        int soSV;
        while (true) {
            System.out.println("nhap so sinh vien: ");
            soSV = Integer.parseInt(in.nextLine());
            try {
                if (soSV <= 0) {
                    throw new Exception("Vui long nhap lon hon 0!");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage() + "\n");
            }
        }
        ArrayList<SinhVien> A = new ArrayList<>();

        // Code xu ly
        for (int i = 0; i < soSV; i++) {
            A.add(new SinhVien());
        }
        inputInfo(A, in);
        displaySinhVien(A);
        displayStudyType(A);
    }
}

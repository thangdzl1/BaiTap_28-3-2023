
public class SinhVien {
    private String Ten, MaSV, hocLuc;
    private double diemToan, diemLy, diemHoa, diemTB;

    public void display() {
        this.diemTB = ((int) (diemHoa + diemHoa + diemLy) * 100) / 3;
        this.diemTB /= 100;
        if (this.diemTB >= 9)
            this.hocLuc = "xuat sac";
        else if (this.diemTB < 9 && this.diemTB >= 8)
            this.hocLuc = "gioi";
        else if (this.diemTB < 8 && this.diemTB >= 7)
            this.hocLuc = "kha";
        else if (this.diemTB < 7 && this.diemTB >= 6)
            this.hocLuc = "TB kha";
        else if (this.diemTB < 6 && this.diemTB >= 5)
            this.hocLuc = "TB";
        else
            this.hocLuc = "Yeu";
        System.out.println("Ten: " + Ten + "\tMa sinh vien: " + MaSV + "\tDiem toan: " + diemToan + "\tDiem Ly: "
                + diemLy + "\tDiem Hoa: " + diemHoa + "\tDiem trung binh: " + diemTB);
    }

    public String getHocLuc() {
        return hocLuc;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }
}

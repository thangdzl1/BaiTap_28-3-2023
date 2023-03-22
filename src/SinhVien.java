
public class SinhVien {
    protected String Ten, MaSV, hocLuc;
    protected double diemToan, diemLy, diemHoa, diemTB;

    public double getDiemTB() {
        return this.diemTB;
    }

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

}

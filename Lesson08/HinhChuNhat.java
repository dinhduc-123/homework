
public class HinhChuNhat {

    private double chieuDai;

    private double chieuRong;

    public HinhChuNhat() {
        this.chieuDai = 0;
        this.chieuRong = 0;
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChuVi() {
        return 2 * (this.chieuDai + this.chieuRong);
    }

    public double getDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public void hienThiThongTin() {
        System.out.printf("HCN(%.6f,%.6f): chu vi = %.3f, dien tich = %.3f\n", this.chieuDai, this.chieuRong,
                getChuVi(), getDienTich());
    }

}
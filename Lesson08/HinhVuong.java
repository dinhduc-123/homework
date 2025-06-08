public class HinhVuong extends HinhChuNhat {

    private double canh;

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double getChuVi() {

        return this.canh * 4;
    }

    @Override
    public double getDienTich() {

        return this.canh * this.canh;
    }

    @Override
    public void hienThiThongTin() {
        System.out.printf("HV(canh = %.6f): chu vi = %.3f, dien tich = %.3f\n", this.canh, getChuVi(), getDienTich());
    }

}

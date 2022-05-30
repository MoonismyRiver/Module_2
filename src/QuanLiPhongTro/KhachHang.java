package QuanLiPhongTro;

public class KhachHang {
    private String hoten;
    private String ngaysinh;
    private int soCMND;

    public KhachHang() {
    }

    public KhachHang(String hoten, String ngaysinh, int soCMND) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.soCMND = soCMND;
    }



    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    @Override
    public String toString() {
        return "khach hang{" +
                "hoten=" + hoten +
                ", ngay sinh =" + ngaysinh + '\'' +
                ",so CMND =" + soCMND +
                '}';
    }
}

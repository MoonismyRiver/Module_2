package QuanLiCanBoNhanVien;


public class CongNhan extends CanBo {
    private int Bac;

    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, int bac) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        Bac = bac;
    }

    public int getBac() {
        return Bac;
    }

    public void setBac(int bac) {
        Bac = bac;
    }
}




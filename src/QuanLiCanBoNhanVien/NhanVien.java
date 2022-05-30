package QuanLiCanBoNhanVien;

public class NhanVien extends CanBo {
    private String CongViec;


    public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        CongViec = congViec;
    }
}

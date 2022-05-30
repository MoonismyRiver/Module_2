package QuanLiCanBoNhanVien;



public class CanBo {
    private String HoTen;
    private String NgaySinh;
    private String GioiTinh;
    private String DiaChi;

    public CanBo() {
    }

    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        HoTen = hoTen;
        NgaySinh = ngaySinh;
        GioiTinh = gioiTinh;
        DiaChi = diaChi;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

}

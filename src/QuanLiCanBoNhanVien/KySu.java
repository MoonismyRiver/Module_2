package QuanLiCanBoNhanVien;

public class KySu extends CanBo {
    private String NganhDaoTao;

    public KySu() {
    }


    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, ngaySinh, gioiTinh, diaChi);
        NganhDaoTao = nganhDaoTao;
    }
}

package QuanLiPhongTro;

public class PhongTro {
    private String loaiPhongtro;
    private int giaTien;
    private String diachi;

    public PhongTro(String loaiPhongtro, int giaTien, String diachi) {
        this.loaiPhongtro = loaiPhongtro;
        this.giaTien = giaTien;
        this.diachi = diachi;
    }

    public PhongTro() {
    }

    public String getLoaiPhongtro() {
        return loaiPhongtro;
    }

    public void setLoaiPhongtro(String loaiPhongtro) {
        this.loaiPhongtro = loaiPhongtro;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "phongtro{" +
                "loaiphongtro=" + loaiPhongtro +
                ", giaTien='" + giaTien + '\'' +
                ",dia chi =" + diachi +
                '}';

    }
}

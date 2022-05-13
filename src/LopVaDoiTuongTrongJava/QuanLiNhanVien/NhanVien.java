package LopVaDoiTuongTrongJava.QuanLiNhanVien;

public class NhanVien {
    private String id;
    private String name;
    private int age;
    private String address;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String[][] danhSach = new String[20][4];
    int count = 0;

    public void add(String id, String name, int age, String address) {
        setId(id);
        setName(name);
        setAge(age);
        setAddress(address);
        count++;

    }

    public void edit() {
    }

    public void deltele() {

    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "." + danhSach[i][0] + danhSach[i][1] + danhSach[i][2] + danhSach[i][3]);
        }

    }
}


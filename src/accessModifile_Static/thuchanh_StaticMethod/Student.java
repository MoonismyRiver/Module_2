package accessModifile_Static.thuchanh_StaticMethod;


public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //khởi tạo biến
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method thay đổi giá trị cho biến
    static void change() {
        college = "CODEGYM";
    }

    //phương thức để hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
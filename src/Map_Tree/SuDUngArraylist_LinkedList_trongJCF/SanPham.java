package Map_Tree.SuDUngArraylist_LinkedList_trongJCF;

import Map_Tree.SapXepVsComparableVaComParator.Student;
import org.jetbrains.annotations.NotNull;

public class SanPham {
    private String name;
    private int id;
    private int price;

    public SanPham() {
    }

    public SanPham(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

//    @Override
//    public int compareTo(SanPham sanPham) {
////        return this.getId().compareTo((sanPham.getId());
//    }
//}
}

package KeThua.ThucHanh_HeDoiTuongHinhHoc;

public class TestCycle {
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        System.out.println(cycle);

        cycle = new Cycle(3.5);
        System.out.println(cycle);

        cycle = new Cycle("indigo", false, 3.5);
        System.out.println(cycle);
    }

}

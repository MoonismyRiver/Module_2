package Threading.BaiTap_hienThiSoChanLe;

public class TestThread {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        Thread thread1 = new Thread(evenThread);
        Thread thread2 = new Thread(oddThread);
        thread1.start();
        thread2.start();
    }
}

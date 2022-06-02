package Threading.BaiTapTimSoNguyenTo;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        System.out.println("---Thread 1: Tìm số nguyên tố  chưa tối ưu---");

        for (int n = 2; n < 100; n++) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if (check) {
                System.out.println("thread 1 :" + n);
            }

        }
        System.out.println("Thread 1 done!");

    }
}

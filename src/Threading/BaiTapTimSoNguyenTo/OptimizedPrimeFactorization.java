package Threading.BaiTapTimSoNguyenTo;

public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        System.out.println("---Thread 2 : Tìm số nguyên tố tối ưu---");

        for (int n = 2; n < 100; n++) {
            boolean check = true;
            for (int i = 2; (i < Math.sqrt(n) || i == Math.sqrt(n)); i++) {
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
                System.out.println("thread 2 :" + n);
            }
        }
        System.out.println("Thread 2 done!");
    }
}

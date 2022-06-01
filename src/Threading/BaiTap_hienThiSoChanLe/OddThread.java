package Threading.BaiTap_hienThiSoChanLe;

public class OddThread extends Thread{
    public void run() {
        for (int i = 1; i < 11; i++) {
            if(i%2!=0){
                System.out.println(i+",");
                try {
                    sleep(15);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

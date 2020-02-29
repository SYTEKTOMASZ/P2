package Rekurencja;

public class SilniaRekurencyjnie {
    public static int rekurencyjnie(int n ){
        if (n==1 || n == 0) {
            return 1;
        }
        else{
            int result = n * rekurencyjnie(n - 1);
            return result;
        }
    }

    public static void main(String[] args) {
        long v1 = System.nanoTime();
        System.out.println("Silnia n = "+ rekurencyjnie(6));
        long v2 = System.nanoTime();
        System.out.println("Czas dzaiłania programu w nanosekundach :" + (v2-v1) );
    }
}

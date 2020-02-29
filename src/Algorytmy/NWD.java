package Algorytmy;

public class NWD {
//motda nie stetyczna musimy stworzyc obiekt w mainie
    public int obliczOdejmujac(int a, int b){
        while( b != 0 ){
          if( a > b ){
              a = a - b;
          }
          else  {
              b = b - a;
          }
        }
        return a;
    }
    //medota statyczna nie wymaga tworzenia obiektu
    public static int obliczOdejmujac2(int a, int b){
        while( b != 0 ){
            if( a > b ){
                a = a - b;
            }
            else  {
                b = b - a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        NWD nwd = new NWD();
        System.out.println(nwd.obliczOdejmujac(8888,456));
        System.out.println(obliczOdejmujac2(100,20));
    }
}

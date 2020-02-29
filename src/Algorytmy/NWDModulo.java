package Algorytmy;

public class NWDModulo {

    public int algorytmEukildesa( int a , int b)   {
        while(b != 0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        NWDModulo nwdModulo = new NWDModulo();
        System.out.println(nwdModulo.algorytmEukildesa(250, 500));

    }
}

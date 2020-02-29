package Algorytmy;

public class BinarySearch {

    public static void main(String[] args) {
    TablicaUpo tablicaUpo = new TablicaUpo(120);

    /*for(int i =0; i<tablicaUpo.tab.length;i++){
        System.out.println("Tab["+i+"] = "+tablicaUpo.tab[i]);
    }
*/
    int left = 0;
    int right = tablicaUpo.tab.length-1;
    int y = 23;
    int value = 9999999;
    int center;
while (left < right) {
    center = (left + right) / 2;

    if (tablicaUpo.tab[center] < y) {
        left = center + 1;
    } else {
        right = center;
    }
}
    if(tablicaUpo.tab[right] == y){
        value = tablicaUpo.tab[right];
    }

    System.out.println("Szukana liczba to "+value);
    }
}

package Algorytmy;

public class TablicaUpo {
    public int[] tab;
    public int n;
    public TablicaUpo(int n) {
        this.n = n;
        this.tab = new int[n];
        for(int i=0; i < n; i++){
            this.tab[i]=i+1;
        }
    }
}

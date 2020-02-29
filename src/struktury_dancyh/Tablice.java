package struktury_dancyh;

public class Tablice {

    public static void main(String[] args) {

        int[] tab = new int[10];
        tab[0]  =   1;
        tab[1]  =   2;
        tab[2]  =   3;
        tab[3]  =   4;
        tab[4]  =   5;
        tab[5]  =   5;
        tab[6]  =   6;
        tab[7]  =   8;
        tab[8]  =   9;
        tab[9]  =   11;

            Tablice tablice = new Tablice();
            tablice.wypisz1(tab);
            tablice.wypisz2(tab);
            tablice.wypisz3(tab);
            StosTablica stos1 = new StosTablica(15);
            stos1.push(15);

    }
        public void wypisz1(int[] tab)
        {
            for(int i=tab.length-1; i>=0; i-- )    {
                if(i%2==0)  {
                    System.out.println("tab["+i+"]= "+tab[i]);
                }
            }
        }

        public void wypisz2(int[] tab)
        {
            int x = 0;
            for(int i=tab.length-1; i>=0; i-- )    {
                if(tab[i]%3==0)  {
                    x= x+ tab[i];
                }
            }
            System.out.println("suma elementów podzielnych przez 3 =" + x);
        }

        public void wypisz3(int[] tab ) {
            int x = 0;
            for(int i=0; i<tab.length-1;i++ ) {
                if (i < 5) {
                    x = x + tab[i];
                }
            }
                x = x - tab[tab.length-1];
            System.out.println("suma 5 elementów minus ostatni =" + x);
            }
}

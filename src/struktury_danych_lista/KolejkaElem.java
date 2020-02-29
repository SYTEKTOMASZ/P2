package struktury_danych_lista;

public class KolejkaElem {
    private int value;
    private KolejkaElem next;

    public KolejkaElem(int value, KolejkaElem next) {
        this.next = next;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public KolejkaElem getNext() {
        return next;
    }

    public void setNext(KolejkaElem next) {
        this.next = next;
    }


    public void add (int value){

    }
}

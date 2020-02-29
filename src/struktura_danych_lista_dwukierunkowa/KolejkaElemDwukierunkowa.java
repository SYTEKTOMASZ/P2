package struktura_danych_lista_dwukierunkowa;

import struktury_danych_lista.KolejkaElem;

public class KolejkaElemDwukierunkowa {
    KolejkaElemDwukierunkowa prev;
    KolejkaElemDwukierunkowa next;
    int value;

    public KolejkaElemDwukierunkowa(KolejkaElemDwukierunkowa prev, KolejkaElemDwukierunkowa next, int value) {
        this.prev = prev;
        this.next = next;
        this.value = value;
    }
    public int getValue() {
        return value;
    }

    public KolejkaElemDwukierunkowa getPrev() {
        return prev;
    }

    public void setPrev(KolejkaElemDwukierunkowa prev) {
        this.prev = prev;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public KolejkaElemDwukierunkowa getNext() {
        return next;
    }

    public void setNext(KolejkaElemDwukierunkowa next) {
        this.next = next;
    }
}

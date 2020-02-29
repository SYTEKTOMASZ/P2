package struktury_danych_lista;

import struktury_dancyh.stos_lista.StosLista;
import struktury_dancyh.stos_lista.StosPustyException;

import java.util.Scanner;

public class KolejkaLista   {
    private KolejkaElem first;
    private KolejkaElem last;

    public KolejkaLista()   {
        first = last = null;
    }

    public void add(int value) {
        KolejkaElem elem = new KolejkaElem(value, null);
        if (isEmpty()) {
            first = last = elem;
        }
        else {
            last.setNext(elem);
            last = elem;
        }
    }

    public int poll (){
        if(isEmpty()){
            System.out.println("Kolejka pusta, powinien byc exception");
            return Integer.MAX_VALUE;
        }
        else {
            int value = first.getValue();
            if(first == last){
                last = first = null;
            }
            else {
                first = first.getNext();
            }
            return value;
        }
    }

    public int peekfirst(){
        if(isEmpty()){
            System.out.println("Nie wolno podgladac, kolejka pusta, powinien byc exception");
            return Integer.MAX_VALUE;
        }
        else{
            return first.getValue();
        }
    }

    public int peeklast(){
        if(isEmpty()){
            System.out.println("Nie wolno podgladac, kolejka pusta, powinien byc exception");
            return Integer.MAX_VALUE;
        }
        else {
            return last.getValue();
        }
    }

    public void print(){
        if(isEmpty()) {
            System.out.println("Nie wolno podgladac, kolejka pusta, powinien byc exception");
        }
        else {
            System.out.println("Kolejka wyglada nastepujaco: ");
            KolejkaElem tmp = first;
            while (tmp != null) {
                System.out.println(tmp.getValue());
                tmp = tmp.getNext();
            }
        }
    }

    public boolean isEmpty(){
        return first == null;
        /*
        if(first==null){
            return true;
        }
        else{
            return false;
        }
         */
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KolejkaLista lista = new KolejkaLista();
        while (true) {
            System.out.println("Podaj nr: 1 - dodaj, 2 - przyjmij, 3 - Kto pierwszy, 4 - isEmpty, 5 - Kto ostatni, 6 - wypisz kolejke 0 - wyjście");
            int instrukcja = scanner.nextInt();

            switch (instrukcja) {
                case 0:
                    return;
                case 1:
                    System.out.println("Podaj Liczbe:");
                    int liczba = scanner.nextInt();
                    lista.add(liczba);
                    break;
                case 2:
                        System.out.println("Pop: " + lista.poll());
                        break;
                case 3:
                        System.out.println("Peek: " + lista.peekfirst());
                        break;
                case 4:
                    System.out.println("Is Empty? :" + lista.isEmpty());
                    break;
                case 5:
                    System.out.println("Last: " + lista.peeklast());
                    break;
                case 6:
                    lista.print();
                    break;
                default:
                    System.out.println("Nie prawidłowa instrukcja");
            }
        }

    }



}

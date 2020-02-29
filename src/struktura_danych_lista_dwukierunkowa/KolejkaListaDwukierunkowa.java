package struktura_danych_lista_dwukierunkowa;


import struktury_danych_lista.KolejkaElem;

import java.util.Scanner;

public class KolejkaListaDwukierunkowa {
    private KolejkaElemDwukierunkowa first;
    private KolejkaElemDwukierunkowa last;

    public KolejkaListaDwukierunkowa()   {
        first = last = null;
    }

    public void addfirst(int value){
        KolejkaElemDwukierunkowa elem = new KolejkaElemDwukierunkowa(null, null, value);
        if(isEmpty()){
        first = last = elem;
        }
        else{
        elem.setNext(first);
        first.setPrev(elem);
        first = elem;
        }
    }


    public void addlast(int value){
        KolejkaElemDwukierunkowa elem = new KolejkaElemDwukierunkowa(null, null, value);
        if(isEmpty()){
            last = first = elem;
        }
        else{
            elem.setPrev(last);
            last.setNext(elem);
            last = elem;
        }
    }
    public int peekfirst(){
        if(isEmpty()){
            System.out.println("Nie wolno podgladac, kolejka pusta, powinien byc exception");
            return Integer.MAX_VALUE;
        }
        else {
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
            KolejkaElemDwukierunkowa tmp = first;
            while (tmp != null) {
                System.out.println(tmp.getValue());
                tmp = tmp.getNext();
            }
        }
    }
    public void printreverse(){
        if(isEmpty()) {
            System.out.println("Nie wolno podgladac, kolejka pusta, powinien byc exception");
        }
        else {
            System.out.println("Kolejka wyglada nastepujaco: ");
            KolejkaElemDwukierunkowa tmp = last;
            while (tmp != null) {
                System.out.println(tmp.getValue());
                tmp = tmp.getPrev();
            }
        }
    }

    public int pollfirst (){
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
                first.setPrev(null);
            }
            return value;
        }
    }
    public int polllast (){
        if(isEmpty()){
            System.out.println("Kolejka pusta, powinien byc exception");
            return Integer.MAX_VALUE;
        }
        else {
            int value = last.getValue();
            if(first == last){
                last = first = null;
            }
            else {
                last = last.getPrev();
                last.setNext(null);
            }
            return value;
        }
    }

    public boolean remove(int value){
        int founVal=0;
        KolejkaElemDwukierunkowa found = search(value);
        if(found == null){
            return false;
        }
        else {
            if (value == first.getValue()) {
                pollfirst();
            } else if (value == last.getValue()) {
                polllast();
            } else {
                found.getNext().setPrev(found.getPrev());
                found.getPrev().setNext(found.getNext());
            }
            return true;
        }

    }

    public KolejkaElemDwukierunkowa search(int value)   {
        KolejkaElemDwukierunkowa tmp = first;
        while (tmp!=null){
            if(tmp.getValue()== value){
                return tmp;
            }
            tmp = tmp.getNext();
        }
        return null;
    }

    public int howMany(){
        int how= 0;
        if(isEmpty()){
            System.out.println("Lista pusta");
            return how;
        }
        else{
            KolejkaElemDwukierunkowa tmp = first;
            while (tmp != null) {
                how = how+1;
                tmp = tmp.getNext();
            }

            return how;
        }
    }
    public int printSpecific(int indeks)   {
        int value=0;
        KolejkaElemDwukierunkowa tmp = first;
        if(indeks >= howMany()){
            System.out.println("Lista ma mniej elementów");
            return Integer.MAX_VALUE;
        }
        else{
            while(value!=indeks){
                tmp = tmp.getNext();
                value = value +1;
            }
            return tmp.getValue();
        }
    }

    public int pullSpecific(int indeks){
        int value=0;
        KolejkaElemDwukierunkowa tmp = first;
        if(indeks > howMany()){
            System.out.println("Lista ma mniej elementów");
            return Integer.MAX_VALUE;
        }
        else{
            while(value==indeks){
                tmp = tmp.getNext();
                value = value +1;
            }
            int val = tmp.getValue();
            if(tmp.next == null){
                tmp.prev.setNext(null);
            }
            else if(tmp.prev == null){
                tmp.next.setPrev(null);
            }
            else {
                tmp.next = tmp.getPrev();
                tmp.prev = tmp.getNext();
            }
            return val;
        }
    }


    public boolean isEmpty(){
        return first == null;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KolejkaListaDwukierunkowa lista = new KolejkaListaDwukierunkowa();
        while (true) {
            System.out.println("Podaj nr: 1-addfirst, 2-addlast, 3-Ktofirst, 4-Ktolast, 5-pusty?, 6-wypiszall, 7-firstout, 8-last out, 9- wypiszreve, 10-ile ele, 11 -printspecific, 12 - pullspecific, 13 = serach, 0 - wyjście");
            int instrukcja = scanner.nextInt();

            switch (instrukcja) {
                case 0:
                    return;
                case 1:
                    System.out.println("Podaj Liczbe:");
                    int liczba = scanner.nextInt();
                    lista.addfirst(liczba);
                    break;
                case 2:
                    System.out.println("Podaj Liczbe:");
                    int liczba2 = scanner.nextInt();
                    lista.addlast(liczba2);
                    break;
                case 3:
                    System.out.println("Peek first: " + lista.peekfirst());
                    break;
                    case 4:
                    System.out.println("Last: " + lista.peeklast());
                    break;
                case 5:
                    System.out.println("Is Empty? :" + lista.isEmpty());
                    break;

                case 6:
                    lista.print();
                    break;
                case 7:
                    System.out.println("First Out: :" + lista.pollfirst());
                    break;
                    case 8:
                    System.out.println("Last Out: :" + lista.polllast());
                    break;
                case 9:
                    lista.printreverse();
                    break;
                case 10:
                    System.out.println("Lista ma tyle elementów:"+lista.howMany());
                    break;
                case 11:
                    System.out.println("podaj indeks");
                    int indeks = scanner.nextInt();
                    System.out.println("Elemnt o który prosiles to:"+ lista.printSpecific(indeks));
                    break;
                case 12:
                    System.out.println("podaj indeks");
                    int indeks2 = scanner.nextInt();
                    System.out.println("Specific Out: :" + lista.pullSpecific(indeks2));
                    break;

                    default:
                    System.out.println("Nie prawidłowa instrukcja");
            }
        }

    }
}

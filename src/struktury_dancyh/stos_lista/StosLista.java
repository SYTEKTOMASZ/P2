package struktury_dancyh.stos_lista;

import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class StosLista {

    private StosElem top;

    public StosLista() {
        top = null;
    }

    public void push(int value) {
        top = new StosElem(value, top);
        /*
        To samo co
        StosElem elem = new StosElem(value, top);
        top = elem;
        */
    }

    public int peek() {
        if (isEmpty()){
            throw new StosPustyException();
        }
            return top.getValue();
    }

    public int pop() {
        if(isEmpty()) {
            throw new StosPustyException();
        }
            int value = top.getValue();
            top = top.getPrev();
            return value;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }

    }

    public void printAll(){
        if (top==null){
            throw new StosPustyException();
        }
        StosElem tmp = top;
        while(tmp != null){
            System.out.println(tmp.getValue());
            tmp = tmp.getPrev();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StosLista stos = new StosLista();
        while (true) {
            System.out.println("Podaj nr: 1 - push, 2 - pop, 3 - peek, 4 - isEmpty, 5 - peek all 0 - wyjście");
            int instrukcja = scanner.nextInt();

            switch (instrukcja) {
                case 0:
                    return;
                case 1:
                    System.out.println("Podaj Liczbe:");
                    int liczba = scanner.nextInt();
                    stos.push(liczba);
                    break;
                case 2:
                    try {
                        System.out.println("Pop: " + stos.pop());
                        break;
                    }
                    catch (StosPustyException exception) {
                    System.out.println(exception.getMessage());
                    break;
                }
                case 3:
                    try {
                        System.out.println("Peek: " + stos.peek());
                        break;
                    }
                    catch (StosPustyException exception) {
                        System.out.println(exception.getMessage());
                        break;
                    }

                case 4:
                    System.out.println("Is Empty? :" + stos.isEmpty());
                    break;
                case 5:
                    try {
                        System.out.println("Stan Stosu:");
                        stos.printAll();
                        break;
                    }
                    catch (StosPustyException exception) {
                    System.out.println(exception.getMessage());
                    break;
                }
                default:
                    System.out.println("Nie prawidłowa instrukcja");
            }
        }

    }

}

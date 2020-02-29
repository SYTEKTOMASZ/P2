package struktury_dancyh;

import java.util.Scanner;

public class StosTablica {
    private int tab[];
    private int top;

    public StosTablica(int size) {
        tab = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top < tab.length - 1) {
            tab[++top] = value;
        } else {
            System.out.println("Stos jest pełny");
        }
            /*
        inaczej
        top++;  //top = top + 1;
        tab[top] = value;
        */
    }

    public int peek(){
        if(top>=0) {
            return tab[top];
        }
        System.out.println("Stos pusty");
        return 0;
    }

    public int pop() {
        try {
            int x = tab[top];
            top--;
            // lub return tab[top--];
            return x;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stos pusty");
            return 0;
        }

    }
        public boolean isEmpty() {
        return top==-1;
       /* to samo co wyzej
        if(top==-1)
        {
            return true;
        }
        else{
            return false;
        }*/
    }

        public boolean isFull(){
        return top == tab.length-1;
        /*
        if(top == tab.length - 1)
        {
        return true;
        }
        else{
        return false;
        }
         */
        }

    public static void main(String[] args) {
        StosTablica stos = new StosTablica(10);
        Scanner scanner = new Scanner(System.in);
        while (true)    {
            System.out.println("Podaj nr: 1 - push, 2 - pop, 3 - peek, 4 - isEmpty, 5 - isFull,11 0 - wyjście");
            int instrukcja = scanner.nextInt();

            switch  (instrukcja)    {
                case 0:
                    return;
                case 1:
                    System.out.println("Podaj Liczbe:");
                    int liczba = scanner.nextInt();
                    stos.push(liczba);
                    break;
                case 2:
                    System.out.println("Pop: "+stos.pop());
                    break;
                case 3:
                    System.out.println("Peek: "+stos.peek());
                    break;
                case 4:
                    System.out.println("Is Empty? :"+ stos.isEmpty());
                    break;
                case 5:
                    System.out.println("Is Full? :"+ stos.isFull());
                    break;
                default:
                    System.out.println("Nie prawidłowa instrukcja");

            }

        }
    }

    }






package Rekurencja;

public class FinobaczczczcziRekurencyjnie {

    public static int rekurenccyjneF(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return rekurenccyjneF(n-1)+rekurenccyjneF(n-2);
    }

    public static void main(String[] args) {
        for(int i = 0; i<=15; i++){
            System.out.println(rekurenccyjneF(i));
        }
    }
}


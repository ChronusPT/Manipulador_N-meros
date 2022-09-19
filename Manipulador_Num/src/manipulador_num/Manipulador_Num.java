
package manipulador_num;

import java.util.Scanner;

public class Manipulador_Num {

    public static Scanner ler = new Scanner (System.in);
    public static int x, y;
    public static void main(String[] args) {
           
        int op;
        do {
            System.out.println("Menu de Operação com Números :");
            System.out.println("1 - Maior de 2 números");
            System.out.println("2 - Ordenar valores (decrescente)");
                    
            System.out.println("0 - Sair");
            System.out.println("Selecione a opção pretendida");
            op = ler.nextInt();
            switch (op) {
                case 0 : break;
                case 1 :
                    levalores ("Insira um valor","Insira outro valor");
                    MaiorNumero.maior2(x,y);
                case 2: le1valor("Insira um valor : ");
                    NumeroDecrescente.ordenadecrescente(x);
                    break;
                default: System.out.println("Insira Opção válida!");  
            }
    }while(op!=0);
                }
    private static void levalores(String s1, String s2) {
        System.out.println(s1);
        x = ler.nextInt();
        System.out.println(s2);
        y = ler.nextInt();
     
    }
    
}

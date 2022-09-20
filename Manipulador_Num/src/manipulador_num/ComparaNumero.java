
package manipulador_num;


class ComparaNumero {

    static void comparar2Valores(int x, int y) {
        if (x < y)
            System.out.println("O o valor de x ("+x+") é menor que o valor de y ("+y+")");
        else if (x > y)
            System.out.println("O o valor de x ("+x+") é maior que o valor de y ("+y+")");
        else 
            System.out.println("O o valor de x ("+x+") é igual ao valor de  y ("+y+")");
    }  
}

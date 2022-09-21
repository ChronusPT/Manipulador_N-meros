
package manipulador_num;


class Credito {

    static void calculaSaldo() {
        
        int saldoA;
        double credito = 0; 
       
        System.out.println("Qual o valor do rendimento anual ? ");
        saldoA = Manipulador_Num.ler.nextInt();
        
        if (saldoA < 201)
            credito = (saldoA * 0);
 
        else if (saldoA > 200 && saldoA < 401)
            credito = (saldoA * 0.20);
              
        else if (saldoA > 400 && saldoA < 601)
            credito = (saldoA * 0.30);
        
        else if (saldoA > 600 )
            credito = (saldoA * 0.40);
                        
        
        System.out.println("O valor do credito atribuido é do Tipo " +tier+
                " e tem o valor de " +credito);
        
    }
         
}

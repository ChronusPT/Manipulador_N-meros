
package manipulador_num;


class Credito {

    static void calculaSaldo() {
        
        int saldoA = 0;
        int op = 0;
        double credito;
        
        System.out.println("Qual o valor do rendimento anual ? ");
        saldoA = Manipulador_Num.ler.nextInt();
        
        credito = 0;
        
        if (saldoA > 201 && saldoA < 400)
            op = 1;
        else if (saldoA > 401 && saldoA < 600)
            op = 2;
        else if (saldoA > 601 )
            op = 3;
        else (saldoA <= 200)
            op = 4;
                
        switch(saldoA) {
            case 1:
                    credito = saldoA * 0.20;
                break;
            case 2:
                    credito = saldoA * 0.30;
                break;
            case 3:
                if (saldoA > 601 )
                    credito = saldoA * 0.40;   
                break;
            default:
                    credito = saldoA * 0;    
        
        System.out.println("O valor do credito é de " +credito);
        }
        
    }
         
}


package manipulador_num;


class Carro {
   
    
    
 
    static void calculaValorFinal() {
      
    double custoFabrica,custoFinal;
  
        System.out.println("Qual o valor da produção do automovel ? ");
        custoFabrica = Manipulador_Num.ler.nextDouble();
        custoFinal = custoFabrica + (custoFabrica*0.28) + (custoFabrica*0.45);
  
       
          
  
        System.out.println("O custo do automovel ao consumidor é de "+ custoFinal);
      
    }
    
}

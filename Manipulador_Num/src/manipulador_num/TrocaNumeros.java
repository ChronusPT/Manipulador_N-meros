
package manipulador_num;

class TrocaNumeros {

    static void trocaNumeros(int x,int y) {
        int sup = 0;
        if (x < y){
            sup = x;
            x = y;
            y = sup; 
            System.out.println("Os valores são y = "+x+" e x = "+y);
        } 
        else {
            System.out.println("Os valores são x = "+x+" e y = "+y);
        } 
        
        
        
    }
    
}

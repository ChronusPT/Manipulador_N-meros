
package manipulador_num;


class MediaAluno {
    
    public static int [] notas;

    static void registaNotas() {
        
        int n;
        System.out.println("Quantas notas pretende inserir?");
        n = Manipulador_Num.ler.nextInt();
        notas = new int [n];
        for (int x = 0; x < n ; x++) {
            System.out.println("Insira a nota "+(x+1));
            notas[x] = Manipulador_Num.ler.nextInt ();
            
        }
    mediaAluno();
    }
    
private static void mediaAluno () {
    int tam = notas.length;
    int soma = 0;
    for (int x = 0; x < tam; x++)
        soma+=notas[x];
    System.out.println("Média do aluno: "+ (1.0*soma/tam));
}
}

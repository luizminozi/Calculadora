package testes;
import calculadora.Divisao;

public class TestesDivisao {
    public static void main(String[] args) {
        Divisao d = new Divisao();
             //DIVISÃO
                //1° CASO - Testando o cenário ideal, com dois números inteiros e positivos
                    int divisao1 = d.divisao(100,5);
                    System.out.println("1° DIVISÃO = " + divisao1);
                    
                //2° CASO - Teste com numeros inteiros e um deles sendo negativos negativos
                    int divisao2 = d.divisao(5,-5);
                    System.out.println("2° DIVISÃO = " + divisao2);
                    
                //3° CASO - Teste com numeros inteiros e ambos deles sendo negativos negativos
                    int divisao3 = d.divisao(-10,-2);
                    System.out.println("3° DIVISÃO = " + divisao3);
                    
                //4° CASO - Teste com numeros sendo ambos zero
                    //int divisao4 = d.divisao(0,0);
                    //System.out.println("4° DIVISÃO = " + divisao4);
                    //Erro
                    
                //5° CASO - Teste com numeros fracionados
                    //int divisao5 = d.divisao(1.2,0.3);
                    //System.out.println("5° DIVISÃO = " + divisao5);
                    //Erro
                    
                //6° CASO - Teste com um dos números vazio
                    //int divisao6 = d.divisao(1,);
                    //System.out.println("6° DIVISÃO = " + divisao6);
                    //Erro
                    
                //7° CASO - Teste com um dos valores como STRING
                    //int divisao7 = d.divisao(1, "2");
                    //System.out.println("7° DIVISÃO = " + divisao7);
                    //Erro   
                    
                //8° CASO - Teste com o resultado dando um valor fracionado
                    //int divisao8 = d.divisao(3, 2);
                    //System.out.println("8° DIVISÃO = " + divisao8);
                    //Erro  
                    
                //9° CASO - Teste com o divisor igual a 0
                    //int divisao9 = d.divisao(40, 0);
                    //System.out.println("9° DIVISÃO = " + divisao9);
                    //Erro 
                 
    }
}

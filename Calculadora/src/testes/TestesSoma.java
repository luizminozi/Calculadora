package testes;
import calculadora.Soma;

public class TestesSoma {
    public static void main(String[] args) {
        Soma s = new Soma();
            //SOMA
                //1° CASO - Testando o cenário ideal, com dois números inteiros e positivos
                    int soma1 = s.soma(2,5);
                    System.out.println("1° SOMA = " + soma1);
                    
                //2° CASO - Teste com numeros inteiros e um deles sendo negativos negativos
                    int soma2 = s.soma(2,-5);
                    System.out.println("2° SOMA = " + soma2);
                    
                //3° CASO - Teste com numeros inteiros e ambos deles sendo negativos negativos
                    int soma3 = s.soma(-2,-5);
                    System.out.println("3° SOMA = " + soma3);
                    
                //4° CASO - Teste com numeros sendo ambos zero
                    int soma4 = s.soma(0,0);
                    System.out.println("4° SOMA = " + soma4);
                    
                //5° CASO - Teste com numeros fracionados
                    //int soma5 = s.soma(1.2,0.3);
                    //System.out.println("5 SOMA° = " + soma5);
                    //Erro
                    
                //6° CASO - Teste com um dos números vazio
                    //int soma6 = s.soma(1,);
                    //System.out.println("6 SOMA° = " + soma6);
                    //Erro
                    
                //7° CASO - Teste com um dos valores como STRING
                    //int soma7 = s.soma(1, "2");
                    //System.out.println("7 SOMA° = " + soma7);
                    //Erro 
                    
    }
}

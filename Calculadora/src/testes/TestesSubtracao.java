package testes;
import calculadora.Subtracao;

public class TestesSubtracao {
    public static void main(String[] args) {
        Subtracao s = new Subtracao();
            //SUBTRAÇÃO
                //1° CASO - Testando o cenário ideal, com dois números inteiros e positivos
                    int subtracao1 = s.subtracao(10,2);
                    System.out.println("1° SUBTRAÇÃO = " + subtracao1);
                    
                //2° CASO - Teste com numeros inteiros e um deles sendo negativos negativos
                    int subtracao2 = s.subtracao(10,-5);
                    System.out.println("2° SUBTRAÇÃO = " + subtracao2);
                    
                //3° CASO - Teste com numeros inteiros e ambos deles sendo negativos negativos
                    int subtracao3 = s.subtracao(-3,-4);
                    System.out.println("3° SUBTRAÇÃO = " + subtracao3);
                    
                //4° CASO - Teste com numeros sendo ambos zero
                    int subtracao4 = s.subtracao(0,0);
                    System.out.println("4° SUBTRAÇÃO = " + subtracao4);
                    
                //5° CASO - Teste com numeros fracionados
                    //int subtracao5 = s.subtracao(1.2,0.3);
                    //System.out.println("5° SUBTRAÇÃO = " + subtracao5);
                    //Erro
                    
                //6° CASO - Teste com um dos números vazio
                    //int subtracao6 = s.subtracao(1,);
                    //System.out.println("6° SUBTRAÇÃO = " + subtracao6);
                    //Erro
                    
                //7° CASO - Teste com um dos valores como STRING
                    //int subtracao7 = s.subtracao(1, "2");
                    //System.out.println("7° SUBTRAÇÃO = " + subtracao7);
                    //Erro   
                    
    }
}

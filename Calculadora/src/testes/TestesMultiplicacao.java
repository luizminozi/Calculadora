package testes;
import calculadora.Multiplicacao; 

public class TestesMultiplicacao {
    public static void main(String[] args) {
        Multiplicacao m = new Multiplicacao();
            //MULTIPLICAÇÃO
                //1° CASO - Testando o cenário ideal, com dois números inteiros e positivos
                    int multiplicacao1 = m.multiplicacao(100,5);
                    System.out.println("1° MULTILPICAÇÃO = " + multiplicacao1);
                    
                //2° CASO - Teste com numeros inteiros e um deles sendo negativos negativos
                    int multiplicacao2 = m.multiplicacao(5,-5);
                    System.out.println("2° MULTILPICAÇÃO = " + multiplicacao2);
                    
                //3° CASO - Teste com numeros inteiros e ambos deles sendo negativos negativos
                    int multiplicacao3 = m.multiplicacao(-10,-2);
                    System.out.println("3° MULTILPICAÇÃO = " + multiplicacao3);
                    
                //4° CASO - Teste com numeros sendo ambos zero
                    int multiplicacao4 = m.multiplicacao(0,0);
                    System.out.println("4° MULTILPICAÇÃO = " + multiplicacao4);
                    
                //5° CASO - Teste com numeros fracionados
                    //int multiplicacao5 = m.multiplicacao(1.2,0.3);
                    //System.out.println("5° MULTILPICAÇÃO = " + multiplicacao5);
                    //Erro
                    
                //6° CASO - Teste com um dos números vazio
                    //int multiplicacao6 = m.multiplicacao(1,);
                    //System.out.println("6° MULTILPICAÇÃO = " + multiplicacao6);
                    //Erro
                    
                //7° CASO - Teste com um dos valores como STRING
                    //int multiplicacao7 = m.multiplicacao(1, "2");
                    //System.out.println("7° MULTILPICAÇÃO = " + multiplicacao7);
                    //Erro   
                    
                //8° CASO - Teste com o multiplicador igual a 0
                    int multiplicacao8 = m.multiplicacao(40, 0);
                    System.out.println("8° MULTILPICAÇÃO = " + multiplicacao8);
          
    }
}

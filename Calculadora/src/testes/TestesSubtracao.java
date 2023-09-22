package testes;
import calculadora.Subtracao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestesSubtracao {
    Subtracao s = new Subtracao();
    //SUBTRAÇÃO
    //1° CASO - Testando o cenário ideal, com dois números inteiros e positivos
    @Test
    public void numerosInteirosPositivos() {
        int subtracao = s.subtracao(100,5);
        Assertions.assertEquals(95,subtracao);
    }

    //2° CASO - Teste com numeros inteiros e um deles sendo negativos negativos
    @Test
    public void umNumeroNegativo() {
        int subtracao = s.subtracao(5,-5);
        Assertions.assertEquals(10, subtracao);
    }

    //3° CASO - Teste com numeros inteiros e ambos deles sendo negativos negativos
    @Test
    public void doisNumerosNegativos() {
        int subtracao = s.subtracao(-10,-2);
        Assertions.assertEquals(-8,subtracao);
    }

    //4° CASO - Teste com numeros sendo ambos zero
    @Test
    public void doisNumerosZero() {
        int subtracao = s.subtracao(0,0);
        Assertions.assertEquals(0,subtracao);
    }

    //5° CASO - Teste com numeros fracionados
    /*@Test
    public void numerosFracionados() {
        int subtracao = s.subtracao(1.2,0.3);
        Assertions.assertEquals(0.9,subtracao);
    }

    //6° CASO - Teste com um dos números vazio
    @Test
    public void umNumeroVazio() {
        int subtracao = s.subtracao(1,);
        Assertions.assertEquals(1,subtracao);
    }

    //7° CASO - Teste com um dos valores como STRING
    @Test
    public void umNumeroString() {
        int subtracao = s.subtracao(1, "2");
        Assertions.assertEquals(-1,subtracao);
    }*/

}      
                    
    


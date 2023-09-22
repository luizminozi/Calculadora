package testes;
import calculadora.Divisao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestesDivisao {
    //DIVISÃO
    Divisao d = new Divisao();


    //1° CASO - Testando o cenário ideal, com dois números inteiros e positivos
    @Test
    public void numerosInteirosPositivos() {
        int divisao = d.divisao(100,5);
        Assertions.assertEquals(20,divisao);
    }

    //2° CASO - Teste com numeros inteiros e um deles sendo negativos negativos
    @Test
    public void umNumeroNegativo() {
        int divisao = d.divisao(5,-5);
        Assertions.assertEquals(-1, divisao);
    }

    //3° CASO - Teste com numeros inteiros e ambos deles sendo negativos negativos
    @Test
    public void doisNumerosNegativos() {
        int divisao = d.divisao(-10,-2);
        Assertions.assertEquals(5,divisao);
    }

    //4° CASO - Teste com numeros sendo ambos zero
    @Test
    public void doisNumerosZero() {
        int divisao = d.divisao(0,0);
        Assertions.assertEquals(0,divisao);
    }

    //5° CASO - Teste com numeros fracionados
    /*@Test
    public void numerosFracionados() {
        int divisao = d.divisao(1.2,0.3);
        Assertions.assertEquals(4,divisao);
    }

    //6° CASO - Teste com um dos números vazio
    @Test
    public void umNumeroVazio() {
        int divisao = d.divisao(1,);
        Assertions.assertEquals(20,divisao);
    }

    //7° CASO - Teste com um dos valores como STRING
    @Test
    public void umNumeroString() {
        int divisao = d.divisao(1, "2");
        Assertions.assertEquals(0.5,divisao);
    }*/

    //8° CASO - Teste com o divisor igual a 0
    @Test
    public void divisorZero() {
        int divisao = d.divisao(40, 0);
        Assertions.assertEquals(0,divisao);
    }
}


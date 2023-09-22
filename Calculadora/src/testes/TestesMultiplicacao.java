package testes;
import calculadora.Multiplicacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestesMultiplicacao {
    Multiplicacao m = new Multiplicacao();
    //1° CASO - Testando o cenário ideal, com dois números inteiros e positivos
    @Test
    public void numerosInteirosPositivos() {
        int multiplicacao = m.multiplicacao(100,5);
        Assertions.assertEquals(500,multiplicacao);
    }

    //2° CASO - Teste com numeros inteiros e um deles sendo negativos negativos
    @Test
    public void umNumeroNegativo() {
        int multiplicacao = m.multiplicacao(5,-5);
        Assertions.assertEquals(-25, multiplicacao);
    }

    //3° CASO - Teste com numeros inteiros e ambos deles sendo negativos negativos
    @Test
    public void doisNumerosNegativos() {
        int multiplicacao = m.multiplicacao(-10,-2);
        Assertions.assertEquals(20,multiplicacao);
    }

    //4° CASO - Teste com numeros sendo ambos zero
    @Test
    public void doisNumerosZero() {
        int multiplicacao = m.multiplicacao(0,0);
        Assertions.assertEquals(0,multiplicacao);
    }

    //5° CASO - Teste com numeros fracionados
    /*@Test
    public void numerosFracionados() {
        int multiplicacao = m.multiplicacao(1.2,0.3);
        Assertions.assertEquals(3.6,multiplicacao);
    }

    //6° CASO - Teste com um dos números vazio
    @Test
    public void umNumeroVazio() {
        int multiplicacao = m.multiplicacao(1,);
        Assertions.assertEquals(0,multiplicacao);
    }

    //7° CASO - Teste com um dos valores como STRING
    @Test
    public void umNumeroString() {
        int multiplicacao = m.multiplicacao(1, "2");
        Assertions.assertEquals(2,multiplicacao);
    }*/

    //8° CASO - Teste com o multiplicador igual a 0
    @Test
    public void multiplicadorZero() {
        int multiplicacao = m.multiplicacao(40, 0);
        Assertions.assertEquals(0,multiplicacao);
    }
}

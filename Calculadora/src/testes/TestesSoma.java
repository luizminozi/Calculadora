package testes;
import calculadora.Soma;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestesSoma{
        Soma s = new Soma();    
    
    //SOMA
    //1° CASO - Testando o cenário ideal, com dois números inteiros e positivos
    @Test
    public void numerosInteirosPositivos() {
        int soma = s.soma(100,5);
        Assertions.assertEquals(105,soma);
    }

    //2° CASO - Teste com numeros inteiros e um deles sendo negativos negativos
    @Test
    public void umNumeroNegativo() {
        int soma = s.soma(5,-5);
        Assertions.assertEquals(0, soma);
    }

    //3° CASO - Teste com numeros inteiros e ambos deles sendo negativos negativos
    @Test
    public void doisNumerosNegativos() {
        int soma = s.soma(-10,-2);
        Assertions.assertEquals(-12,soma);
    }

    //4° CASO - Teste com numeros sendo ambos zero
    @Test
    public void doisNumerosZero() {
        int soma = s.soma(0,0);
        Assertions.assertEquals(0,soma);
    }

    //5° CASO - Teste com numeros fracionados
    /*@Test
    public void numerosFracionados() {
        int soma = s.soma(1.2,0.3);
        Assertions.assertEquals(1.5,soma);
    }

    //6° CASO - Teste com um dos números vazio
    @Test
    public void umNumeroVazio() {
        int soma = s.soma(1,);
        Assertions.assertEquals(1,soma);
    }

    //7° CASO - Teste com um dos valores como STRING
    @Test
    public void umNumeroString() {
        int soma = s.soma(1, "2");
        Assertions.assertEquals(3,soma);
    }*/

}

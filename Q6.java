/*
  Crie uma classe Exception para alguma situação envolvida na questão anterior.
*/

public class VeiculoTest {

    @Test
    public void testAbastecimentoValido() {
        Veiculo veiculo = new Carro();
        veiculo.abastecer(30);
        assertEquals(30, veiculo.getTanque());
    }

    @Test
    public void testAbastecimentoInvalido() {
        Veiculo veiculo = new Carro();
        veiculo.abastecer(-10);
        assertEquals(0, veiculo.getTanque());
    }
}

public class CarroTest {

    @Test
    public void testTrancarPortas() {
        Carro carro = new Carro();
        carro.trancar();
        assertTrue(carro.arePortasTrancadas());
    }

    @Test
    public void testDestrancarPortas() {
        Carro carro = new Carro();
        carro.trancar();
        carro.destrancar();
        assertFalse(carro.arePortasTrancadas());
    }
}

public class MotoTest {

    @Test
    public void testAbastecimentoMoto() {
        Veiculo veiculo = new Moto();
        veiculo.abastecer(20);
        assertEquals(20, veiculo.getTanque());
    }
}

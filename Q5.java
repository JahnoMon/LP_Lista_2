/*
  Crie uma classe Exception para alguma situação envolvida na questão anterior.
*/

public class VeiculoException extends Exception {
    public VeiculoException(String mensagem) {
        super(mensagem);
    }
}

class carro extends veiculo implements Trancavel {
    @Override
    public void trancar() {
        if (arePortasTrancadas()) {
            throw new VeiculoException("As portas já estão trancadas.");
        }
        portasTrancadas = true;
    }
}

/*
Implemente classes ou interfaces Java que atendam ao que é pedido abaixo. Comente as suas decisões de reorganização de código via comentários no código.

● Os carros possuem, dentre outras coisas, portas e tanque de combustível
● As portas podem, dentre outras coisas, serem trancadas e destrancadas.
● Os tanques de combustível podem ser abastecidos com certas quantidades de gasolina, até um certo limite.
● Os carros com trava elétrica possuem uma funcionalidade que, com um único comando, todas as suas portas são trancadas ou destrancadas.
● Esse comando pode ser enviado por uma chave eletrônica ou por algum dispositivo que aceite comandos de voz. Ambos enviam algum tipo de sinal para o veículo, que o utiliza para efetivar ou não o comando.
● As motos possuem, dentre outras coisas, tanque de combustível, mas não portas
● Os carros e as motos podem ser abastecidos
*/

interface Abastecivel {
    void abastecer(int quantidade);
}

interface Trancavel {
    void trancar();
    void destrancar();
}

abstract class Veiculo implements Abastecivel {
    private int tanque;

    public Veiculo() {
        this.tanque = 0;
    }

    public int getTanque() {
        return tanque;
    }

    @Override
    public void abastecer(int quantidade) {
        if (quantidade > 0) {
            tanque += quantidade;
        }
    }
}

class Carro extends Veiculo implements Trancavel {
    private boolean portasTrancadas;

    public Carro() {
        this.portasTrancadas = false;
    }

    @Override
    public void trancar() {
        portasTrancadas = true;
    }

    @Override
    public void destrancar() {
        portasTrancadas = false;
    }

    public void executarComandoTrava(boolean trancar) {
        portasTrancadas = trancar;
    }

    public boolean arePortasTrancadas() {
        return portasTrancadas;
    }
}

class Moto extends Veiculo {
    // vazia pois já herda tudo o que é necessário da interface Veículo
}

public class Q3 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();
        
        carro.abastecer(30);
        moto.abastecer(20);

        carro.trancar();

        // Verificando se as portas do carro estão trancadas
        if (carro.arePortasTrancadas()) {
            System.out.println("As portas do carro estão trancadas.");
            
        } else {
            System.out.println("As portas do carro estão destrancadas.");
        }
        System.out.println("Nível do tanque no carro: " + carro.getTanque());
        System.out.println("Nível do tanque na moto: " + moto.getTanque());
    }
}

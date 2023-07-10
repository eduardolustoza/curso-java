package exercicios.exercicio4;

public abstract class Veiculo {
    abstract void acelerar(int velocidade);
    abstract void frear();
}

class Carro extends Veiculo {
    @Override
    void acelerar(int velocidade) {
        System.out.println("O carro acelerou para " + velocidade + " km/h.");
    }

    @Override
    void frear() {
        System.out.println("O carro freou.");
    }
}

class Moto extends Veiculo {
    @Override
    void acelerar(int velocidade) {
        System.out.println("A moto acelerou para " + velocidade + " km/h.");
    }

    @Override
    void frear() {
        System.out.println("A moto freou.");
    }
}

class MainVeiculo {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.acelerar(80);
        carro.frear();

        Moto moto = new Moto();
        moto.acelerar(60);
        moto.frear();
    }
}


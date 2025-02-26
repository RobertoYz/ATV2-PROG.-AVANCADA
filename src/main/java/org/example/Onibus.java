package org.example;

public class Onibus extends Veiculo{

    private int quantidadeEixos;

    public Onibus(String marca, String modelo, String ano, int capacidadePassageiros, String combustivel, int quantidadeEixos) throws Exception {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);

        boolean condicaoEixo = quantidadeEixos >= 6 && quantidadeEixos <= 8;

        if(!condicaoEixo){
            throw new Exception("O VALOR DEVE ESTAR ENTRE...");

        }
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public void calcularAutonomia(double tanque, double consumo) {
        System.out.println("Autonomia: " + tanque * consumo);
    }
}

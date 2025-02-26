package org.example;

public class Carro extends Veiculo {

    private String tipoCarro;

    public Carro(String marca, String modelo, String ano, int capacidadePassageiros, String combustivel, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.tipoCarro = tipoCarro;
    }

    @Override
    public void calcularAutonomia(double tanque, double consumo){
        System.out.println("Autonomia: " + tanque * consumo);
    }

}

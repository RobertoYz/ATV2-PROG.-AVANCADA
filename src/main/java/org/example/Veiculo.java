package org.example;

public abstract class Veiculo {

    private String marca;
    private String modelo;
    private String ano;
    private int capacidadePassageiros;
    private String combustivel;

    public Veiculo(String marca, String modelo, String ano, int capacidadePassageiros, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadePassageiros = capacidadePassageiros;
        this.combustivel = combustivel;
    }

    public abstract void calcularAutonomia(double tanque, double consumo);

    public void exibirDetalhes(){
        System.out.println("Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", capacidadePassageiros=" + capacidadePassageiros +
                ", combustivel='" + combustivel + '\'' +
                '}');
    };

}

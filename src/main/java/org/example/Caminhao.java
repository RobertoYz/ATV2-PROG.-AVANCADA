package org.example;

public class Caminhao extends Veiculo  {
    public double capacidadeCarga;

    public Caminhao(String marca, String modelo, String ano, int capacidadePassageiros, String combustivel, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void calcularAutonomia(double tanque, double consumo){

        double pesoDaCarga = this.capacidadeCarga;
        double consumoFinal = consumo - pesoDaCarga * 0.01;

        if(consumoFinal < 0.25 * consumo){
            System.out.println("Autonomia: " + consumo * 0.25 * tanque);
        } else{
            System.out.println("Autonomia: " + consumoFinal * tanque);
        }
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
    }
}

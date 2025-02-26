package org.example;

public class CaminhaoRefrigerado extends Caminhao{
    private double temperaturaMinima;
    public CaminhaoRefrigerado(String marca, String modelo, String ano, int capacidadePassageiros, String combustivel, double capacidadeCarga, double temperaturaMinima) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, capacidadeCarga);
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public void calcularAutonomia(double tanque, double consumo) {

        double pesoDaCarga = this.capacidadeCarga;
        double consumoFinal = consumo - pesoDaCarga * 0.01;

        if(consumoFinal < 0.25 * consumo){
            System.out.println("Autonomia: " + consumo * 0.25 * tanque);
        } else{
            System.out.println("Autonomia: " + consumoFinal * tanque * 0.10);
        }
    }

}

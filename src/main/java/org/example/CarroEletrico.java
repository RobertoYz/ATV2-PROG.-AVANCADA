package org.example;

public class CarroEletrico extends Carro{

    private double bateriaKWH;

    public CarroEletrico(String marca, String modelo, String ano, int capacidadePassageiros, String tipoCarro, double bateriaKWH){
        super(marca, modelo, ano, capacidadePassageiros, "elétrico", tipoCarro);
        this.bateriaKWH = bateriaKWH;
    }

    @Override
    public void calcularAutonomia(double tanque, double consumo) {
        System.out.println("Autonomia: " + bateriaKWH * consumo);
        tanque = 0;
    }
}

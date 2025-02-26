package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        Onibus onibus = new Onibus("Mercedes", "O500", "2022", 50, "Diesel", 6);
        Carro carro = new Carro("Toyota", "Corolla", "2023", 5, "Gasolina", "Sedan");
        Caminhao caminhao = new Caminhao("Volvo", "FH16", "2021", 2, "Diesel", 40.5);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "truck", "2025", 2, "Sedan", 50);
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Volvo", "FH16", "2021", 2, "Diesel", 40.5, 20);


        onibus.exibirDetalhes();

        onibus.calcularAutonomia(500, 2);

        carro.calcularAutonomia(500, 2);

        caminhao.calcularAutonomia(500, 2);

        carroEletrico.calcularAutonomia(0, 5);

        caminhaoRefrigerado.calcularAutonomia(500, 2);
    }
}
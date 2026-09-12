import java.util.ArrayList;

class Veiculo {

    private String placa;
    private String modelo;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public void mostrar() {

        System.out.println(
            placa + " - " + modelo
        );
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Veiculo> estacionamento =
            new ArrayList<>();

        estacionamento.add(
            new Veiculo("ABC1234", "Civic")
        );

        estacionamento.add(
            new Veiculo("XYZ5678", "Corolla")
        );

        estacionamento.add(
            new Veiculo("DEF9012", "Onix")
        );

        System.out.println(
            "--- VEÍCULOS ---"
        );

        for (Veiculo veiculo : estacionamento) {
            veiculo.mostrar();
        }
    }
}

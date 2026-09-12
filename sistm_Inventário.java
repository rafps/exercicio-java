import java.util.ArrayList;

class Item {

    private String nome;
    private int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void mostrar() {

        System.out.println(
            nome + " x" + quantidade
        );
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Item> inventario =
            new ArrayList<>();

        inventario.add(
            new Item("Poção", 5)
        );

        inventario.add(
            new Item("Espada", 1)
        );

        inventario.add(
            new Item("Armadura", 1)
        );

        System.out.println("--- INVENTÁRIO ---");

        for (Item item : inventario) {
            item.mostrar();
        }
    }
}

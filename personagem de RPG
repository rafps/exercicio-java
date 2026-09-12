class Personagem {

    String nome;
    int vida;
    int ataque;

    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void atacar(Personagem inimigo) {

        inimigo.vida -= ataque;

        System.out.println(
            nome + " atacou " +
            inimigo.nome +
            " causando " +
            ataque +
            " de dano."
        );
    }

    public void mostrarStatus() {

        System.out.println(
            nome +
            " Vida: " +
            vida +
            " Ataque: " +
            ataque
        );
    }
}

public class Main {

    public static void main(String[] args) {

        Personagem guerreiro =
            new Personagem("Guerreiro", 100, 25);

        Personagem monstro =
            new Personagem("Goblin", 80, 15);

        guerreiro.atacar(monstro);

        monstro.mostrarStatus();
    }
}

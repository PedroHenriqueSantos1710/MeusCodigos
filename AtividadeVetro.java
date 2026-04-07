class Pessoa {
    String nome;
    double valor;
}

public class AtividadeVetro {
    public static void main(String[] args) {
        
        Pessoa[] pessoas = new Pessoa[3];

        pessoas[0] = new Pessoa();
        pessoas[0].nome = "Rosa Alves";
        pessoas[0].valor = 1200.00;

        pessoas[1] = new Pessoa();
        pessoas[1].nome = "João Silva";
        pessoas[1].valor = 1500.00;

        pessoas[2] = new Pessoa();
        pessoas[2].nome = "Maria Souza";
        pessoas[2].valor = 980.00;

      
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Nome: " + pessoas[i].nome);
            System.out.println("Valor: " + pessoas[i].valor);
            System.out.println("-----");
        }
    }
}
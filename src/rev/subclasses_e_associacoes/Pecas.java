package rev.subclasses_e_associacoes;

import java.util.Objects;

public class Pecas {
    // Atributos
    private String nome = "";
    private double preco = 0.0;

    // Construtor Peças
    public Pecas(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Construtor Peças vazio
    public Pecas(){
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para acessar o endereço de memória de um atributo "hashcode()equals()"
    // Ou seja, para fazer comparações de atributos usando o endereço de memória e não por valores
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pecas Pecas = (Pecas) o;
        return Double.compare(Pecas.getPreco(), getPreco()) == 0 && Objects.equals(getNome(), Pecas.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPreco());
    }

    // Método 'public void Mostrar();' tornou-se o Método 'public String toString();'
    @Override
    public String toString() {
        System.out.println("--- PEÇAS DISPONÍVEIS --- ");
        return "\nNome: " + nome + " - R$" + preco ;
    }
}

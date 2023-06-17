package rev.superclasse_revisao;

import rev.excecao.ExceptionRevisao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author: Maria Eduarda, Sammuel Rodrigues, Larissa Santos, Ereikson Mendes, Nayra
 */
public abstract class Revisao {

    /* Declaração e atribuição de variaveis de instancia da classe*/
    private String cliente = "";
    private int codRev = 0;         // Uma variável inteira para armazenar o código de revisão
    private String descRev = "";     // Uma variável de string para armazenar a descrição da revisão



    /*CONSTRUTOR COM PARAMETROS DA SUPERCLASSE*/
    public Revisao(String cliente, int codRev, String descRev) {
        this.cliente = cliente;
        this.codRev = codRev;
        this.descRev = descRev;
    }

    //CONTRUTOR VAZIO
    public Revisao() {

    }

    /* CADASTRAR CÓDIGO E DESCRIÇÃO DA REVISÃO() */
    public abstract void cadastrarRevisao();

    // Método Avaliação Interna();
    public abstract void avaliacaoInterna();

    // Método Testes Internos();
    public abstract void testesInternos();


    // Getters e Setters
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCodRev() {
        return codRev;
    }

    public void setCodRev(int codRev) {
        this.codRev = codRev;
    }

    public String getDescRev() {
        return descRev;
    }

    public void setDescRev(String descRev) {
        this.descRev = descRev;
    }

    // Método 'public void Mostrar();' tornou-se o Método 'public String toString();'
    @Override
    public String toString() {
        return "\nREVISÃO" +
                "\nCLIENTE: " + cliente +
                "\nCÓDIGO DA REVISÃO: " + codRev +
                "\nDESCRIÇÃO DA REVISÃO: " + descRev;
    }
}

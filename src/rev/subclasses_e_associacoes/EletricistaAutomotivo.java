package rev.subclasses_e_associacoes;

import rev.carregamento.Loading;
import rev.excecao.ExceptionRevisao;
import rev.superclasse_revisao.Revisao;

import java.util.Scanner;

/*
 * Eletricista Automotivo:
 * cadastrarRevisao();
 * avaliacaoInterna();
 * testesInternos();
 * TesteBateria();
 * instalacaoSom();
 * instalacaoLanternas();
 * */

public class EletricistaAutomotivo extends Revisao {

    // Atributos
    private static Oficina officina = new Oficina();
    private Loading load;

    // Construtor + Construtor da Super Classe
    public EletricistaAutomotivo(String cliente, int codRev, String descRev) {
        super(cliente, codRev, descRev);
    }

    // Construtor + Construtor da Super Classe vazios para instâncias sem argumentos
    public EletricistaAutomotivo(){
        super();
    }


    // Cadastro para Revisão Elétrica
    @Override
    public void cadastrarRevisao() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" --- ELETRICISTA --- ");
        System.out.print("Cliente: ");
        setCliente(sc.nextLine());
        System.out.print("Descrição da Revisão Elétrica: ");
        setDescRev(sc.nextLine());
        System.out.print("Código da Revisão: ");
        setCodRev(sc.nextInt());
    }

    // Avaliação Elétrica interna
    @Override
    public void avaliacaoInterna() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o que deve ser avaliado para o Eletricista : ");
        String servicos = sc.nextLine();
        int totalProgress = 13;
        int currentProgress = 0;
        load = new Loading();
        while(currentProgress < totalProgress){
            System.out.print("Verificando Partições Eletricas"+load.getLoadingDots(currentProgress)+"\r");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new ExceptionRevisao(e.getMessage());
            }
            currentProgress++;
        }
        System.out.println("Problema encontrado: "+servicos+"!");
    }

    // Testes Eletrícos
    @Override
    public void testesInternos() {
        int totalProgress = 13;
        int currentProgress = 0;
        load = new Loading();
        while(currentProgress < totalProgress){
            System.out.print("Realizando Testes Elétricos do Automóvel"+load.getLoadingDots(currentProgress)+"\r");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new ExceptionRevisao(e.getMessage());
            }
            currentProgress++;
        }
    }

    // Teste de Bateria = Tensão / Resistência
    public void TesteBateria(){
        Scanner sc = new Scanner(System.in);
        double tensao = 0.0;
        double resistencia = 0.0;
        System.out.print("Entre com a Tensão da Bateria: ");
        tensao = sc.nextDouble();
        System.out.print("Entre com a Resistência da Bateria: ");
        resistencia = sc.nextDouble();
        testesInternos();
        System.out.println("Carga da Bateria: "+calcularCargaBateria(tensao,resistencia));
    }

    // Instalação de Som
    public void instalAutoFalantes(){
        int totalProgress = 13;
        int currentProgress = 0;
        load = new Loading();
        while(currentProgress < totalProgress){
            System.out.print("Iniciando instalação de Som"+load.getLoadingDots(currentProgress)+"\r");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new ExceptionRevisao(e.getMessage());
            }
            currentProgress++;
        }
        System.out.println("Sistemas de Som Intalado !");
    }

    // Instalação do Sistema de Lanterna
    public void instalLanternas(){
        int totalProgress = 13;
        int currentProgress = 0;
        load = new Loading();
        while(currentProgress < totalProgress){
            System.out.print("Intalando Lanternas"+load.getLoadingDots(currentProgress)+"\r");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new ExceptionRevisao(e.getMessage());
            }
            currentProgress++;
        }
        System.out.println("Larternas Intaladas !");
    }


    // Método Calcula Carga da Bateria();
    public double calcularCargaBateria(double tensao, double resistencia){
        // Lógica para calcular a carga da bateria utilizando a Lei de Ohm (Carga = Tensão / Resistência)
        double carga = tensao / resistencia;
        return carga;
    }

    // Getters e Setters


    @Override
    public String toString() {
        return "\nELETRICISTA AUTOMOTIVO" +
                "\nOFICINA: " + officina.toString() +
                "\n" + super.toString();
    }
}

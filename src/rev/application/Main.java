package rev.application;

import rev.carregamento.Loading;
import rev.subclasses_e_associacoes.EletricistaAutomotivo;
import rev.subclasses_e_associacoes.Mecanico;
import rev.subclasses_e_associacoes.Oficina;

import java.util.Scanner;

/**
 * Instituição           Escola Técnica de Brasília - ETB
 * Nome do Curso         Curso Técnico de Informática
 * Disciplina            LTP1-Java
 * Date                  03/05/23 - 15:46
 * Autor                 GT3: Nayra,Samuel,Eduarda, Ereikson, Larissa.
 * Turma                 2°A
 * Objetivo              MAP06 Projeto Revisão
 */
public class Main {
    static boolean init = true; // Atributo 'init' = true
    public static void main(String[] args) {

        // Instãncias de Classes
        Mecanico mecan = new Mecanico();
        EletricistaAutomotivo eA = new EletricistaAutomotivo();
        Loading load = new Loading();
        Oficina oficina = new Oficina();
        Scanner sc = new Scanner(System.in); // Classe Scanner
        // Carregando ...
        load.Download();

        // Enquanto a variável 'init' for verdadeira de um loop
        while(init){
            int oper = 0; //
            System.out.print("\nCadastrar Revisão p/ Mecânico:        [1]"); // Daqui p/ Baixo - Métodos Mecânico
            System.out.print("\nAvaliação Mecânica:                   [2]");
            System.out.print("\nTeste de Mecânica:                    [3]");
            System.out.print("\nTrocar Óleo:                          [4]");
            System.out.print("\nTrocar Bateria:                       [5]");
            System.out.print("\nFluído do Freio:                      [6]");
            System.out.print("\nÁgua no Radiador:                     [7]");
            System.out.print("\nCalibragem do Pneu:                   [8]");
            System.out.print("\nCadastrar Revisão p/ Eletricista:     [9]"); // Daqui p/ Baixo - Métodos Eletricista
            System.out.print("\nAvaliação Elétrica:                   [10]");
            System.out.print("\nTestes Eletricos:                     [11]");
            System.out.print("\nTeste de Bateria:                     [12]");
            System.out.print("\nInstalação de Autofalantes:           [13]");
            System.out.print("\nInstalação de Lanternas:              [14]");
            System.out.print("\nListagem de Peças / Oficina:          [15]"); // Daqui p/ Baixo - Métodos Oficina
            System.out.print("\nSair do Sistema:                      [16]");
            System.out.print("\n------------------------------------------"+
             "\nEntre com uma valor: ");
             oper = sc.nextInt();
             switch (oper){
                 case 1:
                     // Métodos da Instância Mecanico
                     mecan.cadastrarRevisao();
                     break;
                 case 2:
                     mecan.avaliacaoInterna();
                     break;
                 case 3:
                     mecan.testesInternos();
                     break;
                 case 4:
                     mecan.trocarOleo();
                     break;
                 case 5:
                     mecan.trocaDeBateria();
                     break;
                 case 6:
                     mecan.fluidoDoFreio();
                     break;
                 case 7:
                     mecan.aguaNoRadiador();
                     break;
                 case 8:
                     mecan.calibragemPneu();
                     break;
                 case 9:
                     // Métodos da Instância EletricistaAutomotivo
                     eA.cadastrarRevisao();
                     break;
                 case 10:
                     eA.avaliacaoInterna();
                     break;
                 case 11:
                     eA.testesInternos();
                     break;
                 case 12:
                     eA.TesteBateria();
                     break;
                 case 13:
                     eA.instalAutoFalantes();
                     break;
                 case 14:
                     eA.instalLanternas();
                     break;
                 case 15:
                     // Métodos da Instância Oficina
                     oficina.listPecas();
                     break;
                 case 16:
                     quit();
                     break;
                 default:
                     System.out.println("Valor da Operação inválido !");
                     break;
             }
        }
    }

    // Sair do Sistema
    public static boolean quit(){
        System.out.println("Até mais !");
        return init = false;

    }

}
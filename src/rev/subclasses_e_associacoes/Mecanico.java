package rev.subclasses_e_associacoes;

import rev.carregamento.Loading;
import rev.excecao.ExceptionRevisao;
import rev.superclasse_revisao.Revisao;

import java.util.*;
/*
 * Mecânico:
 * cadastrarRevisao();
 * avaliacaoInterna();
 * testesInternos();
 * trocarOleo();
 * trocaDeBateria();
 * fluidoDoFreio();
 * aguaNoRadiador();
 * calibragemPneu();
 * */
public class Mecanico extends Revisao {

    // Atributos
    public static final int NIVEL_LIMITE = 10;
    private int nivel = 0;
    private static Loading load;
    private static Oficina offic = new Oficina();

    // Construtor do Mécanico com argumentos
    public Mecanico(String cliente, int codRev, String descRev) {
        super(cliente, codRev, descRev);
    }

    // Construtor sem argumentos
    public Mecanico(){
        super();
    }

    public Mecanico(String cliente, String descRev, int codRev) {
        super();
    }

    // Método Herdado da Revisao cadastrarRevisao();
    @Override
    public void cadastrarRevisao() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" --- MECÂNICO --- ");
        System.out.print("Cliente: ");
        setCliente(sc.nextLine());
        System.out.print("Descrição da Revisão: ");
        setDescRev(sc.nextLine());
        System.out.print("Código da Revisão: ");
        setCodRev(sc.nextInt());
        offic.listMecan.add(new Mecanico(getCliente(),getDescRev(), getCodRev()));
    }

    // Método Herdado da Revisao avaliacaoInterna();
    @Override
    public void avaliacaoInterna() {
        int totalProgress = 13;
        int currentProgress = 0;
        load = new Loading();
        while(currentProgress < totalProgress){
            System.out.print("Verificando Sistemas principais"+load.getLoadingDots(currentProgress)+"\r");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            currentProgress++;
        }
        System.out.println("Avaliação interna feita !");
    }

    // Método Herdado da Revisao testesInternos();
    @Override
    public void testesInternos() {
        int totalProgress = 13;
        int currentProgress = 0;
        Loading load = new Loading();
        while(currentProgress < totalProgress){
            System.out.print("Realizando Testes do Automóvel"+load.getLoadingDots(currentProgress)+"\r");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new ExceptionRevisao(e.getMessage());
            }
            currentProgress++;
        }
        System.out.println("Testes feitos !");
    }

    // Método de troca de Óleo
    public void trocarOleo() {
        /*Chama a função VerificarNivelDeOleo() e a variável nível recebe o valor !*/
        nivel = verificarNivelDeOleo();
        drenarOleoAntigo();
        adicionarOleoNovo();
    }


    // Verifica o Nível do Óleo para executar a troca
    private int verificarNivelDeOleo() {
        // Simulação do processo de verificação do nível de óleo
        Random aleatOil = new Random();
        int nivelDeOleo = aleatOil.nextInt(8);  // Nível de óleo fictício para demonstração
        return nivelDeOleo;
    }

    // Lógica para trocar o óleo do veículo
    private int drenarOleoAntigo() {
        // Simulação da drenagem do óleo antigo
        while(!(nivel <= 0)){
            try{
                nivel--;
                System.out.println(" - Drenando o Óleo antigo: "+nivel+"...");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new ExceptionRevisao(" !!! Erro na Drenagem do Óleo !!!");
            }
        }
        System.out.println(" +       ÓLEO DRENADO !      ");
        return nivel;
    }

    // Lógica para trocar o óleo do veículo
    private  int adicionarOleoNovo() {
        while (nivel < NIVEL_LIMITE){
            try{
                nivel++;
                System.out.println(" * Adicionando novo Óleo: "+nivel+"...");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new ExceptionRevisao(" !!! Erro na Adição do Óleo !!!");
            }
        }
        System.out.println("\n+ Óleo Adicionado Com Sucesso !");
        return nivel;
    }

    // Método para Troca de bateria
    public void trocaDeBateria() {
        try{
            Thread.sleep(700);
            System.out.println("Removendo Bateria descarregada !");
        } catch (InterruptedException e) {
            throw new ExceptionRevisao(e.getMessage());
        }
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new ExceptionRevisao(e.getMessage());
        }
        System.out.println("Bateria Nova Adicionada !");
    }

    // Método para troca de filtro de ar
    public void trocarFiltroDeAr() {
        load = new Loading();
        load.Loading();
        System.out.println("Filtro de Ar trocado !");
    }

    // Método para inserir fluído do freio
    public void fluidoDoFreio() {
        Random aleatOil = new Random();
        nivel = aleatOil.nextInt(7);  // Nível de óleo fictício para demonstração
        while(!(nivel <= 0)){
            try{
                System.out.println("Fazendo a sangria do Fluído do Freio: "+nivel+"...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new ExceptionRevisao(e.getMessage());
            }
            nivel--;
        }
        System.out.println(" --- FLUÍDO DRENADO ! --- ");

        //nivel = 0;
        while(nivel <= NIVEL_LIMITE){
            try {
                System.out.println("Abastecendo Fluído do Freio: "+nivel+"...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new ExceptionRevisao(e.getMessage());
            }
            nivel++;
        }
        System.out.println(" --- FLUÍDO ADICIONADO COM SUCESSO ! --- ");
    }

    // Método para abastecer água do radiador
    public void aguaNoRadiador() {
        nivel = 0;
        while(nivel <= NIVEL_LIMITE){
            try {
                System.out.println("Completando Água no Radiador: "+nivel+"...");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new ExceptionRevisao(e.getMessage());
            }
            nivel++;
        }
        System.out.println(" --- ADICIONADO A ÁGUA NO RADIADOR ! --- ");
    }

    // Método para calibragem de pneu
    public void calibragemPneu() {
        int psi = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com a quantidade de libras limite [33 PSI]: ");
        psi = sc.nextInt();
        if(psi > 33){
            System.out.println("Cuidado, libra pra calibragem de pneu alta." +
                    "\nRisco de estourar !");

        }
        while(nivel <= psi){
            try {
                System.out.println("Calibrando: "+nivel+"...");
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new ExceptionRevisao(e.getMessage());
            }
            nivel++;
        }
        System.out.println(" --- PNEUS CALIBRADOS ! --- ");
    }


    // Getters e Setters
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public static Loading getLoad() {
        return load;
    }

    public static void setLoad(Loading load) {
        Mecanico.load = load;
    }

    public static Oficina getOffic() {
        return offic;
    }

    public static void setOffic(Oficina offic) {
        Mecanico.offic = offic;
    }
// Método 'public void Mostrar();' tornou-se o Método 'public String toString();'


    @Override
    public String toString() {
        return "\nMecanico" +
                "\n"+ super.toString();
    }
}

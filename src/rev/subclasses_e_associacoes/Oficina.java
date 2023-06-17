package rev.subclasses_e_associacoes;

import rev.excecao.ExceptionRevisao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Oficina {

    protected final String N_OFICINA = "PIT-STOP Oficina";
    protected final String ENDER_OFICINA = "RUA 01 CASA 08";
    private Mecanico mecan = new Mecanico();
    private EletricistaAutomotivo eleter = new EletricistaAutomotivo();
    private Set<Pecas> set = new HashSet<>();
    protected ArrayList<Mecanico> listMecan = new ArrayList<>();
    private ArrayList<EletricistaAutomotivo> listEa = new ArrayList<>();

    /*
    *   Oficina:
    *   listPecas();
    *   historicoMecan();
    *   historicoEletri();
    *
    * */

    //  'String path'  é um caminho para o sistema acessar o arquivo do
    //  projeto contendo as 'Peças' e os 'Valores' de cada uma disponível
    //  Listar Peças disponíveis através de um arquivo Produtos.txt
    public void listPecas(){
        String path = "C:\\Users\\smk19\\IdeaProjects\\RevisaoMAP06\\Produtos.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String fields[] = line.split(" - ");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                set.add(new Pecas(name,price));
                System.out.println(line);
                line = br.readLine();
            }
            System.out.println("Peças disponíveis !");
        } catch (FileNotFoundException e) {
            throw new ExceptionRevisao(e.getMessage());
        } catch (IOException e) {
            throw new ExceptionRevisao(e.getMessage());
        }
    }

    // Getters Setters
    public Mecanico getMecan() {
        return mecan;
    }

    public EletricistaAutomotivo getEleter() {
        return eleter;
    }

    public void setMecan(Mecanico mecan) {
        this.mecan = mecan;
    }

    public Set<Pecas> getSet() {
        return set;
    }

    public void setSet(Set<Pecas> set) {
        this.set = set;
    }


    // Método 'public void Mostrar();' tornou-se o Método 'public String toString();'

    @Override
    public String toString() {
        return "\nOFICINA: " + N_OFICINA+
                "\nENDEREÇO: " + ENDER_OFICINA+
                "\nMECÂNICO: " + mecan.toString() +
                "\nELETRICISTA AUTO" + eleter.toString() +
                "\nLISTAR MECÂNICO: " + listMecan +
                "\nLISTAR ELETRICISTA AUTO: " + listEa;
    }
}

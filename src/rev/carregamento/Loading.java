package rev.carregamento;

public class Loading {

    /*
    *   Explicação breve da classe Loading:
    * - Essa classe usei para simular um processo do carregamento
    *   de alguns serviços executados pelo Mecânico
    *   e Eletricista Automotivo como:
    *   --------------------------------------------
    *   Classe Mecânico -
    *   Método > avaliacaoInterna();
    *   Método > testeInterno();
    *   --------------------------------------------
    *   Classe EletricistaAutomotivo -
    *   Método > avaliacaoInterna();
    *   Método > testeInterno();
    *   Método > instalacaoSom();
    *   Método > instalacaoLanternas();
    * */

    // Método que expressa o carregamento com a quantidade de pontos desejado getLoadingDots(int progress)
    public String getLoadingDots(int progress) {
        int dotsCount = progress % 4 + 0; // Altere o número aqui para ajustar a quantidade de pontos
        StringBuilder dots = new StringBuilder();

        for (int i = 0; i < dotsCount; i++) {
            dots.append(".");
        }
        return dots.toString();
    }

    // Método de exibição do carregamento  Loading();
    public void Loading(){
        int totalProgress = 15;
        int currentProgress = 0;

        while (currentProgress < totalProgress) {
            System.out.print("Carregando" + getLoadingDots(currentProgress) + "\r");
            try{
                Thread.sleep(500); // Aguarda meio segundo
            }catch (InterruptedException e){
                System.out.println("Erouuuu !");
            }
            currentProgress++;
        }
        System.out.println("Troca concluída!");
    }

    // Método de exibição do carregamento  Loading();
    public void Download(){
        int totalProgress = 15;
        int currentProgress = 0;

        while (currentProgress < totalProgress) {
            System.out.print("Downloading" + getLoadingDots(currentProgress) + "\r");
            try{
                Thread.sleep(500); // Aguarda meio segundo
            }catch (InterruptedException e){
                System.out.println("Erouuuu !");
            }
            currentProgress++;
        }
        System.out.println("Download Finished !");
    }
}

import java.util.Scanner;
public class usuarioTelevisao {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        SmartTv smartTv = new SmartTv();
        //STATUS INICIAIS DA TELEVISÃO:
        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: "+ smartTv.canal);
        System.out.println("Volume atual: "+ smartTv.volume);
        
        //RECEBENDO O CANAL DESEJADO PELO USUÁRIO:
        System.out.println("Qual o canal desejado: ");
        int canalDesejado = sc.nextInt();

        smartTv.ligar();
        System.out.println("Novo status => Tv ligada: " + smartTv.ligada);
        smartTv.mudarCanal(canalDesejado);
        System.out.println("Novo status => Canal atual: "+ smartTv.canal);
        smartTv.aumentarVolume();
        System.out.println("Novo status => Volume atual: "+ smartTv.volume);

        sc.close();
    }
}

package bytebank;


public class TestaMetodo { 
  public static void main(String[] args) {
    Conta contaDaLouise = new Conta();
    contaDaLouise.saldo = 100;
    contaDaLouise.deposita(50);
    System.out.println(contaDaLouise.saldo);

    boolean conseguiuRetirar = contaDaLouise.saca(20);
    System.out.println(contaDaLouise.saldo);
    System.out.println(conseguiuRetirar);
    
    Conta contaDaMarcela = new Conta();
    contaDaMarcela.deposita(1000);

    boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDaLouise);
    if(sucessoTransferencia) {
        System.out.println("transferencia com sucesso");
    } else {
        System.out.println("faltou dinheiro");

    }
    System.out.println(contaDaMarcela.saldo);
    System.out.println(contaDaLouise.saldo); 
  }
}
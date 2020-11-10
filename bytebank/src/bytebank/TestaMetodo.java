package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDaLouise = new Conta(6646,969060);
		contaDaLouise.deposita(100);
		contaDaLouise.deposita(50);
		System.out.println(contaDaLouise.getSaldo());

		boolean conseguiuRetirar = contaDaLouise.saca(20);
		System.out.println(contaDaLouise.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta(6644,969063);
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDaLouise);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDaLouise.getSaldo());
	}

}
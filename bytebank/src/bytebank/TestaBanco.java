package bytebank;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente louise = new Cliente();
		louise.setNome("Louise Andrade");
		louise.setCpf("222.222.222.-22");
		louise.setProfissao("coordenadora do Dermatoarte e estudante de programação");

		Conta contaDaLouise = new Conta(6646,969060);
		contaDaLouise.deposita(100);

		contaDaLouise.setTitular(louise);
		System.out.println(contaDaLouise.getTitular().getNome());
		System.out.println(contaDaLouise.getTitular());

	}
}
package bytebank;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario louise = new Funcionario();
		louise.setNome("Louise Andrade");
		louise.setCpf("11111111111");
		louise.setSalario(2600.00);
		
		System.out.println(louise.getNome());
		System.out.println(louise.getBonificacao());
	}

}

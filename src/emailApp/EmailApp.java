package emailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		String nome, sobrenome; 
		int numDepartamento;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Criando um email\n");
		
		System.out.println("Digite o primeiro nome da pessoa: \n");
		nome = sc.nextLine();
		System.out.println("Digite o sobrenome da pessoa: \n");
		sobrenome = sc.nextLine();
		
		System.out.println("Selecione o codigo do departamento:\n"
				+ "RH :1\n"
				+ "Contas: 2\n" 
				+ "Desenvolvimento: 3\n"
				+ "Producao: 4\n"
				+ "Sem departamento: qualquer outro número\n");
		numDepartamento = sc.nextInt();
		Email em1 = new Email(nome, sobrenome, numDepartamento);
		em1.set_senha("ancathur");
		sc.close();
	}

}

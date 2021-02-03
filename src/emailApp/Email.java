package emailApp;

import java.util.Random;

//Your application should do the following:
// Generate an email with the following syntax: firstname.lastname@department.company.com
// Determine the department (sales, development, accounting), if none leave blank
// Generate a random String for a password
// Have set methods to change the password, set the mailbox capacity, and define an alternate
//email address
// Have get methods to display the name, email, and mailbox capacity
public class Email {

	private String _primeiroNome;
	private String _ultimoNome;
	private final String _email;
	private final String _departamento;
	private String _senha;
	private int _capacidadeCaixaEmail = 500;
	private String _emailAlternativo;
	private static final String DOMINIO_DA_CIA = "company.com";
	private static final int numCaracteresSenha = 8;
	private static final int TAMANHO_CAIXA_EMAIL_PADRAO = 500;

	public Email(String primeiroNome, String ultimoNome, int numDepartamento) {
		this._primeiroNome = primeiroNome;
		this._ultimoNome = ultimoNome;
		this._departamento = setDepartamento(numDepartamento);
		if (numDepartamento <= 4)
			this._email = primeiroNome.toLowerCase() + ultimoNome.toLowerCase() + "@" + _departamento.toLowerCase()
				+ "." + DOMINIO_DA_CIA;
		else
			this._email = primeiroNome.toLowerCase() + ultimoNome.toLowerCase() + "@" 
			+ DOMINIO_DA_CIA;
		this._senha = geraSenhaAleatoria();
		this._capacidadeCaixaEmail = TAMANHO_CAIXA_EMAIL_PADRAO;
		System.out.println("Email criado: " + _email + "\n" 
		+ "Senha: " + _senha +"\n");
	}

	private String setDepartamento(int numDepartamento) {
		String departamento;
		switch (numDepartamento) {
		case 1:
			departamento = "RH";
			break;
		case 2:
			departamento = "Contas";
			break;
		case 3:
			departamento = "Desenvolvimento";
			break;
		case 4:
			departamento = "Producao";
			break;

		default:
			departamento = "";
		}
		//sc.close();
		return departamento;
	}

	private String geraSenhaAleatoria() {
		String passwordSimbolos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String newPassword = "";
		Random rn = new Random();

		for (int i = 0; i < numCaracteresSenha; i++) {
			newPassword += passwordSimbolos.charAt(rn.nextInt(26));
		}

		return newPassword;
	}

	public String getName() {
		return _primeiroNome + " " + _ultimoNome;
	}

	public String get_senha() {
		return _senha;
	}

	public void set_senha(String _senha) {
		this._senha = _senha;
	}

	public int get_capacidadeCaixaEmail() {
		return _capacidadeCaixaEmail;
	}

	public void set_capacidadeCaixaEmail(int _capacidadeCaixaEmail) {
		this._capacidadeCaixaEmail = _capacidadeCaixaEmail;
	}

	public String get_emailAlternativo() {
		return _emailAlternativo;
	}

	public void set_emailAlternativo(String _emailAlternativo) {
		this._emailAlternativo = _emailAlternativo;
	}

	public String get_email() {
		return _email;
	}
	
}

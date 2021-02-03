package test;


import org.junit.Test;
import static org.junit.Assert.*;


import emailApp.Email;

public class EmailTest {
	


	@Test
	public void getName() {
		Email e1 = new Email("Robert", "Jonh", 2);
		
		assertEquals(e1.getName(), "Robert Jonh");
	}
	@Test
	public void whengetEmailThenRetornaEmail() {
		Email e3 = new Email("Roberto", "Jonhs", 7);
		assertEquals (e3.get_email(), "robertojonhs@company.com");
	}
	
	@Test
	public void getEmailparaRH() {
		Email e2 = new Email("Cid", "Ramos", 1);

		assertEquals (e2.get_email(), "cidramos@rh.company.com");
	}
		
	@Test 
	public void getEmailCapacidade1500() {
		Email e4 = new Email("teo", "Ramos", 4);
		e4.set_capacidadeCaixaEmail(1500);
		assertEquals(e4.get_capacidadeCaixaEmail(), 1500);
	}

}

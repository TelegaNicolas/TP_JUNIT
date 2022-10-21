import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonneTest {

	private Personne p;
	private Personne p2;
	private Personne p3;
	private Personne p4;
	private Personne p5;
	private Personne p6;
	private Personne p7;
	private Personne p8;
	private Personne p9;
	private Personne p10;
	private Personne p11;
	
	@BeforeEach
	void setUp() throws Exception {
		p = new Personne("Martin" , "Laurant");
		p2 = new Personne("martin" , "laurant");
		p3 = new Personne("m artin" , "laurant");
		p4 = new Personne("martin" , " l aurant");
		p5 = new Personne("m artin" , "l aurant");
		p6 = new Personne(" martin" , " laurant");
		p7 = new Personne("martin " , "laurant ");
		p8 = new Personne("ma^^r.tin " , "la^^..?urant ");
		p9 = new Personne("^^martin" , "^^la^^urant ");
		p10 = new Personne("martin" , "laaaaaaaaaaaaaaaaaaaaaaaaurant ");
		p11 = new Personne("m-_ârtïn","la-u_rant");
		System.out.println(p.toString());
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testLogin() {

		
		
		Assert.assertEquals("Pas de majuscules !", "lmartin" , p.getLogin());
		Assert.assertEquals("Probleme : de base", "lmartin" , p2.getLogin());
		Assert.assertEquals("Probleme : Espace dans le prenom", "lmartin" , p3.getLogin());
		Assert.assertEquals("Probleme : Espace dans le nom", "lmartin" , p4.getLogin());
		Assert.assertEquals("Probleme : Espace dans le nom et prenom", "lmartin" , p5.getLogin());
		Assert.assertEquals("Probleme : Espace avant le nom et prenom", "lmartin" , p6.getLogin());
		Assert.assertEquals("Probleme : Espace après le bom et prenom", "lmartin" , p7.getLogin());
		Assert.assertEquals("Probleme : nom bizarre ", "lmartin" , p8.getLogin());
		Assert.assertEquals("Probleme : caractères spéciaux ", "lmartin" , p9.getLogin());
		Assert.assertEquals("Probleme : Nom trop long", "lmartin", p10.getLogin());
		Assert.assertEquals("Probleme : A des tirets dans le nom", "lmartin", p11.getLogin());
		

			
	}
	
	@Test
	public void testToString()
	{
		Assert.assertNotNull(p.toString());
		Assert.assertEquals("Probleme : de base", "Nom : Martin Prenom : Laurant Login : lmartin",p.toString());
		
		
	}
}


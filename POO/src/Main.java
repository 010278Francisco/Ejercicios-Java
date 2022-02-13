
public class Main {

	public static void main(String[] args) {
		
		//Scanner  scaner = new Scanner();
		Tacos taco1 = new Tacos("Maza Azul", "Suaddero", 2, "Mediana", 30);
		
		/*	
		taco1.tipoDeTortilla = "Maza Azul";
		taco1.tipoDeTortilla = "Suaddero";
		taco1.numeroDeTortilla = 2;
		taco1.tamañoDeTortilla = "Mediana";
		*/
		//taco1.precio = 30;
		
		taco1.subirPrecio(5.5f);
		
		Tacos taco2 = new Tacos();
		
		taco2.tipoDeTortilla = "Harina";
		taco2.tipoDeGuisado = "Bisteck";
		//taco2.getNumeroDeTortilla(1);
		taco2.tamanioDeTortilla = "Grande";
		taco2.precio = 42.6f;
		
		
		
		Tacos taco3 = new Tacos("Maiz");
		System.out.println(taco1);
		System.out.println(taco2);
		System.out.println(taco3);
		
		Tacos tacos4 = new Tacos();
		tacos4.setNumeroDeTortilla(2);
		System.out.println("Si tengo 2 tortillas"+tacos4.getNumeroDeTortilla());

	}
	

}

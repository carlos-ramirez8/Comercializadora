public class Main {

	public static void main(String[] args) {

		Libros lbr1 = new Libros("El Señor de los Anillos", 30);
		Libros lbr2 = new Libros("El principito (Le Petit Prince)", 43);
		
		Cd Cd1 = new Cd("OPTIMUS ARCA", 60);
		Cd Cd2 = new Cd("ARES", 22);

       
		System.out.println("USTED TIENE QUE CANCELAR POR EL LIBRO DE EL SEÑOR DE LOS ANILLOS :" + lbr1.getValor1() +  "$");
		System.out.println("EL LIBRO EL PRINCIPITO CUESTA : " + lbr2.getValor1() +  "$"); 
		
		System.out.println("                                                 ");
		
		System.out.println("EL VALOR DEL CD DE OPTIMUS ARCA ES :" +  Cd1.getValorcd1() +  "$");
		System.out.println("EL VALOR DEL CD DE ARES ES : "  + Cd2.getValorcd1() +  "$");
	}

}
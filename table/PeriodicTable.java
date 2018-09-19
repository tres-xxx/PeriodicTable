package table;
import element.Atom;

public class PeriodicTable {
	
	private static int numberEnG = 6;
	
	private static Atom [] nobleGases() {
		Atom ng [] = new Atom [numberEnG];
		String type = "Noble gas";
		ng[0] = new Atom(2,"H","Helium", type, 4.0026);
		ng[1] = new Atom(10,"Ne","Neon", type, 20.18);
		ng[2] = new Atom(18,"Ar","Argon", type, 39.948);
		ng[3] = new Atom(36,"Kr","Krypton", type, 83.798);
		ng[4] = new Atom(54,"Xe","Xenon", type, 131.293);
		ng[5] = new Atom(86,"Rn","Radon", type, 222.0);
		return ng;
	}
	
	private static void printnG(Atom [] element, int n) {
		System.out.println("-----");
		for(int i = 0; i < n; i++) {
			System.out.println(i+1 + ".");
			System.out.println("Atomic number: " + element[i].getaN());
			System.out.println("Name: " + element[i].getn());
			System.out.println("Symbol: " + element[i].gets());
			System.out.println("Type: " + element[i].gett());
			System.out.println("Weight: " + element[i].getw());
			System.out.println("-----");
		}
	}
	
	public static void main (String args []) {
		printnG(nobleGases(),numberEnG);
	}
	
}

package element;

public class Atom {
	
	private int atomicNumber;
	private String symbol,name,type;
	private double weight;
	
	public Atom(){
		atomicNumber = 0;
		type = name = symbol = "n";
		weight = 0.0;
	}
	
	public Atom(int aN, String s, String n, String ty, double w){
		this.atomicNumber = aN;
		this.symbol = s;
		this.name = n;
		this.weight = w;
		this.type = ty;	
	}
	
	public void setaN(int aN) {
		this.atomicNumber = aN;
	}
	
	public void sets(String s) {
		this.symbol = s;
	}
	
	public void setn(String n) {
		this.name = n;
	}
	
	public void setw(double w) {
		this.weight = w;
	}
	
	public void sett(String ty) {
		this.type = ty;
	}
	
	public int getaN() {
		return this.atomicNumber;
	}
	
	public String gets() {
		return this.symbol;
	}
	
	public String getn() {
		return this.name;
	}
	
	public String gett() {
		return this.type;
	}
	
	public double getw() {
		return this.weight;
	}
}

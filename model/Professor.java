package model;

public class Professor extends Funcionario{
	private int id;
	private String classe;

	public Professor(String nome, String classe){
		super(nome, 2);
		this.classe = classe;
	}
	public String getClasse(){
		return this.classe;
	}
	public void setClasse(String classe){
		this.classe = classe;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double calcularSalario(){
		switch(getClasse().toUpperCase()){
			case "A":
				return 3000+(100*this.getDiarias());
			case "B":
				return 5000+(100*this.getDiarias());
			case "C":
				return 7000+(100*this.getDiarias());
			case "D":
				return 9000+(100*this.getDiarias());
			default:
				return 11000+(100*this.getDiarias());
		}
	}
	
	public String toString(){
		String res ="";
		res += super.toString();
		res += "Classe: " + this.classe + "\n";
		res += "Salario: " + calcularSalario();
		return res;
	}

	
}
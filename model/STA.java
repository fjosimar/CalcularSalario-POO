package model;


public class STA extends Funcionario{

	private int nivel;
    

    public STA(String nome, int nivel){
        super(nome, 1);
        this.nivel = nivel;

    }
    
    public int getNivel(){
    	return this.nivel;

    }

    public void setNivel(int nivel){
    	this.nivel =  nivel; 

    }

    public String toString(){
    	String res = "";
    	res += super.toString();
    	res += "Nivel: " + this.nivel + "\n";
    	res += "Salario: " + calcularSalario();
    	return res;
    }

    public double calcularSalario(){
    	return 3000 + 300 * this.nivel + 100 * this.getDiarias();
    }

}
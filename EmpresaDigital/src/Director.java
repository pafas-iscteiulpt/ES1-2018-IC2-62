
public class Director extends Empregado{
	
	private String Departamento;
	
	public Director(String nome, int id , String departamento){
		super(nome,id);
		this.Departamento= departamento;
	}
	
	@Override 
	public double salario(){
		return super.salario() * 1.75;
	}

	public String getDepartamento() {
		return Departamento;
	}
	
	@Override
	public String toString(){
		return "Director : " + super.getNome()+ "- " + salario() + "- " + Departamento;
	}
}

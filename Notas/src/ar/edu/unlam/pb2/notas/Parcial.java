package ar.edu.unlam.pb2.notas;

public class Parcial {
private Integer nota;
	
	public Parcial(){
		
	}
	
	public void agregarNota(Integer nota){
		this.nota=nota;
	}
	
	public Boolean fueEvaluado(){
		if(nota!=null){
			return true;
		}
		return false;
	}
	
	public Integer getNota(){
		return this.nota;
	}
	
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	
	
}
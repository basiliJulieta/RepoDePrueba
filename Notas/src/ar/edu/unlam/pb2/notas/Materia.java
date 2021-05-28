package ar.edu.unlam.pb2.notas;

public class Materia {
	private Parcial parcial1 = new Parcial(); 
	private Parcial parcial2 = new Parcial(); 
	
	public Materia() {
		
	}
	
	public void evaluar(Integer numeroDeParcial, Integer nota) {
		if(numeroDeParcial==1) {
			parcial1.agregarNota(nota);
		}else if(numeroDeParcial==2) {
			parcial2.agregarNota(nota);
		}
	}
	
	public void recuperar(Integer numeroParcial, Integer notaParcial) {
		if(numeroParcial==1&&parcial1.fueEvaluado()==true) {
			parcial1.agregarNota(notaParcial);
		}else if(numeroParcial==2&&parcial2.fueEvaluado()==true) {
			parcial2.agregarNota(notaParcial);
		}
	}
		
	public Integer getNotaP1() {
		return parcial1.getNota();
	}
	
	public Integer getNotaP2() {
		return parcial2.getNota();
	}
	
	
	
}

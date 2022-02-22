package desafio;

public class Brinde {
	
	private String nome;
	private int distancia;
	private int peso;
	
	public Brinde(String nome, int distancia, int peso) {
		this.nome = nome;
		this.distancia = distancia;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
		
	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	

}

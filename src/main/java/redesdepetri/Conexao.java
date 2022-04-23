package redesdepetri;

public class Conexao {
	private Integer id;
	private Lugar lugar;
	private Transicao transicao;
	private Integer peso;
	private Boolean ehEntrada;
	private Boolean arcoInibidor;
	private Boolean ehArcoReset;

	public Conexao(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public Transicao getTransicao() {
		return transicao;
	}

	public void setTransicao(Transicao transicao) {
		this.transicao = transicao;
		transicao.addConexao(this);
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Boolean getEhEntrada() {
		return ehEntrada;
	}

	public void setEhEntrada(Boolean ehEntrada) {
		this.ehEntrada = ehEntrada;
	}

	public Boolean getArcoInibidor() {
		return arcoInibidor;
	}

	public Conexao(Integer id, Lugar lugar, Transicao transicao, Integer peso, Boolean ehEntrada, Boolean arcoInibidor,
			Boolean ehArcoReset) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.transicao = transicao;
		this.peso = peso;
		this.ehEntrada = ehEntrada;
		this.arcoInibidor = arcoInibidor;
		this.ehArcoReset = ehArcoReset;
	}

	public void setArcoInibidor(Boolean arcoInibidor) {
		this.arcoInibidor = arcoInibidor;
	}

	public Boolean getEhArcoReset() {
		return ehArcoReset;
	}

	public void setEhArcoReset(Boolean ehArcoReset) {
		this.ehArcoReset = ehArcoReset;
	}
	
}

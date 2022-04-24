package redesdepetri;

import java.util.ArrayList;

public class Transicao {
	private Integer id;
	private Boolean ativa;
	private ArrayList<Conexao> conexoesEntrada = new ArrayList<Conexao>();
	private ArrayList<Conexao> conexoesSaida = new ArrayList<Conexao>();

	public Transicao(Integer id) {
		super();
		this.id = id;
		this.ativa = false;
	}

	public Transicao() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void addConexao(Conexao conexao) {
		if (conexao.getEhEntrada() == true) {
			conexoesEntrada.add(conexao);
		} else {
			conexoesSaida.add(conexao);
		}
	}

	public ArrayList<Conexao> getConexoesEntrada() {
		return conexoesEntrada;
	}

	public void setConexoesEntrada(ArrayList<Conexao> conexoesEntrada) {
		this.conexoesEntrada = conexoesEntrada;
	}

	public ArrayList<Conexao> getConexoesSaida() {
		return conexoesSaida;
	}

	public void setConexoesSaida(ArrayList<Conexao> conexoesSaida) {
		this.conexoesSaida = conexoesSaida;
	}

	public Boolean getAtiva() {
		return ativa;
	}

	public String getAtivaFormatada() {
		if (ativa) {
			return "T";
		}
		return "F";
	}

	public void setAtiva(Boolean ativa) {
		this.ativa = ativa;
	}

	public Transicao clone() {
		Transicao t = new Transicao();
		t.id = this.id;;
		t.ativa = this.ativa;
		t.conexoesEntrada = (ArrayList<Conexao>) this.conexoesEntrada.clone();
		t.conexoesSaida = (ArrayList<Conexao>) this.conexoesSaida.clone();
		return t;
	}

	

}

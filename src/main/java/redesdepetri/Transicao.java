package redesdepetri;

import java.util.ArrayList;

public class Transicao {
	private Integer id;
	private ArrayList<Conexao> conexoesEntrada = new ArrayList<Conexao>();
	private ArrayList<Conexao> conexoesSaida = new ArrayList<Conexao>();

	public Transicao(Integer id) {
		super();
		this.id = id;
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

	

}

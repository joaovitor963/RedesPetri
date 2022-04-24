package redesdepetri;

import java.util.ArrayList;

public class RedePetri {
	private ArrayList<Lugar> lugares = new ArrayList<Lugar>();
	private ArrayList<Transicao> transicoes = new ArrayList<Transicao>();
	private ArrayList<Conexao> conexoes = new ArrayList<Conexao>();
	
	public ArrayList<Lugar> getLugares() {
		return lugares;
	}
	
	public void setLugares(ArrayList<Lugar> lugares) {
		this.lugares = lugares;
	}

	public boolean criarLugar(Integer id, Integer tokens) {
		// verifica se id já existe na lista
	    if (lugares.stream().filter(lugar -> lugar.getId().equals(id)).findFirst().isPresent()) {
	    	return false;
	    }

		Lugar lugar = new Lugar(id, tokens);
		lugares.add(lugar);
		return true;
	}
	
	public Lugar getLugar(Integer id) {
	    return lugares.stream().filter(lugar -> id.equals(lugar.getId())).findFirst().orElse(null);
	}
	
	public boolean removeLugar(Integer id) {
		return lugares.removeIf(lugar -> lugar.getId().equals(id));
	}

	public ArrayList<Transicao> getTransicoes() {
		return transicoes;
	}

	public void setTransicoes(ArrayList<Transicao> transicoes) {
		this.transicoes = transicoes;
	}
	
	public boolean criarTransicao(Integer id) {
		// verifica se id já existe na lista
	    if (transicoes.stream().filter(lugar -> lugar.getId().equals(id)).findFirst().isPresent()) {
	    	return false;
	    }

		Transicao transicao = new Transicao(id);
		transicoes.add(transicao);
		return true;
	}
	
	public Transicao getTransicao(Integer id) {
	    return transicoes.stream().filter(transicao -> id.equals(transicao.getId())).findFirst().orElse(null);
	}
	
	public boolean removeTransicao(Integer id) {
		return transicoes.removeIf(transicao -> transicao.getId().equals(id));
	}
	
	public ArrayList<Conexao> getConexoes() {
		return conexoes;
	}
	
	public void setConexoes(ArrayList<Conexao> conexoes) {
		this.conexoes = conexoes;
	}
	
	public Boolean criarConexao(Integer id, Lugar lugar, Transicao transicao, int peso, boolean ehEntrada, boolean ehArcoInibidor, boolean ehArcoReset) {
		// verifica se id já existe na lista
	    if (conexoes.stream().filter(conexao -> conexao.getId().equals(id)).findFirst().isPresent()) {
	    	return false;
	    }
	    
	    Conexao conexao = new Conexao(id, lugar, transicao, peso, ehEntrada, ehArcoInibidor, ehArcoReset);
		conexoes.add(conexao);
	    return true;
	}
	
	public boolean removeConexao(Integer id) {
		return conexoes.removeIf(conexao -> conexao.getId().equals(id));
	}
	
	public Lugar getLugarDeConexao(Conexao conexao) {
		return conexao.getLugar();
	}
	
	public Transicao getTransicaoDeConexao(Conexao conexao) {
		return conexao.getTransicao();
	}
	
	public ArrayList<Conexao> getConexoesEntrada(Integer id) { // retorna array de conexões de entrada de uma transição
	    return transicoes.stream().filter(transicao -> id.equals(transicao.getId())).findFirst().orElse(null).getConexoesEntrada();
	}
	
	public ArrayList<Conexao> getConexoesSaida(Integer id) { // retorna array de conexões de entrada de uma transição
		return transicoes.stream().filter(transicao -> id.equals(transicao.getId())).findFirst().orElse(null).getConexoesSaida();
	}
	
	public void insereTokenEmLugar(Token token, Lugar lugar) {
		lugar.adicionaToken(token);
	}
	
	public void removeTokenDeLugar(Token token, Lugar lugar) {
		lugar.removeToken(token);
	}
	
	public ArrayList<Token> getToken(Lugar lugar) {
		return lugar.getTokens();
	}
	
	public int quantosTokens(int id) {
		return getLugar(id).getTokens().size();
	}
	
}

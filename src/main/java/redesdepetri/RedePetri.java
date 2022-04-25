package redesdepetri;

import java.util.ArrayList;

public class RedePetri {
	private ArrayList<Lugar> lugares = new ArrayList<Lugar>();
	private ArrayList<Transicao> transicoes = new ArrayList<Transicao>();
	private ArrayList<Conexao> conexoes = new ArrayList<Conexao>();
	private Integer ciclo = 0;

	public void executaCiclo() {
		ciclo++;
		
		// cria uma c�pia do array de transicoes
		ArrayList<Transicao> transicoesCopia  = new ArrayList<Transicao>();
		for(Transicao t : transicoes)
			transicoesCopia.add(t.clone());
		
		// percorre transicoes que est�o ativas
		for (Transicao transicao : transicoesCopia) {
			if (transicao.getAtiva()) {
				ArrayList<Token> tokens = null;
				
				boolean podeRemover = true;
				int indexToken = 0;
				// percorre as conexoes de entrada das transicoes ativas
				while (podeRemover) {
					for (Conexao conexao : getTransicao(transicao.getId()).getConexoesEntrada()) {
						
						// cria c�pia do array de tokens para evitar problemas de concorrencia
						tokens = (ArrayList<Token>) conexao.getLugar().getTokens().clone();
						
						if (conexao.getEhArcoReset()) {
							conexao.getLugar().clearLugar();
						} else {
							// percorre a lista de tokens e os remove do lugar
							if (conexao.getPeso() > 1) {
								for (int i = 0; i < conexao.getPeso(); i++) {
									removeTokenDeLugar(tokens.get(i), conexao.getLugar());
								}
							} else {
								removeTokenDeLugar(tokens.get(indexToken), conexao.getLugar());
							}
							if(conexao.getLugar().getTokens().size() == 0) {
								podeRemover = false;
							}
							
						}
						int qtdTokens = conexao.getLugar().getTokens().size();
						if (conexao.getLugar().getId() == conexao.getLugar().getId() && (qtdTokens == 0 || conexao.getPeso() > qtdTokens)) {
							getTransicao(transicao.getId()).setAtiva(false);
						}
					}
					indexToken++;
				}
				
				// percorre as conexoes de saida das transicoes ativas
				for (Conexao conexao  : getTransicao(transicao.getId()).getConexoesSaida()) {
					for (Token token : tokens) {
						insereTokenEmLugar(token, conexao.getLugar());
					}
				}
			}
		}
		
		for (Transicao transicao : transicoes) {
			int qtdConexoesOk = 0;
			for (Conexao conexao : transicao.getConexoesEntrada()) {
				if (transicao.getConexoesSaida().size() > 0 && 
						conexao.getLugar().getTokens().size() >= conexao.getPeso() ) {
					qtdConexoesOk++;
				}
			}
			if(qtdConexoesOk == transicao.getConexoesEntrada().size()) {
				transicao.setAtiva(true);
			}
		}
	}
	
	public ArrayList<Lugar> getLugares() {
		return lugares;
	}
	
	public void setLugares(ArrayList<Lugar> lugares) {
		this.lugares = lugares;
	}

	public boolean criarLugar(Integer id) {
		// verifica se id j� existe na lista
		if (lugares.stream().filter(lugar -> lugar.getId().equals(id)).findFirst().isPresent()) {
			return false;
		}
		
		Lugar lugar = new Lugar(id, 0);
		lugares.add(lugar);
		return true;
	}

	public boolean criarLugar(Integer id, Integer tokens) {
		// verifica se id j� existe na lista
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
		// verifica se id j� existe na lista
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
		// verifica se id j� existe na lista
	    if (conexoes.stream().filter(conexao -> conexao.getId().equals(id)).findFirst().isPresent()) {
	    	return false;
	    }
	    
	    
	    Conexao conexao = new Conexao(id, lugar, transicao, peso, ehEntrada, ehArcoInibidor, ehArcoReset);
		conexoes.add(conexao);
		
		transicao.addConexao(conexao);
		
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
	
	public ArrayList<Conexao> getConexoesEntrada(Integer id) { // retorna array de conex�es de entrada de uma transi��o
	    return transicoes.stream().filter(transicao -> id.equals(transicao.getId())).findFirst().orElse(null).getConexoesEntrada();
	}
	
	public ArrayList<Conexao> getConexoesSaida(Integer id) { // retorna array de conex�es de entrada de uma transi��o
		return transicoes.stream().filter(transicao -> id.equals(transicao.getId())).findFirst().orElse(null).getConexoesSaida();
	}
	
	public void insereTokenEmLugar(Token token, Lugar lugar) {
		lugar.adicionaToken(token);
		for (Transicao transicao : transicoes) {
			int qtdConexoesOk = 0;
			for (Conexao conexao : transicao.getConexoesEntrada()) {
				if (transicao.getConexoesSaida().size() > 0 && 
						conexao.getLugar().getTokens().size() >= conexao.getPeso() ) {
					qtdConexoesOk++;
				}
			}
			if(qtdConexoesOk == transicao.getConexoesEntrada().size()) {
				transicao.setAtiva(true);
			}
		}
	}
	
	public void removeTokenDeLugar(Token token, Lugar lugar) {
		lugar.removeToken(token);
//		for (Transicao transicao : transicoes) {
//			for (Conexao conexao : transicao.getConexoesEntrada()) {
//				int qtdTokens = lugar.getTokens().size();
//				if (conexao.getLugar().getId() == lugar.getId() && (qtdTokens == 0 || conexao.getPeso() > qtdTokens)) {
//					transicao.setAtiva(false);
//				}
//			}
//		}
	}
	
	public ArrayList<Token> getToken(Lugar lugar) {
		return lugar.getTokens();
	}
	
	public int quantosTokens(int id) {
		return getLugar(id).getTokens().size();
	}
	
	public boolean getStatusTransicao (int id) {
		return getTransicao(id).getAtiva();
	}
	
	public void setTransicaoAtiva(int id) {
		getTransicao(id).setAtiva(true);
	}

	public void setTransicaoInativa(int id) {
		getTransicao(id).setAtiva(false);
	}
	
	public boolean isTransicaoAtiva (int id) {
		return (getStatusTransicao(id) == true);
	}
	
	public void mostraRede() {
		mostraCabecalho();
		mostraCiclo();
	}
	
	public void mostraCabecalho() {
		System.out.print("Ciclo   ");
		for (int i = 0; i < lugares.size(); i++) {
			System.out.print(padRight(String.valueOf("L" + lugares.get(i).getId()), 4));
			
		}
		for (int i = 0; i < transicoes.size(); i++) {
			System.out.print(padRight(String.valueOf("T" + transicoes.get(i).getId()), 4));
			
		}
	}
	public void mostraCiclo() {
		System.out.println("");
		System.out.print(padRight(ciclo.toString(), 8));
		for (Lugar lugar : lugares) {
			System.out.print(padRight(String.valueOf(lugar.getTokens().size()), 4));
		}
		for (Transicao transicao : transicoes) {
			System.out.print(padRight(String.valueOf(transicao.getAtivaFormatada()), 4));
		}
		System.out.println("");
	}
	
	boolean insereCallbackTokenEntrandoLugar(Lugar lugar, /*ponteiroPara M�todo/Fun��o, */ Token token) {
		return false;
	}
	
	public static String padRight(String s, int n) {
	     return String.format("%-" + n + "s", s);  
	}
}

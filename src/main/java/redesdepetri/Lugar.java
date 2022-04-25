package redesdepetri;

import java.util.ArrayList;

public class Lugar {
	private Integer id;
	private ArrayList<Token> tokens = new ArrayList<Token>();

	public Lugar(Integer id, Integer qtdTokens) {
		super();
		this.id = id;

		for (int i = 0; i < qtdTokens; i++) {
			tokens.add(new Token());
		}
	}

	public void adicionaToken(Token token) {
		tokens.add(token);
	}

	public ArrayList<Token> getTokens() {
		return tokens;
	}

	public void setTokens(ArrayList<Token> tokens) {
		this.tokens = tokens;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean removeToken(Token token) {
		return tokens.removeIf(t -> t.getId().equals(token.getId()));

	}

	public void clearLugar() {
		tokens.clear();
	}
}

package redesdepetri;

public class Lugar {
	private Integer id;
	private Integer qtdTokens;

	public Lugar(Integer id, Integer qtdTokens) {
		super();
		this.id = id;
		this.qtdTokens = qtdTokens;
	}

	public Integer getQtdTokens() {
		return qtdTokens;
	}

	public void setQtdTokens(Integer qtdTokens) {
		this.qtdTokens = qtdTokens;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}

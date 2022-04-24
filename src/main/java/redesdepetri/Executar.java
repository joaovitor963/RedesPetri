package redesdepetri;

public class Executar {

	public static void main(String[] args) {
		RedePetri rede = new RedePetri();
		
		Token t1 = new Token();
		rede.criarLugar(0, 2);
		rede.criarLugar(1, 2);
		rede.criarTransicao(0);
		rede.criarConexao(0, rede.getLugar(0), rede.getTransicao(0), 1, true, false, false);
		rede.criarConexao(1, rede.getLugar(1), rede.getTransicao(0), 1, false, false, false);
		rede.insereTokenEmLugar(t1, rede.getLugar(0));
		rede.executaCiclo();
		
	}

}

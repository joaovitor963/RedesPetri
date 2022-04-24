package redesdepetri;

public class Executar {

	public static void main(String[] args) {
		RedePetri rede = new RedePetri();
		
		Token t1 = new Token();
		rede.criarLugar(1);
		rede.criarLugar(2);
		rede.criarLugar(3);
		rede.criarLugar(4);
		rede.criarTransicao(1);
		rede.criarConexao(1, rede.getLugar(1), rede.getTransicao(1), 1, true, false, false);
		rede.criarConexao(2, rede.getLugar(2), rede.getTransicao(1), 1, false, false, false);
		rede.insereTokenEmLugar(t1, rede.getLugar(1));
		
		rede.criarTransicao(2);
		rede.criarConexao(3, rede.getLugar(2), rede.getTransicao(2), 1, true, false, false);
		rede.criarConexao(4, rede.getLugar(3), rede.getTransicao(2), 1, false, false, false);
		rede.criarConexao(5, rede.getLugar(4), rede.getTransicao(2), 1, false, false, false);
		
		rede.mostraRede();
		rede.executaCiclo();
		rede.mostraRede();
		rede.executaCiclo();
		rede.mostraRede();
	}

}

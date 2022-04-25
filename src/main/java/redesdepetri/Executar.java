package redesdepetri;

public class Executar {

	public static void main(String[] args) {
		RedePetri rede = new RedePetri();
		
		// teste 1
//		Token t1 = new Token();
//		rede.criarLugar(1);
//		rede.criarLugar(2);
//		rede.criarLugar(3);
//		rede.criarLugar(4);
//		
//		rede.criarTransicao(1);
//		rede.criarConexao(1, rede.getLugar(1), rede.getTransicao(1), 2, true, false, false);
//		rede.criarConexao(2, rede.getLugar(2), rede.getTransicao(1), 1, false, false, false);
//		rede.insereTokenEmLugar(t1, rede.getLugar(1));
//		rede.insereTokenEmLugar(t1, rede.getLugar(1));
//		
//		rede.criarTransicao(2);
//		rede.criarConexao(3, rede.getLugar(2), rede.getTransicao(2), 1, true, false, false);
//		rede.criarConexao(4, rede.getLugar(3), rede.getTransicao(2), 1, false, false, false);
//		rede.criarConexao(5, rede.getLugar(4), rede.getTransicao(2), 1, false, false, false);
//		
//		rede.mostraRede();
//		rede.executaCiclo();
//		rede.mostraRede();
//		rede.executaCiclo();
//		rede.mostraRede();

		
		// teste 2 (ciclo 3 para 4 da referencia)
//		rede.criarLugar(8);
//		rede.criarLugar(9);
//		rede.criarLugar(11);
//		rede.criarLugar(12);
//		rede.criarLugar(13);
//		
//		rede.criarTransicao(1);
//		
//		rede.criarConexao(1, rede.getLugar(8), rede.getTransicao(1), 1, true, false, false);
//		rede.criarConexao(2, rede.getLugar(9), rede.getTransicao(1), 1, true, false, false);
//		rede.criarConexao(3, rede.getLugar(11), rede.getTransicao(1), 1, true, false, false);
//		rede.criarConexao(4, rede.getLugar(12), rede.getTransicao(1), 1, false, false, false);
//		rede.criarConexao(5, rede.getLugar(13), rede.getTransicao(1), 1, false, false, false);
//
//		Token t1 = new Token();
//		Token t2 = new Token();
//		Token t3 = new Token();
//		Token t4 = new Token();
//		
//		rede.insereTokenEmLugar(t1, rede.getLugar(8));
//		rede.insereTokenEmLugar(t2, rede.getLugar(9));
//		rede.insereTokenEmLugar(t3, rede.getLugar(9));
//		rede.insereTokenEmLugar(t4, rede.getLugar(11));
//		
//		rede.mostraRede();
//		rede.executaCiclo();
//		rede.mostraRede();
		
		// teste 3 (ciclo 3 para 4 da referencia - conexao do lugar 9 com peso 2)
//		rede.criarLugar(8);
//		rede.criarLugar(9);
//		rede.criarLugar(11);
//		rede.criarLugar(12);
//		rede.criarLugar(13);
//		
//		rede.criarTransicao(1);
//		
//		rede.criarConexao(1, rede.getLugar(8), rede.getTransicao(1), 1, true, false, false);
//		rede.criarConexao(2, rede.getLugar(9), rede.getTransicao(1), 2, true, false, false);
//		rede.criarConexao(3, rede.getLugar(11), rede.getTransicao(1), 1, true, false, false);
//		rede.criarConexao(4, rede.getLugar(12), rede.getTransicao(1), 1, false, false, false);
//		rede.criarConexao(5, rede.getLugar(13), rede.getTransicao(1), 1, false, false, false);
//
//		Token t1 = new Token();
//		Token t2 = new Token();
//		Token t3 = new Token();
//		Token t4 = new Token();
//		Token t5 = new Token();
//		
//		rede.insereTokenEmLugar(t1, rede.getLugar(8));
//		rede.insereTokenEmLugar(t2, rede.getLugar(9));
//		rede.insereTokenEmLugar(t3, rede.getLugar(9));
//		rede.insereTokenEmLugar(t5, rede.getLugar(9));
//		rede.insereTokenEmLugar(t4, rede.getLugar(11));
//		
//		rede.mostraRede();
//		rede.executaCiclo();
//		rede.mostraRede();
//		
//		Token t6 = new Token();
//		Token t7 = new Token();
//		Token t8 = new Token();
//		
//		rede.insereTokenEmLugar(t6, rede.getLugar(8));
//		rede.insereTokenEmLugar(t7, rede.getLugar(9));
//		rede.insereTokenEmLugar(t8, rede.getLugar(11));
//
//		rede.mostraRede();
//		rede.executaCiclo();
//		rede.mostraRede();
//		
		// teste 4 (arco reset)
//		rede.criarLugar(1);
//		rede.criarLugar(2);
//		
//		rede.criarTransicao(1);
//		
//		rede.criarConexao(1, rede.getLugar(1), rede.getTransicao(1), 1, true, false, true);
//		rede.criarConexao(2, rede.getLugar(2), rede.getTransicao(1), 2, false, false, false);
//
//		Token t1 = new Token();
//		Token t2 = new Token();
//		Token t3 = new Token();
//		Token t4 = new Token();
//		Token t5 = new Token();
//		
//		rede.insereTokenEmLugar(t1, rede.getLugar(1));
//		rede.insereTokenEmLugar(t2, rede.getLugar(1));
//		rede.insereTokenEmLugar(t3, rede.getLugar(1));
//		rede.insereTokenEmLugar(t4, rede.getLugar(1));
//		rede.insereTokenEmLugar(t5, rede.getLugar(1));
//		
//		rede.mostraRede();
//		rede.executaCiclo();
//		rede.mostraRede();
		
		// simulação de referencia
		
		for (int i = 0; i < 13; i++) {
			rede.criarLugar(i+1);
		}
		
		for (int i = 0; i < 7; i++) {
			rede.criarTransicao(i+1);
		}
		
		// conexões do lugar 1
		rede.criarConexao(1, rede.getLugar(1), rede.getTransicao(1), 2, true, false, false);
		rede.criarConexao(2, rede.getLugar(1), rede.getTransicao(2), 1, false, false, false);

		// conexões do lugar 2
		rede.criarConexao(3, rede.getLugar(2), rede.getTransicao(6), 1, false, false, false);
		rede.criarConexao(4, rede.getLugar(2), rede.getTransicao(2), 1, true, false, false);
		
		// conexões do lugar 3
		rede.criarConexao(5, rede.getLugar(3), rede.getTransicao(3), 1, true, false, false);

		// conexões do lugar 4
		rede.criarConexao(6, rede.getLugar(4), rede.getTransicao(1), 1, false, false, false);
		rede.criarConexao(7, rede.getLugar(4), rede.getTransicao(4), 1, true, false, false);
		
		// conexões do lugar 5
		rede.criarConexao(8, rede.getLugar(5), rede.getTransicao(2), 1, false, false, false);
		rede.criarConexao(9, rede.getLugar(5), rede.getTransicao(5), 1, true, false, false);

		// conexões do lugar 6
		rede.criarConexao(10, rede.getLugar(6), rede.getTransicao(3), 1, false, false, false);
		rede.criarConexao(11, rede.getLugar(6), rede.getTransicao(6), 1, false, false, false);
		//rede.criarConexao(12, rede.getLugar(6), rede.getTransicao(5), 1, true, true, false); // arco inibidor
		
		// conexões do lugar 7
		rede.criarConexao(13, rede.getLugar(7), rede.getTransicao(4), 1, true, false, true); // arco reset

		// conexões do lugar 8
		rede.criarConexao(14, rede.getLugar(8), rede.getTransicao(5), 1, false, false, false); 
		rede.criarConexao(15, rede.getLugar(8), rede.getTransicao(4), 1, true, false, false); 
		rede.criarConexao(16, rede.getLugar(8), rede.getTransicao(7), 1, true, false, false); 

		// conexões do lugar 9
		rede.criarConexao(17, rede.getLugar(9), rede.getTransicao(5), 1, false, false, false); 
		rede.criarConexao(18, rede.getLugar(9), rede.getTransicao(7), 1, true, false, false); 

		// conexões do lugar 10
		rede.criarConexao(19, rede.getLugar(10), rede.getTransicao(5), 1, false, false, false); 
		rede.criarConexao(20, rede.getLugar(10), rede.getTransicao(6), 1, true, false, false); 
		
		// conexões do lugar 11
		rede.criarConexao(21, rede.getLugar(11), rede.getTransicao(4), 1, false, false, false); 
		rede.criarConexao(22, rede.getLugar(11), rede.getTransicao(7), 1, true, false, false); 

		// conexões do lugar 12
		rede.criarConexao(23, rede.getLugar(12), rede.getTransicao(7), 1, false, false, false); 

		// conexões do lugar 13
		rede.criarConexao(24, rede.getLugar(13), rede.getTransicao(7), 1, false, false, false); 
		rede.criarConexao(25, rede.getLugar(13), rede.getTransicao(6), 1, true, false, false); 
		
		Token t1 = new Token();
		Token t2 = new Token();
		Token t3 = new Token();
		rede.insereTokenEmLugar(t1, rede.getLugar(2));
		rede.insereTokenEmLugar(t2, rede.getLugar(2));
		rede.insereTokenEmLugar(t3, rede.getLugar(3));
		
		Token t4 = new Token();
		rede.insereTokenEmLugar(t4, rede.getLugar(7));
		
		rede.mostraRede();
		
		rede.executaCiclo(); // 1

		rede.mostraRede();

		rede.executaCiclo(); // 2
		
		rede.mostraRede();

		rede.executaCiclo(); // 3
		
		rede.mostraRede();
	}

}

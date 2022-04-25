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

		
		// teste 2
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
		

		/** teste  (ciclo 0 para 1) **/
//		rede.criarLugar(1);
//		rede.criarLugar(2);
//		rede.criarLugar(5);
//
//		
//		rede.criarTransicao(2);
//		
//		rede.criarConexao(1, rede.getLugar(2), rede.getTransicao(2), 1, true, false, false);
//		rede.criarConexao(2, rede.getLugar(1), rede.getTransicao(2), 1, false, false, false);
//		rede.criarConexao(3, rede.getLugar(5), rede.getTransicao(2), 1, false, false, false);
//
//		Token t1 = new Token();
//		Token t2 = new Token();
//		
//		rede.insereTokenEmLugar(t1, rede.getLugar(2));
//		rede.insereTokenEmLugar(t2, rede.getLugar(2));
//		
//		rede.mostraRede();
//		rede.executaCiclo();
//		rede.mostraRede();

		/** teste  (ciclo 1 para 2) **/
//		rede.criarLugar(1);
//		rede.criarLugar(2);
//		rede.criarLugar(4);
//		
//		rede.criarTransicao(1);
//		rede.criarTransicao(5);
//		
//		rede.criarConexao(1, rede.getLugar(1), rede.getTransicao(1), 2, true, false, false);
//		rede.criarConexao(2, rede.getLugar(2), rede.getTransicao(1), 1, true, false, false);
//		rede.criarConexao(3, rede.getLugar(4), rede.getTransicao(1), 1, false, false, false);
//
//		Token t1 = new Token();
//		Token t2 = new Token();
//		Token t3 = new Token();
//		Token t4 = new Token();
//		Token t5 = new Token();
//		Token t6 = new Token();
//		Token t7 = new Token();
//		Token t8 = new Token();
//		Token t9 = new Token();
//		
//		rede.insereTokenEmLugar(t1, rede.getLugar(1));
//		rede.insereTokenEmLugar(t2, rede.getLugar(1));
//		rede.insereTokenEmLugar(t3, rede.getLugar(1));
//		rede.insereTokenEmLugar(t4, rede.getLugar(1));
//		rede.insereTokenEmLugar(t5, rede.getLugar(1));
//		rede.insereTokenEmLugar(t6, rede.getLugar(1));
//		rede.insereTokenEmLugar(t7, rede.getLugar(1));
//		rede.insereTokenEmLugar(t8, rede.getLugar(2));
//		rede.insereTokenEmLugar(t9, rede.getLugar(2));
//		
//		rede.mostraRede();
//		rede.executaCiclo();
//		rede.mostraRede();
		
		/** teste 3 (ciclo 2 para 3) **/
//		rede.criarLugar(4);
//		rede.criarLugar(7);
//		rede.criarLugar(8);
//		rede.criarLugar(9);
//		rede.criarLugar(11);
//		rede.criarLugar(12);
//		
//		rede.criarTransicao(4);
//		rede.criarTransicao(7);
//		
//		rede.criarConexao(1, rede.getLugar(4), rede.getTransicao(4), 1, true, false, false);
//		rede.criarConexao(3, rede.getLugar(7), rede.getTransicao(4), 1, true, false, false);
//		rede.criarConexao(2, rede.getLugar(8), rede.getTransicao(4), 1, true, false, false);
//		rede.criarConexao(4, rede.getLugar(11), rede.getTransicao(4), 1, false, false, false);
//		rede.criarConexao(6, rede.getLugar(8), rede.getTransicao(7), 1, true, false, false);
//		rede.criarConexao(5, rede.getLugar(9), rede.getTransicao(7), 1, true, false, false);
//		rede.criarConexao(7, rede.getLugar(11), rede.getTransicao(7), 1, true, false, false);
//		rede.criarConexao(8, rede.getLugar(12), rede.getTransicao(7), 1, false, false, false);
//
//		Token t1 = new Token();
//		Token t2 = new Token();
//		Token t3 = new Token();
//		Token t4 = new Token();
//		Token t5 = new Token();
//		Token t6 = new Token();
//		
//		rede.insereTokenEmLugar(t1, rede.getLugar(4));
//		rede.insereTokenEmLugar(t2, rede.getLugar(7));
//		rede.insereTokenEmLugar(t3, rede.getLugar(8));
//		rede.insereTokenEmLugar(t4, rede.getLugar(8));
//		rede.insereTokenEmLugar(t5, rede.getLugar(9));
//		rede.insereTokenEmLugar(t6, rede.getLugar(9));
//		
//		rede.mostraRede();
//		rede.executaCiclo();
//		rede.mostraRede();
//		rede.executaCiclo();
//		rede.mostraRede();

		
		/** teste 3 (ciclo 3 para 4) **/
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
		

		// teste  (pesos diferentes) 
//		rede.criarLugar(1);
//		rede.criarLugar(2);
//		rede.criarLugar(3);
//		rede.criarLugar(4);
//		
//		rede.criarTransicao(1);
//		
//		rede.criarConexao(1, rede.getLugar(1), rede.getTransicao(1), 1, true, false, false);
//		rede.criarConexao(2, rede.getLugar(2), rede.getTransicao(1), 2, true, false, false);
//		rede.criarConexao(3, rede.getLugar(3), rede.getTransicao(1), 3, true, false, false);
//		rede.criarConexao(4, rede.getLugar(4), rede.getTransicao(1), 1, false, false, false);
//
//		Token t1 = new Token();
//		Token t2 = new Token();
//		Token t3 = new Token();
//		Token t4 = new Token();
//		Token t5 = new Token();
//		Token t6 = new Token();
//		Token t7 = new Token();
//		Token t8 = new Token();
//		Token t9 = new Token();
//		
//		rede.insereTokenEmLugar(t1, rede.getLugar(1));
//		rede.insereTokenEmLugar(t2, rede.getLugar(1));
//		rede.insereTokenEmLugar(t3, rede.getLugar(2));
//		rede.insereTokenEmLugar(t4, rede.getLugar(2));
//		rede.insereTokenEmLugar(t5, rede.getLugar(2));
//		rede.insereTokenEmLugar(t6, rede.getLugar(3));
//		rede.insereTokenEmLugar(t7, rede.getLugar(3));
//		rede.insereTokenEmLugar(t8, rede.getLugar(3));
//		rede.insereTokenEmLugar(t9, rede.getLugar(3));
//		
//		rede.mostraRede();
//		rede.executaCiclo();
//		rede.mostraRede();


	}

}

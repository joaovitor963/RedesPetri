package redesdepetri;

public class Executar {

	public static void main(String[] args) {
		RedePetri redePetri = new RedePetri();
		System.out.println("Criou? " + redePetri.criarLugar(1, 2));
		System.out.println("Id: " + redePetri.getLugar(1).getId());
		System.out.println("Removeu? " + redePetri.removeLugar(1));
		System.out.println("Id: " + redePetri.getLugar(1).getId());
		
	}

}

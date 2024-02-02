package celular;
import celular.Aparelho;
import celular.Musica;
import celular.Telefone;
import celular.Internet;

public class Funcionando {
	public static void main (String[] args) {
				
				System.out.println("=========FUNCIONANDO IPHONE=======");
				
				System.out.println("===FUNÇÃO MUSICA===");
				Musica m = new Musica();
				m.tocar();
				m.pausar();
				m.selecionar();
				
				System.out.println("===FUNÇÃO TELEFONE===");
				Telefone t = new Telefone();
				t.atender();
				t.ligar();
				t.correio();
				
				System.out.println("===FUNÇÃO INTERNET===");
				Internet i = new Internet();
				i.exibir();
				i.adicionarnovaaba();
				i.atualizar();
				
				
					
	}

}

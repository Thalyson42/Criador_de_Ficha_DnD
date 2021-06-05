package CriadorDeFicha;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Mago extends Classes{
	private SecureRandom random = new SecureRandom();
//	private String nome = "Mago";
//	private FichaDoPersonagem ficha;
//	private Proficiencia proficiencia;
//	private Equipamentos equips;
//	private Magias magias;
	
	public void setMago() {
		getFicha().setClasse("Mago");
		getFicha().setBonus_proficiencia(2);
//		this.proficiencia.setFicha(ficha);
		List<String> profEquips = Arrays.asList("Adagas", "Dardos", "Fundas", "Bord�es", "Bestas Leves");
		getProficiencia().SetProfEquips(profEquips);
		List<String> profResistencia = Arrays.asList("Intelig�ncia", "Sabedoria");
		getProficiencia().SetResistencia(profResistencia);
		List<String> profPericias = Arrays.asList("Arcanismo", "Hist�ria", "Intui��o", "Investiga��o", "Medicina", "Religi�o");
		getProficiencia().setPericias(profPericias, 2);
//		this.ficha = this.proficiencia.getFicha();
		equips1();
		equips2();
		equips3();
		getFicha().setEquipamentos("Grim�rio");
//		this.magias.setFicha(ficha);
		getMagias().truquesMago();
		getMagias().setMagiasMagoLV1();
//		this.ficha = this.magias.getFicha();
		getFicha().setHabilidade_conjuracao("Intelig�ncia");
		setGrimorio();
		setRecuperacaoArcana();
	}
	
	public int pontosVidaLV1(int modConstituicao) {
		return 8+modConstituicao;
	}
	
	public int pontosVidaNiveisSeguintesRoll(int vida, int modConstituicao, int niveis) {
		int soma = vida;
		for(int c = 0; c < niveis; c++) {
			soma += modConstituicao+(random.nextInt((8 - 1) + 1) + 1);	
		}
		return soma;
	}
	
	public int pontosVidaNiveisSeguintes(int vida, int modConstituicao, int niveis) {
		int soma = vida;
		
		for(int i = 0; i < niveis; i++) {
			soma += modConstituicao+5;
		}
		
		return soma;
	}
	
	public int setCDMagias(int proficiencia, int ModInteligencia) {
		return 8+proficiencia+ModInteligencia;
	}
	
	public int setModificadorAtaqueMagia(int proficiencia, int ModInteligencia) {
		return proficiencia+ModInteligencia;
	}
	
	public void equips1() {
		Scanner entrada = new Scanner(System.in);
		List<String> equips1 = Arrays.asList("Bord�o", "Adaga");
		boolean menuLoop = false;
		int menu = 0;
		while(menuLoop == false) {
			do {
				System.out.println("Escolha uma das op��es:");
				
				for(int i = 0; i < equips1.size(); i++) {
					System.out.println("("+ i+1 +") Uma " +equips1.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Digite um numero!");
					entrada.next();
				}
				
				menu = entrada.nextInt();
			}while(menu <= 0 || menu > 2);
			menuLoop = confirmarDecisao(equips1.get(menu));
		}
		switch(menu) {
		case 1:
			getFicha().setEquipamentos("Bord�o");
		break;
			
		case 2:
			getFicha().setEquipamentos("Adaga");
		break;
			
		default:
		break;
		}
	}
	
	public void equips2() {
		Scanner entrada = new Scanner(System.in);
		boolean equips2Loop = false;
		while(equips2Loop == false) {
			int equip2Menu;
			System.out.println("Escolha uma das op��es:\n1 - Bolsa de componentes\n2 - Foco arcano\n");
			
			while(!entrada.hasNextInt()) {
				System.out.println("Por favor digite um numero!");
				entrada.next();
			}
			
			equip2Menu = entrada.nextInt();
			switch(equip2Menu) {
			case 1:
				char decisaocase1;
				boolean decisaoLoop = false;
				while(decisaoLoop == false) {
					System.out.println("--Bolsa de Componentes--\n"
							+ "Trata-se de uma pequena\r\n"
							+ "bolsa de couro � prova d'�gua que pode ser fixada em um\r\n"
							+ "cinto. Ela possui compartimentos para armazenar todos\r\n"
							+ "os componentes materiais e outros itens especiais que\r\n"
							+ "voc� precisa para lan�ar suas magias, exceto os\r\n"
							+ "componentes que possuem um custo espec�fico (conforme\r\n"
							+ "indicado na descri��o da magia).\n");
					System.out.printf("Tem certeza que deseja escolher Bolsa de componentes? (Y/N)\n");
					
					decisaocase1 = entrada.next().charAt(0);
					if(decisaocase1 == 'Y' || decisaocase1 == 'y') {
						getFicha().setEquipamentos("Bolsa de componentes");
						decisaoLoop = true;
						equips2Loop = true;
					}else if(decisaocase1 == 'N' || decisaocase1 == 'n') {
						decisaoLoop = true;
					}
				}
			break;
			
			case 2:
				char decisaocase2;
				boolean decisao2Loop = false;
					
				while(decisao2Loop == false) {	
					System.out.println("--Foco arcano--\n"
							+ "Um foco arcano � um item especial �\r\n"
							+ "um orbe, um cristal, um bast�o, um cajado especialmente\r\n"
							+ "constru�do, uma varinha de madeira, ou algum item\r\n"
							+ "semelhante � projetado para canalizar o poder de magias\r\n"
							+ "arcanas. Um feiticeiro, bruxo ou mago podem us�-lo como\r\n"
							+ "um foco de conjura��o, conforme descrito no cap�tulo 10.\n");
					System.out.printf("Tem certeza que deseja escolher Foco arcano? (Y/N)\n");
					
					decisaocase2 = entrada.next().charAt(0);
					if(decisaocase2 == 'Y' || decisaocase2 == 'y') {
						getFicha().setEquipamentos("Foco Arcano");
						decisao2Loop = true;
						equips2Loop = true;
					}else if(decisaocase2 == 'N' || decisaocase2 == 'n') {
						decisao2Loop = true;
					}
				}
				
			break;	
			
			default:
				System.out.println("Essa op��o n�o existe!");
			break;
			}		
		}
	}
	
	public void equips3() {
		getFicha().setEquipamentos(getEquips().setPacotes("Pacote de Estudioso", "Pacote de Explorador"));
	}
	
	public boolean confirmarDecisao(String opcao) {
		Scanner entrada = new Scanner(System.in);
		
		char decisao;
		do {
			System.out.println("\nTem certeza que deseja " +opcao +"? (Y/N)");
			
			decisao = entrada.next().charAt(0);
		}while((Objects.equals(decisao, 'Y') || Objects.equals(decisao, 'y')  || Objects.equals(decisao, 'N') || Objects.equals(decisao, 'n')) == false);
		
		if(decisao == 'Y' || decisao == 'y') {
			return true;
		}
		return false;
	}
	
	public void setGrimorio() {
		getFicha().setClassefeats("--Grim�rio--\n"
				+ "No 1� n�vel, voc� possui um grim�rio contendo seis magias\r\n"
				+ "de mago de 1� n�vel, � sua escolha. Um grim�rio n�o\r\n"
				+ "cont�m truques.\r\n"
				+ "Copiar uma Magia para o Grim�rio. Quando voc� encontrar\r\n"
				+ "uma magia de mago de 1� n�vel ou superior, voc� pode adicion�-la\r\n"
				+ "em seu grim�rio, desde que seja de um n�vel que voc� possua\r\n"
				+ "espa�os de magia, al�m de dispor de tempo para decifr�-la e\r\n"
				+ "copi�-la. A magia copiada deve ser de um n�vel de magia que o\r\n"
				+ "mago possa preparar\n"
				+ "Para cada n�vel da magia a ser copiada, gasta-se 2 horas e 50\r\n"
				+ "po. O custo representa os componentes materiais que voc� gasta\r\n"
				+ "para experimentar a magia at� domin�-la, bem como as finas\r\n"
				+ "tintas utilizadas para escrev�-la. Uma vez gasto o tempo e o\r\n"
				+ "dinheiro, voc� pode preparar a magia copiada como as suas\r\n"
				+ "outras magias.\n"
				+ "Substituir o Grim�rio. Voc� pode copiar uma magia de seu\r\n"
				+ "grim�rio em outro livro � por exemplo, se voc� quiser fazer uma\r\n"
				+ "c�pia reserva de seu grim�rio. O processo � igual ao de copiar\r\n"
				+ "uma nova magia em seu grim�rio, s� que mais r�pido e f�cil, pois\r\n"
				+ "o mago entende suas pr�prias nota��es e sabe como conjurar a\r\n"
				+ "magia. Voc� precisa gastar somente 1 hora e 10 po para cada n�vel\r\n"
				+ "de magia copiada.\r\n"
				+ "Se perder o seu grim�rio, voc� pode usar o mesmo\r\n"
				+ "procedimento para transcrever suas magias preparadas em um\r\n"
				+ "novo grim�rio. Preencher o restante do grim�rio exigir� que voc�\r\n"
				+ "encontre novas magias, como normalmente se faz. Por essa raz�o,\r\n"
				+ "muitos magos mant�m seus grim�rios reservas em lugares\r\n"
				+ "seguros.\n");
	}
	
	public void setRecuperacaoArcana() {
		getFicha().setClassefeats("--Recupera��o Arcana--\n"
				+ "Voc� aprendeu como recuperar um pouco de sua energia\r\n"
				+ "m�gica estudando seu grim�rio. Uma vez por dia, quando\r\n"
				+ "voc� terminar um descanso curto, voc� pode escolher\r\n"
				+ "espa�os de magia gastos para recuper�-los. Os espa�os\r\n"
				+ "gastos a serem recuperados podem ser de qualquer\r\n"
				+ "combina��o de n�veis de magia, desde que sejam iguais ou\r\n"
				+ "inferiores a metade de seu n�vel de mago (arredondado\r\n"
				+ "para cima) e nenhum deles seja de 6� ou superior.\r\n"
				+ "Por exemplo, se voc� � um mago de 4� n�vel, voc� pode\r\n"
				+ "recuperar at� 2 espa�os de magia gastos. Voc� pode\r\n"
				+ "recuperar o espa�o de uma magia de 2� n�vel ou os\r\n"
				+ "espa�os de duas magias de 1� n�vel.\r\n");
	}

}

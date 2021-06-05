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
		List<String> profEquips = Arrays.asList("Adagas", "Dardos", "Fundas", "Bordões", "Bestas Leves");
		getProficiencia().SetProfEquips(profEquips);
		List<String> profResistencia = Arrays.asList("Inteligência", "Sabedoria");
		getProficiencia().SetResistencia(profResistencia);
		List<String> profPericias = Arrays.asList("Arcanismo", "História", "Intuição", "Investigação", "Medicina", "Religião");
		getProficiencia().setPericias(profPericias, 2);
//		this.ficha = this.proficiencia.getFicha();
		equips1();
		equips2();
		equips3();
		getFicha().setEquipamentos("Grimório");
//		this.magias.setFicha(ficha);
		getMagias().truquesMago();
		getMagias().setMagiasMagoLV1();
//		this.ficha = this.magias.getFicha();
		getFicha().setHabilidade_conjuracao("Inteligência");
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
		List<String> equips1 = Arrays.asList("Bordão", "Adaga");
		boolean menuLoop = false;
		int menu = 0;
		while(menuLoop == false) {
			do {
				System.out.println("Escolha uma das opções:");
				
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
			getFicha().setEquipamentos("Bordão");
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
			System.out.println("Escolha uma das opções:\n1 - Bolsa de componentes\n2 - Foco arcano\n");
			
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
							+ "bolsa de couro à prova d'água que pode ser fixada em um\r\n"
							+ "cinto. Ela possui compartimentos para armazenar todos\r\n"
							+ "os componentes materiais e outros itens especiais que\r\n"
							+ "você precisa para lançar suas magias, exceto os\r\n"
							+ "componentes que possuem um custo específico (conforme\r\n"
							+ "indicado na descrição da magia).\n");
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
							+ "Um foco arcano é um item especial –\r\n"
							+ "um orbe, um cristal, um bastão, um cajado especialmente\r\n"
							+ "construído, uma varinha de madeira, ou algum item\r\n"
							+ "semelhante – projetado para canalizar o poder de magias\r\n"
							+ "arcanas. Um feiticeiro, bruxo ou mago podem usá-lo como\r\n"
							+ "um foco de conjuração, conforme descrito no capítulo 10.\n");
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
				System.out.println("Essa opção não existe!");
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
		getFicha().setClassefeats("--Grimório--\n"
				+ "No 1º nível, você possui um grimório contendo seis magias\r\n"
				+ "de mago de 1º nível, à sua escolha. Um grimório não\r\n"
				+ "contém truques.\r\n"
				+ "Copiar uma Magia para o Grimório. Quando você encontrar\r\n"
				+ "uma magia de mago de 1° nível ou superior, você pode adicioná-la\r\n"
				+ "em seu grimório, desde que seja de um nível que você possua\r\n"
				+ "espaços de magia, além de dispor de tempo para decifrá-la e\r\n"
				+ "copiá-la. A magia copiada deve ser de um nível de magia que o\r\n"
				+ "mago possa preparar\n"
				+ "Para cada nível da magia a ser copiada, gasta-se 2 horas e 50\r\n"
				+ "po. O custo representa os componentes materiais que você gasta\r\n"
				+ "para experimentar a magia até dominá-la, bem como as finas\r\n"
				+ "tintas utilizadas para escrevê-la. Uma vez gasto o tempo e o\r\n"
				+ "dinheiro, você pode preparar a magia copiada como as suas\r\n"
				+ "outras magias.\n"
				+ "Substituir o Grimório. Você pode copiar uma magia de seu\r\n"
				+ "grimório em outro livro – por exemplo, se você quiser fazer uma\r\n"
				+ "cópia reserva de seu grimório. O processo é igual ao de copiar\r\n"
				+ "uma nova magia em seu grimório, só que mais rápido e fácil, pois\r\n"
				+ "o mago entende suas próprias notações e sabe como conjurar a\r\n"
				+ "magia. Você precisa gastar somente 1 hora e 10 po para cada nível\r\n"
				+ "de magia copiada.\r\n"
				+ "Se perder o seu grimório, você pode usar o mesmo\r\n"
				+ "procedimento para transcrever suas magias preparadas em um\r\n"
				+ "novo grimório. Preencher o restante do grimório exigirá que você\r\n"
				+ "encontre novas magias, como normalmente se faz. Por essa razão,\r\n"
				+ "muitos magos mantêm seus grimórios reservas em lugares\r\n"
				+ "seguros.\n");
	}
	
	public void setRecuperacaoArcana() {
		getFicha().setClassefeats("--Recuperação Arcana--\n"
				+ "Você aprendeu como recuperar um pouco de sua energia\r\n"
				+ "mágica estudando seu grimório. Uma vez por dia, quando\r\n"
				+ "você terminar um descanso curto, você pode escolher\r\n"
				+ "espaços de magia gastos para recuperá-los. Os espaços\r\n"
				+ "gastos a serem recuperados podem ser de qualquer\r\n"
				+ "combinação de níveis de magia, desde que sejam iguais ou\r\n"
				+ "inferiores a metade de seu nível de mago (arredondado\r\n"
				+ "para cima) e nenhum deles seja de 6º ou superior.\r\n"
				+ "Por exemplo, se você é um mago de 4º nível, você pode\r\n"
				+ "recuperar até 2 espaços de magia gastos. Você pode\r\n"
				+ "recuperar o espaço de uma magia de 2º nível ou os\r\n"
				+ "espaços de duas magias de 1º nível.\r\n");
	}

}

package CriadorDeFicha;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Paladino extends Classes{
	private SecureRandom random = new SecureRandom();
//	private String nome = "Paladino";
//	private FichaDoPersonagem ficha;
//	private Proficiencia proficiencia;
//	private Equipamentos equips;
//	private Magias magias;
	
	public void setPaladino() {
		getFicha().setClasse("Paladino");
		getFicha().setBonus_proficiencia(2);
//		this.proficiencia.setFicha(ficha);
		List<String> listaArmaduras = Arrays.asList("Armaduras Leves", "Armaduras Médias", "Armaduras Pesadas", "Armas Simples", "Armas Marciais");
		getProficiencia().SetProfEquips(listaArmaduras);
		getProficiencia().setProficienciaEscudos();
		List<String> profResistencia = Arrays.asList("Sabedoria", "Carisma");
		getProficiencia().SetResistencia(profResistencia);
		List<String> profPericias = Arrays.asList("Atletismo", "Intuição", "Intimidação", "Medicina", "Persuasão", "Religião");
		getProficiencia().setPericias(profPericias, 2);
//		getFicha() = this.proficiencia.getFicha();
		equips1();
		equips2();
		equips3();
		getFicha().setEquipamentos("Cota de malha");
		getFicha().setEquipamentos("Símbolo sagrado");
	}
	
	public int pontosVidaLV1(int modConstituicao) {
		return 10+modConstituicao;
	}
	
	public int pontosVidaNiveisSeguintesRoll(int vida, int modConstituicao, int niveis) {
		int soma = vida;
		for(int c = 0; c < niveis; c++) {
			soma += modConstituicao+(random.nextInt((10 - 1) + 1) + 1);	
		}
		return soma;
	}
	
	public int pontosVidaNiveisSeguintes(int vida, int modConstituicao, int niveis) {
		int soma = vida;
		
		for(int i = 0; i < niveis; i++) {
			soma += modConstituicao+6;
		}
		
		return soma;
	}
	
	public int CDMagia(int proficiencia, int ModCarisma) {
		return 8+proficiencia+ModCarisma;
	}
	
	public int ModificadorAtaqueMagia(int proficiencia, int ModCarisma) {
		return proficiencia+ModCarisma;
	}
	
	public void equips1() {
		Scanner entrada = new Scanner(System.in);
		List<String> equip1 = Arrays.asList("Uma arma marcial e um escudo", "Duas armas marciais");
		boolean menuLoop = false;
		int menu = 0;
		while(menuLoop == false) {
			do {
				System.out.println("Escolha uma opção:");
				
				for(int i = 0; i < equip1.size(); i++) {
					System.out.println((i+1)+ " - " +equip1.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Digite um numero!");
					entrada.next();
				}
				
				menu = entrada.nextInt();
			}while(menu <= 0 || menu > 2);
			menuLoop = confirmarDecisao(equip1.get(menu));
		}
		
		switch(menu) {
		case 1:
			getFicha().setEquipamentos(getEquips().setArmasMarciais());
			getFicha().setEquipamentos("Escudo");
		break;
		
		case 2:
			getFicha().setEquipamentos(getEquips().setArmasMarciais(2));
		break;
		}
	}
	
	public void equips2() {
		Scanner entrada = new Scanner(System.in);
		List<String> equip1 = Arrays.asList("5 azagaias", "Qualquer arma simples corpo-a-corpo");
		boolean menuLoop = false;
		int menu = 0;
		while(menuLoop == false) {
			do {
				System.out.println("Escolha uma opção:");
				
				for(int i = 0; i < equip1.size(); i++) {
					System.out.println((i+1)+ " - " +equip1.get(i));
				}
				
				while(!entrada.hasNextInt()) {
					System.out.println("Digite um numero!");
					entrada.next();
				}
				
				menu = entrada.nextInt();
			}while(menu <= 0 || menu > 2);
			menuLoop = confirmarDecisao(equip1.get(menu));
		}
		
		switch(menu) {
		case 1:
			getFicha().setEquipamentos("Azagais (5)");
		break;
		
		case 2:
			getFicha().setEquipamentos(getEquips().setArmaCACSimples());
		break;
		}
	}
	
	public void equips3() {
		getFicha().setEquipamentos(getEquips().setPacotes("Pacote de Sacerdote", "Pacote de Aventureiro"));
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
	
	public void setSentidoDivino() {
		getFicha().setClassefeats("--SENTIDO DIVINO--\r\n"
				+ "A presença de um mal poderoso é registrada nos seus\r\n"
				+ "sentidos como um odor nocivo e o bem poderoso badala\r\n"
				+ "como música celestial nos seus ouvidos. Com uma ação,\r\n"
				+ "você pode expandir sua consciência para detectar tais\r\n"
				+ "forças. Até o final do seu próximo turno, você sabe a\r\n"
				+ "localização de qualquer celestial, corruptor ou morto-vivo\r\n"
				+ "a 18 metros de você que não esteja com cobertura total.\r\n"
				+ "Você sabe o tipo (celestial, corruptor ou morto-vivo) de\r\n"
				+ "qualquer ser cuja presença você sentiu, mas não sua\r\n"
				+ "identidade (o vampiro Conde Strahd von Zarovish, por\r\n"
				+ "exemplo). Dentro do mesmo raio, você também detecta a\r\n"
				+ "presença de qualquer lugar ou objeto que tenha sido\r\n"
				+ "consagrado ou conspurcado, como pela magia consagrar.\r\n"
				+ "Você pode usar essa característica um número de\r\n"
				+ "vezes igual a 1 + seu modificador de Carisma. Quando\r\n"
				+ "você concluir um descanso longo, você recupera todos os\r\n"
				+ "usos gastos.\n");
	}
	
	public void setCuraPelasMãos() {
		getFicha().setClassefeats("--CURA PELAS MÃOS--\r\n"
				+ "Seu toque abençoado pode curar ferimentos. Você tem\r\n"
				+ "uma reserva de poder curativo que se enche quando você\r\n"
				+ "realiza um descanso longo. Com essa reserva, você pode\r\n"
				+ "restaurar um número total de pontos de vida igual ao seu\r\n"
				+ "nível de paladino x 5.\r\n"
				+ "Com uma ação, você pode tocar uma criatura e sugar\r\n"
				+ "poder da sua reserva para restaurar um número de\r\n"
				+ "pontos de vida da criatura, até o máximo de pontos\r\n"
				+ "restantes na reserva.\r\n"
				+ "Alternativamente, você pode gastar 5 pontos de cura\r\n"
				+ "da sua reserva de cura para curar o alvo de uma doença\r\n"
				+ "ou neutralizar um veneno que o esteja afetando. Você\r\n"
				+ "pode curar múltiplas doenças e neutralizar múltiplos\r\n"
				+ "venenos com um único uso de Cura pelas Mãos, gastando\r\n"
				+ "pontos de vida separadamente para cada um.\r\n"
				+ "Essa característica não gera nenhum efeito em\r\n"
				+ "mortos-vivos e constructos.\n");
	}
	
}

package Races;

import java.util.Scanner;

import CriadorDeFicha.Classes;

public class Draconato extends Classes{

	public String draconatoDescricao() {
		String draconato = "DRACONATO\r\n\n"
			+ "Descendentes de dragões, como seus nomes\r\n"
			+ "demonstram, os draconatos andam orgulhosamente pelo\r\n"
			+ "mundo que os saúda com um temor incompreensível.\r\n"
			+ "Moldados por deuses dracônicos ou pelos próprios\r\n"
			+ "dragões, draconatos originalmente nasceram de ovos de\r\n"
			+ "dragão como uma raça única, combinando os melhores\r\n"
			+ "atributos de dragões e humanos. Alguns draconatos são\r\n"
			+ "servos fieis de dragões verdadeiros, outros formas as\r\n"
			+ "fileiras de soldados em grandes guerras e ainda existem\r\n"
			+ "os que encontram-se à toa, sem um objetivo claro na vida.\r\n\n"
			+ "Draconatos parecem muito com dragões que estão de pé\r\n"
			+ "em forma humanoide, apesar de não possuírem asas nem\r\n"
			+ "uma calda. O primeiro draconato possuía escamas de\r\n"
			+ "matizes brilhantes combinando com as cores do dragão de\r\n"
			+ "que descendia, mas gerações de misturas criaram uma\r\n"
			+ "aparência mais uniforme. Suas pequenas escamas finas,\r\n"
			+ "normalmente são de cor bronze ou latão, algumas vezes\r\n"
			+ "indo até tons de escarlate, ferrugem, ouro ou cobreesverdeado. Eles são altos e de constituição forte, muitas\r\n"
			+ "vezes medindo 1,95 metro de altura e pesando 150 kg ou\r\n"
			+ "mais. Suas mãos e pés são fortes, com três dedos de\r\n"
			+ "garras curvadas em cada mão.\r\n"
			+ "O sangue de um tipo particular de dragão corre\r\n"
			+ "fortemente nas veias de alguns clãs de draconatos. Esses\r\n"
			+ "draconatos muitas vezes ostentam escamas de cores mais\r\n"
			+ "similares ao seu dragão ancestral vermelho, verde, azul\r\n"
			+ "ou branco brilhantes, preto lustroso ou ouro, prata, latão,\r\n"
			+ "cobre ou bronze metálico reluzente.\r\n"
			+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
			+ "Força aumenta em 2 e seu valor de Carisma aumenta em\r\n"
			+ "1.\r\n"
			+ "Idade. Draconatos jovens crescem rapidamente. Eles\r\n"
			+ "caminham horas após nascerem, adquirindo o tamanho e\r\n"
			+ "desenvolvimento semelhante a de uma criança humana\r\n"
			+ "de 10 anos com 3 anos de idade e alcançam a maturidade\r\n"
			+ "aos 15. Eles costumam viver até os 80.\r\n"
			+ "Tendência. Os draconatos tendem aos extremos,\r\n"
			+ "realizando uma escolha consciente de um lado ou do outro\r\n"
			+ "da guerra cósmica entre o bem e o mal (representada por\r\n"
			+ "Bahamut e Tiamat, respectivamente). A maioria dos\r\n"
			+ "draconatos é boa, mas os que vão para o lado de Tiamat\r\n"
			+ "podem se tornar vilões terríveis.\r\n"
			+ "Tamanho. Os draconatos são mais altos e mais\r\n"
			+ "pesados que os humanos, geralmente possuindo mais de\r\n"
			+ "1,80 metro e normalmente pesando mais de 125 kg. Seu\r\n"
			+ "tamanho é Médio.\r\n"
			+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
			+ "é 9 metros.\r\n"
			+ "Ancestral Dracônico. Você possui um ancestral\r\n"
			+ "dracônico. Escolha um tipo de dragão da tabela Ancestral\r\n"
			+ "Dracônico. Sua arma de sopro e resistência a dano são\r\n"
			+ "determinadas pelo tipo de dragão, como mostrado na\r\n"
			+ "tabela.\r\n"
			+ "Arma de Sopro. Você pode usar uma ação para\r\n"
			+ "exalar energia destrutiva. Seu ancestral dracônico\r\n"
			+ "determina o tamanho, formado e tipo de dano que você\r\n"
			+ "expele.\r\n"
			+ "Quando você usa sua arma de sopro, cada criatura na\r\n"
			+ "área exalada deve realizar um teste de resistência, o tipo\r\n"
			+ "do teste é determinado pelo seu ancestral dracônico. A CD\r\n"
			+ "do teste de resistência é 8 + seu modificador de\r\n"
			+ "Constituição + seu bônus de proficiência. Uma criatura\r\n"
			+ "sofre 2d6 de dano num fracasso e metade desse dano num\r\n"
			+ "sucesso. O dano aumenta para 3d6 no 6° nível, 4d6 no 11°\r\n"
			+ "nível e 5d6 no 16° nível.\r\n"
			+ "Depois de usar sua arma de sopro, você não poderá\r\n"
			+ "utilizá-la novamente até completar um descanso curto ou\r\n"
			+ "longo.\r\n"
			+ "Resistência a Dano. Você possui resistência ao tipo\r\n"
			+ "de dano associado ao seu ancestral dracônico.\r\n"
			+ "Idiomas. Você pode falar, ler e escrever Comum e\r\n"
			+ "Dracônico. O idioma Dracônico é conhecido por ser uma\r\n"
			+ "das mais antigas línguas e ainda é usado no estudo de\r\n"
			+ "magia. A linguagem soa áspera para a maioria das\r\n"
			+ "criaturas, incluindo várias consoantes e silabas firmes.\r\n"
			+ "\n"
			+ "ANCESTRAL DRACÔNICO\r\n"
			+ "Dragão    Tipo de Dano    Arma de Sopro\r\n"
			+ "Azul      Elétrico        Linha de 1,5m/9m (teste de Des)\r\n"
			+ "Branco    Frio            Cone de 4,5m (teste de Con)\r\n"
			+ "Bronze    Elétrico        Linha de 1,5m/9m (teste de Des)\r\n"
			+ "Cobre     Acido           Linha de 1,5m/9m (teste de Des)\r\n"
			+ "Latão     Fogo            Linha de 1,5m/9m (teste de Des)\r\n"
			+ "Negro     Acido           Linha de 1,5m/9m (teste de Des)\r\n"
			+ "Ouro      Fogo            Cone de 4,5m (teste de Des)\r\n"
			+ "Prata     Frio            Cone de 4,5m (teste de Con)\r\n"
			+ "Verde     Veneno          Cone de 4,5m (teste de Con)\r\n"
			+ "Vermelho  Fogo            Cone de 4,5m (teste de Des)\r\n";
			
			return draconato;
	}
	
	
	public String getAncestralDraconico() {
		Scanner entrada = new Scanner(System.in);
		int menu;
		boolean menuLoop = false;
		String ancestralDraconico = null;
		while(menuLoop == false) {
			System.out.println("Ancestral Dracônico.\n\nVocê possui um ancestral\r\n"
				+ "dracônico. Escolha um tipo de dragão da tabela Ancestral\r\n"
				+ "Dracônico. Sua arma de sopro e resistência a dano são\r\n"
				+ "determinadas pelo tipo de dragão, como mostrado na\r\n"
				+ "tabela.\n\n");
			System.out.println("1 - Azul / Elétrico / Linha de 1,5m/9m (teste de Des)\n"
				+ "2 - Branco / Frio / Cone de 4,5m (teste de Con)\n"
				+ "3 - Bronze / Elétrico / Linha de 1,5m/9m (teste de Des)\n"
				+ "4 - Cobre / Acido / Linha de 1,5m/9m (teste de Des)\n"
				+ "5 - Latão / fogo / Linha 1,5m/9m (teste de Des)\n"
				+ "6 - Negro / Acido / Linha 1,5m/9m (teste de Des)\n"
				+ "7 - Ouro / Fogo / Cone de 4,5m (teste de Des)\n"
				+ "8 - Prata / Frio / Cone de 4,5m (teste de Con)\n"
				+ "9 - Verde / Veneno / Cone de 4,5m (teste de Con)\n"
				+ "10 - Vermelho / Fogo / Cone de 4,5m (teste de Des)\n");
			menu = entrada.nextInt();
			switch(menu) {
			case 1:
				ancestralDraconico = "Anccestral Dracônico.\n\nAzul / Elétrico / Linha de 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 2:
				ancestralDraconico = "Anccestral Dracônico.\n\nBranco / Frio / Cone de 4,5m (teste de Con)\n";
				menuLoop = true;
			break;
			
			case 3:
				ancestralDraconico = "Anccestral Dracônico.\n\nBronze / Elétrico / Linha de 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 4:
				ancestralDraconico = "Anccestral Dracônico.\n\nCobre / Acido / Linha de 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 5:
				ancestralDraconico = "Anccestral Dracônico.\n\nLatão / fogo / Linha 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 6:
				ancestralDraconico = "Anccestral Dracônico.\n\nNegro / Acido / Linha 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 7:
				ancestralDraconico = "Anccestral Dracônico.\n\nOuro / Fogo / Cone de 4,5m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 8:
				ancestralDraconico = "Anccestral Dracônico.\n\nPrata / Frio / Cone de 4,5m (teste de Con)\n";
				menuLoop = true;
			break;
			
			case 9:
				ancestralDraconico = "Anccestral Dracônico.\n\nVerde / Veneno / Cone de 4,5m (teste de Con)\n";
				menuLoop = true;
			break;
			
			case 10:
				ancestralDraconico = "Anccestral Dracônico.\n\nVermelho / Fogo / Cone de 4,5m (teste de Des)\n";
				menuLoop = true;
			break;
			
			default:
			break;
			}
		}
		return ancestralDraconico;
	}
	
	public void setDraconato() {
		getFicha().setForca(2);
		getFicha().setCarisma(1);
		getFicha().setTracosraciais(getAncestralDraconico());
		getFicha().setTracosraciais("Arma de Sopro.\n\nVocê pode usar uma ação para\r\n"
			+ "exalar energia destrutiva. Seu ancestral dracônico\r\n"
			+ "determina o tamanho, formado e tipo de dano que você\r\n"
			+ "expele.\r\n"
			+ "Quando você usa sua arma de sopro, cada criatura na\r\n"
			+ "área exalada deve realizar um teste de resistência, o tipo\r\n"
			+ "do teste é determinado pelo seu ancestral dracônico. A CD\r\n"
			+ "do teste de resistência é 8 + seu modificador de\r\n"
			+ "Constituição + seu bônus de proficiência. Uma criatura\r\n"
			+ "sofre 2d6 de dano num fracasso e metade desse dano num\r\n"
			+ "sucesso. O dano aumenta para 3d6 no 6° nível, 4d6 no 11°\r\n"
			+ "nível e 5d6 no 16° nível.\r\n"
			+ "Depois de usar sua arma de sopro, você não poderá\r\n"
			+ "utilizá-la novamente até completar um descanso curto ou longo.\n\n");
		getFicha().setTracosraciais("Resistência a Dano.\n\nVocê possui resistência ao tipo\r\n"
			+ "de dano associado ao seu ancestral dracônico.\r\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Dracônico");
	}
}

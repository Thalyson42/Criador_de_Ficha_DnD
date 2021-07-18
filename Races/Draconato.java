package Races;

import java.util.Scanner;

import CriadorDeFicha.Classes;

public class Draconato extends Classes{

	public String draconatoDescricao() {
		String draconato = "DRACONATO\r\n\n"
			+ "Descendentes de drag�es, como seus nomes\r\n"
			+ "demonstram, os draconatos andam orgulhosamente pelo\r\n"
			+ "mundo que os sa�da com um temor incompreens�vel.\r\n"
			+ "Moldados por deuses drac�nicos ou pelos pr�prios\r\n"
			+ "drag�es, draconatos originalmente nasceram de ovos de\r\n"
			+ "drag�o como uma ra�a �nica, combinando os melhores\r\n"
			+ "atributos de drag�es e humanos. Alguns draconatos s�o\r\n"
			+ "servos fieis de drag�es verdadeiros, outros formas as\r\n"
			+ "fileiras de soldados em grandes guerras e ainda existem\r\n"
			+ "os que encontram-se � toa, sem um objetivo claro na vida.\r\n\n"
			+ "Draconatos parecem muito com drag�es que est�o de p�\r\n"
			+ "em forma humanoide, apesar de n�o possu�rem asas nem\r\n"
			+ "uma calda. O primeiro draconato possu�a escamas de\r\n"
			+ "matizes brilhantes combinando com as cores do drag�o de\r\n"
			+ "que descendia, mas gera��es de misturas criaram uma\r\n"
			+ "apar�ncia mais uniforme. Suas pequenas escamas finas,\r\n"
			+ "normalmente s�o de cor bronze ou lat�o, algumas vezes\r\n"
			+ "indo at� tons de escarlate, ferrugem, ouro ou cobreesverdeado. Eles s�o altos e de constitui��o forte, muitas\r\n"
			+ "vezes medindo 1,95 metro de altura e pesando 150 kg ou\r\n"
			+ "mais. Suas m�os e p�s s�o fortes, com tr�s dedos de\r\n"
			+ "garras curvadas em cada m�o.\r\n"
			+ "O sangue de um tipo particular de drag�o corre\r\n"
			+ "fortemente nas veias de alguns cl�s de draconatos. Esses\r\n"
			+ "draconatos muitas vezes ostentam escamas de cores mais\r\n"
			+ "similares ao seu drag�o ancestral vermelho, verde, azul\r\n"
			+ "ou branco brilhantes, preto lustroso ou ouro, prata, lat�o,\r\n"
			+ "cobre ou bronze met�lico reluzente.\r\n"
			+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
			+ "For�a aumenta em 2 e seu valor de Carisma aumenta em\r\n"
			+ "1.\r\n"
			+ "Idade. Draconatos jovens crescem rapidamente. Eles\r\n"
			+ "caminham horas ap�s nascerem, adquirindo o tamanho e\r\n"
			+ "desenvolvimento semelhante a de uma crian�a humana\r\n"
			+ "de 10 anos com 3 anos de idade e alcan�am a maturidade\r\n"
			+ "aos 15. Eles costumam viver at� os 80.\r\n"
			+ "Tend�ncia. Os draconatos tendem aos extremos,\r\n"
			+ "realizando uma escolha consciente de um lado ou do outro\r\n"
			+ "da guerra c�smica entre o bem e o mal (representada por\r\n"
			+ "Bahamut e Tiamat, respectivamente). A maioria dos\r\n"
			+ "draconatos � boa, mas os que v�o para o lado de Tiamat\r\n"
			+ "podem se tornar vil�es terr�veis.\r\n"
			+ "Tamanho. Os draconatos s�o mais altos e mais\r\n"
			+ "pesados que os humanos, geralmente possuindo mais de\r\n"
			+ "1,80 metro e normalmente pesando mais de 125 kg. Seu\r\n"
			+ "tamanho � M�dio.\r\n"
			+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
			+ "� 9 metros.\r\n"
			+ "Ancestral Drac�nico. Voc� possui um ancestral\r\n"
			+ "drac�nico. Escolha um tipo de drag�o da tabela Ancestral\r\n"
			+ "Drac�nico. Sua arma de sopro e resist�ncia a dano s�o\r\n"
			+ "determinadas pelo tipo de drag�o, como mostrado na\r\n"
			+ "tabela.\r\n"
			+ "Arma de Sopro. Voc� pode usar uma a��o para\r\n"
			+ "exalar energia destrutiva. Seu ancestral drac�nico\r\n"
			+ "determina o tamanho, formado e tipo de dano que voc�\r\n"
			+ "expele.\r\n"
			+ "Quando voc� usa sua arma de sopro, cada criatura na\r\n"
			+ "�rea exalada deve realizar um teste de resist�ncia, o tipo\r\n"
			+ "do teste � determinado pelo seu ancestral drac�nico. A CD\r\n"
			+ "do teste de resist�ncia � 8 + seu modificador de\r\n"
			+ "Constitui��o + seu b�nus de profici�ncia. Uma criatura\r\n"
			+ "sofre 2d6 de dano num fracasso e metade desse dano num\r\n"
			+ "sucesso. O dano aumenta para 3d6 no 6� n�vel, 4d6 no 11�\r\n"
			+ "n�vel e 5d6 no 16� n�vel.\r\n"
			+ "Depois de usar sua arma de sopro, voc� n�o poder�\r\n"
			+ "utiliz�-la novamente at� completar um descanso curto ou\r\n"
			+ "longo.\r\n"
			+ "Resist�ncia a Dano. Voc� possui resist�ncia ao tipo\r\n"
			+ "de dano associado ao seu ancestral drac�nico.\r\n"
			+ "Idiomas. Voc� pode falar, ler e escrever Comum e\r\n"
			+ "Drac�nico. O idioma Drac�nico � conhecido por ser uma\r\n"
			+ "das mais antigas l�nguas e ainda � usado no estudo de\r\n"
			+ "magia. A linguagem soa �spera para a maioria das\r\n"
			+ "criaturas, incluindo v�rias consoantes e silabas firmes.\r\n"
			+ "\n"
			+ "ANCESTRAL DRAC�NICO\r\n"
			+ "Drag�o    Tipo de Dano    Arma de Sopro\r\n"
			+ "Azul      El�trico        Linha de 1,5m/9m (teste de Des)\r\n"
			+ "Branco    Frio            Cone de 4,5m (teste de Con)\r\n"
			+ "Bronze    El�trico        Linha de 1,5m/9m (teste de Des)\r\n"
			+ "Cobre     Acido           Linha de 1,5m/9m (teste de Des)\r\n"
			+ "Lat�o     Fogo            Linha de 1,5m/9m (teste de Des)\r\n"
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
			System.out.println("Ancestral Drac�nico.\n\nVoc� possui um ancestral\r\n"
				+ "drac�nico. Escolha um tipo de drag�o da tabela Ancestral\r\n"
				+ "Drac�nico. Sua arma de sopro e resist�ncia a dano s�o\r\n"
				+ "determinadas pelo tipo de drag�o, como mostrado na\r\n"
				+ "tabela.\n\n");
			System.out.println("1 - Azul / El�trico / Linha de 1,5m/9m (teste de Des)\n"
				+ "2 - Branco / Frio / Cone de 4,5m (teste de Con)\n"
				+ "3 - Bronze / El�trico / Linha de 1,5m/9m (teste de Des)\n"
				+ "4 - Cobre / Acido / Linha de 1,5m/9m (teste de Des)\n"
				+ "5 - Lat�o / fogo / Linha 1,5m/9m (teste de Des)\n"
				+ "6 - Negro / Acido / Linha 1,5m/9m (teste de Des)\n"
				+ "7 - Ouro / Fogo / Cone de 4,5m (teste de Des)\n"
				+ "8 - Prata / Frio / Cone de 4,5m (teste de Con)\n"
				+ "9 - Verde / Veneno / Cone de 4,5m (teste de Con)\n"
				+ "10 - Vermelho / Fogo / Cone de 4,5m (teste de Des)\n");
			menu = entrada.nextInt();
			switch(menu) {
			case 1:
				ancestralDraconico = "Anccestral Drac�nico.\n\nAzul / El�trico / Linha de 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 2:
				ancestralDraconico = "Anccestral Drac�nico.\n\nBranco / Frio / Cone de 4,5m (teste de Con)\n";
				menuLoop = true;
			break;
			
			case 3:
				ancestralDraconico = "Anccestral Drac�nico.\n\nBronze / El�trico / Linha de 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 4:
				ancestralDraconico = "Anccestral Drac�nico.\n\nCobre / Acido / Linha de 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 5:
				ancestralDraconico = "Anccestral Drac�nico.\n\nLat�o / fogo / Linha 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 6:
				ancestralDraconico = "Anccestral Drac�nico.\n\nNegro / Acido / Linha 1,5m/9m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 7:
				ancestralDraconico = "Anccestral Drac�nico.\n\nOuro / Fogo / Cone de 4,5m (teste de Des)\n";
				menuLoop = true;
			break;
			
			case 8:
				ancestralDraconico = "Anccestral Drac�nico.\n\nPrata / Frio / Cone de 4,5m (teste de Con)\n";
				menuLoop = true;
			break;
			
			case 9:
				ancestralDraconico = "Anccestral Drac�nico.\n\nVerde / Veneno / Cone de 4,5m (teste de Con)\n";
				menuLoop = true;
			break;
			
			case 10:
				ancestralDraconico = "Anccestral Drac�nico.\n\nVermelho / Fogo / Cone de 4,5m (teste de Des)\n";
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
		getFicha().setTracosraciais("Arma de Sopro.\n\nVoc� pode usar uma a��o para\r\n"
			+ "exalar energia destrutiva. Seu ancestral drac�nico\r\n"
			+ "determina o tamanho, formado e tipo de dano que voc�\r\n"
			+ "expele.\r\n"
			+ "Quando voc� usa sua arma de sopro, cada criatura na\r\n"
			+ "�rea exalada deve realizar um teste de resist�ncia, o tipo\r\n"
			+ "do teste � determinado pelo seu ancestral drac�nico. A CD\r\n"
			+ "do teste de resist�ncia � 8 + seu modificador de\r\n"
			+ "Constitui��o + seu b�nus de profici�ncia. Uma criatura\r\n"
			+ "sofre 2d6 de dano num fracasso e metade desse dano num\r\n"
			+ "sucesso. O dano aumenta para 3d6 no 6� n�vel, 4d6 no 11�\r\n"
			+ "n�vel e 5d6 no 16� n�vel.\r\n"
			+ "Depois de usar sua arma de sopro, voc� n�o poder�\r\n"
			+ "utiliz�-la novamente at� completar um descanso curto ou longo.\n\n");
		getFicha().setTracosraciais("Resist�ncia a Dano.\n\nVoc� possui resist�ncia ao tipo\r\n"
			+ "de dano associado ao seu ancestral drac�nico.\r\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Drac�nico");
	}
}

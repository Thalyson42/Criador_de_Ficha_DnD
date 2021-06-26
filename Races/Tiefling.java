package Races;

import CriadorDeFicha.Classes;

public class Tiefling extends Classes{

	public String tieflingDescricao() {
		String tiefling = "TIEFLING\r\n\n"
				+ "Ser recebido com olhares e cochichos, sofrer viol�ncia e\r\n"
				+ "insultos nas ruas, ver a desconfian�a e medo em cada\r\n"
				+ "olhar: esse � o fardo do tiefling. E para completar tudo, os\r\n"
				+ "tieflings sabem que isso � gra�as ao pacto feito gera��es\r\n"
				+ "atr�s que infundiu a ess�ncia de Asmodeus � senhor\r\n"
				+ "supremo dos Nove Infernos � em sua linhagem. Sua\r\n"
				+ "apar�ncia e natureza n�o � culpa deles, mas � o resultado\r\n"
				+ "de um pecado ancestral, pelo qual eles, seus filhos e os\r\n"
				+ "filhos de seus filhos ser�o eternamente responsabilizados.\r\n\n"
				+ "Os tieflings derivam de linhagens humanas e, no sentido\r\n"
				+ "mais amplo poss�vel, eles ainda parecem humanos. No\r\n"
				+ "entanto, sua heran�a infernal deixou tra�os claros na sua\r\n"
				+ "apar�ncia. Tieflings possuem grandes chifres que\r\n"
				+ "possuem os mais diversos formatos: alguns possuem\r\n"
				+ "chifres curvos, como um carneiro, outros possuem chifres\r\n"
				+ "compridos e finos, como uma gazela, e outros chifres\r\n"
				+ "espiralados e alongados, como os de um ant�lope. Eles\r\n"
				+ "possuem uma final calda, com uns 1,20 metro a 1,50\r\n"
				+ "metro de comprimento, que chicoteia ou se enrola em suas\r\n"
				+ "pernas quando ele fica chateado ou nervoso. Seus dentes\r\n"
				+ "caninos s�o afiados e pontiagudos e seus olhos possuem\r\n"
				+ "cores solidas � preto, vermelho, branco, prateado ou\r\n"
				+ "dourado � sem esclera ou pupila vis�veis. Seus tons de\r\n"
				+ "pele abrangem todas as tonalidades da pele humana, mas\r\n"
				+ "tamb�m incluem varia��es de tons vermelho. Seus\r\n"
				+ "cabelos, escorrem atr�s dos seus chifres, geralmente\r\n"
				+ "escuro, de preto ou marrom a vermelho, azul ou roxo\r\n"
				+ "escuro.\r\n"
				+ "TRA�OS RACIAIS DOS TIEFLINGS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Intelig�ncia aumenta em 1 e seu valor de Carisma\r\n"
				+ "aumenta em 2.\r\n"
				+ "Idade. Os tieflings amadurecem ao mesmo tempo que\r\n"
				+ "os humanos, mas vivem alguns anos a mais.\r\n"
				+ "Tend�ncia. Tieflings n�o possuem uma tend�ncia\r\n"
				+ "inata ao mal, mas muitos acabam por abra��-lo. Maligno\r\n"
				+ "ou n�o, uma natureza independente inclina a maioria dos\r\n"
				+ "tieflings ao alinhamento ca�tico.\r\n"
				+ "Tamanho. Os tieflings possuem o mesmo tamanho e\r\n"
				+ "complei��o dos humanos. Seu tamanho � M�dio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "� 9 metros.\r\n"
				+ "Vis�o no Escuro. Gra�as a sua heran�a infernal, voc�\r\n"
				+ "tem uma vis�o superior no escuro e na penumbra. Voc�\r\n"
				+ "enxerga na penumbra a at� 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Voc� n�o\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Resist�ncia Infernal. Voc� possui resist�ncia a dano\r\n"
				+ "de fogo.\r\n"
				+ "Legado Infernal. Voc� conhece o truque\r\n"
				+ "taumaturgia. Quando voc� atingir o 3� n�vel, voc� poder�\r\n"
				+ "conjurar a magia repreens�o infernal como uma magia de\r\n"
				+ "2� n�vel. Quando voc� atingir o 5� n�vel, voc� tamb�m\r\n"
				+ "poder� conjurar a magia escurid�o. Voc� precisa terminar\r\n"
				+ "um descanso longo para poder usar as magias desse tra�o\r\n"
				+ "novamente. Sua habilidade de conjura��o para essas\r\n"
				+ "magias � Carisma.\r\n"
				+ "Idiomas. Voc� sabe falar, ler e escrever Comum e\r\n"
				+ "Infernal.\r\n";
		return tiefling;
	}
	
	public void setTiefling() {
		getFicha().setInteligencia(1);
		getFicha().setCarisma(2);
		getFicha().setDeslocamento("9");
		getFicha().setTracosraciais("Vis�o no Escuro.\n\nGra�as a sua heran�a infernal, voc�\r\n"
				+ "tem uma vis�o superior no escuro e na penumbra. Voc�\r\n"
				+ "enxerga na penumbra a at� 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Voc� n�o\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Infernal");
	}
}

package Races;

import CriadorDeFicha.Classes;

public class Tiefling extends Classes{

	public String tieflingDescricao() {
		String tiefling = "TIEFLING\r\n\n"
				+ "Ser recebido com olhares e cochichos, sofrer violência e\r\n"
				+ "insultos nas ruas, ver a desconfiança e medo em cada\r\n"
				+ "olhar: esse é o fardo do tiefling. E para completar tudo, os\r\n"
				+ "tieflings sabem que isso é graças ao pacto feito gerações\r\n"
				+ "atrás que infundiu a essência de Asmodeus – senhor\r\n"
				+ "supremo dos Nove Infernos – em sua linhagem. Sua\r\n"
				+ "aparência e natureza não é culpa deles, mas é o resultado\r\n"
				+ "de um pecado ancestral, pelo qual eles, seus filhos e os\r\n"
				+ "filhos de seus filhos serão eternamente responsabilizados.\r\n\n"
				+ "Os tieflings derivam de linhagens humanas e, no sentido\r\n"
				+ "mais amplo possível, eles ainda parecem humanos. No\r\n"
				+ "entanto, sua herança infernal deixou traços claros na sua\r\n"
				+ "aparência. Tieflings possuem grandes chifres que\r\n"
				+ "possuem os mais diversos formatos: alguns possuem\r\n"
				+ "chifres curvos, como um carneiro, outros possuem chifres\r\n"
				+ "compridos e finos, como uma gazela, e outros chifres\r\n"
				+ "espiralados e alongados, como os de um antílope. Eles\r\n"
				+ "possuem uma final calda, com uns 1,20 metro a 1,50\r\n"
				+ "metro de comprimento, que chicoteia ou se enrola em suas\r\n"
				+ "pernas quando ele fica chateado ou nervoso. Seus dentes\r\n"
				+ "caninos são afiados e pontiagudos e seus olhos possuem\r\n"
				+ "cores solidas – preto, vermelho, branco, prateado ou\r\n"
				+ "dourado – sem esclera ou pupila visíveis. Seus tons de\r\n"
				+ "pele abrangem todas as tonalidades da pele humana, mas\r\n"
				+ "também incluem variações de tons vermelho. Seus\r\n"
				+ "cabelos, escorrem atrás dos seus chifres, geralmente\r\n"
				+ "escuro, de preto ou marrom a vermelho, azul ou roxo\r\n"
				+ "escuro.\r\n"
				+ "TRAÇOS RACIAIS DOS TIEFLINGS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Inteligência aumenta em 1 e seu valor de Carisma\r\n"
				+ "aumenta em 2.\r\n"
				+ "Idade. Os tieflings amadurecem ao mesmo tempo que\r\n"
				+ "os humanos, mas vivem alguns anos a mais.\r\n"
				+ "Tendência. Tieflings não possuem uma tendência\r\n"
				+ "inata ao mal, mas muitos acabam por abraçá-lo. Maligno\r\n"
				+ "ou não, uma natureza independente inclina a maioria dos\r\n"
				+ "tieflings ao alinhamento caótico.\r\n"
				+ "Tamanho. Os tieflings possuem o mesmo tamanho e\r\n"
				+ "compleição dos humanos. Seu tamanho é Médio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "é 9 metros.\r\n"
				+ "Visão no Escuro. Graças a sua herança infernal, você\r\n"
				+ "tem uma visão superior no escuro e na penumbra. Você\r\n"
				+ "enxerga na penumbra a até 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Você não\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Resistência Infernal. Você possui resistência a dano\r\n"
				+ "de fogo.\r\n"
				+ "Legado Infernal. Você conhece o truque\r\n"
				+ "taumaturgia. Quando você atingir o 3° nível, você poderá\r\n"
				+ "conjurar a magia repreensão infernal como uma magia de\r\n"
				+ "2° nível. Quando você atingir o 5° nível, você também\r\n"
				+ "poderá conjurar a magia escuridão. Você precisa terminar\r\n"
				+ "um descanso longo para poder usar as magias desse traço\r\n"
				+ "novamente. Sua habilidade de conjuração para essas\r\n"
				+ "magias é Carisma.\r\n"
				+ "Idiomas. Você sabe falar, ler e escrever Comum e\r\n"
				+ "Infernal.\r\n";
		return tiefling;
	}
	
	public void setTiefling() {
		getFicha().setInteligencia(1);
		getFicha().setCarisma(2);
		getFicha().setDeslocamento("9");
		getFicha().setTracosraciais("Visão no Escuro.\n\nGraças a sua herança infernal, você\r\n"
				+ "tem uma visão superior no escuro e na penumbra. Você\r\n"
				+ "enxerga na penumbra a até 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Você não\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Infernal");
	}
}

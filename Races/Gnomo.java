package Races;

import CriadorDeFicha.Classes;

public class Gnomo extends Classes{

	public String gnomoDescricao() {
		String gnomo = "GNOMO\r\n\n"
				+ "A energia e entusiasmo dos gnomos pela vida brilha em\r\n"
				+ "cada pedacinho do seu pequeno corpo. Um gnomo padrão\r\n"
				+ "tem aproximadamente 90 centímetros de altura e pesa\r\n"
				+ "entre 20 e 23 kg. Seus rostos morenos ou bronzeados são\r\n"
				+ "geralmente adornados com largos sorrisos (apesar dos\r\n"
				+ "seus prodigiosos narizes) e seus olhos brilhantes vibram\r\n"
				+ "de emoção. Seus cabelos claros tendem a ser espichados,\r\n"
				+ "como se expressassem o insaciável interesse dos gnomos\r\n"
				+ "em tudo a sua volta.\r\n"
				+ "A personalidade de um gnomo é muito maior que sua\r\n"
				+ "aparência. A barba de um gnomo macho, em contraste\r\n"
				+ "com seu cabelo bagunçado, mantem se perfeitamente\r\n"
				+ "aparada, mas as vezes, tem um bigode estiloso e pontas\r\n"
				+ "curiosas. Apesar da roupa de um gnomo geralmente\r\n"
				+ "possuir tons modestos de terra, ele ostenta bordados,\r\n"
				+ "estampas ou joias reluzentes.\r\n\n"
				+ "TRAÇOS RACIAIS DOS GNOMOS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Inteligência aumenta em 2.\r\n"
				+ "Idade. Gnomos amadurecem a mesma proporção que\r\n"
				+ "os humanos e, a maioria, atinge a idade adulta por volta\r\n"
				+ "dos 40 anos. Eles podem viver entre 350 e 500 anos.\r\n"
				+ "Tendência. Os gnomos geralmente são bons. Os que\r\n"
				+ "tendem para a ordem são sábios, engenheiros,\r\n"
				+ "pesquisadores, escolásticos, investigadores ou inventores.\r\n"
				+ "Os que tendem ao caos são menestréis, engenhoqueiros,\r\n"
				+ "andarilhos ou joalheiros caprichosos. Gnomos são bons de\r\n"
				+ "coração e, até mesmo os trapaceiros entre eles tendem a\r\n"
				+ "ser mais brincalhões que perversos.\r\n"
				+ "Tamanho. Os gnomos tem entre 0,90 e 1,20 metro e\r\n"
				+ "seu peso médio é de 20 kg. Seu tamanho é Pequeno.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "é 7,5 metros.\r\n"
				+ "Visão no Escuro. Acostumado à vida subterrânea,\r\n"
				+ "você tem uma visão superior no escuro e na penumbra.\r\n"
				+ "Você enxerga na penumbra a até 18 metros como se fosse\r\n"
				+ "luz plena, e no escuro como se fosse na penumbra. Você\r\n"
				+ "não pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Esperteza Gnômica. Você possui vantagem em todos\r\n"
				+ "os testes de resistência de Inteligência, Sabedoria e\r\n"
				+ "Carisma contra magia.\r\n"
				+ "Idiomas. Você sabe falar, ler e escrever Comum e\r\n"
				+ "Gnômico. A linguagem Gnômica, que usa o alfabeto Anão,\r\n"
				+ "é conhecida por suas técnicas de dissertação e por seus\r\n"
				+ "catálogos de conhecimento sobre o mundo natural.\r\n"
				+ "Sub-raças. Duas sub-raças de gnomos são\r\n"
				+ "encontradas ao redor dos mundos de D&D: os gnomos da\r\n"
				+ "floresta e os gnomos das rochas. Escolha uma dessas subraças.\r\n";
		return gnomo;
	}
	
	public void setGnomo() {
		getFicha().setInteligencia(2);
		getFicha().setDeslocamento("7,5");
		getFicha().setTracosraciais("Visão no Escuro.\n\nAcostumado à vida subterrânea,\r\n"
				+ "você tem uma visão superior no escuro e na penumbra.\r\n"
				+ "Você enxerga na penumbra a até 18 metros como se fosse\r\n"
				+ "luz plena, e no escuro como se fosse na penumbra. Você\r\n"
				+ "não pode discernir cores no escuro, apenas tons de cinza.\r\n\n");
		getFicha().setTracosraciais("Esperteza Gnômica.\n\nVocê possui vantagem em todos\r\n"
				+ "os testes de resistência de Inteligência, Sabedoria e\r\n"
				+ "Carisma contra magia.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Gnômico");
	}
	
	public String getGnomoDaFloresta() {
		String gnomoDaFloresta = "GNOMO DA FLORESTA\r\n\n"
				+ "Como um gnomo da floresta, você possui um traquejo\r\n"
				+ "natural com ilusões e velocidade e furtividade naturais.\r\n"
				+ "Nos mundos de D&D, gnomos da floresta são raros e\r\n"
				+ "reservados. Eles vivem em comunidades escondidas em\r\n"
				+ "florestas silvestres, usando suas ilusões e truques para se\r\n"
				+ "esconderem das ameaças ou para mascarar sua fuga\r\n"
				+ "antes de serem detectados. Gnomos da floresta tendem a\r\n"
				+ "ser amigáveis com outros povos da floresta espirituosos e\r\n"
				+ "eles tem nos elfos e fadas bondosas como seus mais\r\n"
				+ "importantes aliados. Eles gnomos também fazem amizade\r\n"
				+ "com pequenos animais silvestres e contam com eles para\r\n"
				+ "obter informações sobre ameaças que estejam\r\n"
				+ "perambulando por suas terras.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Destreza aumenta em 1.\r\n"
				+ "Ilusionista Nato. Você conhece o truque ilusão\r\n"
				+ "menor. Inteligência é a sua habilidade usada para\r\n"
				+ "conjurá-la.\r\n"
				+ "Falar com Bestas Pequenas. Através de sons e\r\n"
				+ "gestos, você pode comunicar ideias simples para Bestas\r\n"
				+ "pequenas ou menores. Gnomos da floresta amam os\r\n"
				+ "animais e normalmente possuem esquilos, doninhas,\r\n"
				+ "coelhos, toupeiras, pica-paus e outras criaturas como\r\n"
				+ "amados animais de estimação.\r\n\n";
		return gnomoDaFloresta;
	}
	
	public void setGnomoDaFloresta() {
		getFicha().setDestreza(1);
		//Ilusionista Nato. Você conhece o truque ilusão menor. Inteligência é a sua habilidade usada para conjurá-la.
		getFicha().setTracosraciais("Falar com Bestas Pequenas.\n\nAtravés de sons e\r\n"
				+ "gestos, você pode comunicar ideias simples para Bestas\r\n"
				+ "pequenas ou menores. Gnomos da floresta amam os\r\n"
				+ "animais e normalmente possuem esquilos, doninhas,\r\n"
				+ "coelhos, toupeiras, pica-paus e outras criaturas como\r\n"
				+ "amados animais de estimação.\n\n");
	}
	
	public String getGnomoDasRochas() {
		String gnomoDasRochas = "GNOMO DAS ROCHAS\r\n\n"
				+ "Como um gnomo das rochas, você possui uma\r\n"
				+ "inventividade e resistência naturais acima dos outros\r\n"
				+ "gnomos. A maioria dos gnomos nos mundos de D&D são\r\n"
				+ "gnomos das rochas, incluindo os gnomos engenhoqueiros\r\n"
				+ "do cenário de Dragonlance.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Constituição aumenta em 1.\r\n"
				+ "Conhecimento de Artífice. Toda vez que você fizer\r\n"
				+ "um teste de Inteligência (História) relacionado a itens\r\n"
				+ "mágicos, objetos alquímicos ou mecanismos tecnológicos,\r\n"
				+ "você pode adicionar o dobro do seu bônus de proficiência,\r\n"
				+ "ao invés de qualquer bônus de proficiência que você\r\n"
				+ "normalmente use.\r\n"
				+ "Engenhoqueiro: Você possui proficiência com\r\n"
				+ "ferramentas de artesão (ferramentas de engenhoqueiro).\r\n"
				+ "Usando essas ferramentas, você pode gastar 1 hora e 10\r\n"
				+ "po em materiais para construir um mecanismo Miúdo (CA\r\n"
				+ "5, 1 pv). O mecanismo para de funcionar após 24 horas (a\r\n"
				+ "não ser que você gaste 1 hora reparando-o para manter o\r\n"
				+ "mecanismo funcionando), ou quando você usa sua ação\r\n"
				+ "para desmantelá-lo; nesse momento, você pode recuperar\r\n"
				+ "o material usado para criá-lo. Você pode ter até três\r\n"
				+ "desses mecanismos ativos ao mesmo tempo.\r\n"
				+ "Quando você criar um mecanismo, escolha uma das\r\n"
				+ "seguintes opções:\r\n"
				+ "Brinquedo Mecânico. Esse brinquedo é um animal,\r\n"
				+ "monstro ou pessoa mecânica, como um sapo, rato,\r\n"
				+ "pássaro, dragão ou soldado. Quando colocado no chão,\r\n"
				+ "o brinquedo se move 1,5 metro pelo chão em cada um\r\n"
				+ "dos seus turnos em uma direção aleatória. Ele faz\r\n"
				+ "barulhos apropriados a criatura que ele representa.\r\n"
				+ "Isqueiro Mecânico. O mecanismo produz uma\r\n"
				+ "miniatura de chama, que você pode usar para\r\n"
				+ "acender uma vela, tocha ou fogueira. Usar o\r\n"
				+ "mecanismo requer sua ação.\r\n"
				+ "Caixa de Música. Quando aberta, essa caixa de\r\n"
				+ "música toca uma canção a um volume\r\n"
				+ "moderado. A caixa para de tocar quando alcança\r\n"
				+ "o fim da música ou quando é fechada.\r\n\n";
		return gnomoDasRochas;
	}
	
	public void setGnomoDasRochas() {
		getFicha().setConstituicao(1);
		getFicha().setTracosraciais("Conhecimento de Artífice.\n\nToda vez que você fizer\r\n"
				+ "um teste de Inteligência (História) relacionado a itens\r\n"
				+ "mágicos, objetos alquímicos ou mecanismos tecnológicos,\r\n"
				+ "você pode adicionar o dobro do seu bônus de proficiência,\r\n"
				+ "ao invés de qualquer bônus de proficiência que você\r\n"
				+ "normalmente use.\n\n");
		getFicha().setTracosraciais("Engenhoqueiro.\n\nVocê possui proficiência com\r\n"
				+ "ferramentas de artesão (ferramentas de engenhoqueiro).\r\n"
				+ "Usando essas ferramentas, você pode gastar 1 hora e 10\r\n"
				+ "po em materiais para construir um mecanismo Miúdo (CA\r\n"
				+ "5, 1 pv). O mecanismo para de funcionar após 24 horas (a\r\n"
				+ "não ser que você gaste 1 hora reparando-o para manter o\r\n"
				+ "mecanismo funcionando), ou quando você usa sua ação\r\n"
				+ "para desmantelá-lo; nesse momento, você pode recuperar\r\n"
				+ "o material usado para criá-lo. Você pode ter até três\r\n"
				+ "desses mecanismos ativos ao mesmo tempo.\r\n"
				+ "Quando você criar um mecanismo, escolha uma das\r\n"
				+ "seguintes opções:\r\n\n"
				+ "Brinquedo Mecânico.\nEsse brinquedo é um animal,\r\n"
				+ "monstro ou pessoa mecânica, como um sapo, rato,\r\n"
				+ "pássaro, dragão ou soldado. Quando colocado no chão,\r\n"
				+ "o brinquedo se move 1,5 metro pelo chão em cada um\r\n"
				+ "dos seus turnos em uma direção aleatória. Ele faz\r\n"
				+ "barulhos apropriados a criatura que ele representa.\r\n\n"
				+ "Isqueiro Mecânico.\nO mecanismo produz uma\r\n"
				+ "miniatura de chama, que você pode usar para\r\n"
				+ "acender uma vela, tocha ou fogueira. Usar o\r\n"
				+ "mecanismo requer sua ação.\r\n\n"
				+ "Caixa de Música.\nQuando aberta, essa caixa de\r\n"
				+ "música toca uma canção a um volume\r\n"
				+ "moderado. A caixa para de tocar quando alcança\r\n"
				+ "o fim da música ou quando é fechada.\n\n");
	}
	
}

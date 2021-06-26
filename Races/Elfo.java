package Races;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Elfo extends Classes{

	public String elfoDescricao() {
		String elfo = "Elfo\r\n\n"
				+ "Com a sua graça sobrenatural e seus traços finos, os elfos\r\n"
				+ "parecem assustadoramente belos para os humanos e os\r\n"
				+ "membros de muitas outras raças. Em média, eles são\r\n"
				+ "ligeiramente mais baixos do que os humanos, variando de\r\n"
				+ "pouco menos de 1,50 metro até pouco mais de 1,80 metro\r\n"
				+ "de altura. Eles são mais delgados que os humanos,\r\n"
				+ "pesando entre 50 kg a 72 kg apenas. Os machos e as\r\n"
				+ "fêmeas são quase da mesma altura, mas os machos são\r\n"
				+ "um pouco mais pesados do que as fêmeas.\r\n"
				+ "A coloração da pele dos elfos varia da mesma maneira\r\n"
				+ "que os humanos, e também incluem peles em tons de\r\n"
				+ "cobre, bronze, até o branco-azulado, os cabelos podem ser\r\n"
				+ "de tons verdes ou azuis, e os olhos podem ser como\r\n"
				+ "piscinas douradas ou prateadas. Elfos não possuem pelos\r\n"
				+ "faciais e poucos pelos no corpo. Eles preferem roupas\r\n"
				+ "elegantes em cores brilhantes, e gostam de joias simples,\r\n"
				+ "mas belas.\r\n\n"
				+ "TRAÇOS RACIAIS DOS ELFOS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Destreza aumenta em 2.\r\n"
				+ "Idade. Embora os elfos atinjam a maturidade física\r\n"
				+ "com praticamente a mesma idade dos humanos, a\r\n"
				+ "compreensão élfica da idade adulta vai além da\r\n"
				+ "maturidade física, abrangendo sua experiência sobre o\r\n"
				+ "mundo. Um elfo tipicamente assume a idade adulta e um\r\n"
				+ "nome adulto com cerca de 100 anos de idade e pode viver\r\n"
				+ "750 anos.\r\n"
				+ "Tendência. Elfos amam a liberdade, a diversidade e a\r\n"
				+ "expressão pessoal, então eles inclinam-se forte e\r\n"
				+ "suavemente para aspectos do caos. Eles valorizam e\r\n"
				+ "protegem a liberdade dos outros como a sua própria, e são\r\n"
				+ "geralmente mais bondosos que o contrário. Os drow são\r\n"
				+ "exceção. Seu exílio no Subterrâneo fez deles perversos e\r\n"
				+ "perigosos. Drow são geralmente mais maus que o\r\n"
				+ "contrário.\r\n"
				+ "Tamanho. Elfos medem entre 1,50 a 1,80 metro de\r\n"
				+ "altura e possuem constituição delgada. Seu tamanho é\r\n"
				+ "Médio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "é 9 metros.\r\n"
				+ "Visão no Escuro. Acostumado às florestas\r\n"
				+ "crepusculares e ao céu noturno, você possui uma visão\r\n"
				+ "superior em condições de escuridão e na penumbra. Você\r\n"
				+ "pode enxergar na penumbra a até 18 metros como se fosse\r\n"
				+ "na luz plena, e no escuro como se fosse na penumbra.\r\n"
				+ "Você não pode discernir cores no escuro, apenas tons de\r\n"
				+ "cinza.\r\n"
				+ "Sentidos Aguçados. Você tem proficiência na perícia\r\n"
				+ "Percepção.\r\n"
				+ "Ancestral Feérico. Você tem vantagem nos testes de\r\n"
				+ "resistência para resistir a ser enfeitiçado e magias não\r\n"
				+ "podem colocá-lo para dormir.\r\n"
				+ "Transe. Elfos não precisam dormir. Ao invés disso,\r\n"
				+ "eles meditam profundamente, permanecendo\r\n"
				+ "semiconscientes, durante 4 horas por dia. (A palavra em\r\n"
				+ "idioma comum para tal meditação é \"transe\".) Enquanto\r\n"
				+ "medita, um elfo é capaz de sonhar de certo modo. Esses\r\n"
				+ "sonhos na verdade são exercícios mentais que se tornam\r\n"
				+ "reflexos através de anos de prática. Depois de descansar\r\n"
				+ "dessa forma, você ganha os mesmos benefícios que um\r\n"
				+ "humano depois de 8 horas de sono.\r\n"
				+ "Idiomas. Você pode falar, ler e escrever Comum e\r\n"
				+ "Élfico. O Élfico é um idioma fluido, com entonações sutis e\r\n"
				+ "gramática complexa. A literatura élfica é rica e diversa, e\r\n"
				+ "suas canções e poemas são famosos entre outras raças.\r\n"
				+ "Muitos bardos aprendem essa língua para que possam\r\n"
				+ "adicionar canções élficas ao seu repertório.\r\n"
				+ "Sub-raça. Antigas divisões entre os povos élficos\r\n"
				+ "resultaram em três sub-raças principais: os altos elfos, os\r\n"
				+ "elfos da floresta, e os elfos negros, que são comumente\r\n"
				+ "chamados de drow. Escolha uma dessas sub-raças. Em\r\n"
				+ "alguns mundos, essas sub-raças são ainda mais divididas\r\n"
				+ "(como os elfos do sol e elfos da lua nos Reinos Esquecidos),\r\n"
				+ "então se você desejar, você pode escolher uma sub-raça\r\n"
				+ "ainda mais específica.\r\n";
		return elfo;
	}
	
	public void setRacaElfo() {
		getFicha().setRaca("Elfo");
		getFicha().setDestreza(2);
		getFicha().setDeslocamento("9");
		getFicha().setTracosraciais("Visão no Escuro.\n\nAcostumado às florestas\r\n"
				+ "crepusculares e ao céu noturno, você possui uma visão\r\n"
				+ "superior em condições de escuridão e na penumbra. Você\r\n"
				+ "pode enxergar na penumbra a até 18 metros como se fosse\r\n"
				+ "na luz plena, e no escuro como se fosse na penumbra.\r\n"
				+ "Você não pode discernir cores no escuro, apenas tons de\r\n"
				+ "cinza.\n\n");
		getFicha().setTracosraciais("Sentidos Aguçados.\n\nVocê tem proficiência na perícia\r\n"
				+ "Percepção.\n\n");
		getFicha().setTracosraciais("Ancestral Feérico.\n\nVocê tem vantagem nos testes de\r\n"
				+ "resistência para resistir a ser enfeitiçado e magias não\r\n"
				+ "podem colocá-lo para dormir.\r\n\n");
		getFicha().setTracosraciais("Transe.\n\nElfos não precisam dormir. Ao invés disso,\r\n"
				+ "eles meditam profundamente, permanecendo\r\n"
				+ "semiconscientes, durante 4 horas por dia. (A palavra em\r\n"
				+ "idioma comum para tal meditação é \"transe\".) Enquanto\r\n"
				+ "medita, um elfo é capaz de sonhar de certo modo. Esses\r\n"
				+ "sonhos na verdade são exercícios mentais que se tornam\r\n"
				+ "reflexos através de anos de prática. Depois de descansar\r\n"
				+ "dessa forma, você ganha os mesmos benefícios que um\r\n"
				+ "humano depois de 8 horas de sono.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Élfico");
	}
	
	public String getAltoElfo() {
		String altoElfo = "ALTO ELFO\r\n\n"
				+ "Como alto elfo, você possui uma mente afiada e um\r\n"
				+ "domínio da magia básico. Em muitos dos mundos de\r\n"
				+ "D&D, existem dois tipos de altos elfos. Um tipo (que\r\n"
				+ "inclui os elfos cinzentos e elfos do vale de Greyhawk, os\r\n"
				+ "Silvanesti de Dragonlance, e os elfos do sol dos\r\n"
				+ "Reinos Esquecidos) são arrogantes e reclusos,\r\n"
				+ "acreditando serem superiores aos não elfos e até\r\n"
				+ "mesmo a outros elfos. O outro tipo (como os altos\r\n"
				+ "elfos de Greyhawk, os Qualinesti de Dragonlance\r\n"
				+ "e os elfos da lua dos Reinos Esquecidos) são\r\n"
				+ "mais comuns e amigáveis, e muitas vezes\r\n"
				+ "encontrados entre humanos e outras raças.\r\n"
				+ "Os elfos do sol de Faerûn (também chamado de elfos\r\n"
				+ "dourados ou elfos do amanhecer) têm pele bronzeada e\r\n"
				+ "cabelos cor de cobre, negros ou louro dourado. Seus\r\n"
				+ "olhos são dourados, prateados ou negros. Os elfos da\r\n"
				+ "lua (também chamados de elfos de prata ou elfos\r\n"
				+ "cinzentos) são muito mais pálidos, com pele de\r\n"
				+ "alabastro por vezes tingida de azul. Normalmente, eles\r\n"
				+ "têm cabelos de um branco prateado, negros ou azuis,\r\n"
				+ "diversos tons de loiro, castanho e vermelho não são\r\n"
				+ "incomuns. Seus olhos são azuis ou verdes com manchas\r\n"
				+ "douradas.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Inteligência aumenta em 1.\r\n"
				+ "Treinamento Élfico com Armas. Você possui\r\n"
				+ "proficiência com espadas longas, espadas curtas, arcos\r\n"
				+ "longos e arcos curtos.\r\n"
				+ "Truque. Você conhece um truque, à sua escolha, da\r\n"
				+ "lista de truques do mago. Inteligência é a habilidade\r\n"
				+ "usado para conjurar este truque.\r\n"
				+ "Idioma Adicional. Você pode falar, ler e escrever um\r\n"
				+ "idioma adicional à sua escolha.\r\n\n";
		return altoElfo;
	}
	
	public void setAltoElfo() {
		getFicha().setInteligencia(1);
		List<String> proficiencias_equips = Arrays.asList("Espadas longas", "Espadas curtas", "Arcos longos", "Arcos curtos");
		getFicha().setProfi_equips(proficiencias_equips);
	}
	
	public String getElfoDaFloresta() {
		String elfoDaFloresta = "ELFO DA FLORESTA\r\n\n"
				+ "Como um elfo da floresta, você possui sentidos e intuição\r\n"
				+ "aguçados, seus pés ágeis guiam-no rápida e furtivamente\r\n"
				+ "através de suas florestas nativas. Essa categoria inclui os\r\n"
				+ "elfos selvagens (grugach) de Greyhawk e os Kagonesti de\r\n"
				+ "Dragonlance, bem como as raças chamadas de elfos da\r\n"
				+ "floresta em Greyhawk e nos Reinos Esquecidos. Em\r\n"
				+ "Faerûn, os elfos da floresta (também chamados de elfos\r\n"
				+ "selvagens, elfos verdes ou elfos do bosque) são reclusos e\r\n"
				+ "desconfiados dos não elfos.\r\n"
				+ "A pele dos elfos da floresta tende a ser de matiz\r\n"
				+ "cobreada, algumas vezes com traços esverdeados. Seu\r\n"
				+ "cabelo geralmente é castanho ou negro, mas\r\n"
				+ "ocasionalmente podem ser loiros ou cor de cobre. Seus\r\n"
				+ "olhos são verdes, castanhos ou cor de avelã.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Sabedoria aumenta em 1.\r\n"
				+ "Treinamento Élfico com Armas. Você possui\r\n"
				+ "proficiência com espadas longas, espadas curtas, arcos\r\n"
				+ "longos e arcos curtos.\r\n"
				+ "Pés Ligeiros. Seu deslocamento base de caminhada\r\n"
				+ "aumenta para 10,5 metros.\r\n"
				+ "Máscara da Natureza. Você pode tentar se esconder\r\n"
				+ "mesmo quando você está apenas levemente obscurecido\r\n"
				+ "por folhagem, chuva forte, neve caindo, névoa ou outro\r\n"
				+ "fenômeno natural.\r\n\n";
				
				return elfoDaFloresta;
	}
	
	public void setElfoDaFloresta() {
		getFicha().setSabedoria(1);
		List<String> proficiencias_equips = Arrays.asList("Espadas longas", "Espadas curtas", "Arcos longos", "Arcos curtos");
		getFicha().setProfi_equips(proficiencias_equips);
		getFicha().setDeslocamento("10,5");
		getFicha().setTracosraciais("Máscara da Natureza.\n\nVocê pode tentar se esconder\r\n"
				+ "mesmo quando você está apenas levemente obscurecido\r\n"
				+ "por folhagem, chuva forte, neve caindo, névoa ou outro\r\n"
				+ "fenômeno natural.\n");
	}
	
	public String getElfoNegro() {
		String elfoNegro ="ELFO NEGRO(DROW)\r\n\n"
				+ "Descendentes de uma antiga sub-raça de elfos de pele\r\n"
				+ "negra, os drow foram banidos da superfície do mundo por\r\n"
				+ "seguirem a deusa Lolth pelo caminho do mal e corrupção.\r\n"
				+ "Agora, eles construíram sua própria civilização nas\r\n"
				+ "profundezas do Subterrâneo, moldados pelo Caminho de\r\n"
				+ "Lolth. Também conhecidos como elfos negros, os drow\r\n"
				+ "possuem pele negra similar a obsidiana polida e cabelos\r\n"
				+ "brancos opacos ou amarelo pálido. Normalmente eles\r\n"
				+ "possuem olhos muito pálidos (tão pálidos que são\r\n"
				+ "confundidos com olhos brancos) com tons de lilás, prata,\r\n"
				+ "rosa, vermelho e azul. Eles costumam ser menores e mais\r\n"
				+ "magros que a maioria dos elfos.\r\n"
				+ "Aventureiros drow são raros e a raça não existe em\r\n"
				+ "todo o mundo. Verifique com seu Mestre se a raça drow\r\n"
				+ "está disponível como personagem de jogador.\r\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Carisma aumenta em 1.\r\n"
				+ "Visão no Escuro Superior. Sua visão no escuro tem\r\n"
				+ "alcance de 36 metros de raio.\r\n"
				+ "Sensibilidade à Luz Solar. Você possui\r\n"
				+ "desvantagem nas jogadas de ataque e testes de Sabedoria\r\n"
				+ "(Percepção) relacionados a visão quando você, o alvo do\r\n"
				+ "seu ataque, ou qualquer coisa que você está tentando\r\n"
				+ "perceber, esteja sob luz solar direta.\r\n"
				+ "Magia Drow. Você possui o truque globos de luz.\r\n"
				+ "Quando você alcança o 3° nível, você pode conjurar a\r\n"
				+ "magia fogo das fadas. Quando você alcança o 5° nível,\r\n"
				+ "você pode conjurar escuridão. Você precisa terminar um\r\n"
				+ "descanso longo para poder conjurar as magias desse traço\r\n"
				+ "novamente. Carisma é sua habilidade chave para\r\n"
				+ "conjurar essas magias.\r\n"
				+ "Treinamento Drow com Armas. Você possui\r\n"
				+ "proficiência com rapieiras, espadas curtas e bestas de mão.\r\n\n";
		return elfoNegro;
	}
	
	public void setElfoNegro() {
		getFicha().setCarisma(1);
		getFicha().setTracosraciais("Visão no Escuro Superior.\n\nSua visão no escuro tem\r\n"
				+ "alcance de 36 metros de raio.\n\n");
		getFicha().setTracosraciais("Sensibilidade à Luz Solar.\n\nVocê possui\r\n"
				+ "desvantagem nas jogadas de ataque e testes de Sabedoria\r\n"
				+ "(Percepção) relacionados a visão quando você, o alvo do\r\n"
				+ "seu ataque, ou qualquer coisa que você está tentando\r\n"
				+ "perceber, esteja sob luz solar direta.\r\n\n");
		List<String> proficiencias_equips = Arrays.asList("Rapieiras", "Espadas curtas", "Bestas de mão");
		getFicha().setProfi_equips(proficiencias_equips);
	}
	
}

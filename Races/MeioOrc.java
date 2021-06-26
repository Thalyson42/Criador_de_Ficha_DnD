package Races;

import CriadorDeFicha.Classes;

public class MeioOrc extends Classes{

	public String meio_orcDescricao() {
		String meio_orc = "MEIO ORC\r\n\n"
				+ "A pigmentação acinzentada dos meio-orcs, suas testas\r\n"
				+ "avantajadas, mandíbulas salientes, dentes proeminentes\r\n"
				+ "e corpos grandes torna sua herança orc notável para todos\r\n"
				+ "os observadores. Meio-orcs tem entre 1,80 metro e 2,10\r\n"
				+ "metros e, normalmente pesam entre 90 kg e 125 kg.\r\n"
				+ "Orcs ostentam cicatrizes de batalha como peças de\r\n"
				+ "orgulho e consideram cicatrizes ornamentais como coisas\r\n"
				+ "bonitas. Outras cicatrizes, no entanto, marcam um orc ou\r\n"
				+ "meio-orc como um ex-escravo ou um exilado desonrado.\r\n"
				+ "Qualquer meio-orc que tenha vivido entre ou próximo dos\r\n"
				+ "orcs terá cicatrizes, independentemente de serem marcas\r\n"
				+ "de humilhação ou de orgulho, recontando suas façanhas e\r\n"
				+ "ferimentos do passado. Até mesmo um meio-orc que viva\r\n"
				+ "entre os humanos deverá mostrar essas cicatrizes\r\n"
				+ "orgulhosamente ou escondê-las com vergonha.\r\n\n"
				+ "TRAÇOS RACIAIS DOS MEIO ORCS\r\n\n"
				+ "Aumento no Valor de Habilidade. Seu valor de\r\n"
				+ "Força aumenta em 2 e seu valor de Constituição\r\n"
				+ "aumenta em 1.\r\n"
				+ "Idade. Os meio-orcs amadurecem um pouco antes\r\n"
				+ "dos humanos, atingindo a idade adulta aos 14 anos.\r\n"
				+ "Eles envelhecem notavelmente mais rápido e, raramente,\r\n"
				+ "vivem mais de 75 anos.\r\n"
				+ "Tendência. Meio-orcs tem uma tendência inata ao\r\n"
				+ "caos devido aos seus parentes orcs e não são fortemente\r\n"
				+ "inclinados ao bem. Meio-orcs que cresceram entre orcs e\r\n"
				+ "desejam viver e estão dispostos a passar sua vida entre\r\n"
				+ "eles, tendem a ser malignos.\r\n"
				+ "Tamanho. Meio-orcs são de certa forma maiores e\r\n"
				+ "mais largos que os humanos, medindo entre 1,80 metro e\r\n"
				+ "2,10 metros. Seu tamanho é Médio.\r\n"
				+ "Deslocamento. Seu deslocamento base de caminhada\r\n"
				+ "é 9 metros.\r\n"
				+ "Visão no Escuro. Graças ao seu sangue orc, você tem\r\n"
				+ "uma visão superior no escuro e na penumbra. Você\r\n"
				+ "enxerga na penumbra a até 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Você não\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\r\n"
				+ "Ameaçador. Você adquire proficiência na perícia\r\n"
				+ "Intimidação.\r\n"
				+ "Resistência Implacável. Quando você é reduzido a\r\n"
				+ "0 pontos de vida mas não é completamente morto, você\r\n"
				+ "pode voltar para 1 ponto de vida. Você não pode usar essa\r\n"
				+ "característica novamente até completar um descanso\r\n"
				+ "longo.\r\n"
				+ "Ataques Selvagens. Quando você atinge um ataque\r\n"
				+ "crítico com uma arma corpo-a-corpo, você pode rolar um\r\n"
				+ "dos dados de dano da arma mais uma vez e adicioná-lo ao\r\n"
				+ "dano extra causado pelo acerto crítico.\r\n"
				+ "Idiomas. Você sabe falar, ler e escrever Comum, Orc.\r\n"
				+ "O Orc é um idioma ríspido, possuindo uma linguagem de\r\n"
				+ "consoantes duras. Ele não possui alfabeto próprio, mas\r\n"
				+ "usa o alfabeto Anão.\r\n";
		return meio_orc;
	}
	
	public void setMeio_orc() {
		getFicha().setForca(2);
		getFicha().setConstituicao(1);
		getFicha().setDeslocamento("9");
		getFicha().setTracosraciais("Visão no Escuro.\n\nGraças ao seu sangue orc, você tem\r\n"
				+ "uma visão superior no escuro e na penumbra. Você\r\n"
				+ "enxerga na penumbra a até 18 metros como se fosse luz\r\n"
				+ "plena, e no escuro como se fosse na penumbra. Você não\r\n"
				+ "pode discernir cores no escuro, apenas tons de cinza.\r\n\n");
		getFicha().setTem_intimidacao();
		getFicha().setTracosraciais("Resistência Implacável.\n\nQuando você é reduzido a\r\n"
				+ "0 pontos de vida mas não é completamente morto, você\r\n"
				+ "pode voltar para 1 ponto de vida. Você não pode usar essa\r\n"
				+ "característica novamente até completar um descanso longo.\n\n");
		getFicha().setTracosraciais("Ataques Selvagens.\n\nQuando você atinge um ataque\r\n"
				+ "crítico com uma arma corpo-a-corpo, você pode rolar um\r\n"
				+ "dos dados de dano da arma mais uma vez e adicioná-lo ao\r\n"
				+ "dano extra causado pelo acerto crítico.\n\n");
		getFicha().setIdiomas("Comum");
		getFicha().setIdiomas("Orc");
	}
	
}

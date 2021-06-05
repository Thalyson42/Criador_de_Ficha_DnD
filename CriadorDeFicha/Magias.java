package CriadorDeFicha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import br.com.uninassau.jdbc.modelo.FichaDoPersonagem;

public class Magias {
	private FichaDoPersonagem ficha;
	private ArrayList<String> truques = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV1 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV2 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV3 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV4 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV5 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV6 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV7 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV8 = new ArrayList<String>();
	private ArrayList<String> nome_magiaLV9 = new ArrayList<String>();
	private ArrayList<String> descricao_truques = new ArrayList<String>();
	private ArrayList<String> descricao_magias = new ArrayList<String>();
	
	public void setFicha(FichaDoPersonagem ficha) {
		this.ficha = ficha;
	}
	
	public FichaDoPersonagem getFicha() {
		return ficha;
	}
	
	public void setAllTruques() {
		List<String> AllTruques = Arrays.asList("Amizade", "Ataque Certeiro", "Bordão Místico", "Chama Sagrada", "Chicote de Espinhos", "Consertar", "Criar Chamas", "Druidismo", "Espirro Ácido", "Estabilizar", "Globos de Luz", "Ilusão Menor", "Luz", "Mãos Mágicas", "Mensagem", "Orientação", "Prestidigitação", "Proteção contra Lâminas", "Raio de Fogo", "Raio de Gelo", "Rajada de Veneno", "Rajada Mística", "Resistência", "Taumaturgia", "Toque Arrepiante", "Toque Chocante", "Zombaria Viciosa");
		this.truques.addAll(AllTruques);
		List<String> descricao_truques = Arrays.asList(/*Amizade*/ "Pela duração, você terá vantagem em todos os testes de\r\n"
				+ "Carisma direcionados a uma criatura, à sua escolha, que\r\n"
				+ "não seja hostil a você. Quando a magia acabar, a criatura\r\n"
				+ "perceberá que você usou maia para influenciar o humor\r\n"
				+ "dela, e ficará hostil a você. Uma criatura propensa a\r\n"
				+ "violência irá atacar você. Outra criatura pode buscar\r\n"
				+ "outras formas de retaliação (a critério do Mestre),\r\n"
				+ "dependendo da natureza da sua interação com ela.\r\n",
				/*Ataque Certeiro*/"Você estende sua mão e aponta o dedo para um alvo no\r\n"
				+ "alcance. Sua magia garante a você uma breve intuição\r\n"
				+ "sobre as defesas do alvo. No seu próximo turno, você terá\r\n"
				+ "vantagem na primeira jogada de ataque contra o alvo,\r\n"
				+ "considerando que essa magia não tenha acabado.\n",
				/*Bordão Místico*/"A madeira de uma clava ou bordão, que você esteja\r\n"
				+ "segurando, é imbuída com o poder da natureza. Pela\r\n"
				+ "duração, você pode usar sua habilidade de conjuração ao\r\n"
				+ "invés da sua Força para as jogadas de ataque e dano\r\n"
				+ "corpo-a-corpo usando essa arma, e o dado de dano da\r\n"
				+ "arma se torna um d8. A arma também se torna mágica, se\r\n"
				+ "ela já não for. A magia acaba se você conjura-la\r\n"
				+ "novamente ou se você soltar a arma.\n",
				/*Chama Sagrada*/"Radiação similar a uma chama desce sobre uma criatura\r\n"
				+ "que você possa ver, dentro do alcance. O alvo deve ser\r\n"
				+ "bem sucedido num teste de resistência de Destreza ou\r\n"
				+ "sofrerá 1d8 de dano radiante. O alvo não recebe qualquer\r\n"
				+ "benefício de cobertura contra esse teste de resistência.\r\n"
				+ "O dano da magia aumenta em 1d8 quando você\r\n"
				+ "alcança o 5° nível (2d8), 11° nível (3d8) e 17° nível (4d8).\n",
				/*Chicote de Espinhos*/"Você cria um longo chicote de vinhas coberto por espinhos\r\n"
				+ "que chicoteia, ao seu comando, em direção de uma\r\n"
				+ "criatura dentro do alcance. Realize um ataque corpo-acorpo com magia contra o alvo. Se o ataque atingir, a\r\n"
				+ "criatura sofrerá 1d6 de dano perfurante e, se a criatura\r\n"
				+ "for Grande ou menor, você a puxa até 3 metros para perto\r\n"
				+ "de você.\r\n"
				+ "O dano dessa magia aumenta em 1d6 quando você\r\n"
				+ "alcança o 5° nível (2d6), 11° nível (3d6) e 17° nível (4d6).",
				/*Consertar*/"Essa magia repara um única quebra ou fissura em um\r\n"
				+ "objeto que você tocar, como um elo quebrado de uma\r\n"
				+ "corrente, duas metades de uma chave partida, um manto\r\n"
				+ "rasgado ou o vazamento em um odre. Contanto que a\r\n"
				+ "quebra ou fissura não tenha mais de 30 centímetros em\r\n"
				+ "qualquer dimensão, você pode remenda-la, não deixando\r\n"
				+ "qualquer vestígio do dano anterior.\r\n"
				+ "Essa magia pode reparar fisicamente um item mágico\r\n"
				+ "ou constructo, mas a magia não irá restaurar a magia em\r\n"
				+ "tais objetos.\r\n",
				/*Criar Chamas*/"Uma chama tremulante aparece na sua mão. A chama\r\n"
				+ "permanece ai pela duração e não machuca nem você nem\r\n"
				+ "seu equipamento. A chama emite luz plena num raio de 3\r\n"
				+ "metros e penumbra por 3 metros adicionais. A magia\r\n"
				+ "acaba se você dissipa-la usando uma ação ou se conjura-la\r\n"
				+ "novamente.\r\n"
				+ "Você pode, também, atacar com a chama, no entanto,\r\n"
				+ "fazer isso acaba com a magia. Quando você conjura essa\r\n"
				+ "magia ou com uma ação em um turno posterior, você pode\r\n"
				+ "arremessar a chama numa criatura a até 9 metros de\r\n"
				+ "você. Faça um ataque à distância com magia. Se atingir, o\r\n"
				+ "alvo sofre 1d8 de dano de fogo.\r\n"
				+ "O dano dessa magia aumenta em 1d8 quando você\r\n"
				+ "alcança o 5° nível (2d8), 11° nível (3d8) e 17° nível (4d8).\n",
				/*Druidismo*/"Sussurrando para os espíritos da natureza, você cria um\r\n"
				+ "dos seguintes efeitos, dentro do alcance:\r\n"
				+ "- Você cria um efeito sensorial minúsculo e inofensivo\r\n"
				+ "que prevê como será o clima na sua localização pelas\r\n"
				+ "próximas 24 horas. O efeito deve se manifestar como\r\n"
				+ "um globo dourado para céu claro, uma nuvem para\r\n"
				+ "chuva, flocos de neve para nevasca e assim por diante.\r\n"
				+ "Esse efeito persiste por 1 rodada.\r\n"
				+ "- Você faz uma flor florescer, uma semente brotar ou um\r\n"
				+ "folha amadurecer, instantaneamente.\r\n"
				+ "- Você cria um efeito sensorial inofensivo instantâneo,\r\n"
				+ "como folhas caindo, um sopro de vento, o som de um\r\n"
				+ "pequeno animal ou o suave odor de um repolho. O\r\n"
				+ "efeito deve caber num cubo de 1,5 metro.\r\n"
				+ "- Você, instantaneamente, acennde ou apaga uma vela,\r\n"
				+ "tocha ou fogueira pequena.\r\n",
				/*Espirro Ácido*/"Você arremessa uma bolha de ácido. Escolha uma\r\n"
				+ "criatura dentro do alcance, ou escolha duas criaturas\r\n"
				+ "dentro do alcance que estejam a 1,5 metro uma da outra.\r\n"
				+ "Um alvo deve ser bem sucedido num teste de resistência\r\n"
				+ "de Destreza ou sofrerá 1d6 de dano ácido.\r\n"
				+ "O dano dessa magia aumenta em 1d6 quando você\r\n"
				+ "alcança o 5° nível (2d6), 11° nível (3d6) e 17° nível (4d6).\n",
				/*Estabilizar*/"Você toca uma criatura viva que esteja com 0 pontos de\r\n"
				+ "vida. A criatura é estabilizada. Essa magia não afeta\r\n"
				+ "mortos-vivos ou constructos.\r\n",
				/*Globos de Luz*/"Você cria até quatro luzes do tamanho de tochas dentro\r\n"
				+ "do alcance, fazendo-as parecerem tochas, lanternas ou\r\n"
				+ "esferas luminosas que flutuam no ar pela duração. Você\r\n"
				+ "também pode combinar as quatro luzes em uma forma\r\n"
				+ "luminosa, vagamente humanoide, de tamanho Médio.\r\n"
				+ "Qualquer que seja a forma que você escolher, cada luz\r\n"
				+ "produz penumbra num raio de 3 metros.\r\n"
				+ "Com uma ação bônus, no seu turno, você pode mover\r\n"
				+ "as luzes, até 18 metros, para um novo local dentro do\r\n"
				+ "alcance. Uma luz deve estar a, pelo menos, 6 metros de\r\n"
				+ "outra luz criada por essa magia e uma luz some se\r\n"
				+ "exceder o alcance da magia.\n",
				/*Ilusão Menor*/"Você cria um som ou uma imagem de um objeto, dentro\r\n"
				+ "do alcance, que permanece pela duração. A ilusão também\r\n"
				+ "termina se você dissipa-la usando uma ação ou conjurar\r\n"
				+ "essa magia novamente.\r\n"
				+ "Se você criar um som, seu volume pode variar entre\r\n"
				+ "um sussurro até um grito. Pode ser a sua voz, a voz de\r\n"
				+ "outrem, o rugido de um leão, batidas de tambor ou\r\n"
				+ "qualquer outro som que você quiser. O som permanece no\r\n"
				+ "mesmo volume durante toda duração ou você pode fazer\r\n"
				+ "sons distintos em momentos diferentes, antes da magia\r\n"
				+ "acabar.\r\n"
				+ "Se você criar uma imagem de um objeto – como uma\r\n"
				+ "cadeira, pegadas de lama ou um pequeno baú – ela não\r\n"
				+ "pode ter mais de 1,5 metro cúbico. A imagem não pode\r\n"
				+ "produzir som, luz, cheiro ou qualquer outro efeito\r\n"
				+ "sensorial. Interação física com a imagem revelará que ela\r\n"
				+ "é uma ilusão, já que as coisas podem atravessa-la.\r\n"
				+ "Se uma criatura usar sua ação para examinar a\r\n"
				+ "imagem, ela pode determinar que ela é uma ilusão se\r\n"
				+ "obtiver sucesso num teste de Inteligência (Investigação)\r\n"
				+ "contra a CD da magia. Se uma criatura discernir a ilusão\r\n"
				+ "como sendo isso, a ilusão se tornará suave para a\r\n"
				+ "criatura.\n",
				/*Luz*/"Você toca um objeto que não tenha mais 3 metros em\r\n"
				+ "qualquer dimensão. Até a magia acabar, o objeto emite\r\n"
				+ "luz plena num raio de 6 metros e penumbra por 6 metros\r\n"
				+ "adicionais. Cobrir o objeto completamente com alguma\r\n"
				+ "coisa opaca bloqueará a luz. A magia termina se você\r\n"
				+ "conjura-la novamente ou dissipa-la com uma ação.\r\n"
				+ "Se você tentar afetar um objeto segurado ou vestido\r\n"
				+ "por uma criatura hostil, a criatura deve ser bem sucedida\r\n"
				+ "num teste de Destreza para evitar a magia.\r\n",
				/*Mãos Mágicas*/"Uma mão espectral flutuante aparece num ponto, à sua\r\n"
				+ "escolha, dentro do alcance. A mão permanece pela\r\n"
				+ "duração ou até você dissipa-la com uma ação. A mão some\r\n"
				+ "se estiver a mais de 9 metros de você ou se você conjurar\r\n"
				+ "essa magia novamente.\r\n"
				+ "Você pode usar sua ação para controlar a mão. Você\r\n"
				+ "pode usar a mão para manipular um objeto, abrir uma\r\n"
				+ "porta ou recipiente destrancado, guardar ou pegar um\r\n"
				+ "item de um recipiente aberto ou derramar o conteúdo de\r\n"
				+ "um frasco. Você pode mover a mão até 9 metros a cada\r\n"
				+ "vez que a usa.\r\n"
				+ "A mão não pode atacar, ativar itens mágicos ou\r\n"
				+ "carregar mais de 5 quilos.\r\n",
				/*Mensagem*/"Você aponta seu dedo para uma criatura dentro do\r\n"
				+ "alcance e sussurra uma mensagem. O alvo (e apenas ele)\r\n"
				+ "ouvi a mensagem e pode responder com um sussurro que\r\n"
				+ "apenas você pode ouvir.\r\n"
				+ "Você pode conjurar essa magia através de objetos\r\n"
				+ "sólidos se você tiver familiaridade com o alvo. Silêncio\r\n"
				+ "mágico, 30 centímetros de rocha, 2,5 centímetros de metal\r\n"
				+ "comum, uma fina camada de chumbo, ou 90 centímetros\r\n"
				+ "de madeira ou terra bloqueiam a magia. A magia não\r\n"
				+ "precisa seguir uma linha reta e pode viajar livremente,\r\n"
				+ "dobrando esquinas ou através de aberturas.\n",
				/*Orientação*/"Você toca uma criatura voluntária. Uma vez, antes da\r\n"
				+ "magia acabar, o alvo pode rolar um d4 e adicionar o\r\n"
				+ "número rolado a um teste de habilidade a escolha dele.\r\n"
				+ "Ele pode rolar o dado antes ou depois de realizar o teste\r\n"
				+ "de habilidade. Após isso, a magia termina.\r\n",
				/*Prestidigitação*/"Essa magia é um truque mágico simples que conjuradores\r\n"
				+ "iniciantes usam para praticar. Você cria um dos seguintes\r\n"
				+ "efeitos mágicos dentro do alcance:\r\n"
				+ "- Você cria, instantaneamente, um efeito sensorial\r\n"
				+ "inofensivo, como uma chuva de faíscas, um sopro de\r\n"
				+ "vento, notas musicais suaves ou um odor estranho.\r\n"
				+ "- Você, instantaneamente, acende ou apaga uma vela,\r\n"
				+ "uma tocha ou uma pequena fogueira.\r\n"
				+ "- Você, instantaneamente, limpa ou suja um objeto de\r\n"
				+ "até 1 metro cúbico.\r\n"
				+ "- Você esfria, esquenta ou melhora o sabor de até 1\r\n"
				+ "metro cubico de matéria inorgânica por 1 hora.\r\n"
				+ "- Você faz uma cor, uma pequena marca ou um símbolo\r\n"
				+ "aparecer em um objeto ou superfície por 1 hora.\r\n"
				+ "- Você cria uma bugiganga não-mágica ou uma imagem\r\n"
				+ "ilusória que caiba na sua mão e que dura até o final do\r\n"
				+ "seu próximo turno.\r\n"
				+ "Se você conjurar essa magia diversas vezes, você pode\r\n"
				+ "ter até três dos seus efeitos não-instantâneos ativos, ao\r\n"
				+ "mesmo tempo, e você pode dissipar um desses efeitos com\r\n"
				+ "uma ação.\n",
				/*Proteção contra Lâminas*/"Você estende suas mãos e desenha um símbolo de\r\n"
				+ "proteção no ar. Até o final do seu próximo turno, você terá\r\n"
				+ "resistência contra dano de concussão, cortante e\r\n"
				+ "perfurante causado por ataques com armas.\n",
				/*Raio de Fogo*/"Você arremessa um cisco de fogo em uma criatura ou\r\n"
				+ "objeto dentro do alcance. Faça um ataque à distância com\r\n"
				+ "magia contra o alvo. Se atingir, o alvo sofre 1d10 de dano\r\n"
				+ "de fogo. Um objeto inflamável atingido por essa magia,\r\n"
				+ "incendeia se não estiver sendo vestido ou carregado.\r\n"
				+ "O dano dessa magia aumenta em 1d10 quando você\r\n"
				+ "alcança o 5° nível (2d10), 11° nível (3d10) e 17° nível\r\n"
				+ "(4d10).\r\n",
				/*Raio de Gelo*/"Um raio frigido de luz azul clara parte em direção de uma\r\n"
				+ "criatura, dentro do alcance. Realize um ataque à\r\n"
				+ "distância com magia contra o alvo. Se atingir, ele sofre\r\n"
				+ "1d8 de dano de frio e seu deslocamento é reduzido em 3\r\n"
				+ "metros até o começo do seu próximo turno.\r\n"
				+ "O dano da magia aumenta em 1d8 quando você\r\n"
				+ "alcança o 5° nível (2d8), 11° nível (3d8) e 17° nível (4d8).\n",
				/*Rajada de Veneno*/"Você ergue sua mão em direção de uma criatura que você\r\n"
				+ "possa ver, dentro do alcance e projeta um sopro de gás\r\n"
				+ "tóxico da sua palma. A criatura deve ser bem sucedida\r\n"
				+ "num teste de resistência de Constituição ou sofrerá 1d12\r\n"
				+ "de dano de veneno.\r\n"
				+ "O dano dessa magia aumenta em 1d12 quando você\r\n"
				+ "alcança o 5° nível (2d12), 11° nível (3d12) e 17° nível\r\n"
				+ "(4d12).\n",
				/*Rajada Mística*/"Um feixe de energia crepitante vai em direção a uma\r\n"
				+ "criatura dentro do alcance. Realize uma jogada de ataque\r\n"
				+ "à distância com magia contra o alvo. Se atingir, o alvo\r\n"
				+ "sofre 1d10 de dano de energia.\r\n"
				+ "A magia cria mais de um feixe quando você alcança\r\n"
				+ "níveis elevados: dois feixes no 5° nível, três feixes no 11°\r\n"
				+ "nível e quatro feixes no 17° nível. Você pode direcionar os\r\n"
				+ "feixes para o mesmo alvo ou para alvos diferentes. Realize\r\n"
				+ "jogadas de ataque separadas para cada feixe.\n",
				/*Resistência*/"Você toca uma criatura voluntária. Uma vez, antes da\r\n"
				+ "magia acabar, o alvo pode rolar um d4 e adicionar o valor\r\n"
				+ "jogado a um teste de resistência de sua escolha. Ele pode\r\n"
				+ "rolar o dado antes ou depois de realizar o teste de\r\n"
				+ "resistência. Então, a magia termina.\r\n",
				/*Taumaturgia*/"Você manifesta pequenas maravilhas, um sinal de poder\r\n"
				+ "sobrenatural, dentro do alcance. Você cria um dos\r\n"
				+ "seguintes efeitos mágicos dentro do alcance:\r\n"
				+ "- Sua voz ressoa com o triplo do volume normal por 1\r\n"
				+ "minuto.\r\n"
				+ "- Você provoca tremores inofensivos no solo por 1\r\n"
				+ "minuto.\r\n"
				+ "- Você cria, instantaneamente, um som que se origina\r\n"
				+ "de um ponto, à sua escolha, dentro do alcance, como o\r\n"
				+ "barulho de um trovão, o gralhar de um corvo ou\r\n"
				+ "sussurros sinistros.\r\n"
				+ "- Você, instantaneamente, faz uma porta ou janela\r\n"
				+ "destrancada se abrir ou se fechar.\r\n"
				+ "- Você altera a aparência dos seus olhos por 1 minuto.\r\n"
				+ "Se você conjurar essa magia diversas vezes, você pode\r\n"
				+ "ter até três dos efeitos de 1 minuto ativos por vez, e você\r\n"
				+ "pode dissipar um desses efeitos com uma ação.\r\n",
				/*Toque Arrepiante*/"Você cria uma mão esquelética fantasmagórica no espaço\r\n"
				+ "de uma criatura, dentro do alcance. Realize um ataque à\r\n"
				+ "distância com magia contra a criatura para afeta-la com o\r\n"
				+ "frio sepulcral. Se atingir, a criatura sofre 1d8 de dano\r\n"
				+ "necrótico e não poderá recuperar pontos de vida até o\r\n"
				+ "início do seu próximo turno. Até lá, a mão ficará presa ao\r\n"
				+ "alvo.\r\n"
				+ "Se você atingir um alvo morto-vivo, ele terá\r\n"
				+ "desvantagem nas jogadas de ataque contra você até o\r\n"
				+ "final do seu próximo turno.\r\n"
				+ "O dano dessa magia aumenta em 1d8 quando você\r\n"
				+ "alcança o 5° nível (2d8), 11° nível (3d8) e 17° nível (4d8).\n",
				/*Toque Chocante*/"Eletricidade surge da sua mão para transmitir um choque\r\n"
				+ "em uma criatura que você tentar tocar. Faça um ataque\r\n"
				+ "corpo-a-corpo com magia contra o alvo. Você tem\r\n"
				+ "vantagem na jogada de ataque se o alvo estiver vestindo\r\n"
				+ "qualquer armadura de metal. Se atingir, o alvo sofre 1d8\r\n"
				+ "de dano elétrico e não pode usar reações até o início do\r\n"
				+ "próximo turno dele.\r\n"
				+ "O dano da magia aumenta em 1d8 quando você\r\n"
				+ "alcança o 5° nível (2d8), 11° nível (3d8) e 17° nível (4d8).\r\n",
				/*Zombaria Viciosa*/"Você libera uma série de insultos atados com\r\n"
				+ "encantamentos sutis numa criatura que você possa ver,\r\n"
				+ "dentro do alcance. Se o alvo puder ouvir você (apesar de\r\n"
				+ "não precisar compreende-lo), ele deve ser bem sucedido\r\n"
				+ "num teste de resistência de Sabedoria ou sofrerá 1d4 de\r\n"
				+ "dano psíquico e terá desvantagem na próxima jogada de\r\n"
				+ "ataque que ele fizer antes do final do próximo turno dele.\r\n"
				+ "O dano dessa magia aumenta em 1d4 quando você\r\n"
				+ "alcança o 5° nível (2d4), 11° nível (3d4) e 17° nível (4d4).\r\n");
		this.descricao_truques.addAll(descricao_truques);
	}
	
	//Alterar futuramente
	public void truquesBardo() {
		List<String> truquesBardo = Arrays.asList("Amizade", "Ataque Certeiro", "Consertar", "Globos de Luz", "Ilusão Menor", "Luz", "Mãos Mágicas", "Mensagem", "Prestidigitação", "Proteção contra Lâminas", "Zombaria Viciosa");
		setTruques(truquesBardo, 2);
	}
	
	public void truquesBruxo() {
		List<String> truquesBruxo = Arrays.asList("Amizade", "Ataque Certeiro", "Ilusão Menor", "Mãos Mágicas", "Prestidigitação", "Proteção contra Lâminas", "Rajada de Veneno", "Rajada Mística", "Toque Arrepiante");
		setTruques(truquesBruxo, 2);
	}
	
	public void truquesClerigo() {
		List<String> truquesClerigo = Arrays.asList("Chama Sagrada", "Consertar", "Estabilidade", "Luz", "Orientação", "Resistência", "Taumaturgia");
		setTruques(truquesClerigo, 3);
	}
	
	public void truquesDruida() {
		List<String> truquesDruida = Arrays.asList("Bordão Místico", "Chicote de Espinhos", "Consertar", "Criar Chamas", "Druidismo", "Orientação", "Rajada de Veneno", "Resistência");
		setTruques(truquesDruida, 2);
	}
	
	public void truquesFeiticeiro() {
		List<String> truquesFeiticeiro = Arrays.asList("Amizade", "Ataque Certeiro", "Consertar", "Espirro Ácido", "Globos de Luz", "Ilusão Menor", "Luz", "Mãos Mágicas", "Mensagem", "Prestidigitação", "Proteção contra Lâminas", "Raio de Fogo", "Raio de Gelo", "Rajada de Veneno", "Toque Arrepiante", "Toque Chocante");
		setTruques(truquesFeiticeiro, 4);
	}
	
	public void truquesMago() {
		List<String> truquesMago = Arrays.asList("Amizade", "Ataque Certeiro", "Consertar", "Espirro Ácido", "Globos de Luz", "Ilusão Menor", "Luz", "Mãos Mágicas", "Mensagem", "Prestidigitação", "Proteção contra Lâminas", "Raio de Fogo", "Raio de Gelo", "Rajada de Veneno", "Toque Arrepiante", "Toque Chocante");
		setTruques(truquesMago, 3);
	}
	

	public void setTruques(List<String> truque, int c) {
		setAllTruques();
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> listaTruques = new ArrayList<String>();
		listaTruques.addAll(truque);
		ArrayList<String> truquesEscolhidos = new ArrayList<String>();
		
		int opcao;
		int count = c;
		while(count != 0) {
			System.out.println("Escolha " +count +" truques:");
			for(int i = 0; i < listaTruques.size(); i++) {
				System.out.println(i +" - " +listaTruques.get(i));
			}
			
			do {
				while(!entrada.hasNextInt()) {
					System.out.println("Digite um numero!");
					entrada.next();
				}
				
				opcao = entrada.nextInt();
			}while(opcao < 0 || opcao > listaTruques.size());
			
			char decisao;
			boolean decisaoLoop = false;
			while(decisaoLoop == false) {
				for(int i = 0; i < truques.size(); i++) {
					if(Objects.equals(listaTruques.get(opcao), this.truques.get(i))) {
						System.out.println(this.descricao_truques.get(i));
					}
				}
				System.out.println("Deseja adicionar " +listaTruques.get(opcao) +"? (Y/N)");
				decisao = entrada.next().charAt(0);
				if(decisao == 'Y' || decisao == 'y') {
					truquesEscolhidos.add(listaTruques.get(opcao));
					listaTruques.remove(opcao);
					count--;
					decisaoLoop = true;
				}else if(decisao == 'N' || decisao == 'n') {
					decisaoLoop = true;
				}
			}

		}
		this.ficha.setTruques(truquesEscolhidos);
	}
	
	public void getTruques() {
		
	}
	
	public void setAllMagiasLV1() {
		List<String> listaMagiasLV1 = Arrays.asList("Alarme", "Área Escorregadia", "Armadura Arcana", "Armadura de Agathys", "Amizade Animal", "Auxílio Divino", "Bênção", "Bom Fruto", "Braços de Hadar", "Bruxaria", "Comando", "Compreender Idiomas", "Constrição", "Convocar Familiar", "Criar ou Destruir Água", "Curar Ferimentos", "Destruição Colérica", "Destruição Lancinante", "Destruição Trovejante", "Detectar Magia", "Detectar o Bem e Mal", "Detectar Veneno e Doença", "Disfarçar-se", "Duelo Compelido", "Enfeitiçar Pessoa", "Escrita Ilusória", "Escudo Arcano", "Escudo da Fé", "Falar com Animais", "Fogo das Fadas", "Golpe Constritor", "Heroísmo", "Identificação", "Imagem Silenciosa", "Infringir Ferimentos", "Leque Cromático", "Mãos Flamejantes", "Marca do Caçador", "Mísseis Mágicos", "Névoa Obscurecente", "Onda Trovejante", "Orbe Cromática", "Queda Suave", "Palavra Curativa", "Passos Longos", "Perdição", "Proteção contra o Bem e Mal", "Purificar Alimentos", "Queda Suave", "Raio Adoecente", "Raio de Bruxa", "Raio Guiador", "Recuo Acelerado", "Repreensão Infernal", "Riso Histérico de Tasha", "Salto", "Santuário", "Saraivada de Espinhos", "Servo Invisível", "Sono", "Sussurros Dissonantes", "Vitalidade Falsa");
		this.nome_magiaLV1.addAll(listaMagiasLV1);
	}
	
	public void setMagiasBardoLV1() {
		List<String> listaMagiasBardoLV1 = Arrays.asList("Amizade Animal", "Compreender Idiomas", "Curar Ferimentos", "Detectar Magia", "Disfarçar-se", "Enfeitiçar Pessoa", "Escrita Ilusória", "Falar com Animais", "Fogo das Fadas", "Heroísmo", "Identificação", "Identificação", "Imagem Silenciosa", "Onda Trovejante", "Queda Suave", "Palavra Curativa", "Passos Longos", "Perdição", "Riso Histérico de Tasha", "Servo Invisível", "Sono", "Sussurros Dissonantes");
		setMagiasLV1(listaMagiasBardoLV1, 4);
	}
	
	public void setMagiasBruxoLV1() {
		List<String> listaMagiasBruxoLV1 = Arrays.asList("Armadura de Agathys", "Braços de Hadar", "Bruxaria", "Compreender Idiomas", "Enfeitiçar Pessoa", "Escrita Ilusória", "Proteção contra o Bem e Mal", "Raio de Bruxa", "Recuo Acelerado", "Repreensão Infernal", "Servo Invisível");
		setMagiasLV1(listaMagiasBruxoLV1, 2);
	}
	
	public void setMagiasClerigoLV1() {
		List<String> listaMagiasClerigoLV1 = Arrays.asList("Bênção", "Comando", "Criar ou Destruir Água", "Curar Ferimentos", "Detectar Magia", "Detectar o Bem e Mal", "Detectar Veneno e Doença", "Escudo da Fé", "Infringir Ferimentos", "Palavra Curativa", "Perdição", "Proteção contra o Bem e Mal", "Purificar Alimentos", "Raio Guiador", "Santuário");
		setMagiasLV1(listaMagiasClerigoLV1, 2);
	}
	
	public void setMagiasDruidaLV1() {
		List<String> listaMagiasDruidaLV1 = Arrays.asList("Amizade Animal", "Bom Fruto", "Constrição", "Criar ou Destruir Água", "Curar Ferimentos", "Detectar Magia", "Detectar Magia", "Detectar Veneno e Doença", "Enfeitiçar Pessoa", "Falar com Animais", "Fogo das Fadas", "Névoa Obscurecente", "Onda Trovejante", "Palavra Curativa", "Passos Longos", "Purificar Alimentos", "Salto");
		setMagiasLV1(listaMagiasDruidaLV1, 2);
	}
	
	public void setMagiasFeiticeiroLV1() {
		List<String> listaMagiasFeiticeiroLV1 = Arrays.asList("Armadura Arcana", "Compreender Idiomas", "Detectar Magia", "Disfarça-se", "Enfeitiçar Pessoa", "Escudo Arcano", "Imagem Silenciosa", "Leque Crómatico", "Mãos Mágicas", "Névoa Obscurecente", "Onda Trovejante", "Orbe Cromática", "Queda suave", "Raio de Bruxa", "Recuo Acelerado", "Sono", "Salto", "Vitalidade Falsa");
		setMagiasLV1(listaMagiasFeiticeiroLV1, 2);
	}
	
	public void setMagiasMagoLV1() {
		List<String> listaMagiasMagoLV1 = Arrays.asList("Alarme", "Área Escorregadia", "Armadura Arcana", "Compreender Idiomas", "Convocar Familiar", "Detectar Magia", "Disco Flutuante de Tenser", "Disfarçar-se", "Enfeitiçar Pessoa", "Escrita Ilusória", "Escudo Arcano", "Identificação", "Imagem Silenciosa", "Leque Cromático", "Mãos Flamejantes", "Mísseis Mágicos", "Névoa Obscurecente", "Onda Trovejante", "Orb Cromática", "Passos Longos", "Proteção contra o Bem e Mal", "Queda Suave", "Raio Adoecente", "Raio de Bruxa", "Recúo Acelerado", "Riso Histérico de Tasha", "Salto", "Servo Invisível", "Sono", "Vitalidade Falsa");
		setMagiasLV1(listaMagiasMagoLV1, 6);
	}
	
	public void setMagiasPaladinoLV1() {
		List<String> listaMagiasPaladinoLV1 = Arrays.asList("Auxílio Divino", "Bênção", "Comando", "Curar Ferimentos", "Destruição Colérica", "Destruição Lancinante", "Destruição Trovejante", "Detectar o Bem e Mal", "Dectetar Magia", "Detectar Veneno e Doença", "Duelo Compelido", "Escudo da Fé", "Heroísmo", "Proteção contra o Bem e Mal", "Purificar Alimentos");
		setMagiasLV1(listaMagiasPaladinoLV1, 2);
	}
	
	public void setMagiasPatrulheiro() {
		List<String> listaMagiasPatrulheiroLV1 = Arrays.asList("Alarme", "Amizade Animal", "Bom Fruto", "Curar Ferimentos", "Detectar Magia", "Detectar Veneno e Doença", "Falar com Animais", "Golpe Constritor", "Marca do Caçador", "Névoa Obscurecente", "Passos Longos", "Salto", "Saraivada de Espinhos");
		setMagiasLV1(listaMagiasPatrulheiroLV1, 2);
	}
	
	public void setMagiasLV1(List<String> magias, int c) {
		setAllMagiasLV1();
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> listaMagiasLV1 = new ArrayList<String>();
		listaMagiasLV1.addAll(magias);
		ArrayList<String> magiasLV1Escolhidas = new ArrayList<String>();
		
		int opcao;
		int count = c;
		while(count != 0) {
			System.out.println("Escolha " +count +" truques:");
			for(int i = 0; i < listaMagiasLV1.size(); i++) {
				System.out.println(i +" - " +listaMagiasLV1.get(i));
			}
			
			do {
				while(!entrada.hasNextInt()) {
					System.out.println("Digite um numero!");
					entrada.next();
				}
				
				opcao = entrada.nextInt();
			}while(opcao < 0 || opcao > listaMagiasLV1.size());
			
			char decisao;
			boolean decisaoLoop = false;
			while(decisaoLoop == false) {
				for(int i = 0; i < nome_magiaLV1.size(); i++) {
					if(Objects.equals(listaMagiasLV1.get(opcao), this.nome_magiaLV1.get(i))) {
						System.out.println(this.descricao_magias.get(i));
					}
				}
				System.out.println("Deseja adicionar " +listaMagiasLV1.get(opcao) +"? (Y/N)");
				decisao = entrada.next().charAt(0);
				if(decisao == 'Y' || decisao == 'y') {
					magiasLV1Escolhidas.add(listaMagiasLV1.get(opcao));
					listaMagiasLV1.remove(opcao);
					count--;
					decisaoLoop = true;
				}else if(decisao == 'N' || decisao == 'n') {
					decisaoLoop = true;
				}
			}

		}
		this.ficha.setMagiasLV1(magiasLV1Escolhidas);
	}
	
	public void setAllMagiasLV2() {
		List<String> listaMagiasLV2 = Arrays.asList("Acalmar Emoções", "Aprimorar Habilidade", "Arrombar", "Boca Encantada", "Cativar", "Cegueira/Surdez", "Coroa da Loucura", "Esquentar Metal", "Despedaçar", "Força Fantasmagórica", "Detectar Pensamentos", "Imobilizar Pessoas", "Invisibilidade", "Localizar Objeto", "Mensageiro Animal", "Nuvem de Adagas", "Restauração Menor", "Silêncio", "Sugestão", "Ver o Invisível", "Zona da Verdade");
		this.nome_magiaLV2.addAll(listaMagiasLV2);
	}
	
	public void setMagiasBardoLV2() {
		List<String> listaMagiasBardoLV2 = Arrays.asList("Acalmar Emoções", "Aprimorar Habilidade", "Arrombar", "Boca Encantada", "Cativar", "Cegueira/Surdez", "Coroa da Loucura", "Esquentar Metal", "Despedaçar", "Força Fantasmagórica", "Detectar Pensamentos", "Imobilizar Pessoas", "Invisibilidade", "Localizar Objeto", "Mensageiro Animal", "Nuvem de Adagas", "Restauração Menor", "Silêncio", "Sugestão", "Ver o Invisível", "Zona da Verdade");
		
	}
	
	public void setMagiasBruxoLV2() {
		List<String> listaMagiasBardoLV2 = Arrays.asList("Cativar", "Coroa da Loucura", "Despedaçar", "Escuridão", "Imobilizar Pessoa", "Nuvem de Adagas", "Passo Nebuloso", "Patas de Aranha", "Raio do Enfraquecimento", "Reflexos", "Sugestão");
		
	}
	
	public void setMagiasClerigoLV2() {
		List<String> listaMagiasBardoLV2 = Arrays.asList("Acalmar", "Ajuda", "Aprimorar Habilidade", "Arma Esperitual", "Augúrio", "Cegueira/Surdez", "Chama Continua", "Encontrar Armadilhas", "Imobilizar Pessoa", "Localizar Objeto", "Oração", "Curativa", "Proteção contra Veneno", "Repouso Tranquilo", "Restauração Menor", "Silêncio", "Vínculo Protetor", "Zona da Verdade");
	}
	
	public void setMagiaDruidaLV2() {
		List<String> listaMagiaDruidaLV2 = Arrays.asList("Aprimorar Habilidade", "Crescer Espinhos", "Encontrar Armadilhas", "Esfera Flamejante", "Esquentar Metal", "Imobilizar Pessoa", "Lâmina Flamejante", "Localizar Animais ou Plantas", "Localizar Objeto", "Lufada de Vento", "Mensageiro Animal", "Passos sem Pegadas", "Pele de Árvore", "Proteção contra Veneno", "Raio Lunar", "Restauração Menor", "Sentido Bestial", "Visão no Escuro");
	}
	
	//Tiefling Inicio /Verificar para mudanças
	public void setLegadoInfernal() {
		setAllTruques();
		if(this.ficha.getNivel() >= 1) {
			if(verifyTruque("Taumaturgia") == false) this.ficha.setTruques("Taumaturgia");
		}else if(this.ficha.getNivel() >= 3) {
			if(verifyMagia("Repreensão Infernal", 1) == false) this.ficha.setMagiasLV2("Repreensão infernal");
		}else if(this.ficha.getNivel() >= 5) {
			if(verifyMagia("Repreensão Infernal", 2) == false) this.ficha.setMagiasLV2("Escuridão");
		}
	}
	
	public boolean verifyTruque(String truque) {
		for(int i = 0; i > this.ficha.getTruques().size(); i++) {
			if(Objects.equals(truque, this.ficha.getTruques().get(i))) {
				return true;
			}
		}
		return false;
	}
	
	public boolean verifyMagia(String magia, int nivel) {
		switch(nivel) {
		case 1:
			for(int i = 0; i > this.ficha.getMagiasLV1().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV1().get(i))) {
					return true;
				}
			}
		break;
		
		case 2:
			for(int i = 0; i > this.ficha.getMagiasLV2().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV2().get(i))) {
					return true;
				}
			}
		break;
		
		case 3:
			for(int i = 0; i > this.ficha.getMagiasLV3().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV3().get(i))) {
					return true;
				}
			}
		break;
		
		case 4:
			for(int i = 0; i > this.ficha.getMagiasLV4().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV4().get(i))) {
					return true;
				}
			}
		break;
		
		case 5:
			for(int i = 0; i > this.ficha.getMagiasLV5().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV5().get(i))) {
					return true;
				}
			}
		break;
		
		case 6:
			for(int i = 0; i > this.ficha.getMagiasLV6().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV6().get(i))) {
					return true;
				}
			}
		break;
		
		case 7:
			for(int i = 0; i > this.ficha.getMagiasLV7().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV7().get(i))) {
					return true;
				}
			}
		break;
		
		case 8:
			for(int i = 0; i > this.ficha.getMagiasLV8().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV8().get(i))) {
					return true;
				}
			}
		break;
		
		case 9:
			for(int i = 0; i > this.ficha.getMagiasLV9().size(); i++) {
				if(Objects.equals(magia, this.ficha.getMagiasLV9().get(i))) {
					return true;
				}
			}
		break;
		}
		return false;
	}
	//Tiefling Fim
}

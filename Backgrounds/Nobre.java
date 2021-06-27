package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Nobre extends Classes{

	private List<String> tracoNobre = Arrays.asList("Minha bajulação eloquente faz com que todos com quem eu converse se sintam a pessoa mais maravilhosa e importante do mundo.",
			"As pessoas comuns me amam por minha bondade e generosidade.",
			"Ninguém pode duvidar, olhando para o meu porte real, que estou acima das massas plebeias.",
			"Eu tenho grande cuidado de sempre estar no meu melhor e seguir as últimas modas.",
			"Eu não gosto de sujar minhas mãos, e eu não vou ser pego em acomodações inadequadas.",
			"Apesar da minha origem nobre, eu não estou acima dos outros. O sangue é um só.",
			"Meu apoio, uma vez perdido, não volta.",
			"Se você me ferir, eu irei esmagá-lo, arruinar seu nome, e salgar seus campos.");
	
	private List<String> idealNobre = Arrays.asList("Respeito. O respeito a mim é devido por causa da minha posição, mas todas as pessoas, independentemente da posição merecem ser tratados com dignidade. (Bom)",
			"Responsabilidade. É o meu dever respeitar a autoridade daqueles acima de mim, assim como aqueles abaixo de mim devem me respeitar. (Leal)",
			"Independência. Devo provar que posso me cuidar sem os mimos da minha família. (Caótico)",
			"Poder. Se eu puder alcançar mais poder, ninguém vai me dizer o que fazer. (Mau)",
			"Família. O sangue corre mais grosso que a água. (Qualquer)",
			"Obrigação Nobre. É o meu dever proteger e cuidar das pessoas abaixo de mim. (Bom)");
	
	private List<String> vinculoNobre = Arrays.asList("Eu vou encarar qualquer desafio para ganhar a aprovação da minha família.",
			"A aliança da minha casa com outra família nobre deve ser mantida a todo custo.",
			"Nada é mais importante do que os outros membros da minha família.",
			"Eu sou apaixonado pela herdeira de uma família que a minha família despreza.",
			"Minha lealdade ao meu soberano é inabalável.",
			"As pessoas comuns devem me ver como um herói do povo");
	
	private List<String> defeitoNobre = Arrays.asList("Eu secretamente acredito que todos estão abaixo de mim.",
			"Eu escondo um segredo verdadeiramente escandaloso que poderia arruinar minha família para sempre.",
			"Muitas vezes eu ouço insultos e ameaças veladas em cada palavra dirigida a mim, e me irrito muito rápido.",
			"Eu tenho um desejo insaciável por prazeres carnais.",
			"Na verdade, o mundo gira ao meu redor.",
			"Pelas minhas palavras e ações, muitas vezes, envergonho minha família.");
	
	public String getNobre() {
		String descricao = "NOBRE\r\n"
				+ "Você entende de riqueza, poder e privilégios. Você carrega\r\n"
				+ "um título de nobreza, sua família possui terras, coleta\r\n"
				+ "impostos e exerce uma influência política significativa.\r\n"
				+ "Você pode ser um aristocrata mimado pouco familiarizado\r\n"
				+ "com o trabalho ou com o desconforto, um ex-comerciante\r\n"
				+ "elevado à nobreza ou um malandro deserdado com um\r\n"
				+ "sentido desproporcional de direitos. Ou pode ser um dono\r\n"
				+ "de terra honesto e trabalhador que se preocupa com as\r\n"
				+ "pessoas que vivem e trabalham em sua terra, sutilmente\r\n"
				+ "ciente da sua responsabilidade para com eles.\r\n"
				+ "Converse com seu Mestre para chegar a um título\r\n"
				+ "adequado e determinar a quantidade de autoridade esse\r\n"
				+ "título carrega. Um título de nobreza não fica com você – é\r\n"
				+ "conectado a uma família inteira, e qualquer título que\r\n"
				+ "você possuir passará para seus filhos. Você não precisa\r\n"
				+ "determinar seu título de nobreza sozinho, você também\r\n"
				+ "deve conversar com seu Mestre para descrever sua\r\n"
				+ "família e a influência dela sobre você.\r\n"
				+ "Sua família é antiga e estabelecida ou só recentemente\r\n"
				+ "você foi agraciado com seu título? Qual a influência que\r\n"
				+ "sua família exerce e sobre qual área? Que tipo de\r\n"
				+ "reputação sua família tem entre os outros aristocratas da\r\n"
				+ "região? Como as pessoas comuns consideram sua família?\r\n"
				+ "Qual é sua posição na família? Um herdeiro ou chefe\r\n"
				+ "da família? Você já herdou o título? Como você se sente\r\n"
				+ "sobre essa responsabilidade? Você está tão abaixo da\r\n"
				+ "linha de herança que ninguém se importa com o que você\r\n"
				+ "faz, contanto que não envergonhe a família? Como é que o\r\n"
				+ "chefe da família se sente sobre a sua carreira de\r\n"
				+ "aventuras? Você está de bem com a família ou anda\r\n"
				+ "afastado dela?\r\n"
				+ "Sua família tem um brasão de armas? Uma insígnia\r\n"
				+ "que você pode usar em um anel de sinete? Cores\r\n"
				+ "específicas que você usa o tempo todo? Um animal que\r\n"
				+ "você considera como um símbolo de sua linhagem ou um\r\n"
				+ "membro espiritual da família?\r\n"
				+ "Esses detalhes ajudam a estabelecer sua família e seu\r\n"
				+ "título como características do mundo de campanha.\r\n"
				+ "Proficiência em Perícias: História, Persuasão\r\n"
				+ "Proficiência em Ferramentas: Um tipo de kit de jogos\r\n"
				+ "Idiomas: Um à sua escolha\r\n"
				+ "Equipamento: Um conjunto de trajes finos, um anel de\r\n"
				+ "sinete, um pergaminho de linhagem e uma algibeira\r\n"
				+ "contendo 25 po.\r\n";
		
		return descricao;
	}
	
	public void setNobre() {
		getFicha().setAntecedente("Nobre");
		List<String> profPericias = Arrays.asList("História", "Persuasão");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de jogos");
		List<String> equipamentos = Arrays.asList("Conjunto de trajes finos", "Anel de sinete", "Pergaminho de linhagem", "Algibeira 25po");
		getFicha().setEquipamentos(equipamentos);
	}

	public List<String> getTracoNobre() {
		return tracoNobre;
	}

	public List<String> getIdealNobre() {
		return idealNobre;
	}

	public List<String> getVinculoNobre() {
		return vinculoNobre;
	}

	public List<String> getDefeitoNobre() {
		return defeitoNobre;
	}
	
}

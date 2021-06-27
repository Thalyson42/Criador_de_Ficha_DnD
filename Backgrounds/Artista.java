package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Artista extends Classes{

	private List<String> tracoArtista = Arrays.asList("Eu conheço uma história relevante de praticamente todas as situações.",
			"Sempre que eu chego em um lugar novo, eu coleto os rumores locais e espalho fofocas.",
			"Eu sou um romântico incorrigível, sempre em busca daquele \"alguém especial\"",
			"Ninguém fica com raiva de mim ou perto de mim por muito tempo, já que eu posso acabar com qualquer tipo de tensão.",
			"Eu amo um bom insulto, até os direcionados a mim.",
			"Eu fico sentido se eu não for o centro das atenções.",
			"Eu mudo de ânimo ou de pensamento tão rápido quando mudo eu mudo de nota em uma canção.");
	
	private List<String> idealArtista = Arrays.asList("Beleza. Quando eu atuo, eu torno o mundo um lugar melhor. (Bom)",
			"Tradição. As histórias, lendas e canções do passado nunca devem ser esquecidas, pois elas nos ensinam quem nós somo. (Leal)",
			"Criatividade. O mundo precisa de novas ideias e ações ousadas. (Caótico)",
			"Ganância. Eu só estou aqui pelo dinheiro e pela fama. (Mau)",
			"Povo. Eu gosto de ver os sorrisos nos rostos das pessoas quando eu atuo. Isso é tudo que importa. (Neutro)",
			"Honestidade. A arte deve refletir a alma; ela deve vir de dentro e revelar quem realmente somos. (Qualquer)");
	
	private List<String> vinculoArtista = Arrays.asList("Meu instrumento é meu bem mais valioso e ele me lembra de alguém que eu amo.",
			"Alguém roubou meu precioso instrumento e, algum dia, eu vou pegá-lo de volta.",
			"Eu quero ser famoso, custe o que custar.",
			"Eu idolatro um herói dos contos antigos e mensuro meus feitos baseados nessa personalidade.",
			"Eu vou fazer tudo para provar que sou superior ao meu odiado rival.",
			"Eu faria qualquer coisa pelos membros da minha antiga trupe.");
	
	private List<String> defeitoArtista = Arrays.asList("Eu farei de tudo para ganhar fama e renome.",
			"Eu viro um idiota quando vejo um rosto bonito.",
			"Um escândalo me impede de voltar para casa novamente. Esse tipo de problema parece me perseguir por ai.",
			"Eu certa vez, satirizei um nobre que ainda quer minha cabeça. Foi um erro que eu adoraria repetir.",
			"Eu tenho problemas em esconder meu verdadeiros sentimentos. Minha língua afiada me mete em confusão.",
			"Apesar dos meus melhores esforços, meus amigos não me consideram confiável.");
	
	
	public String getArtista() {
		String descricao = "ARTISTA\r\n"
				+ "Você cresce em frente a uma audiência. Você sabe como\r\n"
				+ "fasciná-los, entretê-los e, até mesmo, inspirá-los. Suas\r\n"
				+ "poesias podem avivar o coração daqueles que te ouvem,\r\n"
				+ "despertando tristeza ou alegria, risadas ou ira. Sua\r\n"
				+ "música ergue seus espíritos ou captura suas aflições. Seus\r\n"
				+ "passos de dança cativam, seu humor os extasia\r\n"
				+ "rapidamente. Qualquer que sejam as técnicas que você\r\n"
				+ "use, sua arte é sua vida.\r\n"
				+ "Proficiência em Perícias: Acrobacia, Atuação\r\n"
				+ "Proficiência em Ferramentas: Kit de disfarce, um tipo\r\n"
				+ "de instrumento musical\r\n"
				+ "Equipamento: Um instrumento musical (à sua escolha),\r\n"
				+ "um presente de um admirador (carta de amor, mecha\r\n"
				+ "de cabelo ou uma bijuteria), um traje e uma algibeira\r\n"
				+ "contendo 15 po\r\n";
		return descricao;
	}
	
	public void setArtista() {
		getFicha().setAntecedente("Artista");
		List<String> profPericias = Arrays.asList("Acrobacia", "Atuação");
		getProficiencia().setPericias(profPericias);
		getFicha().setProfi_ferramentas_peri("Kit de disfarce");
//		getFicha().setProfi_ferramentas_peri(getEquips().setInstrumentoMusical());
//		getFicha().setEquipamentos(getEquips().setInstrumentoMusical());
		List<String> equipamentos = Arrays.asList("Presente de um admirador", "Traje", "Algibeira 15 po");
		getFicha().setEquipamentos(equipamentos);
	}

	public List<String> getTracoArtista() {
		return tracoArtista;
	}

	public List<String> getIdealArtista() {
		return idealArtista;
	}

	public List<String> getVinculoArtista() {
		return vinculoArtista;
	}

	public List<String> getDefeitoArtista() {
		return defeitoArtista;
	}
	
}

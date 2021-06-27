package Backgrounds;

import java.util.Arrays;
import java.util.List;

import CriadorDeFicha.Classes;

public class Artista extends Classes{

	private List<String> tracoArtista = Arrays.asList("Eu conhe�o uma hist�ria relevante de praticamente todas as situa��es.",
			"Sempre que eu chego em um lugar novo, eu coleto os rumores locais e espalho fofocas.",
			"Eu sou um rom�ntico incorrig�vel, sempre em busca daquele \"algu�m especial\"",
			"Ningu�m fica com raiva de mim ou perto de mim por muito tempo, j� que eu posso acabar com qualquer tipo de tens�o.",
			"Eu amo um bom insulto, at� os direcionados a mim.",
			"Eu fico sentido se eu n�o for o centro das aten��es.",
			"Eu mudo de �nimo ou de pensamento t�o r�pido quando mudo eu mudo de nota em uma can��o.");
	
	private List<String> idealArtista = Arrays.asList("Beleza. Quando eu atuo, eu torno o mundo um lugar melhor. (Bom)",
			"Tradi��o. As hist�rias, lendas e can��es do passado nunca devem ser esquecidas, pois elas nos ensinam quem n�s somo. (Leal)",
			"Criatividade. O mundo precisa de novas ideias e a��es ousadas. (Ca�tico)",
			"Gan�ncia. Eu s� estou aqui pelo dinheiro e pela fama. (Mau)",
			"Povo. Eu gosto de ver os sorrisos nos rostos das pessoas quando eu atuo. Isso � tudo que importa. (Neutro)",
			"Honestidade. A arte deve refletir a alma; ela deve vir de dentro e revelar quem realmente somos. (Qualquer)");
	
	private List<String> vinculoArtista = Arrays.asList("Meu instrumento � meu bem mais valioso e ele me lembra de algu�m que eu amo.",
			"Algu�m roubou meu precioso instrumento e, algum dia, eu vou peg�-lo de volta.",
			"Eu quero ser famoso, custe o que custar.",
			"Eu idolatro um her�i dos contos antigos e mensuro meus feitos baseados nessa personalidade.",
			"Eu vou fazer tudo para provar que sou superior ao meu odiado rival.",
			"Eu faria qualquer coisa pelos membros da minha antiga trupe.");
	
	private List<String> defeitoArtista = Arrays.asList("Eu farei de tudo para ganhar fama e renome.",
			"Eu viro um idiota quando vejo um rosto bonito.",
			"Um esc�ndalo me impede de voltar para casa novamente. Esse tipo de problema parece me perseguir por ai.",
			"Eu certa vez, satirizei um nobre que ainda quer minha cabe�a. Foi um erro que eu adoraria repetir.",
			"Eu tenho problemas em esconder meu verdadeiros sentimentos. Minha l�ngua afiada me mete em confus�o.",
			"Apesar dos meus melhores esfor�os, meus amigos n�o me consideram confi�vel.");
	
	
	public String getArtista() {
		String descricao = "ARTISTA\r\n"
				+ "Voc� cresce em frente a uma audi�ncia. Voc� sabe como\r\n"
				+ "fascin�-los, entret�-los e, at� mesmo, inspir�-los. Suas\r\n"
				+ "poesias podem avivar o cora��o daqueles que te ouvem,\r\n"
				+ "despertando tristeza ou alegria, risadas ou ira. Sua\r\n"
				+ "m�sica ergue seus esp�ritos ou captura suas afli��es. Seus\r\n"
				+ "passos de dan�a cativam, seu humor os extasia\r\n"
				+ "rapidamente. Qualquer que sejam as t�cnicas que voc�\r\n"
				+ "use, sua arte � sua vida.\r\n"
				+ "Profici�ncia em Per�cias: Acrobacia, Atua��o\r\n"
				+ "Profici�ncia em Ferramentas: Kit de disfarce, um tipo\r\n"
				+ "de instrumento musical\r\n"
				+ "Equipamento: Um instrumento musical (� sua escolha),\r\n"
				+ "um presente de um admirador (carta de amor, mecha\r\n"
				+ "de cabelo ou uma bijuteria), um traje e uma algibeira\r\n"
				+ "contendo 15 po\r\n";
		return descricao;
	}
	
	public void setArtista() {
		getFicha().setAntecedente("Artista");
		List<String> profPericias = Arrays.asList("Acrobacia", "Atua��o");
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

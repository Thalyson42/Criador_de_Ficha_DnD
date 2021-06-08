package CriadorDeFicha;

import br.com.uninassau.jdbc.modelo.FichaDoPersonagem;

public class Classes {
	private static String nome;
	private static FichaDoPersonagem ficha;
	private static Proficiencia proficiencia;
	private static Equipamentos equips;
	private static Magias magias;
	private static Idiomas idiomas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Classes.nome = nome;
	}
	public FichaDoPersonagem getFicha() {
		return ficha;
	}
	public void salvarFicha(FichaDoPersonagem ficha) {
		Classes.ficha = ficha;
	}
	public Proficiencia getProficiencia() {
		return proficiencia;
	}
	public void setProficiencia(Proficiencia proficiencia) {
		Classes.proficiencia = proficiencia;
	}
	public Equipamentos getEquips() {
		return equips;
	}
	public void setEquips(Equipamentos equips) {
		Classes.equips = equips;
	}
	public Magias getMagias() {
		return magias;
	}
	public void setMagias(Magias magias) {
		Classes.magias = magias;
	}
	public Idiomas getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(Idiomas idiomas) {
		Classes.idiomas = idiomas;
	}
	
	
}

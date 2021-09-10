package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.connection.ConnectionFactory;
import jdbc.modelo.Usuario;

public class FichaDoPersonagemDAO {
	private Connection conexao;
	
	public FichaDoPersonagemDAO() throws SQLException {
		this.conexao = ConnectionFactory.createConnection();
	}
	
	public boolean characterAlreadyExist(int idpersonagem) {
		String sql = "SELECT idpersonagem FROM personagem";
		int id = 0;
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			ResultSet rs;
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				id = rs.getInt("idpersonagem");
			}
			
			if(id == idpersonagem) {
				stmt.close();
				return true;
			}
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void salvarPersonagem(Usuario usuario, int pos) {
		String sql = "INSERT INTO personagem (idpersonagem, perfil_idperfil, nome, classe, raca, antecedente, pontos_xp, pontos_vida, nivel, classe_armadura, deslocamento, iniciativa, percepcao_passiva) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		int idpersonagem = usuario.getPersonagem().get(pos).getIdpersonagem();
		
		while(characterAlreadyExist(idpersonagem)) {
			idpersonagem++;
			usuario.getPersonagem().get(pos).setIdpersonagem(idpersonagem);
		}
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setInt(2, usuario.getIDperfil());
			stmt.setString(3, usuario.getPersonagem().get(pos).getNome_personagem());
			stmt.setString(4, usuario.getPersonagem().get(pos).getClasse());
			stmt.setString(5, usuario.getPersonagem().get(pos).getRaca());
			stmt.setString(6, usuario.getPersonagem().get(pos).getAntecedente());
			stmt.setInt(7, usuario.getPersonagem().get(pos).getPontos_vida());
			stmt.setDouble(8, usuario.getPersonagem().get(pos).getExp());
			stmt.setInt(9, usuario.getPersonagem().get(pos).getNivel());
			stmt.setInt(10, usuario.getPersonagem().get(pos).getClasseDeArmadura());
			stmt.setString(11, usuario.getPersonagem().get(pos).getDeslocamento());
			stmt.setString(12, usuario.getPersonagem().get(pos).getIniciativa());
			stmt.setInt(13, usuario.getPersonagem().get(pos).getPercepcao_passiva());
			stmt.execute();
			stmt.close();
		}catch(SQLException msg) {
			msg.printStackTrace();
		}
	}
	
	public void removerPersonagem(Usuario usuario, int pos) {
		String sql = "Delete from personagem WHERE idpersonagem=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarPersonagem(Usuario usuario, int pos) {
		String sql = "Update personagem SET nome=?, classe=?, raca=?, antecedente=?, pontos_xp=?, pontos_vida=?, nivel=?, classe_armadura=?, deslocamento=?, iniciativa=?, percepcao_passiva=? WHERE idpersonagem="+usuario.getPersonagem().get(pos).getIdpersonagem();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getNome_personagem());
			stmt.setString(2, usuario.getPersonagem().get(pos).getClasse());
			stmt.setString(3, usuario.getPersonagem().get(pos).getRaca());
			stmt.setString(4, usuario.getPersonagem().get(pos).getAntecedente());
			stmt.setDouble(5, usuario.getPersonagem().get(pos).getExp());
			stmt.setInt(6, usuario.getPersonagem().get(pos).getPontos_vida());
			stmt.setInt(7, usuario.getPersonagem().get(pos).getNivel());
			stmt.setInt(8, usuario.getPersonagem().get(pos).getClasseDeArmadura());
			stmt.setString(9, usuario.getPersonagem().get(pos).getDeslocamento());
			stmt.setString(10, usuario.getPersonagem().get(pos).getIniciativa());
			stmt.setInt(11, usuario.getPersonagem().get(pos).getPercepcao_passiva());
			stmt.executeUpdate();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarBio(Usuario usuario, int pos) {
		String sql = "INSERT INTO bio (cod, personagem_idpersonagem, idade, tamanho, altura, peso, olhos, pele, cabelo, aparencia_personagem, aliado_organizacoes, historia_personagem, caracteristicas_tracos_add, tesouro) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getBio_cod());
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(3, usuario.getPersonagem().get(pos).getIdade());
			stmt.setString(4, usuario.getPersonagem().get(pos).getTamanho());
			stmt.setString(5, usuario.getPersonagem().get(pos).getAltura());
			stmt.setString(6, usuario.getPersonagem().get(pos).getPeso());
			stmt.setString(7, usuario.getPersonagem().get(pos).getOlhos());
			stmt.setString(8, usuario.getPersonagem().get(pos).getPele());
			stmt.setString(9, usuario.getPersonagem().get(pos).getCabelo());
			stmt.setString(10, usuario.getPersonagem().get(pos).getAparencia_personagem());
			stmt.setString(11, usuario.getPersonagem().get(pos).getAliados_organizacoes());
			stmt.setString(12, usuario.getPersonagem().get(pos).getHistoria_personagem());
			stmt.setString(13, usuario.getPersonagem().get(pos).getCaracteristicas_tracos_adicionais());
			stmt.setString(14, usuario.getPersonagem().get(pos).getTesouro());
			stmt.execute();
			stmt.close();
			
		} catch (SQLException msg) {
			msg.printStackTrace();
		}
	}
	
	public void removerBio(Usuario usuario, int pos) {
		String sql = "Delete from bio WHERE cod=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getBio_cod());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarBio(Usuario usuario, int pos) {
		String sql = "Update bio SET idade=?, tamanho=?, altura=?, peso=?, olhos=?, pele=?, cabelo=?, aparencia_personagem=?, aliado_organizacoes=?,"
				+ " historia_personagem=?, caracteristicas_tracos_add=?, tesouro=? WHERE cod="+usuario.getPersonagem().get(pos).getBio_cod();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getIdade());
			stmt.setString(2, usuario.getPersonagem().get(pos).getTamanho());
			stmt.setString(3, usuario.getPersonagem().get(pos).getAltura());
			stmt.setString(4, usuario.getPersonagem().get(pos).getPeso());
			stmt.setString(5, usuario.getPersonagem().get(pos).getOlhos());
			stmt.setString(6, usuario.getPersonagem().get(pos).getPele());
			stmt.setString(7, usuario.getPersonagem().get(pos).getCabelo());
			stmt.setString(8, usuario.getPersonagem().get(pos).getAparencia_personagem());
			stmt.setString(9, usuario.getPersonagem().get(pos).getAliados_organizacoes());
			stmt.setString(10, usuario.getPersonagem().get(pos).getHistoria_personagem());
			stmt.setString(11, usuario.getPersonagem().get(pos).getCaracteristicas_tracos_adicionais());
			stmt.setString(12, usuario.getPersonagem().get(pos).getTesouro());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarMagias(Usuario usuario, int pos) {
		String sql = "INSERT INTO magias (idmagias, personagem_idpersonagem, cd_resistencia_magia, bonus_ataque_magia, habilidade_conjuracao) values (?,?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdMagias());
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setInt(3, usuario.getPersonagem().get(pos).getCd_resistencia_magia());
			stmt.setInt(4, usuario.getPersonagem().get(pos).getBonus_ataque_magia());
			stmt.setString(5, usuario.getPersonagem().get(pos).getHabilidade_conjuracao());
			stmt.execute();
			stmt.close();
		} catch (SQLException msg) {
			msg.printStackTrace();
		}
	}
	
	public void removerMagias(Usuario usuario, int pos) {
		String sql = "Delete from magias WHERE idmagias=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdMagias());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarMagias(Usuario usuario, int pos) {
		String sql = "Update magias SET cd_resistencia_magia=?, bonus_ataque_magia=?, habilidade_conjuracao=? WHERE idmagias="+usuario.getPersonagem().get(pos).getIdMagias();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getCd_resistencia_magia());
			stmt.setInt(2, usuario.getPersonagem().get(pos).getBonus_ataque_magia());
			stmt.setString(3, usuario.getPersonagem().get(pos).getHabilidade_conjuracao());
			stmt.executeUpdate();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void salvarCaracteristicas(Usuario usuario, int pos) {
		String sql = "INSERT INTO caracteristicas (idcaracteristicas, personagem_idpersonagem, defeitos, vinculos, ideais, pesototal) "
				+ "values (?,?,?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdcaracteristica());
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(3, usuario.getPersonagem().get(pos).getDefeito());
			stmt.setString(4, usuario.getPersonagem().get(pos).getVinculo());
			stmt.setString(5, usuario.getPersonagem().get(pos).getIdeal());
			stmt.setDouble(6, usuario.getPersonagem().get(pos).getPeso_total());
			stmt.execute();
			stmt.close();
		} catch (SQLException msg) {
			msg.printStackTrace();
		}
	}
	
	public void removerCaracteristicas(Usuario usuario, int pos) {
		String sql = "Delete from caracteristicas WHERE idcaracteristicas=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdcaracteristica());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarCaracteristicas(Usuario usuario, int pos) {
		String sql = "Update caracteristicas SET defeitos=?, vinculos=?, ideais=?, pesototal=? WHERE idcaracteristicas="+usuario.getPersonagem().get(pos).getIdcaracteristica();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getDefeito());
			stmt.setString(2, usuario.getPersonagem().get(pos).getVinculo());
			stmt.setString(3, usuario.getPersonagem().get(pos).getIdeal());
			stmt.setDouble(4, usuario.getPersonagem().get(pos).getPeso_total());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarTracosPersonalidade(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO tracos_personalidade (personagem_idpersonagem, tracos_personalidade) values (?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(2, usuario.getPersonagem().get(pos).getTracos_personalidade().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerTracosPersonalidade(Usuario usuario, int pos, int i) {
		String sql = "Delete from tracos_personalidade WHERE idtracos_personalidade=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdtracos_personalidade().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarTracosPersonalidade(Usuario usuario, int pos, int i) {
		String sql = "Update tracosPersonalidade SET tracos_personalidade=? WHERE idtracos_personalidade="+usuario.getPersonagem().get(pos).getIdtracos_personalidade().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getTracos_personalidade().get(i));
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarPericias(Usuario usuario, int pos) {
		String sql = "INSERT INTO pericias (idpericias, personagem_idpersonagem, acrobacia, adestrar_animais, enganacao, historia, intuicao, investigacao, medicina, "
				+ "natureza, perfomance, prestidigitacao, furtividade, religiao, sobrevivencia, intimidacao, atletismo, arcanismo, persuasao, percepcao) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdpericias());
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setInt(3, usuario.getPersonagem().get(pos).getAcrobacia());
			stmt.setInt(4, usuario.getPersonagem().get(pos).getAdestrar_animais());
			stmt.setInt(5, usuario.getPersonagem().get(pos).getEnganacao());
			stmt.setInt(6, usuario.getPersonagem().get(pos).getHistoria());
			stmt.setInt(7, usuario.getPersonagem().get(pos).getIntuicao());
			stmt.setInt(8, usuario.getPersonagem().get(pos).getInvestigacao());
			stmt.setInt(9, usuario.getPersonagem().get(pos).getMedicina());
			stmt.setInt(10, usuario.getPersonagem().get(pos).getNatureza());
			stmt.setInt(11, usuario.getPersonagem().get(pos).getPerformance());
			stmt.setInt(12, usuario.getPersonagem().get(pos).getPrestidigitacao());
			stmt.setInt(13, usuario.getPersonagem().get(pos).getFurtividade());
			stmt.setInt(14, usuario.getPersonagem().get(pos).getReligiao());
			stmt.setInt(15, usuario.getPersonagem().get(pos).getSobrevivencia());
			stmt.setInt(16, usuario.getPersonagem().get(pos).getIntimidacao());
			stmt.setInt(17, usuario.getPersonagem().get(pos).getAtletismo());
			stmt.setInt(18, usuario.getPersonagem().get(pos).getArcanismo());
			stmt.setInt(19, usuario.getPersonagem().get(pos).getPersuasao());
			stmt.setInt(20, usuario.getPersonagem().get(pos).getPercepcao());
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerPericias(Usuario usuario, int pos) {
		String sql = "Delete from pericias WHERE idpericias=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdpericias());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarPericias(Usuario usuario, int pos) {
		String sql = "Update pericias SET acrobacia=?, adestrar_animais=?, enganacao=?, historia=?, intuicao=?, investigacao=?, medicina=?, natureza=?, perfomance=?, prestidigitacao=?, furtividade=?, "
				+ "religiao=?, sobrevivencia=?, intimidacao=?, atletismo=?, arcanismo=?, persuasao=?, percepcao=? WHERE idpericias="+usuario.getPersonagem().get(pos).getIdpericias();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getAcrobacia());
			stmt.setInt(2, usuario.getPersonagem().get(pos).getAdestrar_animais());
			stmt.setInt(3, usuario.getPersonagem().get(pos).getEnganacao());
			stmt.setInt(4, usuario.getPersonagem().get(pos).getHistoria());
			stmt.setInt(5, usuario.getPersonagem().get(pos).getIntuicao());
			stmt.setInt(6, usuario.getPersonagem().get(pos).getInvestigacao());
			stmt.setInt(7, usuario.getPersonagem().get(pos).getMedicina());
			stmt.setInt(8, usuario.getPersonagem().get(pos).getNatureza());
			stmt.setInt(9, usuario.getPersonagem().get(pos).getPerformance());
			stmt.setInt(10, usuario.getPersonagem().get(pos).getPrestidigitacao());
			stmt.setInt(11, usuario.getPersonagem().get(pos).getFurtividade());
			stmt.setInt(12, usuario.getPersonagem().get(pos).getReligiao());
			stmt.setInt(13, usuario.getPersonagem().get(pos).getSobrevivencia());
			stmt.setInt(14, usuario.getPersonagem().get(pos).getIntimidacao());
			stmt.setInt(15, usuario.getPersonagem().get(pos).getAtletismo());
			stmt.setInt(16, usuario.getPersonagem().get(pos).getArcanismo());
			stmt.setInt(17, usuario.getPersonagem().get(pos).getPersuasao());
			stmt.setInt(18, usuario.getPersonagem().get(pos).getPercepcao());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarAtributos(Usuario usuario, int pos) {
		String sql = "INSERT INTO atributos (idatributos, personagem_idpersonagem, forca, destreza, constituicao, inteligencia, sabedoria, carisma) values (?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdatributo());
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setInt(3, usuario.getPersonagem().get(pos).getForca());
			stmt.setInt(4, usuario.getPersonagem().get(pos).getDestreza());
			stmt.setInt(5, usuario.getPersonagem().get(pos).getConstituicao());
			stmt.setInt(6, usuario.getPersonagem().get(pos).getInteligencia());
			stmt.setInt(7, usuario.getPersonagem().get(pos).getSabedoria());
			stmt.setInt(8, usuario.getPersonagem().get(pos).getCarisma());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerAtributos(Usuario usuario, int pos) {
		String sql = "Delete from atributos WHERE idatributos=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdatributo());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarAtributos(Usuario usuario, int pos) {
		String sql = "Update atributos SET forca=?, destreza=?, constituicao=?, inteligencia=?, sabedoria=?, carisma=? WHERE idatributos="+usuario.getPersonagem().get(pos).getIdatributo();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getForca());
			stmt.setInt(2, usuario.getPersonagem().get(pos).getDestreza());
			stmt.setInt(3, usuario.getPersonagem().get(pos).getConstituicao());
			stmt.setInt(4, usuario.getPersonagem().get(pos).getInteligencia());
			stmt.setInt(5, usuario.getPersonagem().get(pos).getSabedoria());
			stmt.setInt(6, usuario.getPersonagem().get(pos).getCarisma());
			stmt.executeUpdate();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();;
		}
	}
	
	public void salvarTeste_resistencia(Usuario usuario, int pos) {
		String sql = "INSERT INTO teste_resistencia (idteste_resistencia, personagem_idpersonagem, teste_forca, teste_destreza, teste_constituicao, teste_inteligencia, teste_sabedoria, teste_carisma) values (?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdteste_resistencia());
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setInt(3, usuario.getPersonagem().get(pos).getTeste_forca());
			stmt.setInt(4, usuario.getPersonagem().get(pos).getTeste_destreza());
			stmt.setInt(5, usuario.getPersonagem().get(pos).getTeste_constituicao());
			stmt.setInt(6, usuario.getPersonagem().get(pos).getTeste_inteligencia());
			stmt.setInt(7, usuario.getPersonagem().get(pos).getTeste_sabedoria());
			stmt.setInt(8, usuario.getPersonagem().get(pos).getTeste_carisma());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerTeste_resistencia(Usuario usuario, int pos) {
		String sql = "Delete from teste_resistencia WHERE idteste_resistencia=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdteste_resistencia());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarTeste_resistencia(Usuario usuario, int pos) {
		String sql = "Update teste_resistencia SET teste_forca, teste_destreza, teste_constituicao, teste_inteligencia, teste_sabedoria=? WHERE idteste_resistencia="+usuario.getPersonagem().get(pos).getIdteste_resistencia();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getTeste_forca());
			stmt.setInt(2, usuario.getPersonagem().get(pos).getTeste_destreza());
			stmt.setInt(3, usuario.getPersonagem().get(pos).getTeste_constituicao());
			stmt.setInt(4, usuario.getPersonagem().get(pos).getTeste_inteligencia());
			stmt.setInt(5, usuario.getPersonagem().get(pos).getTeste_sabedoria());
			stmt.setInt(6, usuario.getPersonagem().get(pos).getTeste_carisma());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.err.println("Erro: "+ e);
		}
	}
	
	public void salvarFerramentas_pericias(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO array_ferramentas_pericias (personagem_idpersonagem, array_ferramentas_pericias) values (?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(2, usuario.getPersonagem().get(pos).getProfi_ferramentas_peri().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerFerramentas_pericias(Usuario usuario, int pos, int i) {
		String sql = "Delete from array_ferramentas_pericias WHERE idarray_ferramentas_pericias=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdprofi_ferramentas_peri().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarFerramentas_pericias(Usuario usuario, int pos, int i) {
		String sql = "Update array_ferramentas_pericias SET array_ferramentas_pericias WHERE idarray_ferramentas_pericias="+usuario.getPersonagem().get(pos).getIdprofi_ferramentas_peri().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getProfi_ferramentas_peri().get(i));
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.err.println("Erro: "+ e);
		}
	}
	
	public void salvarEquipamentos(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO array_equipamentos (personagem_idpersonagem, array_equipamentos) values (?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(2, usuario.getPersonagem().get(pos).getEquipamentos().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerEquipamentos(Usuario usuario, int pos, int i) {
		String sql = "Delete from array_equipamentos WHERE idarray_equipamentos=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdequipamentos().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarEquipamentos(Usuario usuario, int pos, int i) {
		String sql = "Update array_equipamentos SET array_equipamentos=? WHERE idarray_equipamentos="+usuario.getPersonagem().get(pos).getIdequipamentos().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getEquipamentos().get(i));
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.err.println("Erro: "+ e);
		}
	}
	
	public void salvarIdioma(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO array_idioma (personagem_idpersonagem, array_idioma) values (?,?)";
		
		PreparedStatement stmt =null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(2, usuario.getPersonagem().get(pos).getIdiomas().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerIdioma(Usuario usuario, int pos, int i) {
		String sql = "Delete from array_idioma WHERE idarray_idioma=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdidiomas().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarIdioma(Usuario usuario, int pos, int i) {
		String sql = "Update array_idioma SET array_idioma=? WHERE idarray_idioma="+usuario.getPersonagem().get(pos).getIdidiomas().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getIdiomas().get(i));
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarConfirmarTesteResistencia(Usuario usuario, int pos) {
		String sql = "INSERT INTO Confirma_teste_resistencia (idConfirma_teste_resistencia, personagem_idpersonagem, C_teste_forca, C_teste_destreza, C_teste_constituicao, C_teste_inteligencia, C_teste_sabedoria, C_teste_carisma) "
				+ "values (?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdCteste());
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setBoolean(3, usuario.getPersonagem().get(pos).getTem_resForca());
			stmt.setBoolean(4, usuario.getPersonagem().get(pos).getTem_resDestreza());
			stmt.setBoolean(5, usuario.getPersonagem().get(pos).getTem_resConstituicao());
			stmt.setBoolean(6, usuario.getPersonagem().get(pos).getTem_resInteligencia());
			stmt.setBoolean(7, usuario.getPersonagem().get(pos).getTem_resSabedoria());
			stmt.setBoolean(8, usuario.getPersonagem().get(pos).getTem_resCarisma());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerConfirmarTesteResistencia(Usuario usuario, int pos) {
		String sql = "Delete from confirmar_teste_resistencia WHERE idConfirmar_teste_resistencia=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdCteste());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarConfirmarTesteResistencia(Usuario usuario, int pos) {
		String sql = "Update Confirmar_teste_resistencia SET C_teste_forca=?, C_teste_destreza=?, C_teste_constituicao=?, C_teste_inteligencia=?, C_teste_sabedoria=?, C_teste_carisma=? WHERE idConfirmar_teste_resistencia="+usuario.getPersonagem().get(pos).getIdCteste();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setBoolean(1, usuario.getPersonagem().get(pos).getTem_resForca());
			stmt.setBoolean(2, usuario.getPersonagem().get(pos).getTem_resDestreza());
			stmt.setBoolean(3, usuario.getPersonagem().get(pos).getTem_resConstituicao());
			stmt.setBoolean(4, usuario.getPersonagem().get(pos).getTem_resInteligencia());
			stmt.setBoolean(5, usuario.getPersonagem().get(pos).getTem_resSabedoria());
			stmt.setBoolean(6, usuario.getPersonagem().get(pos).getTem_resCarisma());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarConfirmarPericias(Usuario usuario, int pos) {
		String sql = "INSERT INTO C_pericias (idC_pericias, personagem_idpersonagem, C_acrobacia, C_adestrar_animais, C_enganacao, C_historia, C_intuicao, C_investigacao, C_medicina, C_natureza, C_performance, C_prestidigitacao, "
				+ "C_furtividade, C_religiao, C_sobrevivencia, C_intimidacao, C_atletismo, C_arcanismo, C_persuasao, C_percepcao) "
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdCpericia());
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setBoolean(3, usuario.getPersonagem().get(pos).isTem_acrobacia());
			stmt.setBoolean(4, usuario.getPersonagem().get(pos).isTem_adestrar_animais());
			stmt.setBoolean(5, usuario.getPersonagem().get(pos).isTem_enganacao());
			stmt.setBoolean(6, usuario.getPersonagem().get(pos).isTem_historia());
			stmt.setBoolean(7, usuario.getPersonagem().get(pos).isTem_intuicao());
			stmt.setBoolean(8, usuario.getPersonagem().get(pos).isTem_investigacao());
			stmt.setBoolean(9, usuario.getPersonagem().get(pos).isTem_medicina());
			stmt.setBoolean(10, usuario.getPersonagem().get(pos).isTem_natureza());
			stmt.setBoolean(11, usuario.getPersonagem().get(pos).isTem_performance());
			stmt.setBoolean(12, usuario.getPersonagem().get(pos).isTem_prestidigitacao());
			stmt.setBoolean(13, usuario.getPersonagem().get(pos).isTem_furtividade());
			stmt.setBoolean(14, usuario.getPersonagem().get(pos).isTem_religiao());
			stmt.setBoolean(15, usuario.getPersonagem().get(pos).isTem_sobrevivencia());
			stmt.setBoolean(16, usuario.getPersonagem().get(pos).isTem_atletismo());
			stmt.setBoolean(17, usuario.getPersonagem().get(pos).isTem_arcanismo());
			stmt.setBoolean(18, usuario.getPersonagem().get(pos).isTem_persuasao());
			stmt.setBoolean(19, usuario.getPersonagem().get(pos).isTem_persuasao());
			stmt.setBoolean(20, usuario.getPersonagem().get(pos).isTem_percepcao());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerConfirmarPericias(Usuario usuario, int pos) {
		String sql = "Delete from C_pericias WHERE idC_pericias=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdCpericia());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarConfirmarPericias(Usuario usuario, int pos) {
		String sql = "Update C_pericias SET C_acrobacia, C_adestrar_animais, C_enganacao, C_historia, C_intuicao, C_investigacao, "
				+ "C_medicina, C_natureza, C_performance, C_prestidigitacao, C_furtividade, C_religiao, C_sobrevivencia, C_intimidacao,"
				+ " C_atletismo, C_arcanismo, C_persuasao, C_percepcao=? WHERE idC_pericias="+usuario.getPersonagem().get(pos).getIdCpericia();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setBoolean(1, usuario.getPersonagem().get(pos).isTem_acrobacia());
			stmt.setBoolean(2, usuario.getPersonagem().get(pos).isTem_adestrar_animais());
			stmt.setBoolean(3, usuario.getPersonagem().get(pos).isTem_enganacao());
			stmt.setBoolean(4, usuario.getPersonagem().get(pos).isTem_historia());
			stmt.setBoolean(5, usuario.getPersonagem().get(pos).isTem_intuicao());
			stmt.setBoolean(6, usuario.getPersonagem().get(pos).isTem_investigacao());
			stmt.setBoolean(7, usuario.getPersonagem().get(pos).isTem_medicina());
			stmt.setBoolean(8, usuario.getPersonagem().get(pos).isTem_natureza());
			stmt.setBoolean(9, usuario.getPersonagem().get(pos).isTem_performance());
			stmt.setBoolean(10, usuario.getPersonagem().get(pos).isTem_prestidigitacao());
			stmt.setBoolean(11, usuario.getPersonagem().get(pos).isTem_furtividade());
			stmt.setBoolean(12, usuario.getPersonagem().get(pos).isTem_religiao());
			stmt.setBoolean(13, usuario.getPersonagem().get(pos).isTem_sobrevivencia());
			stmt.setBoolean(14, usuario.getPersonagem().get(pos).isTem_atletismo());
			stmt.setBoolean(15, usuario.getPersonagem().get(pos).isTem_arcanismo());
			stmt.setBoolean(16, usuario.getPersonagem().get(pos).isTem_persuasao());
			stmt.setBoolean(17, usuario.getPersonagem().get(pos).isTem_persuasao());
			stmt.setBoolean(18, usuario.getPersonagem().get(pos).isTem_percepcao());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarTracosRaciais(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO tracos_raciais (personagem_idpersonagem, tracos_raciais) values (?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(2, usuario.getPersonagem().get(pos).getTracosraciais().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerTracosRaciais(Usuario usuario, int pos, int i) {
		String sql = "Delete from tracos_raciais WHERE idtracos_raciais=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdtracos_raciais().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarTracosRaciais(Usuario usuario, int pos, int i) {
		String sql = "Update tracos_raciais SET tracos_raciais=? WHERE idtracos_raciais="+usuario.getPersonagem().get(pos).getIdtracos_raciais().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getTracosraciais().get(i));
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			System.err.println("Erro: "+ e);
		}
	}
	
	public void salvarClasseFeats(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO classe_feats (personagem_idpersonagem, classe_feats) values (?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(2, usuario.getPersonagem().get(pos).getClassefeats().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerClasseFeats(Usuario usuario, int pos, int i) {
		String sql = "Delete from classe_feats WHERE idclasse_feats=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdclasse_feats().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarClasseFeats(Usuario usuario, int pos, int i) {
		String sql = "Update classe_feats SET classe_feats=? WHERE idclasse_feats="+usuario.getPersonagem().get(pos).getIdclasse_feats().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getClassefeats().get(i));
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarProfiEquips(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO profi_equips (personagem_idpersonagem, profi_equips) values (?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(2, usuario.getPersonagem().get(pos).getProfi_equips().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerProfiEquips(Usuario usuario, int pos, int i) {
		String sql = "Delete from profi_equips WHERE idprofi_equips=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdprofi_equips().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void altearProfiEquips(Usuario usuario, int pos, int i) {
		String sql = "Update profi_equips SET profi_equips=? WHERE idprofi_equips="+usuario.getPersonagem().get(pos).getIdprofi_equips().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getProfi_equips().get(i));
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarAtributosModificadores(Usuario usuario, int pos) {
		String sql = "INSERT INTO atributos_modificadores (idatributos_modificadores, personagem_idpersonagem, forca_mod, destreza_mod,"
				+ "constituicao_mod,inteligencia_mod, sabedoria_mod, carisma_mod) values (?,?,?,?,?,?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdatributos_modificadores());
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setInt(3, usuario.getPersonagem().get(pos).getForca_mod());
			stmt.setInt(4, usuario.getPersonagem().get(pos).getDestreza_mod());
			stmt.setInt(5, usuario.getPersonagem().get(pos).getConstituicao_mod());
			stmt.setInt(6, usuario.getPersonagem().get(pos).getInteligencia_mod());
			stmt.setInt(7, usuario.getPersonagem().get(pos).getSabedoria_mod());
			stmt.setInt(8, usuario.getPersonagem().get(pos).getCarisma_mod());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerAtributosModificadores(Usuario usuario, int pos) {
		String sql = "Delete from atributos_modificadores WHERE idatributos_modificadores =?";
		
		PreparedStatement stmt = null;
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdatributos_modificadores());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarAtributosModificadores(Usuario usuario, int pos) {
		String sql = "Update atributos_modificadores SET forca_mod, destreza_mod, constituicao_mod,inteligencia_mod, sabedoria_mod, carisma_mod=? WHERE idatributos_modificadores="+usuario.getPersonagem().get(pos).getIdatributos_modificadores();
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getForca_mod());
			stmt.setInt(2, usuario.getPersonagem().get(pos).getDestreza_mod());
			stmt.setInt(3, usuario.getPersonagem().get(pos).getConstituicao_mod());
			stmt.setInt(4, usuario.getPersonagem().get(pos).getInteligencia_mod());
			stmt.setInt(5, usuario.getPersonagem().get(pos).getSabedoria_mod());
			stmt.setInt(6, usuario.getPersonagem().get(pos).getCarisma_mod());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarTruques(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO truques (idtruques, personagem_idpersonagem, truques) values (?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdtruques().get(i));
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(3, usuario.getPersonagem().get(pos).getTruques().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerTruques(Usuario usuario, int pos, int i) {
		String sql = "Delete from truques WHERE idtruques=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdtruques().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarTruques(Usuario usuario, int pos, int i) {
		String sql = "Update truques SET truques WHERE idtruques="+usuario.getPersonagem().get(pos).getIdtruques().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getTruques().get(i));
			stmt.executeUpdate();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarMagiasLV1(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO magiasLV1 (idmagiasLV1, personagem_idpersonagem, magiasLV1) values (?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV1().get(i));
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(3, usuario.getPersonagem().get(pos).getMagiasLV1().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerMagiasLV1(Usuario usuario, int pos, int i) {
		String sql = "Delete magiasLV1 WHERE idmagiasLV1=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV1().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarMagiasLV1(Usuario usuario, int pos, int i) {
		String sql = "Update magiasLV1 SET magiasLV1 WHERE idmagiasLV1="+usuario.getPersonagem().get(pos).getIdmagiasLV1().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getMagiasLV1().get(i));
			stmt.executeUpdate();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarMagiasLV2(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO magiasLV2 (idmagiasLV2, personagem_idpersonagem, magiasLV2) values (?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV2().get(i));
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(3, usuario.getPersonagem().get(pos).getMagiasLV2().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerMagiasLV2(Usuario usuario, int pos, int i) {
		String sql = "Delete magiasLV2 WHERE idmagiasLV2=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV2().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarMagiasLV2(Usuario usuario, int pos, int i) {
		String sql = "Update magiasLV2 SET magiasLV2 WHERE idmagiasLV2="+usuario.getPersonagem().get(pos).getIdmagiasLV2().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getMagiasLV2().get(i));
			stmt.executeUpdate();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarMagiasLV3(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO magiasLV3 (idmagiasLV3, personagem_idpersonagem, magiasLV3) values (?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV3().get(i));
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(3, usuario.getPersonagem().get(pos).getMagiasLV3().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerMagiasLV3(Usuario usuario, int pos, int i) {
		String sql = "Delete magiasLV3 WHERE idmagiasLV3=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV3().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarMagiasLV3(Usuario usuario, int pos, int i) {
		String sql = "Update magiasLV3 SET magiasLV1 WHERE idmagiasLV3="+usuario.getPersonagem().get(pos).getIdmagiasLV3().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getMagiasLV3().get(i));
			stmt.executeUpdate();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarMagiasLV4(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO magiasLV4 (idmagiasLV4, personagem_idpersonagem, magiasLV4) values (?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV4().get(i));
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(3, usuario.getPersonagem().get(pos).getMagiasLV4().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerMagiasLV4(Usuario usuario, int pos, int i) {
		String sql = "Delete magiasLV4 WHERE idmagiasLV4=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV4().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarMagiasLV4(Usuario usuario, int pos, int i) {
		String sql = "Update magiasLV4 SET magiasLV4 WHERE idmagiasLV4="+usuario.getPersonagem().get(pos).getIdmagiasLV4().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getMagiasLV4().get(i));
			stmt.executeUpdate();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarMagiasLV5(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO magiasLV5 (idmagiasLV5, personagem_idpersonagem, magiasLV5) values (?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV5().get(i));
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(3, usuario.getPersonagem().get(pos).getMagiasLV5().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerMagiasLV5(Usuario usuario, int pos, int i) {
		String sql = "Delete magiasLV5 WHERE idmagiasLV5=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV5().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarMagiasLV5(Usuario usuario, int pos, int i) {
		String sql = "Update magiasLV5 SET magiasLV5 WHERE idmagiasLV5="+usuario.getPersonagem().get(pos).getIdmagiasLV5().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getMagiasLV5().get(i));
			stmt.executeUpdate();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarMagiasLV6(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO magiasLV6 (idmagiasLV6, personagem_idpersonagem, magiasLV6) values (?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV6().get(i));
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(3, usuario.getPersonagem().get(pos).getMagiasLV6().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerMagiasLV6(Usuario usuario, int pos, int i) {
		String sql = "Delete magiasLV6 WHERE idmagiasLV6=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV6().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarMagiasLV6(Usuario usuario, int pos, int i) {
		String sql = "Update magiasLV6 SET magiasLV6 WHERE idmagiasLV6="+usuario.getPersonagem().get(pos).getIdmagiasLV6().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getMagiasLV6().get(i));
			stmt.executeUpdate();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarMagiasLV7(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO magiasLV7 (idmagiasLV7, personagem_idpersonagem, magiasLV7) values (?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV7().get(i));
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(3, usuario.getPersonagem().get(pos).getMagiasLV7().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerMagiasLV7(Usuario usuario, int pos, int i) {
		String sql = "Delete magiasLV7 WHERE idmagiasLV7=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV7().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarMagiasLV7(Usuario usuario, int pos, int i) {
		String sql = "Update magiasLV7 SET magiasLV7 WHERE idmagiasLV7="+usuario.getPersonagem().get(pos).getIdmagiasLV7().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getMagiasLV7().get(i));
			stmt.executeUpdate();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarMagiasLV8(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO magiasLV8 (idmagiasLV8, personagem_idpersonagem, magiasLV8) values (?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV8().get(i));
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(3, usuario.getPersonagem().get(pos).getMagiasLV8().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerMagiasLV8(Usuario usuario, int pos, int i) {
		String sql = "Delete magiasLV8 WHERE idmagiasLV8=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV8().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarMagiasLV8(Usuario usuario, int pos, int i) {
		String sql = "Update magiasLV8 SET magiasLV8 WHERE idmagiasLV8="+usuario.getPersonagem().get(pos).getIdmagiasLV8().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getMagiasLV8().get(i));
			stmt.executeUpdate();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarMagiasLV9(Usuario usuario, int pos, int i) {
		String sql = "INSERT INTO magiasLV9 (idmagiasLV9, personagem_idpersonagem, magiasLV9) values (?,?,?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV9().get(i));
			stmt.setInt(2, usuario.getPersonagem().get(pos).getIdpersonagem());
			stmt.setString(3, usuario.getPersonagem().get(pos).getMagiasLV9().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void removerMagiasLV9(Usuario usuario, int pos, int i) {
		String sql = "Delete magiasLV9 WHERE idmagiasLV9=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getPersonagem().get(pos).getIdmagiasLV9().get(i));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void alterarMagiasLV9(Usuario usuario, int pos, int i) {
		String sql = "Update magiasLV9 SET magiasLV9 WHERE idmagiasLV9="+usuario.getPersonagem().get(pos).getIdmagiasLV9().get(i);
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getPersonagem().get(pos).getMagiasLV9().get(i));
			stmt.executeUpdate();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

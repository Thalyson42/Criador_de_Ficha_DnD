package jdbc.dao.charactersheet.characteristics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.connection.ConnectionFactory;
import jdbc.model.characterSheet.characteristics.Characteristics;
import jdbc.model.characterSheet.characteristics.PersonalityTraits;

public class PersonalityTraitsDAO {
	private Connection connection;
	
	Connection getConnection() {
		this.connection = ConnectionFactory.getConnection();
		return this.connection;
	}
	
	public void createPersonalityTraits(Characteristics characteristics, PersonalityTraits trait) {
		int idCharacteristcs = characteristics.getIDCharacteristic();
		String sql = "INSERT INTO personality_traits (idpersonality_traits, personality_traits, charactersheet_idcharactersheet) "
				+ "VALUES (?, ?, ?)";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, trait.getIDPersonalityTrait());
			stmt.setString(2, trait.getPersonalityTrait());
			stmt.setInt(3, idCharacteristcs);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void deletePersonalityTraits(PersonalityTraits trait, Characteristics characteristics) {
		int idCharacteristics = characteristics.getIDCharacteristic();
		String sql = "DELETE FROM personality_traits "
				+ "WHERE charactersheet_idcharactersheet=? AND idpersonality_traits=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idCharacteristics);
			stmt.setInt(2, trait.getIDPersonalityTrait());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updatePersonalityTraits(PersonalityTraits trait, Characteristics characteristics) {
		int idCharacteristics = characteristics.getIDCharacteristic();
		String sql = "UPDATE personality_traits SET "
				+ "personality_traits=? "
				+ "WHERE charactersheet_idcharactersheet=? AND idpersonality_traits=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, trait.getPersonalityTrait());
			stmt.setInt(2, idCharacteristics);
			stmt.setInt(3, trait.getIDPersonalityTrait());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public ArrayList<PersonalityTraits> readPersonalityTraits(Characteristics characteristics) {
		int idCharacteristics = characteristics.getIDCharacteristic();
		ArrayList<PersonalityTraits> traits = new ArrayList<PersonalityTraits>();
		String sql = "SELECT idpersonality_traits, personality_traits "
				+ "FROM personality_traits "
				+ "WHERE charactersheet_idcharactersheet=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = getConnection().prepareStatement(sql);
			stmt.setInt(1, idCharacteristics);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				PersonalityTraits trait = new PersonalityTraits();
				
				trait.setIDPersonalityTrait(rs.getInt("idpersonality_traits"));
				trait.setPersonalityTrait(rs.getString("personality_traits"));
				traits.add(trait);
			}
			stmt.close();
			rs.close();

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return traits;
	}
}

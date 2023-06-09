package ejercicio2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TelefonoDao {

	private String str;

	public TelefonoDao(String str) {
		Objects.requireNonNull(str);
		this.str = str;
	}

	private Connection obtenerConexion() throws BaseException {
		Conn connStr = new Conn(this.str);
		return connStr.open();
	}

	public Set<Telefono> telefonosDePersonaPorId(int id_Persona) throws BaseException {

		String sql = "select t.numero " + "from personas p, telefonos t " + "where p.id = t.id_persona and p.id = ?";

		try (Connection conn = obtenerConexion(); PreparedStatement statement = conn.prepareStatement(sql);) {
			statement.setInt(1, id_Persona);

			ResultSet result = statement.executeQuery();
			Set<Telefono> telefonos = new HashSet<Telefono>();

			while (result.next()) {
				telefonos.add(new Telefono(result.getString(1)));
			}

			return telefonos;

		} catch (SQLException e) {
			throw new BaseException(e, "Error en la consulta a la base.");
		}
	}

}

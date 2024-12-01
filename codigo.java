import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {

    public Connection conectarBD() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=1234";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
        return conn;
    }

    // Método para verificar o usuário no banco de dados
    public boolean verificarUsuario(String login, String senha) {
        boolean result = false;
        String sql = "SELECT nome FROM usuarios WHERE login = ? AND senha = ?";
        
        try (Connection conn = conectarBD();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
             
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    result = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao verificar usuário: " + e.getMessage());
        }
        return result;
    }
}


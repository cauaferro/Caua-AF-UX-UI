
public class User {
    
    /**
     * Conecta ao banco de dados.
     * 
     * @return Retorna a conexão com o banco ou null se não conseguir.
     */
    public Connection conectarBD() {
        Connection conn = null;
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://127.0.0.1/teste?user=root&password=1234";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {

        }
        
        return conn; // Retorna a conexão ou null
    }

    public boolean verificarUsuario(String login, String senha) {
        String sql = ""; // Armazena o comando SQL
        boolean result = false; // Resultado da verificação
        String nome = ""; // Nome do usuário (não utilizado aqui)

        Connection conn = conectarBD(); // Conecta ao banco

        // Cria o comando SQL para verificar login e senha
        sql = "select nome from usuarios ";
        sql += "where login = '" + login + "' ";
        sql += "and senha = '" + senha + "';";

        try {
            // Executa o comando no banco
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
        }

        return result; // Retorna se o usuário foi encontrado
    }
}

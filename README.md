GRAFO:
IMAGEM ESTÁ EM ISSUES

N1: Início do código
public class User {
    public Connection conectarBD() {
        Connection conn = null;

N2: Inicia a tentativa de conexão com o banco
    try {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://127.0.0.1/teste?user=root&password=1234";
        conn = DriverManager.getConnection(url);
        
N3: Exceção durante a conexão (se falhar)
    } catch (Exception e) {
    }
    
N4: Retorno da conexão com o banco
    return conn;
    
N5: Início da verificação do usuário
public boolean verificarUsuario(String login, String senha) {
    String sql = "";
    Connection conn = conectarBD();
    
N6: Execução da consulta SQL
    sql = "select nome from usuarios ";
    sql += "where login = '" + login + "' ";
    sql += "and senha = '" + senha + "';";

    try {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

N7: Exceção durante a execução da consulta
    } catch (Exception e) {        
    }

N8: Verificação do resultado da consulta
    if (rs.next()) {
        result = true;
        nome = rs.getString("nome");
    }

N9: Retorno final da função
    return result;
}

Caminhos:
Caminho 1 (C1): N1 → N2 → N4 → N5 → N6 → N8 → N9
Caminho 2 (C2): N1 → N3 → N9
Caminho 3 (C3): N1 → N2 → N4 → N5 → N7 → N9

Complexidade Ciclomática:
A complexidade ciclomática é calculada com a fórmula:
V ( G )=9−8+2=3
V(G) = 3
Complexidade Ciclomática (V(G)) = 3


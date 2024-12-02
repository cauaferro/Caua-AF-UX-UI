Projeto de Verificação de Usuário

Este projeto conecta ao banco de dados MySQL e verifica se o usuário com o login e a senha informados existe.

Funcionalidades

- Conectar ao banco de dados MySQL.
- Verificar se o usuário e a senha estão corretos.

Como Funciona

1. O código tenta se conectar ao banco de dados MySQL.
2. Depois, verifica se o login e a senha do usuário estão corretos.

Como Usar

1. **Pré-requisitos**:
    - Tenha o MySQL instalado.
    - O banco de dados `teste` com a tabela de usuários precisa estar configurado.

2. **Como executar**:
    - Compile o código.
    - Use o método `verificarUsuario()` passando o login e a senha.
      
Exemplo de Uso

```java
User user = new User();
boolean isValidUser = user.verificarUsuario("usuarioTeste", "senha123");
System.out.println(isValidUser ? "Usuário encontrado!" : "Usuário não encontrado!");

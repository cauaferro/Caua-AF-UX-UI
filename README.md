1 - Erros Ignorados:
Os blocos catchnão fazem nada com os erros que acontecem. Isso esconde os problemas e dificulta a correção.

2 - Risco de Ataques no Banco de Dados:
O método verificarUsuario usa o login e a senha diretamente na consulta SQL. Isso pode permitir que alguém insira comandos perigosos e cause problemas no banco de dados.

3 - Conexões Não Fechadas:
Conexões, comandos e resultados do banco de dados não são fechados depois de usados. Isso pode gastar recursos do sistema e deixar o programa lento ou travado.

4 - Senhas Expostas no Código:
As credenciais do banco de dados, como usuário e senha, estão escritas diretamente no código. Isso deixa esses dados vulneráveis ​​a acessos indevidos.

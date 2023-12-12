*Desafio Java*

Desafio de Programação Java: Monitoramento de Sistema com Princípios SOLID


*Objetivo:*

Desenvolver um aplicativo Java para monitoramento de recursos do sistema, aderindo aos princípios SOLID e utilizando a biblioteca Looca.


*Requisitos:*


1. Biblioteca Looca: Utilize a biblioteca Looca para acessar dados do sistema.

2. Abstrações e Interfaces: Empregue Classes Abstratas e Interfaces para estruturar o código.

3. DAO (Data Access Object): Implemente o padrão DAO para a persistência de dados de cada entidade do sistema.

4. Captura de Dados com TimerTask: Implemente rotinas para capturar dados periodicamente usando TimerTask.

5. Tabela de Parametrização: Crie uma tabela para parametrizar os componentes do sistema, incluindo:

   - CPU: uso

   - Memória: uso

   - Disco: uso

Ou seja o sistema sempre consultará essa tabela para saber o que deve ser lido;

6. Uso de Mapper: Implemente a interface RowMapper para todas as consultas ao banco de dados.

7. Nomenclatura: Escolha bons nomes para variáveis, parâmetros, métodos e classes.

8. Princípio 'S' do SOLID: Assegure-se de que cada classe tenha uma única responsabilidade.

9. Princípio 'I' do SOLID: Evite dependências desnecessárias entre classes.

10. Organização de Pacotes: Separe os pacotes de acordo com o contexto, como database, dao, domínio, serviços, integração e etc...

11. Utilização de Enumeradores: Utilize ao menos um enumerador no projeto para lidar com valores padrões;

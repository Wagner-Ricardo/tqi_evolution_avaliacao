# tqi_evolution_avaliacao
avaliacao solucao backend

A proposta tecnologica foi utilizar inicialmente o framework springboot Maven com java 11 para desenvolver
a backend solução do sistema de analise de crédito.Foi utilizada o IDE Eclipse para construir a solução
muito embora exitam varias outras.

Para ajudar o entendimento do desenvolvimento construir em  UML  caso de uso de como viria a ser
a solução, juntamente com as classes iniciais que concebi durante o processo de planejamento.
construi a solução tentando observando os conceito de padrões de projeto como Singleton para conexao
ao banco de dados, utilizar a composição ao inves de herança no caso da representação UML da classe 
cliente.

A solução compila e sobe na porta especificada aplication.proprerties no caso a 8087 entretanto ao
utilizar o a ferramenta postman apresentou um problema  referente a utf-8 que estou verificando a
solução do problema.A arquittetura da solução foi construida  as pastas de repository,
model, controller, exception.

Antes de utilizar o BDMysql optei inicialmente para utilização do H2 um banco construindo  em memoria
por que é mais facil para testar.


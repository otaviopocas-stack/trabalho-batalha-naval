Trabalho de simulação do jogo de Batalha Naval:
### Grupo: Pedro S. Ruffo, Gustavo Correia Machado e Otavio Poças.


O objeto do trabalho era montar um jogo de batalha naval funcional, utilizando a liguagem de programação
java. Foi solicitado no material fornecido as seguintes exigencias:
Criar um tabuleiro 10x10.
Permitir o posicionamento de navios manualmente.
Ocultar o tabuleiro real do Atacante.
Permitir que o Atacante realize tentativas de ataque escolhendo linha e coluna (coordenada).
Informar acerto/erro e registrar no tabuleiro de ataques.
Encerrar o jogo quando todos os navios forem destruídos ou quando o jogador atingir um número limite de tentativas.
Fazer validações básicas que não interfiram na jogabilidade.


O Criador deve posicionar os seguintes navios:


Navio                      Quantidade     Tamanho
Porta Aviões                    1                          4
Fragata                              1                          3
Submarino                        3                         2
Bote                                    3                         1


Navios podem ser colocados na vertical, horizontal e diagonal.


Para visualização do Criador e Atacante, destacar o tabuleiro com:
'~' = água
'N' = navio
'X' = acerto
'O' = erro
Métodos obrigatórios na implementação:
inicializarTabuleiro
exibirTabuleiro
posicionarNavio
realizarAtaque
verificarFimDeJogo
Fluxo do Jogo:
Criador posiciona os navios
Tabuleiro deve ser mostrado ao Criador
Depois deve ser "escondido" do Atacante
Atacante começa os ataques
Informar linha e coluna
O sistema indica: acerto ou erro
Atualização do tabuleiro de ataques
Encerrar jogo quando:
todos os navios forem destruídos
atingir limite de tentativas
informar o vencedor
Regras de validação obrigatórias
Não permitir colocar navios fora da matriz
Não permitir sobreposição
Entrada inválida de linha/coluna
Tentativas repetidas devem ser bloqueadas.


Diante disso, sentamos e conversamos sobre como prosseguir em grupo o nosso trabalho. Decidimos que era necessario cada um fazer uma parte do código para aprender e tudo o que fizermos mandarmos em nosso grupo.                
 
*Resumo do Projeto Batalha Naval*


### Pedro


Foi responsável pela estrutura inicial do programa. Criou o tabuleiro do jogo, definindo seu tamanho e preenchendo todas as posições com água (~). Também desenvolveu a exibição do tabuleiro na tela, mostrando as linhas e colunas para facilitar a visualização dos jogadores. Além disso, organizou as instruções do jogo, explicando como os navios devem ser posicionados.


### Gustavo


Foi responsável pela parte de posicionamento dos navios. Desenvolveu os métodos que permitem colocar os navios no tabuleiro nas direções horizontal, vertical e diagonal. Também implementou as verificações para impedir que os navios saiam dos limites do tabuleiro ou ocupem posições já utilizadas. Após cada posicionamento válido, o tabuleiro é atualizado e exibido ao jogador.


### Otávio


Foi responsável pelas funções relacionadas aos ataques. Desenvolveu o sistema que recebe as coordenadas informadas pelo jogador, verifica se o ataque é válido e identifica se houve acerto ou erro. Também implementou a atualização dos tabuleiros após cada jogada, marcando os acertos com X e os erros com O, além das mensagens de retorno para o jogador.

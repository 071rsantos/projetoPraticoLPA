Instruções:
1. Este trabalho deve ser realizado em equipe de, no máximo, 4 pessoas.
2. A participação de cada integrante é fundamental sendo considerada para a avaliação.
3. O grupo é o maior responsável sobre a identificação dos elementos da equipe que não
corresponderem adequadamente ao ponto anterior.
4. Os programas deverão ser executados em sala, na data marcada para apresentação, quando os
componentes da equipe serão arguidos sobre o trabalho. A ausência de um aluno na
apresentação do trabalho implica na atribuição, ao mesmo, da nota 0,0(zero).
5. Qualquer semelhança entre trabalhos de equipes diferentes resultará em nota 0,0 (zero) para
todas as equipes com trabalhos semelhantes.
6. O código a ser apresentado não deve conter comentários explicando o mesmo.
7. O programa deverá ser compilado diante da professora no momento da apresentação do
trabalho.
8. Não será aceito trabalho enviado por e-mail.
Objetivo
Implementar, usando a linguagem Java, o jogo da senha.
Jogo da senha
Segundo a Wikipedia, o jogo da senha (Mastermind) foi criado por Mordechai Meirowitz. Consistia
num jogo de tabuleiro em que uma senha de quatro dígitos representados por pinos coloridos (sendo
6 possibilidades de cores) era estabelecida pelo jogador desafiador e deveria ser descoberta em 10
tentativas pelo jogador desafiado.
Para tanto, a cada tentativa, o desafiador informava ao desafiado quantos pinos estavam na posição
correta e quantos faziam parte da senha mas estavam em posição equivocada.
Implementação
Como será utilizada interface de texto, ao invés de cores serão usados números (de 1 a 6) para
compor a senha de quatro dígitos.
A senha deve ser gerada aleatoriamente pelo programa.
A senha deve ser armazenada num vetor de quatro posições e um outro vetor similar deve ser usado
para receber as tentativas do jogador desafiado.
A cada tentativa, o programa deve informar a quantidade de números corretos em posição correta e
a quantidade de números corretos (ou seja que fazem parte da senha) em posição equivocada.

Exemplo:
Senha correta: 1 1 3 5
Tentativa 1: 1 1 1 1
Dígitos corretos: 2
Dígitos deslocados: 0
Tentativa 2: 1 1 2 3
Dígitos corretos: 2
Dígitos deslocados: 1
E assim sucessivamente.
O jogo termina quando o jogador desafiado acerta a senha, sendo portanto vencedor, ou quando
terminam as dez tentativas, sendo vencedor o computador.

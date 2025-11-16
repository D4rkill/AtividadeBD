Feito 2 fluxogramas e 2 grafos de fluxo, levando em consideração que no código há a existência de 2 métodos, e após algumas pesquisas na internet identifiquei que forma mais correta de ser realizada a documentação seria separando-as ao invés de fazer um único fluxograma ou grafo de fluxo para o código inteiro.

Método 1 = public Connection conectarBD()

Método 2 = public boolean verificarUsuario(String login, String senha)

________________________________________________________________________

Método 1:

Complexidade Ciclomática do Método 1: 

M = E - N + 2P

E = 6
N = 6
P = 1

Cálculo: M = 6 - 6 + 2 * 1

Cálculo: M = 2

A complexidade ciclomática M desse código é 2.

Caminhos Possíveis: 

1 - 2 - 3 - 6;

1 - 4 - 5 - 6;

Total de 2 Caminhos possíveis

________________________________________________________________________

Método 2:

Complexidade Ciclomática do Método 1: 

M = E - N + 2P

E = 9
N = 8
P = 1

Cálculo: M = 9 - 8 + 2 * 1

Cálculo: 3

A complexidade ciclomática M desse código é 3.

Caminhos Possíveis:

1 - 2 - 3 - 4 - 5 - 8;

1 - 2 - 3 - 8;

1 - 6 - 7 - 8;

Total de 3 Caminhos possíveis



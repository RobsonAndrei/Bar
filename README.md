
BAR

Refatore seu código, da seguinte forma: 
- organize suas classes em 4 pacotes: uinterface, business, persistence e tests.
- coloque todas as classes de UI no uinterface, as de negócio no pacote business, as de dados no de persistence, e os casos de testes no tests.
- ajuste o código, conforme o necessário.

O trabalho será feito em duplas, com o seu par da aula anterior, onde o projeto foi iniciado. Mas agora trabalharão em paralelo, como uma equipe, a partir do projeto no Github.

Entregável: seu código refatorado com o código de testes

Data: 15/04, até 23:55, no moodle.

O dono de uma rede de bares da cidade nos encomendou um sistema em Java para controlar o acesso de clientes ao bar. O proprietário deseja que, ao entrar no bar, cliente informe seu nome, CPF, idade e gênero. Alguns dos clientes pode ser sócios do bar e elegíveis a um programa de milhagens. Neste caso, deve-se registrar também o número do sócio.
A qualquer momento, ele deseja ser capaz de consultar quem são as pessoas que estão no bar, se alguém com um determinado CPF está no bar, quantas são as pessoas e qual a distribuição por gênero (percentual de clientes masculinos e femininos) e por status de sócio (quantos são sócios, e quantos não são). Ao sair, o cliente deve informar seu CPF, para registrar sua saída.
Ao final do dia, os dados de todos os clientes que estiveram no bar devem estar armazenados em arquivo texto.
Modele este sistema (defina classes, com seus atributos e métodos), implemente-o e implemente os casos de testes usando testes unitários e JUnit.

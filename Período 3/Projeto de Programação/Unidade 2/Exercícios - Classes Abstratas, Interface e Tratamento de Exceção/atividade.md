# Atividade

## [Universidade Tiradentes 2022]

</br>

---

## Exercício 1

Implementar as seguintes classes:
* Classe Pessoa
* Classe PessoaFisica
* Classe PessoaJuridica
* Classe PrincipalPessoa

</br>
</br>

### Classe Pessoa

- Criar a classe Pessoa como abstrata e com o atributo privado nome e seus métodos de
acesso.

- Criar o método imprimir() como abstrato

- Criar um construtor que deverá inicializar o atributo da classe

</br>

### Classe PessoaFisica

- Criar a classe PessoaFisica que deverá ser uma subclasse de Pessoa. Criar os
atributos privados cpf, e data de nascimento. Criar os métodos de acesso.

- Criar para a classe PessoaFisica um construtor vazio e um segundo construtor
que receba os parâmetros da classe e o parâmetro de sua superclasse. Inicializar
os atributos da subclasse e chamar o comando super com o parâmetro da
superclasse.

- Desenvolver o método imprimir() que apresenta os valores na tela.

</br>

### Classe PessoaJuridica

- Criar a classe PessoaJuridica que também estende da classe Pessoa. Criar os
atributos privados cnpj, inscrição estadual, nome fantasia e razão social. Criar
métodos de acesso. Desenvolver o método imprimir(), que exibirá os dados na
tela.

- Criar para a classe PessoaJuridica um construtor vazio e um segundo construtor
que receba os parâmetros da classe e o parâmetro de sua superclasse. Inicializar
os atributos da classe e chamar o comando super com o parâmetro da
superclasse.

</br>

### Classe PrincipalPessoa

- Desenvolver a classe PrincipalPessoa com o atributo pessoa do tipo da
classe Pessoa. Não será necessário criar objeto neste momento, ou seja,
iremos fazê-lo depois que o usuário escolher uma opção.

- Implementar o método main() e apresentar ao usuário um menu com as
opções cadastrar e imprimir. Se o usuário escolher cadastrar, executar o
método cadastrar(). Se o usuário optar por imprimir, executar o método
imprimir().

- O método imprimir() deverá verificar se o atributo da classe está igual a nulo e, em caso
afirmativo, exibir uma mensagem de erro na tela. Caso contrário deverá executar o método
imprimir() usando o atributo pessoa para isso. Não esquecer de verificar se o atributo
pessoa está nulo. Caso esteja, apresentar um mensagem de erro. Criaremos um objeto para
o atributo pessoa no método cadastrar().

- No método cadastrar() deve ser solicitado que o usuário escolha entre pessoa jurídica ou
física. Se escolher pessoa física, solicitar que o usuário leia com o teclado em variáveis
locais os valores referentes a um pessoa física. Ao concluir, criar um objeto do tipo da classe
PessoaFisica usando o construtor com parâmetros. Realizar o mesmo procedimento quando
o usuário escolher a opção de cadastrar uma pessoa jurídica

---

## Exercício 2

Implementar as seguintes classes:
- Classe Veiculo
- Classe Aviao
- Classe Barco
- Classe Carro
- Classe InterfaceMain

</br>

### Classe Veiculo

- Criar a classe Veiculo que deverá ser uma interface
- Criar os métodos:
ligarMotor();
acelerar();
freiar();
buzinar();

</br>

### Classe Aviao

- Criar a classe Aviao que deverá implementar a interface Veiculo
- Criar os métodos por meio da sobreposição (@Override):

ligarMotor();
acelerar();
freiar();
buzinar();

</br>

### Classe Barco

- Criar a classe Barco que deverá implementar a interface Veiculo
- Criar os métodos por meio da sobreposição (@Override):

ligarMotor();
acelerar();
freiar();
buzinar();

</br>

### Classe Carro

- Criar a classe Carro que deverá implementar a interface Veiculo
- Criar os métodos por meio da sobreposição (@Override):

ligarMotor();
acelerar();
freiar();
buzinar();

</br>

### Classe InterfaceMain

- Criar a classe InterfaceMain que deverá testar todas classe Aviao, Barco e Carro.
Para isso, deve criar os objetos de cada uma dessas classes e chamar os
métodos:
ligarMotor();
acelerar();
freiar();
buzinar();
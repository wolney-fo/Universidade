# Atividade

## [Universidade Tiradentes 2022]

Crie uma classe Conta que possua um atributo saldo e os métodos para pegar saldo, depositar e sacar.
Adicione um método na classe Conta, que atualiza essa conta de acordo com uma taxa percentual fornecida pelo usuário.

``` Java
public void atualiza (double taxa)
```

Crie duas subclasses da classe Conta: ContaCorrente e ContaPoupanca. Ambas terão o método atualiza, isto é, método reescrito.
A classe ContaCorrente deve atualizar-se com o dobro da taxa e a ContaPoupanca deve atualizar-se com o triplo da taxa.
Além disso, a ContaCorrente deve reescrever o método deposita, a fim de retirar uma taxa bancária de dez centavos de cada depósito.
Crie uma classe com método main e instancie essas classes, atualize-as e veja o resultado.
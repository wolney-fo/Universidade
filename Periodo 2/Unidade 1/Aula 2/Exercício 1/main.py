import functions as f
import os


questoes = {
    ['pergunta']: list(),
    ['respostas']: list()
}

while True:
    print('[ 1 ] Adicionar questão\n[ 2 ] Salvar teste')
    acao = int(input('> '))
    assert 0 < acao <= 2



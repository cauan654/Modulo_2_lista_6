let listaPessoas = [
    {
        nome: 'Fulano',
        sobrenome: 'Santos',
        idade: 18
    },
    {
        nome: 'Ciclano',
        sobrenome: 'Silva',
        idade: 21
    },
    {
        nome: 'Beltrano',
        sobrenome: 'Souza',
        idade: 17
    },
    {
        nome: 'Joana',
        sobrenome: 'Pereira',
        idade: 25
    },
    {
        nome: 'Pedro',
        sobrenome: 'Almeida',
        idade: 16
    }
];

function maiorIdade(pessoas) {
    for(let i = 0; i < pessoas.length; i++) {
        let pessoa = pessoas[i];
        if(pessoa.idade >= 18) {
            console.log("Seja bem-vindo(a)! Você se chama " + $(pessoa.nome) + $(pessoa.sobrenome) + " e tem" + $(pessoa.idade) + " anos e é maior de idade.");
        } else {
            console.log("Seja bem-vindo(a)! Você se chama " + $(pessoa.nome) + $(pessoa.sobrenome) + " e tem" + $(pessoa.idade) + " anos e não é maior de idade.");
        }
    }
}

function verificaNome(pessoas) {
    for(let i = 0; i < pessoas.length; i++) {
        let pessoa = pessoas[i];
        let nomeCompleto = `${pessoa.nome} ${pessoa.sobrenome}`;
        if(nomeCompleto.length < 3) {
            console.log("Erro! Nome inválido, nome e sobrenome devem ter pelo menos 3 caracteres.");
        } else if(nomeCompleto.length > 50) {
            console.log("Erro! Nome inválido, nome e sobrenome devem ter no máximo 50 caracteres.");
        } else {
            console.log("Nome válido: " + $(nomeCompleto));
        }
    }
}

function quantidadePessoas(pessoas) {
    return pessoas.length;
}

maiorIdade(listaPessoas);
verificaNome(listaPessoas);
console.log("Número de pessoas na lista: " + $(quantidadePessoas(listaPessoas)));
Funcionalidade: Cadastro de Clientes

Narrativa:
Como um administrador
Desejo cadastrar clientes
Para obter informações a seu respeito

Cenário: Acesso ao site Cadastro de Clientes
Dado que vou para a tela "cadastro de clientes"
Então será exibido "Cadastro de Clientes"


Cenário: Sexo não informado
Dado que estou na tela "cadastro de clientes"
Quando informo "Rafaela" no campo "nome"
Quando informo "Rua a" no campo "endereco"
Quando seleciono a opção de valor "RJ" no campo "uf"
Quando seleciono a opção de valor "6" no campo "mes"
Quando seleciono a opção de valor "10" no campo "dia"
Quando seleciono a opção de valor "1992" no campo "ano"
Quando o campo "Masculino" está desmarcado
Quando seleciono a opção de valor "Solteiro(a)" no campo "estado civil"
Quando seleciono a opção "Outra forma"
Quando clico em "Enviar"
Então será exibido "Esta pergunta é obrigatória"

Cenário: Nome não informado
Dado que estou na tela "cadastro de clientes"
Quando não informo valor para o campo "nome"
Quando informo "Rua a" no campo "endereco"
Quando seleciono a opção de valor "RJ" no campo "uf"
Quando seleciono a opção de valor "6" no campo "mes"
Quando seleciono a opção de valor "10" no campo "dia"
Quando seleciono a opção de valor "1992" no campo "ano"
Quando seleciono a opção "Masculino"
Quando seleciono a opção de valor "Solteiro(a)" no campo "estado civil"
Quando seleciono a opção "TV"
Então será exibido "Esta pergunta é obrigatória"

Cenário: Caminho Feliz
Dado que estou na tela "cadastro de clientes"
Quando informo "Rodolfo" no campo "nome"
Quando informo "Rua b" no campo "endereco"
Quando seleciono a opção de valor "RJ" no campo "uf"
Quando seleciono a opção de valor "6" no campo "mes"
Quando seleciono a opção de valor "10" no campo "dia"
Quando seleciono a opção de valor "1992" no campo "ano"
Quando seleciono a opção "Masculino"
Quando seleciono a opção de valor "Solteiro(a)" no campo "estado civil"
Quando seleciono a opção "Internet"
Quando clico em "Enviar"
Então será exibido "Cadastro efetuado com sucesso!"
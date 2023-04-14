# Desafios de Código Java - BootCamp TQI Kotlin

- Desafio de Código proposto em um BootCamp da plataforma do site DIO, o qual nos faz rever o código e complementa-lo para que ele alcance os objetivos solicitados.

## Desafio 1 - Desafio com Java: Tráfego de Trânsito

- Crie um programa que simule o comportamento de um semáforo. O usuário deverá inserir um número correspondente à cor do semáforo (1 para vermelho, 2 para amarelo, 3 para verde), e o programa deve imprimir uma mensagem indicando qual a ação que deve ser tomada com base na cor selecionada.

- Para isso, utilize estruturas de controle de fluxo, como a instrução if-else if para tomar decisões com base no valor de entrada do usuário.

- Entrada
O programa espera um número inteiro correspondente à cor do semáforo (1 para vermelho, 2 para amarelo, 3 para verde). O usuário deve inserir esse número através do teclado e pressionar Enter para confirmar a entrada.

- Saída
O programa imprime uma mensagem na tela informando qual a ação que deve ser tomada, com base no número inserido:

- Explicação, abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas.
Se o número for 1, o sinal está vermelho e o programa deve imprimir "Pare! O sinal está vermelho."
Se o número for 2, o sinal está amarelo e o programa deve imprimir "Atenção! O sinal está amarelo."
Se o número for 3, o sinal está verde e o programa deve imprimir "Siga em frente! O sinal está verde."
Se o número não for 1, 2 ou 3, o programa deve imprimir "Valor inválido! Digite 1, 2 ou 3 para indicar a cor do semáforo."

## Desafio 2 - Desafio com Java: Compras na Livraria

- Crie um programa em Java para calcular o valor total de uma compra de livros em uma livraria. O programa deve perguntar o nome, o preço e a quantidade de cada livro que o cliente deseja comprar. O programa deve exibir o valor total da compra e o número de livros comprados.

- Entrada
A entrada consiste em dados informados pelo usuário via teclado. O usuário deve informar o nome do livro (uma string sem espaços), o preço do livro (um número real) e a quantidade de livros desejados (um número inteiro).

- Saída
A saída consiste em mensagens exibidas na tela do usuário. O programa deve exibir o valor total da compra, formatado com duas casas decimais, seguido do número de livros comprados. Por fim, o programa deve exibir a mensagem "Obrigado por comprar na nossa livraria!"

- Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. 

Exemplo de Entrada = Senhor dos Anéis - As Duas Torres, 29.99, 1 /  A Cor que Caiu do Espaço, 31.00, 2	                    

Exemplo de Saída = Valor total da compra: 91.99, Número de livros comprados: 3, Obrigado por comprar na nossa livraria!                          

## Desafio 3 - Desafio com Java: Idade Planetária

- Astrônomos e astrofísicos utilizam diferentes unidades de tempo para medir o tempo em outros planetas. Neste desafio de código, você deverá criar um programa que solicite a idade de uma pessoa em anos terrestres e calcule a idade equivalente em outros planetas. Para isso, considere as seguintes informações:

- Marte: 1 ano marciano dura aproximadamente 1,88 anos terrestres;
- Venus: 1 ano venusiano dura aproximadamente 0,62 anos terrestres;
- Jupiter: 1 ano jupiteriano dura aproximadamente 11,86 anos terrestres.

- Entrada
Solicitação da idade em anos terrestres através da entrada de dados do usuário;
Solicitação do planeta desejado (Marte, Venus ou Jupiter) através da entrada de dados do usuário.
O usuário deve fornecer sua idade em anos terrestres e o planeta para o qual deseja converter a idade.

- Saída
Exibição da idade equivalente em anos planetários de acordo com o planeta escolhido pelo usuário.
A saída deve ser apresentada em uma mensagem na tela, informando a idade equivalente em anos planetários para o planeta escolhido, com duas casas decimais após a vírgula. Se o planeta informado pelo usuário não for um dos três planetas mencionados acima, a mensagem "Planeta invalido." deve ser exibida.

- Exemplos
Entrada  = 30, Jupter
Saída = Idade equivalente em Jupiter: 2,53 anos

## Desafio 4 - Desafio com Java: Gerenciamento de Loja Geek

- Neste desafio, você deverá ajudar o gerente de uma loja geek a gerenciar o desempenho de seus funcionários em um determinado período. O gerente pode inserir a média das avaliações de desempenho dos funcionários e o programa irá classificar cada um deles em "APR" (bom), "MED" (médio) ou "REP" (ruim), com base em critérios predefinidos.

- Entrada
O programa solicitará ao usuário que insira a média das avaliações de desempenho dos funcionários em um determinado período.

- Saída
O programa irá classificar cada funcionário em "APR" (bom), "MED" (médio) ou "REP" (ruim), de acordo com as seguintes regras:

- Se a média da avaliação for menor que 5, o funcionário estará reprovado em seu teste e será classificado como "REP";
- Se a média da avaliação for menor que 7, mas maior ou igual a 5, o funcionário terá sua avaliação como "MED";
- Se a média for maior ou igual a 7, o funcionário está aprovado no teste de desempenho e será classificado como "APR".

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. 
    Entrada         Saída
      3              REP
      6              MED
      8              APR

## Desafio 5 - Desafio com Java: Mudança para Irlanda

- Você está planejando uma mudança para a Irlanda e precisa calcular qual será o seu salário líquido, considerando o imposto a ser pago à Receita Federal. Para isso, você precisa implementar um programa que receba como entrada o seu salário bruto e o valor dos benefícios recebidos (como vale-refeição ou vale-transporte) e calcule o imposto a ser pago, de acordo com a tabela abaixo:

  Salário Bruto     	          Alíquota
Até R$ 1.100,00	                  5%
De R$ 1.100,01 até R$ 2.500,00	10%
Acima de R$ 2.500,00	            15%

- O programa deve calcular o Imposto a ser pago de acordo com a tabela acima e, em seguida, subtrair esse valor do Salário Bruto mais os Benefícios, para obter o Salário Líquido.

- Entrada
Um valor do tipo double correspondente ao Salário Bruto.
Um valor do tipo double correspondente aos Benefícios recebidos.

- Saída
Um valor do tipo double correspondente ao salário líquido após o pagamento do imposto, formatado com 2 casas decimais. Resumidamente, podemos condensar esse cálculo por meio da seguinte fórmula:
Salário Líquido = Salário Bruto - Imposto + Benefício

- Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas:
Entrada           Saída
 1000            1050.00
 100

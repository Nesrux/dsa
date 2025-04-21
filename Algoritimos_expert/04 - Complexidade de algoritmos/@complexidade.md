## Complexidade de algoritimos

é uma medida que descreve a quantidade de recursos computacionais que um algoritimo necessita para executar, em relação ao tamanho da entrada do algoritimo.

Esses recursos podem incluir :
* tempo de execução
* espaço de memória

### Complexidade de tempo
refere-se ao `número de passos` que um algoritimo leva para complementar sua execução em função do `tamanho de entrada`

Em outras palavras :
Quanto cresce o número de passos à medida que cresce o tamanho da entrada.

### complexidade de espaço
Refere-se à `quantidade de memória` que o algoritimo necessita para o seu processamento, em função do `tamanho da entrada`.

Em outras palavras:
Quando cresce a quantidade de memória utilizada à medida que cresce o tamnho da entrada.

### Análise de BIG O de uma busca sequencial
O algoritimo análisado pode ser encontrado clicando [Aqui](./busca_sequencial.java).

#### Análise da complexidade de espaço
Independendo do caso, esse algoritimo  utiliza apenas uma variavel auxiliar (i) e esse uso de memória não se altera em função do tamanho  da entrada
`f(n) = 1 (Função constante)`

#### Análise da complexidade de espaço
O Tempo de execução do algoritimo crescre conforme o tamanho da entrada de dados.
`F(n) = n (Função linear)`

### Notação assintótica
Foca no comportamento de longo prazo de um algoritimo, ignorando constantes e termos de menor ordem que têm pouca influencia em entradas grandes.

```
n/2 -> n
4n -> n
3n² + 2n + 7 -> n²
```
A notação assintótica permite uma comparação mais limpa e mais significativa entre algoritimos.

Ele foca no termo dominante que mais influencia o crescimento quando `n` se torna muito grande.
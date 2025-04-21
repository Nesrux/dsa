## Recursividade

Recursividade é um conceito findamental na programação e matemática, onde uma função chama a si mesma diretamente ou indiretamente para resolver um problema.

Função recursiva: uma função é dita recursiva se, durante a execução , ela chama a si mesma.

`Exemplo`

```javascript
function recursivo(number) {
  if (number < 0) {
    return;
  }
  console.log(number);
  recursivo(number - 1);
}
// Vai de 10 até 0
recursivo(10);
```

Vale lembrar também que em funções recursivas é necessario existir algum critério de parada da função, pois se não ouver, acaba extourando uma exception `Maximum call stack size exceeded`

### Exemplo de aplicação

a recursividade é utilizada amplamente na computação um dos exemplos mais famosos é nos algoritimos de ordenação `QuickSort` e `MergeSort` que tem complexidade de caso médio de O(n Log n)

### Vantagens da recursividade

#### Adequação à natureza do problema

Alguns problemas são naturalmente recursivos, tais como navegação em árvores e algumas funções matemáticas. Soluções recursivas nesses casos são geralmente claras e diretas;

#### Redução de código

Algumas soluções recursivas podem ser bem mais concisas que soluções equivalantes imperativas.

#### Soluções declarativas

Soluções recursivas muitas vezes correspondem aà definição declarativa da solução, descrevendo `O quê` é a solução, em oposição a descrever `como` executar os passos de um algoritimo

Solução declarativas muitas vezes são elegantes e faceis de entender

```javascript
fatorial 0 = 1;
fatorial n = n * fatorial (n -1);
```

### Desvantagens da recursividade

#### Coonsumo de memória

Funções recursivas frequentemente usam mais memória devido à pilha de chamadas, se a reursividade for muito profunda e o número de chamadas recursivas exceder a capacidade da pilha, pode ocorrer um erro de Stack overflow

#### inadequação à natureza do problema

Alguns problemas são naturalmente imperativos, e para eles geralmente soluções umperativas são mais fáceis de elaborar.

### Casos base e casos recursivos

#### Caso base:

é a condição que interrompe a recursão.
é o ponto de parada para resolver diretamente o menor fragmento do problema.
sem um caso base apropriado, a função recursiva continuará chamando a si mesma, indefinidamente, levando a um loop infinito ou um erro de Stack overflow.

#### Caso recursivo.

é a parte da função que inclui uma ou mais chamadas para a própria função, mas com argumentos que se aproximas do caso base.
Cada chamada recursiva deve alterar os argumentos de tal forma que eles se aproximem do caso base.

```javascript
//Caso base do fatorial onde fatorial de 0  = 1
fatorial 0 = 1
// Caso recursivo
fatorial n = n * (n - 1);
```

### Pilha de chamadas

A pilha de chamadas é uma estrutura de dados usada pelo sistmea operacional e pelo ambiente de execução de linguaguens de programação para gerencias a execução de funções

### Recursividade de cauda

recursividade de cauda é uma técina que consiste em deixar a chamada recursiva como a ultima operação realizada antes da função retornar um resultado.

Em outras palavras: `nenhum processsamento` deve ser feito na função depois da chamada recursiva.

Se o compilador/interpretador da linguagem for devidamente preparado para recursiidade de cauda, a execução do programa será otimizada, sem necessidade de manter informações sobre as chamadas anteriores na pilha de chamadas.

`Exemplos: Haskell, Skala`

Compiladores de linguagens não "puramente" funcionais geralmente não oferecem essa otimização por padrão.

#### vantagens

Soluções alternaticas e mais otimizadas também podem ser constuídas com a recursividade de calda.

Exemplo: Fibonacci exponencial vs Fibonacci linear usando função auzilidar com parametros adicionais.

### Cabeça e calda

Diferentemente da recursividade de calda, existem mais 2 nomenclaturas em listas, que são calda e cabeça

#### Cabeça

A Cabeça (head) de uma lista é o primeiro elemento dessa lista

#### Calda

A Calda de uma lista é Todo o restande dessa lista desconsiderando o primeiro elemento (head)

```javascript
list = ["joao", "marcos", "rebelo"];
head = "joao";
tail = ["marcos", "rebelo"];
```

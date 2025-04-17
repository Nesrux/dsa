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
## Recursividade

Recursividade é um conceito fundamental em programação e matemática, onde uma função **chama a si mesma**, direta ou indiretamente, para resolver um problema.

---

### O que é uma Função Recursiva

Uma função é considerada recursiva quando **ela se chama durante sua execução**.

```javascript
function recursivo(number) {
  if (number < 0) return;
  console.log(number);
  recursivo(number - 1);
}

recursivo(10); // Imprime de 10 até 0
```

> ⚠️ É essencial que exista um **critério de parada**. Sem isso, a função continuará chamando a si mesma até estourar a pilha (erro: `Maximum call stack size exceeded`).

---

### Aplicações

A recursividade é comum em problemas como:
- Percurso em **estruturas de árvore**;
- Funções matemáticas como **fatorial** e **Fibonacci**;
- Algoritmos de ordenação como **QuickSort** e **MergeSort** (`O(n log n)` no caso médio).

---

### Vantagens da Recursividade

- **Adequação ao problema**: clara e natural para estruturas como árvores;
- **Redução de código**: expressões mais concisas que a versão imperativa;
- **Expressividade**: descreve "o quê" resolver, não "como" resolver.

```javascript
function fatorial(n) {
  if (n === 0) return 1;
  return n * fatorial(n - 1);
}
```

---

### Desvantagens da Recursividade

- **Uso excessivo de memória**: cada chamada ocupa espaço na pilha;
- **Erros de estouro de pilha** (stack overflow) se não houver condição de parada;
- **Pode ser ineficiente** se comparado a soluções iterativas em alguns casos.

---

### Conceitos Importantes

#### Caso Base
- Condição que **interrompe a recursão**;
- Resolve o **menor subproblema** diretamente.

#### Caso Recursivo
- Parte que **chama a si mesma**, com parâmetros **mais próximos do caso base**.

```javascript
function fatorial(n) {
  if (n === 0) return 1;        // Caso base
  return n * fatorial(n - 1);  // Caso recursivo
}
```

---

### Pilha de Chamadas

A **stack** (pilha) é usada para controlar o fluxo de chamadas. Cada chamada recursiva adiciona um novo quadro à pilha, que é removido ao retornar.

---

### Recursividade de Cauda (Tail Recursion)

Consiste em fazer a **chamada recursiva ser a última instrução da função**:

```javascript
function somaAcumulada(n, acumulador = 0) {
  if (n === 0) return acumulador;
  return somaAcumulada(n - 1, acumulador + n);
}
```

- Pode ser otimizada por alguns compiladores (como em **Haskell**, **Scala**).
- Em linguagens como JavaScript, a otimização não é garantida.

---

### Cabeça e Cauda de uma Lista

Esses conceitos aparecem bastante em recursão sobre listas:

- **Cabeça (head)**: primeiro elemento da lista.
- **Cauda (tail)**: todos os elementos restantes após a cabeça.

```javascript
const list = ["joao", "marcos", "rebelo"];
const head = list[0]; // "joao"
const tail = list.slice(1); // ["marcos", "rebelo"]
```

Esses conceitos são úteis para **recursão em listas**, especialmente em linguagens funcionais.


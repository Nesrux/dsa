# 📌 Recursividade

**Recursividade** é quando uma função chama a si mesma (direta ou indiretamente) para resolver um problema, dividindo-o em subproblemas menores.

---

## 🔁 Conceito Básico

> Uma **função recursiva** precisa ter:
- **Caso base**: ponto de parada.
- **Caso recursivo**: chamada da função com um valor reduzido, que se aproxima do caso base.

```javascript
function recursivo(n) {
  if (n < 0) return;        // Caso base
  console.log(n);           
  recursivo(n - 1);         // Caso recursivo
}
recursivo(10);  // Imprime de 10 até 0
```

⚠️ **Atenção**: Sem um caso base, ocorre erro de *"Maximum call stack size exceeded"* (estouro de pilha).

---

## 🧠 Aplicacoes Comuns

- **Ordenações**: `QuickSort`, `MergeSort` → `O(n log n)`
- **Estruturas como árvores e grafos**
- **Problemas matemáticos**: fatorial, Fibonacci etc.

---

## ✅ Vantagens

- 🧹 **Adequação ao problema**: ideal para estruturas como árvores.
- 📉 **Código conciso**: menos linhas, mais clareza.
- 🧾 **Solução declarativa**: foca no “o que fazer”, não no “como fazer”.

```javascript
// Fatorial de forma declarativa
fatorial 0 = 1;
fatorial n = n * fatorial(n - 1);
```

---

## ❌ Desvantagens

- 📈 **Maior consumo de memória**: usa a pilha de chamadas.
- ❌ **Nem sempre apropriada**: problemas imperativos podem ser melhor resolvidos com laços.

---

## 🧹 Caso Base vs Caso Recursivo

| Conceito        | Explicação                                                                 |
|------------------|---------------------------------------------------------------------------|
| **Caso base**     | Condição que finaliza a recursão. Sem ele, há loop infinito ou *stack overflow*. |
| **Caso recursivo**| Chamada da função com parâmetros que se aproximam do caso base.          |

```javascript
// Fatorial
function fatorial(n) {
  if (n === 0) return 1;         // Caso base
  return n * fatorial(n - 1);    // Caso recursivo
}
```

---

## 📚 Pilha de Chamadas

A **call stack** armazena o histórico das chamadas de função. Cada nova chamada empilha uma nova entrada; ao retornar, desempilha.

---

## 🔄 Recursividade de Cauda (*Tail Recursion*)

- A **última operação** feita é a chamada recursiva.
- Permite **otimizações** pelo compilador (*tail call optimization*), evitando o crescimento da pilha.

```javascript
function soma(n, acumulador = 0) {
  if (n === 0) return acumulador;
  return soma(n - 1, acumulador + n); // chamada na "cauda"
}
```

🧬 Suporte nativo em linguagens como **Haskell** e **Scala**.

---

## 🧱 Conceito de Cabeça e Calda em Listas

| Termo    | Significado                                    |
|----------|------------------------------------------------|
| **Head** | Primeiro elemento da lista                     |
| **Tail** | Restante da lista (sem o primeiro elemento)    |

```javascript
const list = ["joao", "marcos", "rebelo"];
const head = list[0];             // "joao"
const tail = list.slice(1);       // ["marcos", "rebelo"]
```

---


## Complexidade de Algoritmos

A complexidade de algoritmos mede os **recursos computacionais** (tempo e memória) que um algoritmo precisa para funcionar, em relação ao **tamanho da entrada**.

---

### Tipos de Complexidade

#### Complexidade de Tempo
- Mede o **número de passos** necessários para a execução.
- Cresce com o aumento da entrada.

#### Complexidade de Espaço
- Mede a **quantidade de memória** utilizada.
- Também varia conforme o tamanho da entrada.

---

### Exemplo: Análise de Complexidade da Busca Sequencial
> Código analisado: [`busca_sequencial.java`](./busca_sequencial.java)

#### Espaço
- Usa apenas uma variável auxiliar (`i`).
- Independente do tamanho da entrada.
- **Complexidade:** `O(1)` (Constante)

#### Tempo
- Executa uma verificação para cada elemento da entrada.
- **Complexidade:** `O(n)` (Linear)

---

### Notação Assintótica (Big-O)

Foca no **comportamento do algoritmo para entradas muito grandes**, ignorando constantes e termos menores:

```txt
n/2       → O(n)
4n        → O(n)
3n²+2n+7  → O(n²)
```

- Compara algoritmos de forma mais significativa.
- Considera apenas o **termo dominante**.

---

### Tabela de Complexidades Comuns

| Notação Big-O     | Tipo                     | Tratável?            |
|-------------------|--------------------------|----------------------|
| `O(1)`            | Constante                | Sim                  |
| `O(log n)`        | Logarítmica              | Sim                  |
| `O(n)`            | Linear                   | Sim                  |
| `O(n log n)`      | Log-linear               | Sim                  |
| `O(n²), O(n³)`    | Polinomial               | Sim                  |
| `O(2^n)`          | Exponencial              | Não (intratável)     |


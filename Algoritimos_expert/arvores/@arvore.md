# Árvore

uma árvore é uma estrutura de dados não linear que organiza elementos de forma **hierparquica** em nós.
Algumas implementações de arvores permitem criar coleções ordenadas, com operações eficientes de busca, inserção e remoção.

## Aplicações comuns de árvores

- Sistemas de arquivos (diretórios, pastas e arquivos)

- Interfaces gráficas, paginas web(html) e estrutura de documentos.

- Compiladores: o processo de parsing organiza os símbolos de uma linguegem em uma árvore de derivação sintática.

- Sistemas de banco de dados, sistemas com buscas atualizações frequentes: árvores avl, arvores rubro-negras, arvores B e B+

- Árvores de decisão, em sistemas de machine learning, análise de dados.

- Árvores geradoras: em sistemas de otimização, logistica, cobertura de caminhos.

## Exemplo de arvore

Aqui esta um exemplo de utilização de uma arvore que no caso é uma arvore binária ou **binary tree**, em um sistema de pastas de um projeto.

ela tem um elementento principal **root** que é a parte mais acima da arvore, que nesse caso é a pasta dsa, e possui duas filhas (nodes), que são as pastas arvores e ordenação, que por sua vez tem mais 2 filhas, e isso constitui uma arvore binária.

```
dsa/
├── arvores/
│   ├── binarias/
│   └── rubro-negras/
│
└── ordenacao/
    ├── quicksort/
    └── mergesort/
```

## Árvore genérica

São árvores de propósito geral para armazenar objetos de forma hierarquica.
Não possuem qualquer restrição específica de armazenamento dos objetos (ordenação, filhos)

## Percurso em Profundidade (DFS - Depth-First Search)

**Definição:**  
O algoritmo de busca em profundidade (DFS) explora os ramos de uma estrutura (como grafos ou árvores) o mais profundamente possível antes de retroceder.

### Funcionamento:

- Inicia-se a partir de um **nó raiz** (ou qualquer nó inicial).
- Visita **recursivamente** o primeiro filho, depois o primeiro filho do primeiro filho, e assim por diante.
- Quando um nó **não possui mais filhos não visitados**, o algoritmo **retrocede** para o nó pai.
- O processo continua até que **todos os nós** acessíveis a partir da raiz tenham sido visitados.

## Árvore Binária de Pesquisa - BST (Binary Search Tree)

**Definição:**  
A Árvore Binária de Pesquisa (BST - *Binary Search Tree*) é uma estrutura de árvore binária com a seguinte propriedade:

- Cada **nó** armazena um elemento identificado por uma **chave**.
- As **chaves são comparáveis**, ou seja, podem ser **menores**, **iguais** ou **maiores** entre si.
- Para cada nó com uma chave `K`:
  - As chaves armazenadas na **subárvore à esquerda** são **menores que K**.
  - As chaves armazenadas na **subárvore à direita** são **maiores que K**.

> **Nota:** Algumas variações permitem igualdade à esquerda ou à direita, dependendo da implementação.

---

### Complexidade da BST

| Operação   | Melhor Caso | Pior Caso |
|------------|--------------|------------|
| Busca      | O(log n)     | O(n)       |
| Inserção   | O(log n)     | O(n)       |
| Remoção    | O(log n)     | O(n)       |

- O **melhor caso** ocorre quando a árvore está **balanceada**.
- O **pior caso** ocorre quando a árvore se comporta como uma **lista encadeada**, devido a inserções ordenadas.

---

### Aplicações da BST

As BSTs são recomendadas para aplicações que envolvem muitas:

- **Consultas (buscas)**
- **Inserções**
- **Remoções**

Também são amplamente utilizadas para implementar:

- **Conjuntos**
- **Dicionários**

> Nestes casos, **não pode haver repetição de chaves**.

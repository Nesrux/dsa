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

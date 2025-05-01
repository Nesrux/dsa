# Ordenação em Estruturas de Dados  

## Visão Geral  

**Definição:**  
Ordenação é o processo de reorganizar os elementos de uma coleção (como arrays, listas, etc.) em uma sequência específica, seguindo um critério predefinido.  

**Exemplo:**  
Dado o conjunto `[10, 5, 2, -2, 20]`, podemos ordená-lo de duas formas:  
- **Ordem Crescente:** `[-2, 2, 5, 10, 20]`  
- **Ordem Decrescente:** `[20, 10, 5, 2, -2]`  

### Importância da Ordenação  
- **Eficiência na Busca:** Estruturas ordenadas permitem algoritmos de busca mais rápidos (ex: Busca Binária).  
- **Otimização de Dados:** Facilita operações como merge, filtragem e análise estatística.  

### Chave de Ordenação  
A ordenação é feita com base em uma **chave**, que pode ser:  
- **Valores Numéricos** (ex: inteiros, floats).  
- **Cadeias de Caracteres** (ex: ordem alfabética).  
- **Objetos Complexos** (ordenados por um atributo específico).  

---  

## Classificação dos Algoritmos de Ordenação  

### 1. Ordenação Interna  
- **Definição:** Os dados cabem **totalmente na memória RAM** durante a ordenação.  
- **Vantagens:**  
  - Acesso rápido aos elementos (baixa latência).  
  - Algoritmos geralmente mais eficientes.  
- **Exemplos de Algoritmos:**  
  - *Bubble Sort*, *Quick Sort*, *Merge Sort*.  

### 2. Ordenação Externa  
- **Definição:** Os dados **não cabem na RAM** e são armazenados em memória secundária (HD, SSD).  
- **Casos de Uso:**  
  - Bancos de dados com tabelas muito grandes.  
  - Processamento de big data.  
- **Desafios:**  
  - Acesso mais lento aos dados (I/O é o gargalo).  
- **Exemplos de Algoritmos:**  
  - *External Merge Sort*, *Polyphase Merge Sort*.  

---  

## Bubble Sort
também conhecido como ordenação por bolha, é um dos algoritimos mas conhecidos, no entanto é um algoritimo ineficiente quando estamos trabalhos com um grande conjunto de dados

### Como funciona ?
Basicamente tem dois passos, dado um conjunto, seja um lista ou seja um array ou qualquer outro tipo de conjunto, o algoritimo compara os valores dos elemestos adjacentes e caso esjam fora de ordem, ambos são trocados de lugar, o processo se repete até que nenhuma troca seja necessaria, idicando que os elementos estão ordenados.



Em resumo o Algoritimo é bem simples, só precisa de uma variavel auxiliar, e um for dentro de outro, a demostração do algoritimo feito em java pode ser encontrado [aqui](./BubbleSort.java)

### Complexidade
Considerando um array com N elementos, temos
* **Melhor caso**: O(n), os elementos já estão ordenados
* **Pior caso**: O(n²), os elemestos ordenaos da ordem inversa
* **Caso médio**: O(N²)

---

Aqui está sua anotação revisada, corrigida e aprimorada, mantendo o mesmo padrão do modelo que você me enviou. Também adicionei explicações complementares para reforçar o entendimento:

---

## Selection Sort

---

**Definição:**
Também conhecido como **Algoritmo de Ordenação por Seleção**, o *Selection Sort* é um dos algoritmos de ordenação mais simples e conhecidos na computação. Em comparação com o *Bubble Sort*, ele é geralmente mais eficiente, embora ainda seja ineficiente para grandes volumes de dados.

### Como Funciona?

O algoritmo segue um processo iterativo onde, a cada passo:

1. **Encontra o menor elemento** do array não ordenado.
2. **Troca esse elemento com o primeiro elemento** da parte não ordenada, colocando-o em sua posição correta.
3. **Repete o processo** para o restante do array (excluindo os elementos já ordenados), movendo a fronteira da ordenação para frente.

Esse processo continua até que todo o array esteja ordenado.

**Exemplo passo a passo:**

Array original: `[29, 10, 14, 37, 13]`

```
Passo 1: Encontra o menor (10) e troca com o 1º
[10, 29, 14, 37, 13]

Passo 2: Encontra o menor no restante (13) e troca com o 2º
[10, 13, 14, 37, 29]

Passo 3: Menor no restante é 14 (já está no lugar)
[10, 13, 14, 37, 29]

Passo 4: Encontra o menor (29) e troca com o 4º
[10, 13, 14, 29, 37]

Passo 5: Último elemento já está ordenado
```

---

### Complexidade

O algoritmo de ordenação *Selection Sort* possui a **mesma complexidade de tempo** para todos os casos, pois ele sempre realiza o mesmo número de comparações, independentemente da ordem dos dados.

* **Tempo (Melhor, Médio e Pior caso):** O(**N²**)

  * O número de comparações é sempre `N * (N - 1) / 2`.
* **Espaço:** O(**1**)

  * Não utiliza memória extra além das variáveis auxiliares.

---

### Observações

* O *Selection Sort* realiza **menos trocas** do que o *Bubble Sort*, o que pode torná-lo mais vantajoso em certos contextos.
* Ainda assim, **não é recomendado** para conjuntos de dados muito grandes devido à sua complexidade quadrática.
* É útil em situações onde o custo de escrita na memória é mais relevante do que o custo das comparações.

---


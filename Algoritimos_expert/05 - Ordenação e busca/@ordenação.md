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

Aqui está sua anotação revisada e aprimorada para os tópicos **Insertion Sort** e **Merge Sort**, seguindo o mesmo padrão limpo e explicativo anterior. Fiz correções gramaticais, clareza de ideias e acrescentei observações úteis para estudo.

---

## Insertion Sort

---

**Definição:**
Também conhecido como **Algoritmo de Ordenação por Inserção**, o *Insertion Sort* é eficiente para **conjuntos pequenos de dados**. Em muitos casos, chega a ser mais rápido que algoritmos mais sofisticados como **Merge Sort** e **Quick Sort**, especialmente quando o array está quase ordenado.

---

### Funcionamento do Algoritmo

O algoritmo funciona de forma semelhante à maneira como organizamos cartas de baralho na mão:

1. Para cada posição `k` no array (a partir da segunda posição), verifica-se se o elemento está na posição correta.
2. Compara-se o valor de `array[k]` com os elementos **à esquerda** dele.
3. Todos os elementos **maiores** que `array[k]` são deslocados **uma posição para a direita**.
4. Abre-se assim uma posição onde o `array[k]` pode ser **inserido** corretamente.
5. Esse processo se repete até que o array esteja ordenado.

**Exemplo (parcial):**

```plaintext
Array inicial: [8, 3, 5, 1]

Passo 1: Compara 3 com 8 → move 8 → insere 3
[3, 8, 5, 1]

Passo 2: Compara 5 com 8 → move 8; compara com 3 → insere 5
[3, 5, 8, 1]

Passo 3: Compara 1 com 8, 5, 3 → move todos → insere 1
[1, 3, 5, 8]
```

---

### Complexidade

* **Melhor caso:** O(**n**) (array já ordenado)
* **Pior caso:** O(**n²**) (array em ordem inversa)
* **Caso médio:** O(**n²**)
* **Espaço:** O(**1**) – algoritmo in-place (não usa memória adicional significativa)

---

### Observações

* Muito eficiente para **arrays quase ordenados**.
* É **estável** (não altera a ordem relativa de elementos iguais).
* Poucas trocas comparado com Bubble Sort.

📄 Exemplo em Java: [InsertionSort.java](./InsertionSort.java)

---

## Merge Sort

---

**Definição:**
Também chamado de **Ordenação por Junção/Intercalação**, o *Merge Sort* é um algoritmo **recursivo** baseado na técnica **divide e conquista**. A ideia é dividir o problema em partes menores, resolver essas partes e então combinar (mesclar) as soluções.

---

### Funcionamento do Algoritmo

O processo é:

1. **Divide** recursivamente o array em duas partes.
2. Continua dividindo até que cada subarray contenha apenas **um elemento**.
3. **Mescla (merge)** os subarrays de forma ordenada.
4. Repete o processo até reconstruir um único array ordenado.

**Exemplo de execução:**

```plaintext
Array inicial: [8, 3, 5, 1]

Divide: [8, 3] e [5, 1]
Divide: [8], [3], [5], [1]
Combina: [3, 8], [1, 5]
Combina: [1, 3, 5, 8]
```

---

### Complexidade

* **Melhor caso:** O(**n log n**)
* **Pior caso:** O(**n log n**)
* **Caso médio:** O(**n log n**)
* **Espaço:** O(**n**) – requer memória auxiliar para armazenar as subdivisões

---

### Observações

* Muito eficiente mesmo com grandes volumes de dados.
* **Estável**
* Utilizado em bibliotecas de ordenação padrão de várias linguagens (como Python e Java).
* Sua maior desvantagem é a necessidade de **memória extra**.

📄 Exemplo em Java: [MergeSort.java](./MergeSort.java)

---

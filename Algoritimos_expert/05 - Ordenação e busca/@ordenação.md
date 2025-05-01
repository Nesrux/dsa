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

## Selection Sort
Também conhecido como Algoritimo de **Ordenação por seleção**, é um dos algoritimos mais utilizados na computação em geral, o Selection sort é mais eficiente quando comparado com o bublle sort, no entanto, seu desempenho reduz significativamente a medida que o número do elemenro no array aumenta, também é um dos algoritimos de ordenação mais simples, e funciona da seguinte forma
* Procura o menor elemento do array e seleciona-o. em seguida, troca de posição com a primeira possição do array, ou seja, o elemento é colocado na posição correta.
* em seguida, procura o próximo valor, seleciona-o e troca colocando este elemento na segunda posição.
*este processo é repetido até que todo o array esteja ordenado.

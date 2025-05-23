# Visão Geral

**Dicionários** são estruturas de dados onde o armazenamento e a recuperação das informações são, em geral, **não ordenados** e baseados em **tabelas hash**.  
O acesso aos elementos é feito por meio de uma **chave única**, sendo extremamente eficiente, com **complexidade média de tempo igual a O(1)**.

---

## Principais Implementações

### TreeSet / TreeMap

- Mais lento, porém mantém os elementos **ordenados**.
- Implementado com estruturas de **árvores binárias de busca balanceadas**, como:
  - **Árvore AVL**
  - **Árvore Rubro-Negra**
- **Complexidade de acesso, inserção e remoção:** O(log n)

---

### HashSet / HashMap

- Mais rápido, porém **não mantém ordenação**.
- Baseado em **tabelas hash**.
- **Complexidade de acesso, inserção e remoção (caso ideal):** O(1)
- **Pior caso (muitas colisões):** O(n)

---

### Colisão em Tabelas Hash

**Colisão** ocorre quando duas chaves distintas geram o **mesmo índice** na tabela hash.

#### Tratamento de colisões:

- **Chaining** (Encadeamento):  
  Cada posição da tabela aponta para uma **estrutura auxiliar** (geralmente uma lista ou árvore) que armazena os elementos colididos.

- **Endereçamento Aberto**:  
  Em vez de usar uma estrutura auxiliar, o algoritmo procura outra posição livre na própria tabela.

---

# Dicionários (Mapas)

Um **dicionário** (também conhecido como **mapa**) é uma coleção de pares **chave-valor**, onde cada **chave é única**.

### Características:

- Os elementos **não possuem ordem definida**.
- Não é possível acessar elementos por **índice**, como em arrays ou listas.
- O acesso é feito **exclusivamente pela chave**.
- Não é permitido duplicar chaves.

---

## Aplicações Comuns de Dicionários

- **Contagem de frequência**:  
  Ex: contar o número de ocorrências de palavras em um texto.

- **Caching e memorização**:  
  Guardar o resultado de operações custosas para evitar repetição de cálculos.

- **Indexação**:  
  Utilizado em sistemas de busca, bancos de dados, e em algoritmos de recuperação de dados eficientes.

- **Mapeamento chave-valor em geral**:  
  Cookies, armazenamento local em navegadores, carrinhos de compras, compiladores, tabelas de símbolos, etc.

## Principais Implementações

### Árvores (TreeMap / TreeSet)

- Mais lentas, porém mantêm os elementos **ordenados** e com desempenho **mais previsível**.
- Implementação interna baseada em **árvores binárias de busca balanceadas**, como:
  - **Árvore AVL**
  - **Árvore Rubro-Negra**

**Complexidade (acesso, inserção e remoção):**  
`O(log n)`

---

### Tabela Hash (HashMap / HashSet)

- Mais rápidas, porém **não garantem ordenação** dos elementos.
- Implementação baseada em **tabela hash**.

**Complexidade (ideal):**  
`O(1)` — tempo constante para acesso, inserção e remoção.

**Atenção:**  
Se a função hash for mal construída ou houver muitas colisões, as operações podem se degradar para  
`O(n)` no **pior caso**.

**Fatores que influenciam o desempenho:**
- Qualidade da **função hash**
- Estratégia de **tratamento de colisões**

# Visão Geral

**Pilhas** e **Filas** são **estruturas de dados lineares** com regras específicas de **inserção** e **remoção** de elementos. São fundamentais em diversos contextos da ciência da computação e mais adequadas para a **resolução de problemas específicos**, como algoritmos de navegação, análise sintática, controle de fluxo, entre outros.

---

## Estruturas Lineares

São estruturas **sequenciais e ordenadas**, ou seja, existe uma **posição definida** para cada elemento, com a noção clara de “antes” e “depois”.

### Exemplos:

* **Array**
* **Lista**
* **Pilha**
* **Fila**

Essas estruturas permitem percorrer os elementos em uma ordem previsível (linear), sendo úteis em algoritmos que exigem acesso sequencial.

---

## Estruturas de Dados Não Lineares

Ao contrário das estruturas lineares, as **estruturas não lineares** não organizam seus dados em uma sequência única. Elas podem representar relações mais complexas, como **hierarquias**, **conjuntos**, ou **ligações múltiplas** entre elementos.

### Exemplos:

* **Conjuntos**
* **Dicionários (Mapas)**
* **Árvores**
* **Grafos**
* **Tabelas Hash (Hash Tables)**

Essas estruturas são mais adequadas para modelar relações como **genealogias, redes de computadores, ou mapas de navegação**.

---

## Problema Exemplo: `isBalanced`

Crie uma função que verifica se os **parênteses** em uma string estão **corretamente balanceados**. Em outras palavras, cada parêntese de abertura `(` deve ter um correspondente de fechamento `)`, e a ordem deve ser respeitada.

---

### Regras:

* Para cada `(` deve haver um `)` correspondente.
* O fechamento deve seguir a ordem correta (não pode fechar antes de abrir).

---

### Exemplo 1:

| Entrada  | Saída |
| -------- | ----- |
| `(())()` | True  |

### Exemplo 2:

| Entrada | Saída |
| ------- | ----- |
| `())(`  | False |

---

O arquivo da resolução do problema esta em[Isbalance.java](IsBalance.java)
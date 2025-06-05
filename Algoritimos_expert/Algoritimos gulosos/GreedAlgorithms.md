# Algoritmos Gulosos (Greedy Algorithms)

## Definição

Um algoritmo guloso (*greedy*) resolve um problema fazendo uma **sequência de escolhas locais ótimas**, ou seja, toma sempre a decisão que **parece ser a melhor no momento**, esperando que isso leve a uma **solução global ótima**.

- É comumente utilizado em problemas de **otimização**, onde se deseja **maximizar** ou **minimizar** um determinado valor.
- Uma característica marcante é que **nunca volta atrás** para reconsiderar decisões anteriores.

---

## Quando usar algoritmos gulosos?

Para que um algoritmo guloso funcione corretamente, o problema precisa satisfazer duas propriedades:

### 1. Subestrutura ótima

A **solução ótima** do problema completo **contém soluções ótimas para os subproblemas**.

### 2. Propriedade gulosa

A escolha local ótima **conduz à solução global ótima**.  
Ou seja, não é necessário reavaliar decisões anteriores.

> Se o problema não possuir essas propriedades, o algoritmo guloso pode não produzir a solução correta.

---

## Problemas Clássicos

### Problema das Moedas (*Coin Change Problem*)

**Descrição:**  
Dado um valor `V` e um conjunto de `N` moedas com valores fixos, encontrar o **número mínimo de moedas** cuja soma seja exatamente `V`.

- Assume-se que é **sempre possível** representar `V` com as moedas fornecidas.
- Pode-se usar **quantas moedas quiser** de cada tipo.

**Exemplo:**  
Conjunto de moedas: `[25, 10, 5, 1]`  
Valor: `V = 37`

**Solução com algoritmo guloso:**
Passo 1: 37 - 25 = 12 → moeda usada: 25
Passo 2: 12 - 10 = 2 → moeda usada: 10
Passo 3: 2 - 1 = 1 → moeda usada: 1
Passo 4: 1 - 1 = 0 → moeda usada: 1


**Resultado:** `[25, 10, 1, 1]` → 4 moedas

>  Importante: nem sempre o algoritmo guloso produz a solução ideal.
> 
> Exemplo: moedas `[1, 3, 4]` para `V = 6` → guloso escolhe `4 + 1 + 1`, mas o ideal seria `3 + 3`.

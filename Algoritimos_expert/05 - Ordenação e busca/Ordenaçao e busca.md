## Busca e Ordenação

### Busca

Busca é o processo de localizar um valor específico dentro de um conjunto de dados. Esse valor é comparado com uma **chave** presente em cada elemento da estrutura (como arrays, listas ou registros).

Antes de definir o algoritmo de busca, considere:
- Se os dados estão estruturados;
- Se estão ordenados;
- Se há registros duplicados.

Essas informações influenciam diretamente na escolha do método mais eficiente.

### Busca Sequencial

A busca sequencial, também chamada de linear, percorre a estrutura do início ao fim, comparando cada item com o valor desejado. Caso o valor seja encontrado, retorna sua posição. Se não for, retorna -1. Não exige que os dados estejam ordenados.

#### Funcionamento
- Inicia pelo primeiro elemento do conjunto;
- Compara item a item com a chave procurada;
- Se o item for igual à chave, a posição é retornada;
- Caso contrário, o processo segue até o último elemento;
- Se nenhum item corresponder, a busca retorna -1.

#### Exemplo em JavaScript
```javascript
function buscaSequencial(arr, chave) {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === chave) {
      return i; // Encontrado na posição i
    }
  }
  return -1; // Não encontrado
}


const dados = [10, 3, 7, 9, 5];
const resultado = buscaSequencial(dados, 9);
console.log(resultado); // Saída: 3
```
O exemplo do algoritimo esta [`Aqui`](../04%20-%20Complexidade%20de%20algoritmos/busca_sequencial.java)


#### Ilustração
```
Índices:       0   1   2   3   4
Valores:      [10,  3,  7,  9,  5]
                            ↑
                    Encontrado aqui
```

#### Complexidade
Considerando um array com N elementos.
 * O melhor caso é : O(1), o elemento é o primeiro do array
 * Pior caso é : O(N) o elemento é o ultimo do array ou não existe
 * Caso médio : O (n/2)

 ### Busca binária
 Uma estratégia mais sofisticada de busca é a busca binparia, sendo esta a forma mais eficiente de buscar um elemento em um array

 para aplicar o algoritimo de busca binária, vamos assumor que os dados estão todos **ordenados**

 A busca binária é baseado no principio **Dividir para consquistar**, onde um problema maior é dividido em um sub-problema

O algoritimo funciona da seguinte forma, a cada passo obtemos o elemento centtrario do array.
* Se o valor deste elemento for igual ao elemento que estamos buscando a busca termina.
*se o elemento do meio for maior que o elmento que estamos buscando, então reduzimos a busca a metade inferior do array.
*caso contrario reduzimos a busca à metade superior do array.


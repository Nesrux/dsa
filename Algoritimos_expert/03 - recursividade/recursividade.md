## Recursividade

Recursividade é um conceito findamental na programação e matemática, onde uma função chama a si mesma diretamente ou indiretamente para resolver um problema.

Função recursiva: uma função é dita recursiva se, durante a execução , ela chama a si mesma.

`Exemplo`

```javascript
function recursivo(number) {
  if (number < 0) {
    return;
  }
  console.log(number);
  recursivo(number - 1);
}
// Vai de 10 até 0
recursivo(10)
```

Vale lembrar também que em funções recursivas é necessario existir algum critério de parada da função, pois se não ouver, acaba extourando uma exception `Maximum call stack size exceeded`

### Exemplo de aplicação
a recursividade é utilizada amplamente na computação um dos exemplos mais famosos é nos algoritimos de ordenação `QuickSort` e `MergeSort` que tem complexidade de caso médio de O(n Log n)

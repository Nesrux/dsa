package main

import "fmt"

/*
Binary Search é um algoritimo de busca que funciona em O(Log N), ou seja quanto maior a lista, menos iterações
o algoritimo precisa fazer para encontrar oque ele busca, o problema é que ele precisa de uma lista ordenada
para funcionar corretamente!
*/
func binary_serch(lista []int, item int) int {
	//baixo e alto acompanham a parte da lista que você esta procurando.
	baixo := 0
	alto := len(lista)
	//Enquanto ainda não conseguiu chegar a um único elemento
	for baixo <= alto {
		//Verifica o elemento central
		meio := (baixo + alto) / 2
		chute := lista[meio]
		//Encontra o item
		if chute == item {
			return meio
		}
		//O chute foi muito alto
		if chute > item {
			alto = meio - 1
			//O chute foi muito baixo
		} else {
			baixo = meio + 1
		}
	}
	//O item não existe
	return -1
}

func main() {
	minha_lista := []int{1, 3, 4, 6, 7, 11, 34, 65, 123}
	fmt.Println(binary_serch(minha_lista, 6))  //Item esta na 3 posição
	fmt.Println(binary_serch(minha_lista, 35)) // item não existe
}

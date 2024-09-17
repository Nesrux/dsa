package main

import "fmt"

func fatorial(x int64) int64 {
	if x == 1 {
		return 1
	} else {
		return x * fatorial(x-1)
	}
}
func Fibonacci(number int) int {
	//Essa condição valida se o número passado por parâmtero é uma das constantes
	//definidas pela fórmula de Fibonacci. Se o valor de "number" for 0 ou 1,
	//o mesmo valor é retornado
	if number<= 1 {
		return number
	}
	return Fibonacci(number-1) + Fibonacci(number-2)
}

func regressiva(i int) {
	fmt.Println(i)
	if i <= 1 { //Caso base
		return
	} else { //Caso recursivo
		regressiva(i - 1)
	}

}

func main() {
	//regressiva(10)
	fmt.Println(Fibonacci(40))
	//fmt.Println(fatorial(25))
}

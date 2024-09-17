package main

import "fmt"

func fatorial(x int64) int64 {
	if x == 1 {
		return 1
	} else {
		return x * fatorial(x-1)
	}
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
	regressiva(10)
	fmt.Println(fatorial(25))
}

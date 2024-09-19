package main

import "fmt"

func quickSort(list []int) []int {
	if len(list) < 2 {
		return list
	} else {
		pivot := list[0]
		var menor = []int{}
		var maior = []int{}
		for _, num := range list[1:] {
			if pivot > num {
				menor = append(menor, num)
			} else {
				maior = append(maior, num)
			}
		}
		menor = append(quickSort(menor), pivot)
		maior = quickSort(maior)
		return append(menor, maior...)
	}
}
func main() {
	fmt.Println(quickSort([]int{10, 4, 3, 20, 33, 5, 2}))
}

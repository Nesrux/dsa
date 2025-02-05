package main

import "fmt"

func loopSum(arr []int) int {
	total := 0
	for _, num := range arr {
		total += num
	}
	return total
}
func recursiveSum(arr []int) int {
	if len(arr) == 0 {
		return 0
	}
	return arr[0] + recursiveSum(arr[1:])
}

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
	fmt.Println(loopSum([]int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}))
	fmt.Println(recursiveSum([]int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}))

}

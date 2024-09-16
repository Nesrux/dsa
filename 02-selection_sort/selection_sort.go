package main

import "fmt"

func buscarMenor(arr []int) int {
	// Stores the smallest value
	smallest := arr[0]

	// Stores the index of the smallest value
	smallest_index := 0
	for i := 1; i < len(arr); i++ {
		if arr[i] < smallest {
			smallest = arr[i]
			smallest_index = i
		}
	}
	return smallest_index

}

func BuscarMenor(arr []int) int {
	//Guarda o menor valor
	menor := arr[0]

	//Guarda o index do menor valor
	menor_index := 0

	for i := 1; i < len(arr); i++ {
		if arr[i] < menor {
			menor = arr[i]
			menor_index = 1
		}
	}
	return menor_index
}
func selection_sort(arr []int) []int {
	size := len(arr)
	newArr := make([]int, size)

	for i := 0; i < size; i++ {
		menor := BuscarMenor(arr)
		newArr[i] = arr[menor]
		arr = append(arr[:menor], arr[menor+1:]...)
	}
	return newArr
}

func main() {

	s := []int{5, 3, 6, 2, 10, 34, 11, 340, 43}
	fmt.Println(selection_sort(s))
}
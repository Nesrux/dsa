public class BuscaBinaria {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        int num = 9;

        System.out.println(busca_binaria(numeros, num)); // saida 4
    }
    

    public static int busca_binaria(int[] arr, int num) {
        int inicio = 0;
        int fim = arr.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (arr[meio] == num) {
                return meio; // Encontrado
            } else if (arr[meio] < num) {
                inicio = meio + 1; //metade da direita
            } else {
                fim = meio - 1; // Buscar na metade esquerda
            }
           
        }
        return -1; // Não encontrado
    }

}

package arvores;

import arvores.generic.GenericTree;
import arvores.generic.Position;

public class Test_GerericTree {
    public static void main(String[] args) {

        GenericTree<String> myTree = new GenericTree<>();

        var root = myTree.add("Livro azul", null);

        var intro = myTree.add("Introdução", root);
        myTree.add("para quem é este livro", intro);
        myTree.add("agradecimentos", intro);

        var cap1 = myTree.add("Capitulo 1", root);
        myTree.add("Oque é azul", cap1);
        myTree.add("sertamente não é vermelho", cap1);

        var cap2 = myTree.add("Capitulo 2", root);
        myTree.add("Circulo cromático", cap2);
        myTree.add("Ondas e frequencias", cap2);
        myTree.add("Reflexão e refração", cap2);
        myTree.add("Azul ??? ", cap2);
        
        //Print dfs PRE ORDER
        print(myTree);
     
    }

    public static void print(GenericTree<String> tree) {
        printRecursive(tree.root(), tree, 0);
    }

    public static void printRecursive(Position<String> position, GenericTree<String> tree, int depth) {
      var spaces = "    ".repeat(depth);
        System.out.println(spaces + " " +position.element());
        for(var child : tree.children(position)){
           printRecursive(child, tree, depth + 1);
        }

    }

}

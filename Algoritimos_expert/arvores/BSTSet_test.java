package arvores;

import java.util.Arrays;

import arvores.BSTree.BinarySearchTreeSet;

public class BSTSet_test {
    public static void main(String[] args) {
        var bst = new BinarySearchTreeSet<Integer>();
        System.out.println("Size: " + bst.size());
        System.out.println("IsEmpty: " + bst.isEmpty());
        bst.addAll(Arrays.asList(1, 5, 79, 56, 48, 971, 567, 65, 64, 11, 568, 49, 345));
        bst.add(11);

        System.out.println("Size: " + bst.size());
        System.out.println("IsEmpty: " + bst.isEmpty());
        System.out.println(bst.contains(79));
        System.out.println("removed : " + bst.remove(0));
        System.out.println("Size: " + bst.size());

    }

}

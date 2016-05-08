//
// binary search tree
// Created by sulvtu on 16-4-26.
//

#ifndef DATASTRUCTURES_BINARYSEARCHTREE_H
#define DATASTRUCTURES_BINARYSEARCHTREE_H


#include "LinkedBinaryTree.h"
#include "BinaryTreeNode.h"

template<class E>
class BinarySearchTree : LinkedBinaryTree<E> {
private:
    BinaryTreeNode<E> *root;
    int treeSize;

public:

     E *find(const E e) const;

     void remove(const E e) ;

     void insert(const E e) ;

};

#endif //DATASTRUCTURES_BSTREE_H

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

    virtual E *find(const E &) const;

    virtual void remove(const E &) = 0;

    virtual void insert(const E &) = 0;

};

#endif //DATASTRUCTURES_BSTREE_H

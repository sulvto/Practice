//
// binary search tree
// Created by sulvtu on 16-4-26.
//

#ifndef DATASTRUCTURES_BINARYSEARCHTREE_H
#define DATASTRUCTURES_BINARYSEARCHTREE_H


#include "LinkedBinaryTree.h"
#include "BinaryTreeNode.h"

template<class K, class E>
class BinarySearchTree : LinkedBinaryTree<pair<const K, E>> {
private:
    BinaryTreeNode<pair<const K, E>> *root;
    int treeSize;

public:

    virtual pair<const K, E> *find(const K &) const;

    virtual void remove(const K &) = 0;

    virtual void insert(const pair<const K, E> &) = 0;

};

#endif //DATASTRUCTURES_BSTREE_H

//
// Created by sulvto on 16-4-29.
//

#ifndef DATASTRUCTURES_AVLTREE_H
#define DATASTRUCTURES_AVLTREE_H

#include "BinarySearchTree.h"

template<class E>
class AVLTree{
private:
    BinaryTreeNode<E> *root;
    int treeSize;

    void print(BinaryTreeNode<E> *node);

public:


    BinaryTreeNode<E> *leftLeftRotation(BinaryTreeNode<E> node);

    BinaryTreeNode<E> *leftRightRotation(BinaryTreeNode<E> node);

    BinaryTreeNode<E> *rightLeftRotation(BinaryTreeNode<E> node);

    BinaryTreeNode<E> *rightRightRotation(BinaryTreeNode<E> node);


    void remove(const E e);

    void insert(const E e);

    void insert(BinaryTreeNode<E> node, const E e);

    void remove(BinaryTreeNode<E> node, const E e);


    void print();

};


#endif //DATASTRUCTURES_AVLTREE_H

//
// Created by sulvto on 16-4-29.
//

#ifndef DATASTRUCTURES_AVLTREE_H
#define DATASTRUCTURES_AVLTREE_H

#include "BinarySearchTree.h"

template<class E>
class AVLTree : BinarySearchTree<E> {
private:
    BinaryTreeNode<E> *root;
    int treeSize;
public:


    BinaryTreeNode<E> *leftLeftRotation(BinaryTreeNode node);

    BinaryTreeNode<E> *leftRightRotation(BinaryTreeNode node);

    BinaryTreeNode<E> *rightLeftRotation(BinaryTreeNode node);

    BinaryTreeNode<E> *rightRightRotation(BinaryTreeNode node);


    virtual void remove(const E &) = 0;

    virtual void insert(E &) = 0;

    virtual void insert(BinaryTreeNode<E> node, const E &);

    virtual void remove(BinaryTreeNode node, const E &theE);
};


#endif //DATASTRUCTURES_AVLTREE_H

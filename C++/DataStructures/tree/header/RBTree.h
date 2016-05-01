//
// Red-Black Tree
// Created by sulvto on 16-5-1.
//

#ifndef DATASTRUCTURES_RBTREE_H
#define DATASTRUCTURES_RBTREE_H

#include "BinarySearchTree.h"

template<class E>
class RBTree : BinarySearchTree<E> {
private:
    BinaryTreeNode<E> *root;
    int treeSize;
public:

    /**
     *        px                     px
     *        /                      /
     *       x                      y
     *      /  \                   /  \
     *     lx   y                 x   ry
     *         / \               / \
     *        ly  ry            lx  ly
     *
     *        x.leftRotation
     */
    BinaryTreeNode<E> *leftRotation(BinaryTreeNode node);


    /**
     *            py                      py
     *           /                       /
     *          y                       x
     *         /  \                    /  \
     *        x   ry                  lx   y
     *       / \                          / \
     *      lx  rx                       rx  ry
     *
     *      y.rightRotation
     */
    BinaryTreeNode<E> *rightRotation(BinaryTreeNode node);


    virtual void remove(const E &) = 0;

    virtual void insert(E &) = 0;
};


#endif //DATASTRUCTURES_RBTREE_H

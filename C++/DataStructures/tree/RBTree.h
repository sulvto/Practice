//
// Red-Black Tree
//  A node is either red or black.
//  The root is black. This rule is sometimes omitted. Since the root can always be changed from red to black, but not necessarily vice versa, this rule has little effect on analysis.
//  All leaves (NIL) are black.
//  If a node is red, then both its children are black.
//  Every path from a given node to any of its descendant NIL nodes contains the same number of black nodes. Some definitions: the number of black nodes from the root to a node is the node's black depth; the uniform number of black nodes in all paths from root to the leaves is called the black-height of the red–black tree.[17]
//
// Created by sulvto on 16-5-1.

#ifndef DATASTRUCTURES_RBTREE_H
#define DATASTRUCTURES_RBTREE_H

#include "BinarySearchTree.h"
#include "../stack/ArrayStack.h"

enum class NodeColor {
    red, black
};


template<class E>
class RBTree : BinarySearchTree<pair<E, NodeColor>> {
private:
    BinaryTreeNode<pair<E, NodeColor>> *root;
    int treeSize;

    void insertCase1(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                     BinaryTreeNode<pair<E, NodeColor>> *n);

    void insertCase2(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                     BinaryTreeNode<pair<E, NodeColor>> *n);


    void insertCase3(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                     BinaryTreeNode<pair<E, NodeColor>> *n);


    void insertCase4(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                     BinaryTreeNode<pair<E, NodeColor>> *n);

    void insertCase5(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                     BinaryTreeNode<pair<E, NodeColor>> *n);


public:

    /**
     *       |                      |
     *       x                      y
     *      /  \                   /  \
     *     lx   y                 x   ry
     *         / \               / \
     *        ly  ry            lx  ly
     *
     *        x.leftRotation
     */
    BinaryTreeNode<pair<E, NodeColor>> *leftRotation(BinaryTreeNode<pair<E, NodeColor>> node);


    /**
     *
     *          |                       |
     *          y                       x
     *         /  \                    /  \
     *        x   ry                  lx   y
     *       / \                          / \
     *      lx  rx                       rx  ry
     *
     *      y.rightRotation
     */
    BinaryTreeNode<pair<E, NodeColor>> *rightRotation(BinaryTreeNode<pair<E, NodeColor>> node);


    void remove(const E e);

    void insert(E e);
};


#endif //DATASTRUCTURES_RBTREE_H

//
// Created by sulvto on 16-4-29.
//

#ifndef DATASTRUCTURES_AVLTREE_H
#define DATASTRUCTURES_AVLTREE_H

#include "BinarySearchTree.h"

template<class K, class E>
class AVLTree : BinarySearchTree<pair<const K, E>> {
    BinaryTreeNode<pair<const K, E>> *leftLeftRotation(BinaryTreeNode<pair<const K, E>> &node);

    BinaryTreeNode<pair<const K, E>> *leftRightRotation(BinaryTreeNode<pair<const K, E>> &node);

    BinaryTreeNode<pair<const K, E>> *rightLeftRotation(BinaryTreeNode<pair<const K, E>> &node);

    BinaryTreeNode<pair<const K, E>> *rightRightRotation(BinaryTreeNode<pair<const K, E>> &node);

};


#endif //DATASTRUCTURES_AVLTREE_H

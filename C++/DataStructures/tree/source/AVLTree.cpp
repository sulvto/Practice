//
// Created by sulvto on 16-4-29.
//
#include "../header/AVLTree.h"

template<class K, class E>
BinaryTreeNode<pair<const K, E>> *AVLTree<K, E>::leftLeftRotation(BinaryTreeNode<pair<const K, E>> &node) {
    BinaryTreeNode<pair<const K, E>> *lc = node.leftChild;
    node.leftChild = lc->rightChild;
    lc->rightChild = &node;
    return lc;
};

template<class K, class E>
BinaryTreeNode<pair<const K, E>> *AVLTree<K, E>::leftRightRotation(BinaryTreeNode<pair<const K, E>> &node) {
    BinaryTreeNode<pair<const K, E>> *pNode = rightRightRotation(*node.rightChild);
    return leftLeftRotation(*pNode);
};

template<class K, class E>
BinaryTreeNode<pair<const K, E>> *AVLTree<K, E>::rightLeftRotation(BinaryTreeNode<pair<const K, E>> &node) {
    BinaryTreeNode<pair<const K, E>> *pNode = leftLeftRotation(*node.rightChild);
    return rightRightRotation(*pNode);
};

template<class K, class E>
BinaryTreeNode<pair<const K, E>> *AVLTree<K, E>::rightRightRotation(BinaryTreeNode<pair<const K, E>> &node) {
    BinaryTreeNode<pair<const K, E>> *rc = node.rightChild;
    node.rightChild = rc->rightChild;
    rc->leftChild = &node;
    return rc;
};
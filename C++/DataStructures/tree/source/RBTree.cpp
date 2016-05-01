//
// Created by sulvto on 16-5-1.
//

#include "../header/BinaryTreeNode.h"
#include "../header/RBTree.h"

template<class E>
BinaryTreeNode *RBTree::leftRotation(BinaryTreeNode node) {
    BinaryTreeNode *y = node.rightChild;
    node.rightChild = y->leftChild;
    y->leftChild = &node;
    return y;
}

template<class E>
BinaryTreeNode *RBTree::rightRotation(BinaryTreeNode node) {
    BinaryTreeNode *x = node.rightChild;
    node.rightChild = x->leftChild;
    x->leftChild = &node;
    return x;
}


template<class E>
void RBTree::insert(const E &) {

}




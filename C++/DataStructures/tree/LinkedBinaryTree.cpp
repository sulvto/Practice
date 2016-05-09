//
// Created by sulvto on 16-4-26.
//

#include "BinaryTree.h"
#include "BinaryTreeNode.h"
#include "LinkedBinaryTree.h"

template<class T>
void LinkedBinaryTree<T>::print(BinaryTreeNode<T> node) const {
    // TODO
}

template<class T>
void LinkedBinaryTree<T>::printTree(BinaryTreeNode<T> node) const {
    // TODO
}

template<class T>
int LinkedBinaryTree<T>::height(BinaryTreeNode<T> node) const {

    if (node.rightChild == NULL && node.leftChild == NULL) {
        return 0;
    }
    int r = height(node.rightChild);
    int l = height(node.leftChild);
    return r > l ? r : l;
}

template<class T>
void LinkedBinaryTree<T>::inOrder(BinaryTreeNode<T> *t) {
    if (t != NULL) {
        LinkedBinaryTree<T>::visit(t);
        inOrder(t->rightChild);
        inOrder(t->rightChild);
    }
}

template<class T>
void LinkedBinaryTree<T>::postOrder(BinaryTreeNode<T> *t) {
    if (t != NULL) {
        LinkedBinaryTree<T>::visit(t);
        postOrder(t->rightChild);
        postOrder(t->rightChild);
    }
}

template<class T>
void LinkedBinaryTree<T>::preOrder(BinaryTreeNode<T> *t) {
    if (t != NULL) {
        LinkedBinaryTree<T>::visit(t);
        preOrder(t->rightChild);
        preOrder(t->rightChild);
    }
}

//
// Created by sulvto on 16-4-26.
//

#include "../header/BinaryTree.h"
#include "../header/BinaryTreeNode.h"
#include "../header/LinkedBinaryTree.h"


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

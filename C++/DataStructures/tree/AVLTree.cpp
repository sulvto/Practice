//
// Created by sulvto on 16-4-29.
//
#include "../header/AVLTree.h"


template<class E>
BinaryTreeNode<E> *AVLTree<E>::leftLeftRotation(BinaryTreeNode<E> node) {
    BinaryTreeNode<E> *lc = node.leftChild;
    node.leftChild = lc->rightChild;
    lc->rightChild = &node;
    return lc;
};

template<class E>
BinaryTreeNode<E> *AVLTree<E>::leftRightRotation(BinaryTreeNode<E> node) {
    BinaryTreeNode<E> *pNode = rightRightRotation(*node.rightChild);
    return leftLeftRotation(*pNode);
};

template<class E>
BinaryTreeNode<E> *AVLTree<E>::rightLeftRotation(BinaryTreeNode<E> node) {
    BinaryTreeNode<E> *pNode = leftLeftRotation(*node.rightChild);
    return rightRightRotation(*pNode);
};

template<class E>
BinaryTreeNode<E> *AVLTree<E>::rightRightRotation(BinaryTreeNode<E> node) {
    BinaryTreeNode<E> *rc = node.rightChild;
    node.rightChild = rc->rightChild;
    rc->leftChild = &node;
    return rc;
};

template<class E>
void AVLTree<E>::remove(BinaryTreeNode<E> node, const E e) {
    if (&node == NULL) {
        return;
    }
    if (node.element > e) {
        remove(node.leftChild, e);
        if (LinkedBinaryTree<E>::height(node.leftChild->rightChild) -
            LinkedBinaryTree<E>::height(node.leftChild->leftChild) >= 2) {
            if (node.leftChild->element > e) {
                node = rightRightRotation(node);
            } else {
                node = rightLeftRotation(node);
            }
        }
    } else if (node.element < e) {
        remove(node.rightChild, e);
        if (LinkedBinaryTree<E>::height(node.rightChild->rightChild) -
            LinkedBinaryTree<E>::height(node.rightChild->leftChild) >= 2) {
            if (node.rightChild->element > e) {
                node = rightRightRotation(node);
            } else {
                node = rightLeftRotation(node);
            }
        }
    } else {
        BinarySearchTree<E>::remove(e);
    }

};

template<class E>
void AVLTree<E>::remove(const E e) {
    remove(root, e);
    treeSize--;
};


template<class E>
void AVLTree<E>::insert(BinaryTreeNode<E> node, const E e) {
    if (&node == NULL) {
        node = e;
    } else if (node.element > e) {
        insert(node.rightChild, e);
        if (LinkedBinaryTree<E>::height(node.rightChild->rightChild) -
            LinkedBinaryTree<E>::height(node.rightChild->leftChild) >= 2) {
            if (node.rightChild->element > e) {
                node = rightRightRotation(node);
            } else {
                node = rightLeftRotation(node);
            }
        }
    } else {
        insert(node.leftChild, e);
        if (LinkedBinaryTree<E>::height(node.leftChild->rightChild) -
            LinkedBinaryTree<E>::height(node.leftChild->leftChild) >= 2) {
            if (node.leftChild->element > e) {
                node = leftLeftRotation(node);
            } else {
                node = leftRightRotation(node);
            }
        }
    }
};

template<class E>
void AVLTree<E>::insert(const E e) {
    insert(*root, e);
    treeSize++;
};

template<class E>
void AVLTree<E>::print(BinaryTreeNode<E> *node) {
    cout << node->element << endl;
    print(node->rightChild);
    print(node->leftChild);
};

template<class E>
void AVLTree<E>::print() {
    print(root);
};
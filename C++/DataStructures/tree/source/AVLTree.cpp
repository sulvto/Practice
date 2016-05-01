//
// Created by sulvto on 16-4-29.
//
#include "../header/AVLTree.h"


template<class E>
BinaryTreeNode<E> *AVLTree<E>::leftLeftRotation(BinaryTreeNode node) {
    BinaryTreeNode<E> *lc = node.leftChild;
    node.leftChild = lc->rightChild;
    lc->rightChild = &node;
    return lc;
};

template<class E>
BinaryTreeNode<E> *AVLTree<E>::leftRightRotation(BinaryTreeNode node) {
    BinaryTreeNode<E> *pNode = rightRightRotation(*node.rightChild);
    return leftLeftRotation(*pNode);
};

template<class E>
BinaryTreeNode<E> *AVLTree<E>::rightLeftRotation(BinaryTreeNode node) {
    BinaryTreeNode<E> *pNode = leftLeftRotation(*node.rightChild);
    return rightRightRotation(*pNode);
};

template<class E>
BinaryTreeNode<E> *AVLTree<E>::rightRightRotation(BinaryTreeNode node) {
    BinaryTreeNode<E> *rc = node.rightChild;
    node.rightChild = rc->rightChild;
    rc->leftChild = &node;
    return rc;
};

template<class K, class E>
void AVLTree<E>::remove(BinaryTreeNode node, const E &theE) {
    if (&node == NULL) {
        return;
    }
    if (node.element > theE) {
        remove(node.leftChild, theE);
        if (LinkedBinaryTree::height(node.leftChild->rightChild) -
            LinkedBinaryTree::height(node.leftChild->leftChild) >= 2) {
            if (node.leftChild->element > theE) {
                node = rightRightRotation(node);
            } else {
                node = rightLeftRotation(node);
            }
        }
    } else if (node.element < theE) {
        remove(node.rightChild, theE);
        if (LinkedBinaryTree::height(node.rightChild->rightChild) -
            LinkedBinaryTree::height(node.rightChild->leftChild) >= 2) {
            if (node.rightChild->element > theE) {
                node = rightRightRotation(node);
            } else {
                node = rightLeftRotation(node);
            }
        }
    } else {
        BinarySearchTree::remove(theE);
    }

};

template<class K, class E>
void AVLTree<E>::remove(const E &theE) {
    remove(root, theE);
    treeSize--;
};


template<class E>
void AVLTree<E>::insert(BinaryTreeNode node, const E &theE) {
    if (&node == NULL) {
        node = theE;
    } else if (node.element > theE) {
        insert(node.rightChild, theE);
        if (LinkedBinaryTree::height(node.rightChild->rightChild) -
            LinkedBinaryTree::height(node.rightChild->leftChild) >= 2) {
            if (node.rightChild->element > theE) {
                node = rightRightRotation(node);
            } else {
                node = rightLeftRotation(node);
            }
        }
    } else {
        insert(node.leftChild, theE);
        if (LinkedBinaryTree::height(node.leftChild->rightChild) -
            LinkedBinaryTree::height(node.leftChild->leftChild) >= 2) {
            if (node.leftChild->element > theE) {
                node = leftLeftRotation(node);
            } else {
                node = leftRightRotation(node);
            }
        }
    }
};

template<class E>
void AVLTree<E>::insert(const E &theE) {
    insert(*root, theE);
    treeSize++;
};
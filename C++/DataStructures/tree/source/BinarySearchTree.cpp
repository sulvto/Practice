//
// Created by qinchao on 16-4-26.
//
#include "../header/BinarySearchTree.h"
#include <iostream>

template<class E>
E *BinarySearchTree<E>::find(const E e) const {
    BinaryTreeNode<E> *p = root;
    while (p != NULL) {
        if (e < p->element) {
            p = p->leftChild;
        } else if (e > p->element) {
            p = p->rightChild;
        } else if (e == p->element) {
            return &p->element;
        }
    }
    return NULL;
}

template<class E>
void BinarySearchTree<E>::insert(const E e) {
    BinaryTreeNode<E> *p = root, *temp = NULL;

    while (p != NULL) {
        temp = p;
        if (e.first < p->element) {
            p = p->leftChild;
        } else if (e.first > p->element) {
            p = p->rightChild;
        } else {
            p->element.second = e.second;
            return;
        }
    }
    BinaryTreeNode<E> *newNode = new BinaryTreeNode<E>(e);

    if (temp != NULL) {
        if (e.first < temp->element) {
            temp->leftChild = newNode;
        } else {
            temp->rightChild = newNode;
        }
    } else {
        root = newNode;
    }
    treeSize++;
};


template<class E>
void BinarySearchTree<E>::remove(const E e) {
    BinaryTreeNode<E> *target = root;
    BinaryTreeNode<E> *ptarget = NULL;
    while (target != NULL) {
        ptarget = target;
        if (e < target->element) {
            target = target->leftChild;
        } else if (e > target->element) {
            target = target->rightChild;
        } else {
            break;
        }
    }
    if (target == NULL) {
        return;
    }

    if (target->leftChild != NULL && target->rightChild != NULL) {

        BinaryTreeNode<E> *s = target->rightChild, *ps = target;

        while (s->leftChild != NULL) {
            ps = s;
            s = s->leftChild;
        }

        BinaryTreeNode<E> *newNode = new BinaryTreeNode<E>(s->element, target->leftChild,
                                                           target->rightChild);
        if (ptarget == target) {
            root = newNode;
        } else if (ptarget->rightChild == target) {
            ptarget->rightChild = newNode;
        } else {
            ptarget->leftChild = newNode;
        }

        if (s->rightChild != NULL) {
            ps->leftChild = s->rightChild;
        }
    } else {
        BinaryTreeNode<E> *c = target->leftChild == NULL ? target->rightChild : target->rightChild;
        if (ptarget == target) {
            root = c;
        } else if (ptarget->rightChild == target) {
            ptarget->rightChild = c;
        } else {
            ptarget->leftChild = c;
        }
    }
    treeSize--;
    delete target;
}

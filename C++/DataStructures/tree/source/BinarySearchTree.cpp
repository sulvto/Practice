//
// Created by qinchao on 16-4-26.
//
#include "../header/BinarySearchTree.h"

template<class E>
E *BinarySearchTree<E>::find(const E &theE) const {
    BinaryTreeNode<E> *p = root;
    while (p != NULL) {
        if (theE < p->element) {
            p = p->leftChild;
        } else if (theE > p->element) {
            p = p->rightChild;
        } else if (theE == p->element) {
            return &p->element;
        }
    }
    return NULL;
}

template<class E>
void BinarySearchTree::insert(const E &theE) {
    BinaryTreeNode<E> *p = root, *temp = NULL;

    while (p != NULL) {
        temp = p;
        if (theE.first < p->element) {
            p = p->leftChild;
        } else if (theE.first > p->element) {
            p = p->rightChild;
        } else {
            p->element.second = theE.second;
            return;
        }
    }
    BinaryTreeNode<E> *newNode = new BinaryTreeNode(theE);

    if (temp != NULL) {
        if (theE.first < temp->element) {
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
void BinarySearchTree::remove(const E &theE) {
    BinaryTreeNode<E> *target = root, *ptarget = NULL;
    while (target != NULL) {
        ptarget = target;
        if (theE < target->element) {
            target = target->leftChild;
        } else if (theE > target->element) {
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

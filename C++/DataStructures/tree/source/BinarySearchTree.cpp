//
// Created by qinchao on 16-4-26.
//
#include "../header/BinarySearchTree.h"

template<class K, class E>
pair<const K, E> *BinarySearchTree<K, E>::find(const K &theKey) const {
    BinaryTreeNode<pair<const K, E>> *p = root;
    while (p != NULL) {
        if (theKey < p->element.first) {
            p = p->leftChild;
        } else if (theKey > p->element.first) {
            p = p->rightChild;
        } else {
            return &p->element;
        }
    }
    return NULL;
}

template<class K, class E>
void BinarySearchTree::insert(const pair<const K, E> &thePair) {
    BinaryTreeNode<pair<const K, E>> *p = root, *temp = NULL;

    while (p != NULL) {
        temp = p;
        if (thePair.first < p->element.first) {
            p = p->leftChild;
        } else if (thePair.first > p->element.first) {
            p = p->rightChild;
        } else {
            p->element.second = thePair.second;
            return;
        }
    }
    BinaryTreeNode<pair<const K, E>> *newNode = new BinaryTreeNode(thePair);

    if (p != NULL) {
        if (thePair.first < temp->element.first) {
            temp->leftChild = newNode;
        } else {
            temp->rightChild = newNode;
        }
    } else {
        root = newNode;
    }
    treeSize++;
};


template<class K, class E>
void BinarySearchTree::erase(const K &theK) {
    BinaryTreeNode<pair<const K, E>> *p = root, *target = NULL;
    while (p != NULL) {
        if (theK < p->element.first) {
            p = p->leftChild;
        } else if (theK > p->element.first) {
            p = p->rightChild;
        } else {
            target = p;
        }
    }
    if (target == NULL) {
        return;
    }

    if (target->leftChild != NULL && target->rightChild != NULL) {
        //TODO

        BinaryTreeNode<pair<const K, E>> *r = target->rightChild,*ps;

        while (r->leftChild != NULL) {
            ps = r;
            r = r->leftChild;
        }
        //TODO




    } else if (target->leftChild == NULL) {
        BinaryTreeNode<pair<const K, E>> *r = target->rightChild;

        while (r->leftChild != NULL) {
            r = r->leftChild;
        }

    } else if (target->rightChild == NULL) {

    }
}

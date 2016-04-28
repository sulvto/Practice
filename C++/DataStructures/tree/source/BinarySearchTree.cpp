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

    if (temp != NULL) {
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
void BinarySearchTree::remove(const K &theK) {
    BinaryTreeNode <pair<const K, E>> *target = root, *ptarget = NULL;
    while (target != NULL) {
        ptarget = target;
        if (theK < target->element.first) {
            target = target->leftChild;
        } else if (theK > target->element.first) {
            target = target->rightChild;
        } else {
            break;
        }
    }
    if (target == NULL) {
        return;
    }

    if (target->leftChild != NULL && target->rightChild != NULL) {

        BinaryTreeNode <pair<const K, E>> *s = target->rightChild, *ps = target;

        while (s->leftChild != NULL) {
            ps = s;
            s = s->leftChild;
        }

        BinaryTreeNode <pair<const K, E>> *newNode = new BinaryTreeNode<pair<const K, E>>(s->element, target->leftChild,
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
        BinaryTreeNode <pair<const K, E>> *c = target->leftChild == NULL ? target->rightChild : target->rightChild;
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

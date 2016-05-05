//
// Created by sulvto on 16-5-3.
//


#include <iostream>

#include <stddef.h>
#include "../header/BTree.h"

using namespace std;

template<class E>
BTree<E>::BTree(int _t) {
    t = _t;
    root = NULL;
}

template<class E>
void BTree<E>::insert(E e) {
    if (root == NULL) {
        root = new BTreeNode<E>(this->t, true);
        root->keys[0] = e;
        root->n = 1;
    } else {

        if (root->n == 2 * t - 1) {
            BTreeNode<E> *n = new BTreeNode<E>(t, false);
            n->child[0] = root;
            n->splitChild(0, root);
            int i = 0;
            if (n->keys[0] < e) {
                i++;
            }
            n->child[i]->insertNonFull(e);
            root = n;
        } else {
            root->insertNonFull(e);
        }
    }
}

template<class E>
void BTree<E>::remove(E e) {
    if (root == NULL) {
        return;
    }
    root->remove(e);
    // TODO
}

template <class E>
void BTree<E>::print() {
    if (root == NULL) {
        cout << "empty" << endl;
    } else {
        BTreeNode<E> *node = root;
        int i = 0;

        while (!node->leaf) {
            node = node->child[0];
            i++;
        }
        root->print(i, true);
    }
}

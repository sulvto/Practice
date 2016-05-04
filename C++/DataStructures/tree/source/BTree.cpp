#include <stddef.h>
#include "../header/BTree.h"

//
// Created by sulvto on 16-5-3.
//
BTree::BTree(int _t) {
    this->t = _t;
}

template<class E>
void BTree::insert(E &e) {
    if (root == NULL) {
        root = new BTreeNode(this->t, true);
        root->keys[0] = e;
        root->n = 1;
    } else {
        if (root->n == 2 * t - 1) {
            BTreeNode *n = new BTreeNode(t, false);
            n->child[0] = root;
            n->splitChild(0, root);
            int i = 0;
            if (n->keys[0] < e) {
                i++;
            }
            n->child[i]->insertNonFull(e);
        } else {
            root->insertNonFull(e);
        }
    }
}

template <class E>
void BTree::remove(E e) {
    if (root == NULL) {
        return;
    }
    root->remove(e);
    // TODO
}

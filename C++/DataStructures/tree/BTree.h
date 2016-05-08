//
// Created by sulvto on 16-5-3.
//

#ifndef DATASTRUCTURES_BTREE_H
#define DATASTRUCTURES_BTREE_H


#include "BTreeNode.h"

template<class E>
class BTree {
private:
    BTreeNode<E> *root;
    // Minimum degree
    int t;
public:
    BTree(int _t);

//    void traverse();
    BTreeNode<E> *search(E e) {
        return root == NULL ? NULL : root->search(e);
    };

    void insert(E e);

    void remove(E e);

};

#endif //DATASTRUCTURES_BTREE_H

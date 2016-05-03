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

    void insert(E e);
};

#endif //DATASTRUCTURES_BTREE_H

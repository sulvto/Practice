//
// Created by sulvto on 16-5-3.
//

#ifndef DATASTRUCTURES_NTREENODE_H
#define DATASTRUCTURES_NTREENODE_H

template<class E>
struct BTreeNode {
    E *keys; //array
    // Minimum degree
    int t;
    BTreeNode **child;
    int n; // Current number of keys
    bool leaf;
public:
    BTreeNode(int _t, bool _leaf) {
        t = _t;
        leaf = _leaf;
        keys = new E[2 * t - 1];
        child = new BTreeNode *[2 * t];
        n = 0;
    }

    void traverse();

    BTreeNode *search(E e);

    void insertNonFull(E e) {
        int i = n - 1;
        if (leaf) {
            while (i >= 0 && keys[i] > e) {
                i--;
            }
            keys[i + 1] = e;
            n++;
        } else {
            while (i >= 0 && keys[i] > e) {
                i--;
            }
            //child is full
            if (child[i + 1]->n == 2 * t - 1) {
                child[i + 1]->splitChild(i + 1, child[i + 1]);
                if (keys[i + 1] < e) {
                    i++;
                }
            }
            child[i + 1]->insertNonFull(e);
        }
    }

    void splitChild(int i, BTreeNode *y) {
        BTreeNode *z = new BTreeNode(y->t, y->leaf);
        z->n = t - 1;
        for (int j = 0; j < t - 1; j++) {
            z->keys[j] = y->keys[j + t];
        }
        if (!y->leaf) {
            for (int j = 0; j < t; j++) {
                z->child[j] = y->child[j + t];
            }
        }
        y->n = t - 1;
        for (int j = n; j >= i + 1; j--) {
            child[j + 1] = child[j];
        }
        child[i + 1] = z;

        for (int j = n; j >= i; j--) {
            keys[j + 1] = keys[j];
        }
        keys[i] = y->keys[t - 1];
        n++;
    }

};


#endif //DATASTRUCTURES_NTREENODE_H

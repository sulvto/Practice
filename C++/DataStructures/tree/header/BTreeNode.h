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

    BTreeNode *search(E e) {
        int i = 0;
        while (i < n && keys[i] < e) {
            i++;
        }
        if (keys[i] == e) {
            return this;
        } else if (leaf) {
            return NULL;
        } else {
            return child[i]->search(e);
        }
    }

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

    void remove(E e) {
        int i = 0;

        while (i < n && keys[i] < e) {
            i++;
        }
        if (keys[i] == e) {
            if (leaf) {
                for (; i < n - 1; i++) {
                    keys[i] = keys[i + 1];
                }
                n--;
            } else {
                E k = keys[i];
                if (child[i]->n >= t) {
                    BTreeNode *cNode = child[i];
                    while (!cNode->leaf) {
                        cNode = cNode->child[cNode->n];
                    }
                    // last
                    E ce = cNode->keys[cNode->n - 1];
                    keys[i] = ce;
                    child[i]->remove(ce);
                } else if (child[i + 1]->n >= t) {
                    BTreeNode *cNode = child[i + 1];
                    while (!cNode->leaf) {
                        cNode = cNode->child[0];
                    }
                    // first
                    E ce = cNode->keys[0];
                    keys[i] = ce;
                    child[i + 1]->remove(ce);
                } else {
                    // child[i]->n   < t
                    // child[i+1]->n < t
                    // merge --> child[i],child[i+1]
                    merge(i);
                    child[i]->remove(k);
                }
            }
        } else {
            if (leaf) {
                return;
            } else {
                if (child[i]->n < t) {
                    fill(i);
                }
                if (i >= n) {
                    child[i - 1]->remove(e);
                } else {
                    child[i]->remove(e);
                };
            }

        }

    }

    void fill(int index) {
        if (index != 0 && child[index - 1]->n == t) {
            BTreeNode *cNode = child[index];
            BTreeNode *sNode = child[index - 1];
            for (int i = cNode->n - 1; i >= 0; i--) {
                cNode->keys[i + 1] = cNode->keys[i];
            }
            if (!cNode->leaf) {
                for (int i = cNode->n; i >= 0; i--) {
                    cNode->child[i + 1] = cNode->child[i];
                }
            }
            cNode->keys[0] = keys[index - 1];
            if (!leaf) {
                cNode->child[0] = sNode->child[sNode->n];
            }
            keys[index - 1] = sNode->keys[sNode->n - 1];
            cNode->n++;
            sNode->n--;
        } else if (index != n && child[index + 1]->n == t) {

        } else {
            if (index != n) {
                merge(index);
            } else {
                merge(index - 1);
            }
        };
    }

    void merge(int index) {
        BTreeNode *cNode = child[index];
        BTreeNode *sNode = child[index + 1];

        cNode->keys[t - 1] = keys[index];
        for (int i = 0; i < sNode->n; i++) {
            cNode->keys[i + t] = sNode->keys[i];
        }

        if (!cNode->leaf) {
            for (int i = 0; i < sNode->n; i++) {
                cNode->child[i + t] = sNode->child[i];
            }
        }

        for (int i = index + 1; i < n; i++) {
            keys[i - 1] = keys[i];
        }

        for (int i = index + 2; i < n; i++) {
            child[i - 1] = child[i];
        }
        cNode->n += sNode->n + 1;
        n--;
        delete sNode;
    }
};


#endif //DATASTRUCTURES_NTREENODE_H

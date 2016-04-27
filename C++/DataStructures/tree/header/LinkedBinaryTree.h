//
// Created by qinchao on 16-4-26.
//

#ifndef DATASTRUCTURES_LINKEDBINARYTREE_H
#define DATASTRUCTURES_LINKEDBINARYTREE_H

#include "BinaryTree.h"
#include "BinaryTreeNode.h"

template<class T>
class LinkedBinaryTree : public BinaryTree<BinaryTreeNode<T>> {

public:

    LinkedBinaryTree() {
        root = NULL;
        treeSize = 0;
    }

    ~LinkedBinaryTree() {
        erase();
    }

    void erase() {
        postOrder(dispose);
        root = NULL;
        treeSize = 0;
    }

    bool isEmpty() const { return treeSize == 0; }

    int size() const {
        return treeSize;
    }

    void preOrder(void(*theVisit)(BinaryTreeNode<T> *)) {
        visit = theVisit;
        preOrder(root);
    };

    void inOrder(void(*theVisit)(BinaryTreeNode<T> *)) {
        visit = theVisit;
        inOrder(root);
    };

    void postOrder(void(*theVisit)(BinaryTreeNode<T> *)) {
        visit = theVisit;
        postOrder(root);
    }

    void levelOrder(void(*)(BinaryTreeNode<T> *));

    void preOrderOutput() {
        preOrder(output);
        cout << endl;
    }

private:
    BinaryTreeNode<T> *root;

    int treeSize;

    static void (*visit)(BinaryTreeNode<T> *);

    static void preOrder(BinaryTreeNode<T> *t);

    static void inOrder(BinaryTreeNode<T> *t);

    static void postOrder(BinaryTreeNode<T> *t);

    static void dispose(BinaryTreeNode<T> *t) { delete t; }

    static void output(BinaryTreeNode<T> *t) { cout << t->element << ' '; };


};

#endif //DATASTRUCTURES_LINKEDBINARYTREE_H

//
// Created by qinchao on 16-4-26.
//
#include "BinaryTree.h"
#include "BinaryTreeNode.h"

template<class T>
class LinkedBinaryTree : public BinaryTree<BinaryTreeNode<T>> {

private:
    int treeSize;

    static void (*visit)(BinaryTreeNode<T> *);

    static void preOrder(BinaryTreeNode<T> *t);

    static void inOrder(BinaryTreeNode<T> *t);

    static void postOrder(BinaryTreeNode<T> *t);


    static void dispose(BinaryTreeNode<T> *t) { delete t; }

public:
    BinaryTreeNode<T> *root;

    LinkedBinaryTree() {
        this->root = NULL;
        this->treeSize = 0;
    }

    ~LinkedBinaryTree() {
        erase();
    }

    bool isEmpty() const { return this->treeSize == 0; }

    bool size() const {
        return this->treeSize;
    }

    void preOrder(void(*visit)(BinaryTreeNode<T> *t)) {
        this->visit = visit;
        this->preOrder(this->root);
    };

    void inOrder(void(*visit)(BinaryTreeNode<T> *t)) {
        this->visit = visit;
        this->inOrder(this->root);

    };

    void postOrder(void(*visit)(BinaryTreeNode<T> *t)) {
        this->visit = visit;
        this->postOrder(this->root);
    }

    void levelOrder(void(*)(BinaryTreeNode<T> *t));

    void erase() {
        this.postOrder(dispose);
        this->root = NULL;
        this->treeSize = 0;
    }

};

template <class T>
void LinkedBinaryTree<T>::preOrder(BinaryTreeNode<T> *t) {
    if (t != NULL) {
        LinkedBinaryTree<T>::visit(t);
        preOrder(t->rightChild);
        preOrder(t->rightChild);
    }
}

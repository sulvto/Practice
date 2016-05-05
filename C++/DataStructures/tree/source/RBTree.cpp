//
// Created by sulvto on 16-5-1.
//

#include "../header/BinaryTreeNode.h"
#include "../header/RBTree.h"


template<class E>
BinaryTreeNode<pair<E, NodeColor>> *RBTree<E>::leftRotation(BinaryTreeNode<pair<E, NodeColor>> node) {
    BinaryTreeNode<pair<E, NodeColor>> *y = node.rightChild;
    node.rightChild = y->leftChild;
    y->leftChild = &node;
    return y;
}

template<class E>
BinaryTreeNode<pair<E, NodeColor>> *RBTree<E>::rightRotation(BinaryTreeNode<pair<E, NodeColor>> node) {
    BinaryTreeNode<pair<E, NodeColor>> *x = node.rightChild;
    node.rightChild = x->leftChild;
    x->leftChild = &node;
    return x;
}

template<class E>
bool isRedNode(const BinaryTreeNode<pair<E, NodeColor>> node) {
    return node.element.second == NodeColor::red;
}

template<class E>
bool isBlackNode(const BinaryTreeNode<pair<E, NodeColor>> node) {
    return !isRedNode(node);
}

template<class E>
void setRedNode(BinaryTreeNode<pair<E, NodeColor>> *node) {
    node->element.second = NodeColor::red;
}

template<class E>
void setBlackNode(BinaryTreeNode<pair<E, NodeColor>> *node) {
    node->element.second = NodeColor::black;
}

template<class E>
void RBTree<E>::insertCase5(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                            BinaryTreeNode<pair<E, NodeColor>> *n) {
    BinaryTreeNode<pair<E, NodeColor>> *p = parentStack->pop();
    BinaryTreeNode<pair<E, NodeColor>> *g = parentStack->top();
    setBlackNode(p);
    setRedNode(g);

    if (n == p->leftChild && p == g->leftChild) {
        g = rightRotation(*g);
    } else {
        g = leftRotation(*g);
    }
}

template<class E>
void RBTree<E>::insertCase4(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                            BinaryTreeNode<pair<E, NodeColor>> *n) {
    BinaryTreeNode<pair<E, NodeColor>> *p = parentStack->pop();
    BinaryTreeNode<pair<E, NodeColor>> *g = parentStack->top();

    if (n == p->rightChild && p == g->leftChild) {
        p = leftRotation(*p);
        n = p->leftChild;
    } else if (n == p->leftChild && p == g->rightChild) {
        p = rightRotation(*p);
        n = p->rightChild;
    }
    parentStack->push(*p);
    insertCase5(parentStack, n);

}

template<class E>
void RBTree<E>::insertCase3(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                            BinaryTreeNode<pair<E, NodeColor>> *n) {
    BinaryTreeNode<pair<E, NodeColor>> *p = parentStack->pop();
    BinaryTreeNode<pair<E, NodeColor>> *g = parentStack->top();
    // isRedNode(p) = true
    if (isRedNode(*g->rightChild) && isRedNode(*g->leftChild)) {
        setBlackNode(g->rightChild);
        setBlackNode(g->leftChild);
        g = parentStack->pop();
        insertCase1(parentStack, g);
    } else {
        parentStack->push(*p);
        insertCase4(parentStack, n);
    }
}

template<class E>
void RBTree<E>::insertCase2(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                            BinaryTreeNode<pair<E, NodeColor>> *n) {
    BinaryTreeNode<pair<E, NodeColor>> *p = parentStack->top();
    if (isBlackNode(*p)) {
        return;
    } else {
        insertCase3(parentStack, n);
    }
}

template<class E>
void RBTree<E>::insertCase1(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                            BinaryTreeNode<pair<E, NodeColor>> *n) {
    if (parentStack->empty()) {
        setBlackNode(root);
    } else {
        insertCase2(parentStack, n);
    }
}


template<class E>
void RBTree<E>::insert(const E e) {
    ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> parentStack;
    BinaryTreeNode<pair<E, NodeColor>> *temp = root;
    if (root == NULL) {
        root = new BinaryTreeNode<pair<E, NodeColor>>(make_pair(e, NodeColor::red));
    } else {
        while (temp != NULL) {
            parentStack.push(*temp);
            if (e > temp->element) {
                temp = temp->rightChild;
            } else {
                temp = temp->leftChild;
            }
        }
        temp = new BinaryTreeNode<pair<E, NodeColor>>(make_pair(e, NodeColor::red));
    }

    insertCase1(&parentStack, temp);

}




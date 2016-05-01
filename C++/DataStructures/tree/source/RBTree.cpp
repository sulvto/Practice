//
// Created by sulvto on 16-5-1.
//

#include "../header/BinaryTreeNode.h"
#include "../header/RBTree.h"


template<class E>
BinaryTreeNode *RBTree::leftRotation(BinaryTreeNode<pair<E, NodeColor>> node) {
    BinaryTreeNode *y = node.rightChild;
    node.rightChild = y->leftChild;
    y->leftChild = &node;
    return y;
}

template<class E>
BinaryTreeNode *RBTree::rightRotation(BinaryTreeNode<pair<E, NodeColor>> node) {
    BinaryTreeNode *x = node.rightChild;
    node.rightChild = x->leftChild;
    x->leftChild = &node;
    return x;
}

bool isRedNode(const BinaryTreeNode node) {
    return node.element.second == NodeColor::red;
}

bool isBlackNode(const BinaryTreeNode node) {
    return !isRedNode(node);
}

bool setRedNode(BinaryTreeNode *node) {
    return node->element.second = NodeColor::red;
}

bool setBlackNode(BinaryTreeNode *node) {
    return node->element.second = NodeColor::black;
}

template<class E>
void RBTree::insertCase5(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                         BinaryTreeNode<pair<E, NodeColor>> *n) {
    BinaryTreeNode p = parentStack->pop();
    BinaryTreeNode g = parentStack->top();
    setBlackNode(&p);
    setRedNode(&g);

    if (n == p.leftChild && &p == g.leftChild) {
        g = rightRotation(g);
    }else{
        g = leftRotation(g);
    }
}

template<class E>
void RBTree::insertCase4(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                         BinaryTreeNode<pair<E, NodeColor>> *n) {
    BinaryTreeNode p = parentStack->pop();
    BinaryTreeNode g = parentStack->top();

    if (n == p.rightChild && &p == g.leftChild) {
        p = leftRotation(p);
        n = p.leftChild;
    }else if (n == p.leftChild && &p == g.rightChild) {
        p = rightRotation(p);
        n = p.rightChild;
    }
    parentStack->push(p);
    insertCase5(parentStack, n);

}

template<class E>
void RBTree::insertCase3(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                         BinaryTreeNode<pair<E, NodeColor>> *n) {
    BinaryTreeNode p = parentStack->pop();
    BinaryTreeNode g = parentStack->top();
    // isRedNode(p) = true
    if (isRedNode(g.rightChild) && isRedNode(g.leftChild)) {
        setBlackNode(g.rightChild);
        setBlackNode(g.leftChild);
        g = parentStack->pop();
        insertCase1(parentStack, &g);
    } else {
        parentStack->push(p);
        insertCase4(parentStack, n);
    }
}

template<class E>
void RBTree::insertCase2(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                         BinaryTreeNode<pair<E, NodeColor>> *n) {
    BinaryTreeNode<pair<E, NodeColor>> &p = parentStack->top();
    if (isBlackNode(p)) {
        return;
    } else {
        insertCase3(parentStack, n);
    }
}

template<class E>
void RBTree::insertCase1(ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> *parentStack,
                         BinaryTreeNode<pair<E, NodeColor>> *n) {
    if (parentStack->empty()) {
        setBlackNode(root);
    } else {
        insertCase2(parentStack, n);
    }
}


template<class E>
void RBTree::insert(const E &theE) {
    ArrayStack<BinaryTreeNode<pair<E, NodeColor>>> parentStack;
    BinaryTreeNode *temp = root;
    if (root == NULL) {
        root = new BinaryTreeNode(pair(theE, NodeColor::red));
    } else {
        while (temp != NULL) {
            parentStack.push(*temp);
            if (theE > temp->element) {
                temp = temp->rightChild;
            } else {
                temp = temp->leftChild;
            }
        }
        temp = new BinaryTreeNode(pair(theE, NodeColor::red));
    }

    insertCase1(&parentStack, temp);

}




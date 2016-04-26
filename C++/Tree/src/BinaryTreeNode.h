/*
 * BinaryTreeNode.h
 *
 *  Created on: 2015年8月6日
 *      Author: acer1
 */

#ifndef BINARYTREENODE_H_
#define BINARYTREENODE_H_

#include <iostream>

using namespace std;

template<class T>
class BinaryTreeNode {

public:
    T element;
    BinaryTreeNode<T> *leftChild, *rightChild;

    BinaryTreeNode() {
        leftChild = rightChild = NULL;
    }

    BinaryTreeNode(const T &element) {
        this->element = element;
        leftChild = rightChild = NULL;
    }

    BinaryTreeNode(const T &element, BinaryTreeNode *leftChild,
                   BinaryTreeNode *rightChild) {
        this->element(element);
        this->rightChild = rightChild;
        this->leftChild = leftChild;
    }

};

#endif /* BINARYTREENODE_H_ */

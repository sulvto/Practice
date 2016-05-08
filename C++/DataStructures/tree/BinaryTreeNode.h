/*
 * BinaryTreeNode.h
 *
 *  Created on: 2015年8月6日
 *      Author: sulvto
 */

#ifndef BINARYTREENODE_H_
#define BINARYTREENODE_H_
#include <iostream>

template<class T>
class BinaryTreeNode {

public:
    T element;
    BinaryTreeNode<T> *leftChild;
    BinaryTreeNode<T> *rightChild;

    BinaryTreeNode() {
        leftChild = rightChild = NULL;
    }

    BinaryTreeNode(const T &_element) {
        element = _element;
        leftChild = rightChild = NULL;
    }

    BinaryTreeNode(const T &_element, BinaryTreeNode *_leftChild,
                   BinaryTreeNode *_rightChild) {
        element(_element);
        rightChild = _rightChild;
        leftChild = _leftChild;
    }

};

#endif /* BINARYTREENODE_H_ */

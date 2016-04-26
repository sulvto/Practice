/*
 * BinaryTreeNode.h
 *
 *  Created on: 2015年8月6日
 *      Author: acer1
 */

#ifndef BINARYTREE_H_
#define BINARYTREE_H_

#include <iostream>

using namespace std;

template<class T>
class BinaryTree {
public:
    virtual ~BinaryTree();

    virtual bool isEmpty();

    virtual int size();

    virtual void preOrder(void (*)(T *)) = 0;

    virtual void inOrder(void (*)(T *)) = 0;

    virtual void postOrder(void (*)(T *)) = 0;

    virtual void levelOrder(void (*)(T *)) = 0;


};

#endif /* BINARYTREE_H_ */

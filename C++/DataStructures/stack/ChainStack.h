/*
 * ChainStack.h
 *
 *  Created on: 2015年7月25日
 *      Author: sulvto
 */

#ifndef CHAINSTACK_H_
#define CHAINSTACK_H_

#include <iostream>
#include "Stack.h"
using namespace std;

template<class T>
struct ChainNode {
	T element;
	ChainNode<T> *next;

	ChainNode(const T& _element) {
		element = _element;
		next = NULL;
	}

	ChainNode(const T& _element, ChainNode<T>* _node) {
		element = _element;
		next = _node;
	}
};

template<class T>
class ChainStack: public Stack<T> {
private:
	int length;
	ChainNode<T>* stackTop;
public:
	ChainStack(int init = 10) {
		stackTop = NULL;
		length = 0;
	}

	~ChainStack();

	bool empty() const {
		return stackTop == NULL;
	}

	int size() const {
		return length;
	}

	T& top() {
		if (length == 0)
			throw "NULL";
		return stackTop->element;
	}

	T pop();

	void push(const T& element);

	void print();
};

template<class T>
ChainStack<T>::~ChainStack() {
	while (stackTop != NULL) {
		ChainNode<T>* tempNode = stackTop->next;
		delete stackTop;
		stackTop = tempNode;
	}
}

template<class T>
void ChainStack<T>::push(const T&element) {
	stackTop = new ChainNode<T>(element, stackTop);
	length++;
}

template<class T>
T ChainStack<T>::pop() {
	if (length == 0)
		throw "NULL";

	T r =  stackTop->element;
	ChainNode<T>* tempNode = stackTop->next;
	stackTop = tempNode;
	length--;
	return r;
}

template<class T>
void ChainStack<T>::print() {
	ChainNode<T>* tempNode = stackTop;
	string temp = "top->" + top() + "\n[";
	while (tempNode != NULL) {
		temp += tempNode->element + (tempNode->next == NULL ? "" : ",");
		tempNode = tempNode->next;
	}
	temp += "]";
	cout << temp << endl;
}

#endif /* CHAINSTACK_H_ */

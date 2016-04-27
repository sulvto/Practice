/*
 * ChainQueue.h
 *
 *  Created on: 2015年8月4日
 *      Author: acer1
 */

#ifndef CHAINQUEUE_H_
#define CHAINQUEUE_H_

#include <iostream>
#include "Queue.h"
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
class ChainQueue: public Queue<T> {
private:
	int length;
	ChainNode<T>* frontNode; //front 前面
	ChainNode<T>* backNode; //back 末尾
public:
	ChainQueue(int init = 10) {
		length = 0;
		backNode = frontNode = NULL;
	}

	~ChainQueue();

	//返回true，当且仅当队列为空
	bool isEmpty() const {
		return length == 0;
	}
	//返回队列中元素个数
	int size() const {
		return length;
	}
	//返回头元素
	T front() {
		return frontNode->element;
	}
	//返回尾元素
	T back() {
		return backNode->element;
	}
	//删除并返回头元素
	T pop();
	//添加到队尾
	void push(const T& element);

	void print();
};

template<class T>
ChainQueue<T>::~ChainQueue() {

	while (frontNode != NULL) {
		ChainNode<T>* tempNode = frontNode;
		delete frontNode;
		frontNode = tempNode->next;
	}
	length = 0;
}

template<class T>
void ChainQueue<T>::push(const T& element) {
	ChainNode<T>* newNode = new ChainNode<T>(element);
	if (length == 0)
		frontNode = newNode;
	else
		backNode->next = newNode;
	backNode = newNode;
	length++;
}

template<class T>
T ChainQueue<T>::pop() {
	if (frontNode == NULL)
		throw "NUll";
	ChainNode<T>* tempNode = frontNode->next;
	T rElement = frontNode->element;
	delete frontNode;
	frontNode = tempNode;
	length--;
	return rElement;
}
template<class T>
void ChainQueue<T>::print() {
	string temp = "[";
	ChainNode<T>* tempNode = frontNode;
	for (int i = 1; tempNode != NULL; ++i) {
		temp += tempNode->element + (i == length ? "" : ",");
		tempNode = tempNode->next;
	}
	temp += "]";
	cout << temp << endl;
}

#endif /* CHAINQUEUE_H_ */

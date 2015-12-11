/*
 * chainList.h
 *
 *  Created on: 2015年7月18日
 *      Author: acer1
 */

#ifndef CHAINLIST_H_
#define CHAINLIST_H_

#include <iostream>
#include "LinearList.h"
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
class ChainList: public LinearList<T> {

public:
	ChainList();
	ChainList(const T& element);
	ChainList(const ChainList<T>&);
	~ChainList();

	//ADT 方法
	bool empty() const {
		return listSize == 0;
	}

	int size() const {
		return listSize;
	}

	T& get(int index) const;

	int indexOf(const T& element) const;

	void erase(int index);

	void insert(int index, const T& element);

	void add(const T& element);

//	void output(ostream& out) const;

	void print() const;

protected:
	void checkIndex(int index) const;

	ChainNode<T>* firstNode;
	int listSize;

};

template<class T>
ChainList<T>::ChainList() {
	firstNode = NULL;
	listSize = 0;
}

template<class T>
ChainList<T>::ChainList(const T& element) {
	firstNode = new ChainNode<T>(element);
	firstNode->next = NULL;
	listSize = 1;
}
template<class T>
ChainList<T>::ChainList(const ChainList<T> &list) {
	listSize = list.listSize;
	if (listSize == 0) {
		firstNode = NULL;
		return;
	}
	firstNode = list.firstNode;
}

template<class T>
ChainList<T>::~ChainList() {

	while (firstNode != NULL) {
		ChainNode<T>* tempNode = firstNode->next;
		delete firstNode;
		firstNode = tempNode;
	}
	listSize=0;
}

template<class T>
void ChainList<T>::checkIndex(int index) const {
	if (index < 0 || index > listSize) {
		throw "index error";
	}
}

template<class T>
T& ChainList<T>::get(int index) const {
	checkIndex(index);
	ChainNode<T>* currentNode = firstNode;
	for (int i = 0; i < index-1; i++) {
		currentNode = currentNode->next;
	}
	return currentNode->element;
}

template<class T>
int ChainList<T>::indexOf(const T& element) const {
	ChainNode<T>* currentNode = firstNode;
	for (int i = 0; i < listSize; i++) {
		if (currentNode->element == element)
			return i;
		currentNode = currentNode->next;
	}
	return -1;
}

template<class T>
void ChainList<T>::erase(int index) {
	checkIndex(index);
	ChainNode<T>* tempNode;
	if (index == 0) {
		tempNode = firstNode;
		firstNode = firstNode->next;
	} else {
		ChainNode<T>* currentNode = firstNode;
		for (int i = 0; i < index - 1; i++) {
			currentNode = currentNode->next;
		}
		tempNode = currentNode->next;
		currentNode->next = currentNode->next->next;
	}
	listSize--;
	delete tempNode;
}

template<class T>
void ChainList<T>::insert(int index, const T& element) {
	checkIndex(index);
	ChainNode<T>* currentNode = firstNode;
	if (index == 0)
		firstNode = new ChainNode<T>(element, firstNode);
	else {
		for (int i = 0; i < index - 1; i++) {
			currentNode = currentNode->next;
		}
		currentNode->next = new ChainNode<T>(element, currentNode->next);
	}

	listSize++;
}

template<class T>
void ChainList<T>::add(const T& element) {
	ChainNode<T>* currentNode = firstNode;
	for (int i = 0; i < listSize - 1; i++) {
		currentNode = currentNode->next;
	}
	currentNode->next = new ChainNode<T>(element, currentNode->next);
	listSize++;
}

template<class T>
void ChainList<T>::print() const {
	string s = "[";
	ChainNode<T>* currentNode = firstNode;
	for (int i = 0; currentNode != NULL; i++) {
		s += (currentNode->element + (i == listSize - 1 ? "" : ","));
		currentNode = currentNode->next;
	}
	s += "]";

	cout << s << endl;
}
#endif /* CHAINLIST_H_ */

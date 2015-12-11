/*
 * ArrayList.h
 *
 *  Created on: 2015年7月18日
 *      Author: 秦超
 */

#ifndef ARRAYLIST_H_
#define ARRAYLIST_H_

#include <iostream>
#include "LinearList.h"
using namespace std;

template<class T>
class ArrayList: public LinearList<T> {
public:
	//构造函数 ，复制构造函数和析构函数
	ArrayList(int initialCapacity = 10, const bool isInc = true);
	ArrayList(const ArrayList<T>&);
	~ArrayList() {
		delete[] element;
	}

	//ADT 方法
	bool empty() const {
		return listSize == 0;
	}

	int size() const {
		return listSize;
	}

	T& get(int index) const;

	int indexOf(const T& theElement) const;

	void erase(int index);

	void insert(int index, const T& theElement);

	void add(const T& theElement);

//	void output(ostream& out) const;

	void print() const;

protected:
	void checkIndex(int index) const;

	T* element; //存储线性表的一位数组
	int arrayLength; //一位数组的长度
	int listSize; //线性表的元素个数
	bool isInc;

};

template<class T>
ArrayList<T>::ArrayList(int initialCapacity, const bool _isInc) {
	//构造函数
	if (initialCapacity < 1) {
		throw "initialCapacity <1";
	}
	isInc = _isInc;
	arrayLength = initialCapacity;
	element = new T[arrayLength];
	listSize = 0;
}

template<class T>
ArrayList<T>::ArrayList(const ArrayList<T>& list) {

	arrayLength = list.arrayLength;
	element = new T[arrayLength];
	listSize = list.listSize;
	isInc = list.isInc;
	copy(list.element, list.element + listSize, element);
}

template<class T>
void ArrayList<T>::checkIndex(int index) const {
	if (index < 0 || index > listSize) {
		throw "index error";
	}
}

template<class T>
T& ArrayList<T>::get(int index) const {
	checkIndex(index);
	return element[index];
}

template<class T>
int ArrayList<T>::indexOf(const T& theElement) const {
	for (int i = 0; i < listSize; ++i) {
		if (element[i] == theElement)
			return i;
	}
	return -1;
}

template<class T>
void ArrayList<T>::insert(int index, const T& theElement) {
	checkIndex(index);
	if (listSize >= arrayLength) {
		if (isInc) {
			//TODO not test
			T *t = new T[arrayLength * 2];
			for (int i = 0, len = listSize; i < len; i++)
				t[i] = element[i];
			element = t;
		} else {
			cout << "表满" << endl;
			return;
		}
	}
//index 2
//size 3
//i 3
//i 2
//
	for (int i = listSize; i > index; i--) {
		element[i] = element[i - 1];
	}
	element[index] = theElement;
	listSize++;
}

template<class T>
void ArrayList<T>::add(const T& theElement) {
	if (listSize >= arrayLength) {
		if (isInc) {
			T *t = new T[arrayLength * 2];
			for (int i = 0, len = listSize; i < len; i++)
				t[i] = element[i];
			element = t;
		} else {
			cout << "表满" << endl;
			return;
		}
	}
	element[listSize] = theElement;
	listSize++;
}

template<class T>
void ArrayList<T>::erase(int index) {
	checkIndex(index);
//	delete element[index];
//TODO
	for (int i = index; i < listSize; i++) {
		element[i] = element[i + 1];
	}
	listSize--;
}
template<class T>
void ArrayList<T>::print() const {
	string temp;
	temp = "[";
	for (int i = 0; i < listSize; i++)
		temp += (element[i] + (i == listSize - 1 ? "" : ","));
	temp += "]";
	cout << temp << endl;
}

#endif /* ARRAYLIST_H_ */

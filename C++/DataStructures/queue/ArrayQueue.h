/*
 * ArrayQueue.h
 *
 *  Created on: 2015年7月30日
 *      Author: sulvto
 */

#ifndef ARRAYQUEUE_H_
#define ARRAYQUEUE_H_

#include <iostream>
#include "Queue.h"

using namespace std;

template<class T>
class ArrayQueue : public Queue<T> {
private:
    int frontIndex; //front 前面
    int backIndex; //back 末尾
    int length; //Queue length
    int arraySize;
    T *queue; //Array
public:
    ArrayQueue(int init = 10);

    ~ArrayQueue() {
        delete[] queue;
    }

    bool isEmpty() const {
        return length == 0;
    }

    int size() const {
        return length;
    }

    T front() {
        return queue[frontIndex];
    }

    T back() {
        return queue[backIndex];
    }

    T pop() {
        if (length == 0)
            throw "NULL";
        T r = queue[frontIndex];

        if (frontIndex == backIndex) {
            frontIndex = -1;
            backIndex = 0;
        }
        frontIndex++;
        length--;
        return r;
    }

    void push(const T &element);

    void print();

};

template<class T>
ArrayQueue<T>::ArrayQueue(int init) {
    if (init < 1)
        throw "init error";
    arraySize = init;
    length = 0;
    queue = new T[arraySize];
    backIndex = -1;
    frontIndex = 0;
}

template<class T>
void ArrayQueue<T>::push(const T &element) {
    //扩充容器
    if (length == arraySize) {
        T *newQueue = new T[2 * arraySize];
        for (int i = 0, j = frontIndex; j < backIndex; ++i, ++j) {
            newQueue[i] = queue[j];
        }
        arraySize *= 2;
        delete[] queue;
        queue = newQueue;
        backIndex = length - 1;
        frontIndex = 0;
    }
    queue[++backIndex] = element;
    length++;
}

template<class T>
void ArrayQueue<T>::print() {
    string temp = "[";
    for (int i = frontIndex; i <= backIndex; ++i) {
        temp += queue[i] + (i == backIndex ? "" : ",");
    }
    temp += "]";
    cout << temp << endl;
}

#endif /* ARRAYQUEUE_H_ */

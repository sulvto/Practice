/*
 * ArrayStack.h
 *
 *  Created on: 2015年7月21日
 *      Author: sulvto
 */

#ifndef ARRAYSTACK_H_
#define ARRAYSTACK_H_

#include <iostream>
#include "Stack.h"

using namespace std;

template<class T>
class ArrayStack : public Stack<T> {
private:
    int topIndex; //top
    int length; //Stack length
    T *stack; //Array

public:

    ArrayStack(int init = 10);

    ~ArrayStack() {
        delete[] stack;
    }

    bool empty() const {
        return topIndex == -1;
    }

    int size() const {
        return topIndex + 1;
    }

    T &top() {
        if (topIndex == -1)
            throw "NULL";
        else
            return stack[topIndex];
    }

    T pop() {
        if (topIndex == -1) {
            throw "NULL";
        }
        return stack[topIndex--];
    }

    void push(const T &element);

    void print();

};

template<class T>
ArrayStack<T>::ArrayStack(int init) {
    if (init < 1)
        throw "init error";
    length = init;
    stack = new T[length];
    topIndex = -1;
}


template<class T>
void ArrayStack<T>::push(const T &element) {
    if (topIndex == length - 1) {
        T *t = new T[length * 2];
        for (int i = 0; i < topIndex; ++i)
            t[i] = stack[i];
        stack = t;
    }
    stack[++topIndex] = element;
}

template<class T>
void ArrayStack<T>::print() {

    string temp;
    temp = "[";
    for (int i = 0; i <= topIndex; ++i)
        temp += stack[i] + (i < topIndex ? " , " : "");

    temp += "]";
    cout << temp << endl;
}

#endif /* ARRAYSTACK_H_ */

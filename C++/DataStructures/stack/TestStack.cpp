//============================================================================
// Name        : Stack.cpp
// Author      : sulvto
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "ArrayStack.h"
#include "ChainStack.h"
#include <cassert>

using namespace std;

int main() {
    ArrayStack<string> arrayStack(10);
    arrayStack.push("qin");
    arrayStack.push("chao");
    arrayStack.push("top");
    arrayStack.push("pop");
    arrayStack.print();

    assert(4 == arrayStack.size());
    assert(arrayStack.top() == "pop");
    assert(arrayStack.pop() == "pop");
    assert(arrayStack.top() == "top");
    arrayStack.print();
    assert(arrayStack.pop() == "top");
    assert(arrayStack.top() == "chao");
    assert(arrayStack.size() == 2);
    arrayStack.print();

//====================================
    ChainStack<string> chainStack(10);
    chainStack.push("q");
    chainStack.push("i");
    chainStack.push("n");
    chainStack.push("m");
    chainStack.push("e");
    assert(chainStack.size() == 5);
    assert(chainStack.pop() == "e");
    assert(chainStack.size() == 4);
    chainStack.push("e");
    assert(chainStack.size() == 5);
    chainStack.print();
    assert(chainStack.top() == "e");
    cout << chainStack.top() << endl;
    cout << chainStack.size() << endl;
    assert(chainStack.size() == 5);
    return 0;
}


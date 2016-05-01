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

using namespace std;

int main() {
    ArrayStack<string> arrayStack(10);
    arrayStack.puch("qin");
    arrayStack.puch("chao");
    arrayStack.puch("top");
    arrayStack.puch("pop");
    arrayStack.print();
    cout << arrayStack.top() << endl;
    arrayStack.pop();
    cout << arrayStack.top() << endl;
    arrayStack.print();
    arrayStack.pop();
    cout << arrayStack.top() << endl;

    arrayStack.pop();
    cout << arrayStack.top() << endl;

    arrayStack.pop();
    cout << arrayStack.size() << endl;
    arrayStack.print();

//====================================
    ChainStack<string> chainStack(10);
    chainStack.puch("q");
    chainStack.puch("i");
    chainStack.puch("n");
    chainStack.puch("m");
    chainStack.puch("e");
    chainStack.pop();
    cout << chainStack.size() << endl;
    chainStack.puch("e");
    chainStack.print();

    cout << chainStack.top() << endl;
    cout << chainStack.size() << endl;
    return 0;
}


//
// Created by sulvto on 16-5-2.
//

#include <iostream>
#include "ArrayQueue.h"
#include "ChainQueue.h"
#include <cassert>


int main() {
    ArrayQueue<string> arrayQueue(10);
    arrayQueue.push("Array");
    arrayQueue.push("Queue");
    arrayQueue.push("test");
    arrayQueue.print();

    assert(arrayQueue.size() == 3);
    assert(arrayQueue.front() == "Array");
    assert(arrayQueue.back() == "test");
    arrayQueue.print();
    assert(arrayQueue.pop() == "Array");
    assert(arrayQueue.size() == 2);
    assert(arrayQueue.pop() == "Queue");
    assert(arrayQueue.size() == 1);
    arrayQueue.push("ArrayQueue");
    assert(arrayQueue.size() == 2);

    assert(arrayQueue.back() == "ArrayQueue");
    assert(arrayQueue.front() == "test");

    arrayQueue.print();
    assert( arrayQueue.pop()=="test");
    arrayQueue.print();
    arrayQueue.push("qin");
    assert(arrayQueue.size() == 2);
    arrayQueue.print();
    assert(arrayQueue.front()=="ArrayQueue");
    assert(arrayQueue.back()=="qin");
    arrayQueue.print();


    cout << "========= ChainQueue ===========" << endl;


    ChainQueue<string> chainQueue(10);
    chainQueue.push("qin");
    chainQueue.push("chao");
    chainQueue.push("li");
    chainQueue.print();
    cout << chainQueue.pop() << endl;
    chainQueue.print();
    cout << chainQueue.front() << endl;
    cout << chainQueue.back() << endl;
    cout << chainQueue.size() << endl;
    return 0;
}
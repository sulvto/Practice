//============================================================================
// Name        : Queue.cpp
// Author      : �س�
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "ArrayQueue.h"
#include "ChainQueue.h"

using namespace std;

int main() {
//	ArrayQueue<string> arrayQueue(10);
//	arrayQueue.push("q");
//	arrayQueue.push("i");
//	arrayQueue.push("n");
//	arrayQueue.push("c");
//	arrayQueue.push("h");
//	arrayQueue.push("a");
//	arrayQueue.push("o");
//	arrayQueue.push("l");
//	arrayQueue.push("o");
//	arrayQueue.push("v");
//	arrayQueue.push("e");
//	arrayQueue.push("l");
//	arrayQueue.push("i");
//	arrayQueue.push("h");
//	arrayQueue.push("a");
//	arrayQueue.push("i");
//	arrayQueue.push("y");
//	arrayQueue.push("an");
//	arrayQueue.print();
//	cout << arrayQueue.pop() << endl;
//	arrayQueue.print();
//	cout << arrayQueue.pop() << endl;
//	arrayQueue.print();
//	cout << arrayQueue.pop() << endl;
//	arrayQueue.print();
//	arrayQueue.push("qin");
//	arrayQueue.print();
//	cout << arrayQueue.front() << endl;
//	cout << arrayQueue.back() << endl;
//	arrayQueue.print();

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

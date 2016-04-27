/*
 * MainTest.cpp
 *
 *  Created on: 2015年7月18日
 *      Author: qinchao
 */
#include <iostream>
#include "ArrayList.h"
#include "ChainList.h"
using namespace std;

int main() {
	//TODO false
	ArrayList<string> arrayList(10, true);
	arrayList.insert(0, "qin");
	arrayList.insert(1, "chao");
	arrayList.insert(2, "me");
	arrayList.erase(2);
	cout << arrayList.get(1) << endl; // chao
	cout << arrayList.indexOf("chao") << endl; // 1
	arrayList.insert(2, "my");
	arrayList.insert(2, "mi");
	arrayList.insert(2, "mi");
	arrayList.insert(2, "mi");
	arrayList.insert(2, "mi");
	arrayList.insert(2, "mi");
	arrayList.insert(2, "mi");
	arrayList.insert(2, "mi");
	arrayList.insert(2, "mi");
	arrayList.insert(2, "mi");
	arrayList.insert(2, "mi");
	arrayList.insert(2, "mi");
	arrayList.add("mini");
	arrayList.add("mini2");
	cout << arrayList.size() << endl; // 3
	arrayList.print();

	ChainList<string> chainList("qin");
	chainList.insert(1, "chao");
	chainList.insert(2, "hao");
	chainList.insert(2, "ni");
	chainList.add("me");
	chainList.add("me");
	chainList.add("me2");
	chainList.insert(4, "--");
	chainList.print();
	cout << chainList.size() << endl;
	chainList.erase(4);
	chainList.print();
	cout << chainList.size() << endl;
	chainList.insert(0, "头");
	chainList.print();
	cout << chainList.size() << endl;
	chainList.erase(0);
	chainList.print();
	cout << chainList.size() << endl;

	cout << chainList.get(0) << endl;
	cout << chainList.get(chainList.size()) << endl;
	cout << chainList.indexOf("me2") << endl;
}


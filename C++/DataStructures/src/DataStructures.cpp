//============================================================================
// Name        : DataStructures.cpp
// Author      : �س�
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>

#include "ArrayList.h"
#include "ChainList.h"
using namespace std;



int main() {
	//	vector<string> m;
	//	m.push_back("123");
	//	m.push_back("234");
	//	m.push_back("345");
	//	m.push_back("456");
	// if == m.end 表示未找到  最尾部一般是最后有效数据位置+1
	//	if (find(m.begin(), m.end(), "123") == m.end())
	//		cout << "no" << endl;
	//	else
	//		cout << "yes" << endl;

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


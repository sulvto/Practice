/*
 * Stack.h
 *
 *  Created on: 2015年7月22日
 *      Author: acer1
 */

#ifndef STACK_H_
#define STACK_H_

template<class T>
class Stack {
public:
	virtual ~Stack() {
	}
	//返回true，当且仅当stack为空
	virtual bool empty() const =0;
	//返回栈中元素个数
	virtual int size() const = 0;
	//返回栈顶元素的引用
	virtual T& top()=0;
	//删除栈顶元素
	virtual void pop()=0;
	//将元素压入栈顶
	virtual void puch(const T& element) =0;

};

#endif /* STACK_H_ */

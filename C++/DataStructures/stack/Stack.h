/*
 * Stack.h
 *
 *  Created on: 2015年7月22日
 *      Author: sulvto
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
	virtual T pop()=0;
	//将元素压入栈顶
	virtual void push(const T& element) =0;

};

#endif /* STACK_H_ */

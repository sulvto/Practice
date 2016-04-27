/*
 * Queue.h
 *
 *  Created on: 2015年7月30日
 *      Author: acer1
 */

#ifndef QUEUE_H_
#define QUEUE_H_
/**
 * FIFO 先进先出
 */
template<class T>
class Queue {
public:
	~Queue() {
	}
	//返回true，当且仅当队列为空
	virtual bool isEmpty() const =0;
	//返回队列中元素个数
	virtual int size() const = 0;
	//返回头元素
	virtual T front() = 0;
	//返回尾元素
	virtual T back() = 0;
	//删除头元素
	virtual T pop() = 0;
	//添加到队尾
	virtual void push(const T& element) = 0;
};

#endif /* QUEUE_H_ */

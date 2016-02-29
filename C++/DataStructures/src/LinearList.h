/*
 * LinearList.h
 *
 *  Created on: 2015年7月18日
 *      Author: 秦超
 */

#ifndef LINEARLIST_H_
#define LINEARLIST_H_


template<class T>
class LinearList {
public:
	virtual ~LinearList() {
	}

	virtual bool empty() const = 0;

	virtual int size() const = 0;

	virtual T& get(int index) const = 0;

	virtual int indexOf(const T& element) const = 0;

	virtual void erase(int index) = 0;

	virtual void insert(int index, const T& element) = 0;

	virtual void add(const T& element) = 0;

//	virtual void output(ostream& out) const = 0;

};



#endif /* LINEARLIST_H_ */

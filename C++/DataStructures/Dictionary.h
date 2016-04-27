//
// Created by qinchao on 16-4-26.
//

#ifndef DATASTRUCTURES_DICTIONARY_H
#define DATASTRUCTURES_DICTIONARY_H

template<class K, class E> struct pair

class Dictionary {
public:
    virtual ~Dictionary() { };

    virtual bool isEmpty();

    virtual int size();

    virtual pair<const K, E> *find(const K &) const;

    virtual void erase(const K &) = 0;

    virtual void insert(const pair<const K, E> &) = 0;

};


#endif //DATASTRUCTURES_DICTIONARY_H

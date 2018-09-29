//
// Created by sulvto on 18-4-18.
//

#include "Dictionary.h"

template<class K, class E> struct pair
class SortedArrayList : public Dictionary<K, E> {
public:
    SortedArrayList(): contents(pair<K, E>[10]) {}

private:
    pair<K, E> contents[];
    size_t len;
    size_t cap;
};

bool SortedArrayList::isEmpty() {
    return len == 0;
}

int SortedArrayList::size() {
    return len;
}

pair<K, E> SortedArrayList::find(const K &key) const {
    for (int i = 0; i < len; i++) {
        if (contents[i].first == key) {
            return contents[i];
        }
    }

    return NULL;
}

void SortedArrayList::insert(const pair<K, E> &kv) {
    if ()
    contents[len++] = kv;
}

void SortedArrayList::erase(const K &key) {
    for (int i = 0; i < len; i++) {
        if (contents[i].first == key) {
            delete contents[i];
            for (int j = len; j < len - 1; j++) {
                contents[j] = contents[j + 1];
            }
            delete contents[len];
            len--;
            break;
        }
    }
}


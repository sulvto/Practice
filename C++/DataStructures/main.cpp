#include <iostream>

#include "tree/source/BTree.cpp"
#include "tree/header/AVLTree.h"

using namespace std;

int main() {
//    AVLTree<string> *avlTree = new AVLTree<string>();
//    avlTree->insert("a");
//    avlTree->insert("av");
//    avlTree->insert("aqrv");
//    avlTree->insert("avaq");
//    avlTree->insert("avtq3");
//    avlTree->print();


//    LinkedBinaryTree<int> linkedBinaryTree;
    BTree<string> *bTree = new BTree<string>(2);
    bTree->insert("a1");
    bTree->insert("a2");
    bTree->insert("a3");
    bTree->print();

    bTree->insert("a4");
    bTree->print();
    bTree->insert("a5");
    bTree->print();
    bTree->insert("a6");
    bTree->print();


//    linkedBinaryTree->preOrder(linkedBinaryTree->root);
    return 0;
}
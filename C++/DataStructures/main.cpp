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
    bTree->insert("a4");
    bTree->insert("a5");
    bTree->insert("a6");
    bTree->insert("a7");

    bTree->insert("a8");

    bTree->insert("a9");
    bTree->remove("a8");
    // linkedBinaryTree->preOrder(linkedBinaryTree->root);
    return 0;
}
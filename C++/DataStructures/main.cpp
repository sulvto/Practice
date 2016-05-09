#include <iostream>

#include "tree/BTree.cpp"
#include "tree/AVLTree.cpp"
#include "tree/RBTree.cpp"

using namespace std;

void testRBTree() {
    RBTree<string> *rbTree = new RBTree<string>();
    rbTree->insert("a1");
    rbTree->insert("a2");
    rbTree->insert("a3");
    rbTree->insert("a4");
}


void testAVLTree() {

    AVLTree<string> *avlTree = new AVLTree<string>();
    avlTree->insert("a");
    avlTree->insert("av");
    avlTree->insert("aqrv");
    avlTree->insert("avaq");
    avlTree->insert("avtq3");
    avlTree->print();
}

void testBTree() {
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
}


int main() {


    testRBTree();

//    LinkedBinaryTree<int> linkedBinaryTree;

    // linkedBinaryTree->preOrder(linkedBinaryTree->root);
    return 0;
}

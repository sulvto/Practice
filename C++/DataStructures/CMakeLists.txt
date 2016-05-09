cmake_minimum_required(VERSION 3.3)
project(DataStructures)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES main.cpp tree/BinarySearchTree.h tree/LinkedBinaryTree.cpp tree/LinkedBinaryTree.h Dictionary.h tree/LinkedBinaryTree.h tree/BinaryTree.h tree/BinaryTreeNode.h tree/BinarySearchTree.cpp tree/AVLTree.h tree/AVLTree.cpp tree/RBTree.h tree/RBTree.cpp stack/ArrayStack.h stack/ChainStack.h queue/TestQueue.cpp tree/BTree.h tree/BTree.cpp tree/BTreeNode.h)
add_executable(DataStructures ${SOURCE_FILES})
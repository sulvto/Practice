cmake_minimum_required(VERSION 3.3)
project(DataStructures)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES main.cpp tree/header/BinarySearchTree.h tree/source/LinkedBinaryTree.cpp tree/header/LinkedBinaryTree.h Dictionary.h tree/header/LinkedBinaryTree.h tree/header/BinaryTree.h tree/header/BinaryTreeNode.h tree/source/BinarySearchTree.cpp tree/header/AVLTree.h tree/source/AVLTree.cpp tree/header/RBTree.h tree/source/RBTree.cpp stack/ArrayStack.h stack/ChainStack.h queue/TestQueue.cpp tree/header/BTree.h tree/source/BTree.cpp tree/header/BTreeNode.h)
add_executable(DataStructures ${SOURCE_FILES})
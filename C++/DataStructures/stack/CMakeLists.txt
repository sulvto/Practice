cmake_minimum_required(VERSION 3.3)
project(stack)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES TestStack.cpp ArrayStack.h ChainStack.h Stack.h)
add_executable(stack ${SOURCE_FILES})
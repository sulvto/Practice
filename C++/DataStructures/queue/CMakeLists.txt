cmake_minimum_required(VERSION 3.3)
project(queue)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES TestQueue.cpp ArrayQueue.h ChainQueue.h Queue.h)
add_executable(queue ${SOURCE_FILES})
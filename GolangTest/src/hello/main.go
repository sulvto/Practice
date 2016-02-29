// hello project main.go
package main

import (
	"fmt"
	"io/ioutil"
	"net/http"
)

func main() {
	fmt.Println("Hello World!")
	v, _ := http.Get("http://www.baidu.com")
	defer v.Body.Close()
	s, _ := ioutil.ReadAll(v.Body)
	fmt.Println(string(s))
}

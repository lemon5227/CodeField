package main

import "fmt"

func main(){
	var ptr *int
	fmt.Printf("ptr 变量的值是：%x\n",ptr)
	fmt.Printf("ptr 变量存储的地址是：%x\n",&ptr)
	if(ptr == nil){
		fmt.Println("ptr 是空指针")
	}
}
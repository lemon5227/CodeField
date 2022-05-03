package main

import (
	"fmt"
	"unsafe"
)
func main(){
	const(
		//常量可以用作枚举
		Unknown = 0
		Female = 1
		Male = 2
	)

	const (
		p = "abc"
		q = len(p)
		o = unsafe.Sizeof(p)
		/*
		不论字符串的len有多大，sizeof始终返回16，
		这是为啥，字符串不是也是不可变的吗？实际上字符串类型对应一个结构体，该结构体有两个域，第一个域是指向该字符串的指针，第二个域是字符串的长度，每个域占8个字节，但是并不包含指针指向的字符串的内容，
		这也就是为什么sizeof始终返回的是16
		*/
	)

	const LENGTH int = 10
	const WIDTH int = 5
	var area int
	const a,b,c = 1,false,"str"//多重赋值
	area = LENGTH * WIDTH
	fmt.Printf("面积为：%d",area)
	println()
	println(a,b,c)
	println("*********************")
	println(p,q,o)
}
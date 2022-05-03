package main
import "fmt"
func main(){
	//生命一个变量并初始化
	var a = "RUNOOB"
	fmt.Println(a)

	//没有初始化就为0值
	var b int
	fmt.Println(b)

	//bool 零值为false
	var c bool
	fmt.Println(c)
	/*
		数值类型（包括complex64/128）为 0

		布尔类型为 false

		字符串为 ""（空字符串）

		以下几种类型为 nil：

		var a *int
		var a []int
		var a map[string] int
		var a chan int
		var a func(string) int
		var a error // error 是接口

	*/
	var i int
	var f float64
	var bools bool
	var s string
	fmt.Printf("%v %v %v %q\n", i, f, bools, s)

	var d = true
	fmt.Println(d)

	intVal:=10
	fmt.Println(intVal)


}
package main

import "fmt"

func main(){
	var i,j,k int
	//声明数组的同时快速初始化数组
	balance := [5]float32{1000.0, 2.0, 3.4, 7.0, 50.0}

	/* 输出数组元素 */
	for i = 0; i < 5; i++ {
		fmt.Printf("Element[%d] = %f\n", i, balance[i])
	}

	balance2 := [...]float32{1000.0, 2.0, 3.4, 7.0, 50.0}
	for j = 0; j < 5; j++{
		fmt.Printf("Element[%d] = %f\n", j, balance2[j])
	}

	//将索引为1 和 3 的元素初始化
	balance3 := [5]float32{1:2.0,3:7.0}
	for k = 0; k < 5; k++{
		fmt.Printf("Element[%d] = %f\n", k, balance3[k])
	}
}
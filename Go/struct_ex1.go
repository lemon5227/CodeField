package main

import "fmt"

type Books struct {
	title string
	author string
	subject string
	book_id int
}	

func main(){
	fmt.Println(Books{"Go Programming", "Mahesh Kumar", "Go Programming Tutorial", 6495407})

	fmt.Println(Books{title: "Go Programming", author: "Mahesh Kumar", subject: "Go Programming Tutorial", book_id: 6495407})

	//忽略字段为0 或 空
	fmt.Println(Books{title: "Go Programming", author: "Mahesh Kumar"})
}
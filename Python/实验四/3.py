def func(str):
    num=0 
    chars = 0
    other = 0 
    for i in range(len(str)):
        if(str[i:i+1].isdigit()):
            num+=1
        elif(str[i:i+1].isalpha()):
            chars+=1
        else:
            other+=1
    print("数字个数：",num,"字母个数：",chars,"其它字符个数：",other)

str = input("输入一个字符串:")
func(str)


            

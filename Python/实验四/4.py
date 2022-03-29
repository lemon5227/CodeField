def func(str1,str2):
    a=0
    while(a != -1):
        a=str1.find(str2)
        str1 = str1[:a]+str1[a+len(str2):]
        a=str1.find(str2)
    return str1

str1 = input("输入母串：")
str2 = input("输入子串：")
print(func(str1,str2))
    


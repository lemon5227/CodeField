list1 = eval(input("输入一个包含任意数据的列表："))
list1 = list(list1)
list2 = []
for i  in list1:
    if(bool(i) == True):
        list2.append(i)

print(list2)
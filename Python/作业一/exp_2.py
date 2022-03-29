list0 = [1,2,3,4,5,6,7,8,9]
list1 = []
list2 = []
for i in list0:
    if i%2 != 0:
        list1.append(i)
    else:
        list2.append(i)
print(list1, list2)


list3 = list(map(lambda x,y: x*10+y,list1,list2))
print(list3)
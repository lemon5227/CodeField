list1 = [1,2,3]
list2 = [4,5,6]
list3 = list1 + list2
list4 = [list1, list2]
list4 = [y for x in list4 for y in x]
print(list3, list4)
list1 = ["Python","Java","Php","Python"]
new_list = list(set(list1))
new_list.sort(key = list1.index)
print(new_list)
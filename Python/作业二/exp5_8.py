num = eval(input("输入一个包含若干自然数的列表"))
new_list = []
for i in num:
    new_list.append(len(str(i)))

print(new_list)

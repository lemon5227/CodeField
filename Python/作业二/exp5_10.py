num = eval(input("输入一个包含若干自然数的列表"))
acc = 1
for i in num:
    acc*=i
print(acc)
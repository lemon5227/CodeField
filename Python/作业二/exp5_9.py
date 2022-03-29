num = eval(input("输入一个包含若干自然数的列表"))
max = num[0]
for i in num:
    if(abs(max) < abs(i)):
        max = i

print(max)

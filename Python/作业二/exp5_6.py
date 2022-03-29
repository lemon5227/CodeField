num = eval(input("输入一个包含若干自然数的列表:"))
num = list(num)
sum = 0
for i in num:
    sum+=i
sum = sum/len(num)
print("%.3f" % sum)
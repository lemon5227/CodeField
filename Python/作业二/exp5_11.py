num1 = eval(input("输入若干整数的列表"))
num2 = eval(input("输入等长列表"))
sum = 0  
for i in range(len(num1)):
    sum += num1[i]*num2[i]

print(sum)
num = []

for i in range(100,999):
    x = i%10
    y = i//10%10
    z = i//100%10
    if(i == (x**3+y**3+z**3)):
        num.append(i)

print(num)






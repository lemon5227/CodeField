def gcd(a,b):
    if(a<b):
        temp1 = a
        a=b
        b=temp1
    while(b!=0):
        temp2 = b
        b= a%b
        a= temp2
    return a

a,b = (input("输入两个数字").split())
a = int(a)
b = int(b)
print("最大公约：",gcd(a,b))
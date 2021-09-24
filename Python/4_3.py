for value in range(1,5):
    print(value)
number = list(range(1,6))
print(number)
squares = []
for i in range(1,11):
    squre = i**2
    squares.append(squre)
print(squares)
digits = [1,2,3,4,5,6,7,8,9,0]
print(min(digits))
print(max(digits))
print(sum(digits))
#列表解析
squares = [val**2 for val in range(1,6) ]
print(squares)
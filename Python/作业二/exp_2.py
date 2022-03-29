import random
list = []
for i in range(0,100):
    list.append(random.randint(0,100))
print(list)
list1 = [x*x for x in list if x%2 == 0]
list2 = [x*x*x for x in list if x%2 != 0]
list = list1 + list2
print(list)

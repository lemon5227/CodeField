set1 = [2,5,9,1,3]
set2 = [3,6,8,2,5]
set1.append(7)
print(set(set1) | set(set2))
print(set(set1) & set(set2))
print(set(set1) - set(set2))
if(4 in (set(set1) | set(set2))):
    print("4 is exist")

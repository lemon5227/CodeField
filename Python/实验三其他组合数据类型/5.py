tuple = (5,4,2,5,6,7,4,2,5,6,2,3,1,3,5,7,8,9,4,4)
a = [0,0,0,0,0,0,0,0,0,0,0]
for i in range(1,10):
    a[tuple[i]] +=1

for i in range(1,10):
    print(i,":",a[i])

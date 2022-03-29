counter = 0
for i in range(1,4):
    for j in range(1,4):
        for k in range(1,4):
            if(i!= j and j!= k):
                counter += 1
print(counter)
score = {'001':96,'002':98,'003':92,'004':93,'005':94}
score['006'] = 100
score['002'] = 99 
del score['001']
print(score['004'])
max = score['002']
min = score['002']
count =0
for key,value in score.items():
    if(max < value):
        max = value
    if(min > value):
        min = value
    count+=value
print("最大值：",max,"最小值：",min,"平均值：",count/len(score))
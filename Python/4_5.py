#元组
dimensions = (200,50)
print(dimensions[0])
print(dimensions[1])
#元组不能修改，但是可以重新定义
Banned_Users =['andrew','carolina','david']
user = 'marie'
if user not in Banned_Users:
    print(user.title()+",you can post a response if you wish.")
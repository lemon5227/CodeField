userTuple =('zhangsan','lisi','wangwu','xiaolin','xiaohua')
pwList=['123','456','789','246','abc']
name = input("输入用户名：")
count = 0
if(userTuple.index(name)>-1):
    password=input("用户存在，请输入密码：")
    while(count<2):
        if(pwList[userTuple.index(name)] == password):
            print("密码正确，登陆成功！")
        else:
            password = input("密码错误，请重新输入密码:")
        count += 1
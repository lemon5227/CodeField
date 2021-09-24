filename = "guest.txt"
'''
name = input("请输入你的姓名:\n")
print(name)
filename = "guest.txt"
with open(filename,'wb') as file_obj:
    file_obj.write(name.encode('gbk'))

with open(filename) as file_obj:
    content = file_obj.read()
    print(content)
'''

name = '小狐狸'
f = open(filename,'wb+')
f.write(name.encode('utf-8'))
contents= f.read()
print(contents.decode('utf-8'))


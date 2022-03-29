import re
line = "www.lemon5227.cf #这是我的网站"
web = re.sub(r'#.*$',"",line)
print("这是我的网站："+web)

line1="www.lemon5227.cf "
num = re.sub(r'^[.].+[.]$',".10111.",line1)
print("这是我的网站："+num)

def double(matched):
    value = int(matched.group('value'))
    return str(value * 2)
 
s = 'A23G4HFD567'
print(re.sub('(?P<value>\d+)', double, s))

line2 = "www.lemon5227.cf"
r= re.split(r'[.]',line2.strip("'"))
print(r)
import re
print(re.match('www','www.lemon5227.cf').span())
print(re.match('cf','www.lemon5227.cf'))

print(re.search('www','www.lemon5227.cf').span())
print(re.search('cf','www.lemon5227.cf'))
line = "Cats are smarter than dogs"

marchObj = re.search(r'(.*) are (.*)',line,re.M|re.I)
if marchObj:
    print ("matchObj.group() : ", marchObj.group())
    print ("matchObj.group(1) : ", marchObj.group(1))
    print ("matchObj.group(2) : ", marchObj.group(2))
else:
    print("No match!")

re_obj = re.compile(r'(.*) are (.*)')
print(re_obj.match(line))
list = re.findall(r'.{2}[\S]',line)
print (list)
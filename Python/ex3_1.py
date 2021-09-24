names = ['li','zhang','wang']

print(names)
names.append('dong')
print(names)
names.insert(0, 'huang')
print(names)
del names[0]
print(names)
pop_names = names.pop()
print(pop_names)
print(names)
print("the last name is "+pop_names.title()+'.')
names.remove('li')
print(names)
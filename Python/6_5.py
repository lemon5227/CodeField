#字典中存储列表
pizza ={
    'crust': 'trick',
    'toppings':['mushrooms','extra cheese'],
}

#描述所点的披萨
print("You ordered a "+pizza['crust']+"-crust pizza" + "with the following toppings")

for topping in pizza['toppings']:
    print('\t'+topping)

#favorite_language
favorite_language ={
    'jen':['python', 'ruby'],
    'sarah':['c'],
    'edward':['ruby', 'go'],
    'phil':['python','haskell'],
}
for name, languages in favorite_language.items():
    print('\n'+name.title()+"'s favorite language are")
    for language in languages:
        print('\t'+language.title())

#字典嵌套字典
Users = {
    'aeinstein':{
        'first':'albert',
        'last':'einstein',
        'location':'princeton',
    },
    'mcurie':{
        'first':'marie',
        'last':'curie',
        'location':'paris',
    },
}

for username ,userinfo in Users.items():
    print('\n'+username.title())
    print("\tFull name:"+userinfo['first']+userinfo['last']+userinfo['location'])
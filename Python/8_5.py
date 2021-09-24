def make_pizza(*toppings):
    print(toppings)

make_pizza('pepperoni')
make_pizza('mushroom','green peppers')

def make_pizza1(*toppings):
    print("\nMaking a pizza with the following toppings:")
    for topping in toppings:
        print("- "+topping)

make_pizza1('mushroom','green peppers')

def make_pizza2(size,*toppings):
    print('\nMakeing a '+str(size)+'-inch pizza with the following toppings:')
    for topping in toppings:
        print("- "+topping)

make_pizza2(16,'mushroom','green')

def build_profile(first,last,**userinfo):
    '''
    创建一个字典，其中包含我们知道的有关用户的的一切信息
    '''
    profile={}
    profile['first_name'] = first
    profile['last_name'] = last
    for key ,value in userinfo.items():
        profile[key]=value
    return profile
user_profile = build_profile('albert','einstein',location='princeton',field = 'physics')

print(user_profile)
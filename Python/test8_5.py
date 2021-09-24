#8-12
def make_sandwich(*toppings):
    for element in toppings:
        print(element)

make_sandwich("a",'b','c')

#8-13 
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
my_profile = build_profile('闫','文博',weight="194",height="177")
print(my_profile)

#8-14
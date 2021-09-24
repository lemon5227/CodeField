"""User_o = {
    'username': 'efermi',
    'first':'enrico',
    'last':'fermi'
}

for key,value in User_o.items():
    print("\nKey:"+key)
    print("Value:"+value)"""

favorite_language = {
    'jen':'python',
    'sarah':'c',
    'edward':'ruby',
    'phil':'python',
}

for name,language in favorite_language.items():
    print(name.title()+"'s favorite language is "+language.title()+'.')

"""for name in favorite_language.keys():
    print(name.title())"""

for name in sorted(favorite_language.keys()):
    print(name.title()+ ",thank you for taking the poll.")
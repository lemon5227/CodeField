def greet_user():
    """显示简单的问候语"""
    print("Hello!")

greet_user()

def greet_user1(username):
    print("Hello,"+username.title()+"!")

greet_user1('jesse')

def display_message(message):
    print(message.title())

display_message('python')

def describe_pet(pet_name,animal_type='dog'):
    print("\nI have a "+animal_type+".")
    print("My "+animal_type + "'s name is "+pet_name.title()+'.')

describe_pet('hamster','harry')
describe_pet(pet_name='jhon',animal_type='pig')
describe_pet('whiles')


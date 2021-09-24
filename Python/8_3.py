def get_formatted_name(first_name, last_name,middle_name=''):
    if(middle_name):
        full_name = first_name +" "+middle_name+" "+last_name
    else:
        full_name = first_name+" "+last_name
    return full_name.title()

musician = get_formatted_name("jimi","hendrix")
print(musician)

def build_person(first_name,last_name):
    person = {"first":first_name,"last":last_name}
    return person

m1 = build_person('jimi','hendrix')
print(m1)

def build_person1(first_name,last_name,age=''):
    person = {"first":first_name,"last":last_name}
    if(age):
        person["age"] = age
    return person

m2 = build_person1('jimi','hendrix',27)
print(m2)

while True:
    print("\nPlease tell me your name:")
    f_name = input("First_name:")
    l_name = input("Last_name")
    formatted_name = get_formatted_name(f_name,l_name)
    print("\nHello,"+formatted_name+'!')
    break
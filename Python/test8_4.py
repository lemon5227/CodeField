#8-9魔术师
names =['d','a','b','c','d','e','f']
def show_magicians(names):
    for name in names:
        print(name)
show_magicians(names)
#8-10
def make_great(names):
    for i in range(len(names)):
        names[i] = 'The Great '+names[i].title()

#make_great(names)
show_magicians(names)

#8-11
def make_great1(names):
    new_names=[]
    for i in range(len(names)):
        new_names.append('The Great '+names[i].title())
    return new_names    

new_names = make_great1(names)
show_magicians(new_names)
show_magicians(names)
    
'''
pets = []
black = {'name':'black','hostname':'jhon','type':'泰迪'}
write = {'name':'write','hostname':'susan','type':'金毛'}
pets.append(write)
pets.append(black)
for pet in pets:
    print("name:"+pet['name']+"hostname："+pet['hostname']+"pet_type"+pet['type'])

'''

favorite_places = {'zhang':["beijing","shanghai","shenzhen"],
'wang':["shanghai","guangzhou","zhengzhou"],'li':["beijing","shanghai","luoyang"]}

for name,locations in favorite_places.items():
    print("name:"+name)
    print("location:")
    for location in locations:
        print("\t"+location)

cities = {
    'shanghai':{'country':'China','population':'14','fact':'safe'},
    'Bay_area':{'country':'Amercian','population':'3','fact':'Silicon Valley'},
    'Tokyo':{'country':"Japan",'population':'1','fact':'comfort'}
}

for city,things in cities.items():
    print("City:"+city)
    for name,thing in things.items():
        print("\t"+name+":"+thing)
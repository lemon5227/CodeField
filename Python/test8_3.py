def city_county(city,country):
    print(city.title()+" "+country.title())
city_county('santiago','chile')

def make_album(singer, album,number=''):
    album_message ={'singer':singer, 'album':album}
    if(number):
        album_message['number'] = number
    return album_message

a1 = make_album('zhou', 'yequ',5)
print(a1)        

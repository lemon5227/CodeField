class Restaurant():
    def __init__(self, restaurant_name,cuisine_type):
        self.restaurant_name = restaurant_name
        self.cuisine_type = cuisine_type

    def descri_restaurant(self):
        print("\nrestaurant_name:"+self.restaurant_name.title())
        print("\ncuisine_type:"+self.cuisine_type.title())

    def open_restaurant(self):
        print(self.restaurant_name.title()+" is opening now.")

the_restaurant = Restaurant("kfc","fast")
the_restaurant.descri_restaurant()
the_restaurant.open_restaurant()

#9-3
class User():
    def __init__(self,first_name,last_name):
        self.first_name = first_name
        self.last_name = last_name
    
    def describe_user(self):
        print("\nUser name:"+self.first_name.title()+" "+self.last_name.title())

    def greet_user(self):
        print("Greet "+self.first_name.title()+" "+self.last_name.title()+"!")

User1 = User("闫",'文博')
User1.describe_user()
User1.greet_user()
class Car():
    def __init__(self,make,model,year):
        self.make = make
        self.model = model
        self.year = year
        self.odometer_reading = 0
    
    def get_descriptive_name(self):
        long_name=str(self.year)+' '+self.make+' '+self.model
        return long_name
    
    def read_odometer(self):
        print("This car has "+str(self.odometer_reading)+" miles on it")

    def update_odometer(self,mileage):
        '''将里程表读数设置为指定的值'''
        if mileage > self.odometer_reading:
            self.odometer_reading = mileage
        else:
            print("You can't roll back an odometer!")
my_car = Car('audi','a4',2016)
print(my_car.get_descriptive_name())
my_car.read_odometer()
my_car.update_odometer(26)
my_car.read_odometer()
my_car.update_odometer(20)
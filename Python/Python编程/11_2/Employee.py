class Employee_to_Test():
    def __init__(self,name,age,salary):
        self.name = name
        self.age = age
        self.salary = salary
    
    def give_raise(self,add = 5000):
        self.salary = self.salary+add


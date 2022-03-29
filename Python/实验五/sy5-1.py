import math
class Shape():
    def getArea():
        pass
    def getPerimeter():
        pass
class Triangle(Shape):
    def __init__(self,x,y,z):
        self.x = x
        self.y = y
        self.z = z
    def getArea(self):
        sin = math.sqrt(1-((self.x**2 + self.y**2 - self.z**2)/2*self.x*self.y)**2)
        return self.x*self.y*sin/2

    def getPerimeter(self):
        all = self.x+self.y+self.z
        return all

class Rectangle(Shape):
    def __init__(self,x,y):
        self.x = x
        self.y = y
    
    def getArea(self):
        return self.x-self.y

    def getPerimeter(self):
        return (self.x+self.y)*2

class Circle(Shape):
    def __init__(self,r):
        self.r = r
    
    def getArea(self):
        return self.r*math.pi**2

    def getPerimeter(self):
        return self.r*math.pi*2

my_Circle = Circle(2)
print("%.2f" %my_Circle.getArea())


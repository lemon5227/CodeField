from random import randint
x = randint(1,6)
class Die():
    def __init__(self,sides=6):
        self.sides =sides

    def roll_die(self):
        print(randint(1,self.sides))

six_die = Die()
ten_die = Die(10)
twenty_die = Die(20)
for i in range(10):
    six_die.roll_die()
    ten_die.roll_die()
    twenty_die.roll_die()

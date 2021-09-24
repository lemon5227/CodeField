#切片
players = ['zhao','ma','wang','li','qian']
print(players[0:3])
print(players[:2])
print(players[2:])
#最后三个
print(players[-3:])
print(players[:-3])
my_foods = ['pizza','falafel','carrot cake']
friend_foods = my_foods[0:]
print(friend_foods)
friend_foods.append('ice')
my_foods.append('banana')
print(my_foods)
print(friend_foods)
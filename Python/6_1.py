"""alien_0 = {'color':'green','points':5}
new_point = alien_0['points']
print("You just earned "+str(new_point)+" points.")
print(alien_0)
alien_0['x_position'] = 0
alien_0['y_position'] = 25
print(alien_0)"""
alien_0 = {}
alien_0['color'] = 'green'
alien_0['points'] = 5
print(alien_0)
print("The alien is "+alien_0['color']+'.')
alien_0['color'] = 'yellow'
print("The alien is "+alien_0['color']+'.')
alien_0['speed'] = 'medium'
alien_0['x_position'] = 0
alien_0['y_position'] = 25
print("Original x-position: "+str(alien_0['x_position']))
if(alien_0['speed'] == 'slow'):
    x_increment = 1
elif alien_0['speed'] == 'medium':
    x_increment = 2
else:
    x_increment = 3
alien_0['x_position'] = alien_0['x_position'] + x_increment
print("New x-position: "+str(alien_0['x_position']))
#删除键值
del alien_0['points']
print(alien_0)
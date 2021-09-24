#嵌套
alien_0 = {'color':'green','points':5}
alien_1 = {'color':'yellow','points':10}
alien_2 = {'color':'red','points':15}
aliens = [alien_0,alien_1,alien_2]
for alien in aliens:
    print(alien)
aliens = []
for alien_number in range(30):
    new_alien = {'color':'green','points':5,'speed':'slow'}
    aliens.append(new_alien)

#前三个变为黄色
for aline in aliens[0:3]:
    aline['color'] ='yellow'
    aline['points'] =10
    aline['speed'] ='medium'
#显示前五个
for aline in aliens[:5]:
    print(aline)
print("-----")

#显示创建了多少外星人
print("Total numbers of alines: "+str(len(aliens)))

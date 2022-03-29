goods = {}
saled_goods = {}
choice = 0
def show_goods():
    for good,price_num in goods.items():
        print("货物：",good,"价格:",price_num[0],"数量：",price_num[1])

    
    choice = input("\n选择你要使用的功能：\n")
        

def add_good():
    good = input("\n输入货物名称:\n")                                                          
    price = float(input("\n输入货物价格：\n"))
    number = float(input("\n输入货物数量:\n"))
    goods[good] = [price, number]

def update_good():
    good = input("\n输入要修改的货物名称:\n")
    delete_good = goods.pop(good)
    new_good = input("\n输入修改后的货物名称\n")
    price = float(input("\n输入修改后的货物价格\n"))
    number = float(input("\n输入货物数量:\n"))
    goods[new_good] = [price, number]

def delete_good():
    good = input("\n输入你要删除的货物名称：\n")
    delete_good = goods.pop(good)
    print(delete_good,"已删除")

def saled_good():
    sale_good = input("\n输入你卖出的货物名称：\n")
    sale_price = float(input("\n输入你卖出货物价格：\n"))
    sale_number = float(input("\n输入你卖出货物数量:\n"))
    saled_goods[sale_good]=[sale_price,sale_number]

def total():
    all_price = 0
    for good,price_num in goods.items():
        print("货物：",good,"价格:",price_num[0],"数量：",price_num[1])
        all_price+=(price_num[0]*price_num[1])
    print("-----------------------")
    print("总销售额：\t\t ",all_price)

while True:
    print("-------选择操作-------")
    print("-----1、查询所有商品--")
    print("-----2、添加商品-----")
    print("-----3、修改商品-----")
    print("-----4、删除商品-----")
    print("-----5、卖出商品-----")
    print("-----6、汇总--------")
    print("--- -1、退出系统----")
    choice = input("\n选择你要使用的功能：\n")
    if(choice == '1'):
        show_goods()
    elif(choice == '2'):
        add_good()
    elif(choice == '3'):
        update_good()
    elif(choice == '4'):
        delete_good()
    elif(choice == '5'):
        saled_good()
    elif(choice == '6'):
        total()
    elif(choice == '-1'):
        break
    
    

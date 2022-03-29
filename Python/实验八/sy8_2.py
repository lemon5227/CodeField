print("2023闫文博")
list = ["苹果","柿子","梨"]
with open("实验八/list.txt",'a',encoding='utf-8') as f:
    for ls in list:
        f.write(ls)


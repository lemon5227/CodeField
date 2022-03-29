print("2023闫文博")
filename = "实验八/2.txt"
with open(filename,'r',encoding='utf-8') as f_obj:
    with open("实验八/3.txt",'w',encoding='utf-8') as f2_obj:
        lines = f_obj.readlines()
        for line in lines:
            f2_obj.write(line.upper())
filename = "实验八/1.txt"
with open(filename,'a',encoding='utf-8') as f_obj:
    for i in range(1,10):
        for j in range(1,i+1):
            string = str(i)+"x"+str(j)+" "
            f_obj.write(string)
        f_obj.write("\n")
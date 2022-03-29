print("2023闫文博")
import csv
ls = [["中国","日本"],["北京","东京"]]
with open('实验八/items.csv','w',encoding='utf-8') as f:
    for i in ls:
        f.write(','.join(i)+"\n")


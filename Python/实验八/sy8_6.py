print("2023闫文博")
import csv
csvfile = "实验八/detal.csv"
with open(csvfile,'r',encoding='utf8') as f_obj:
    r = csv.reader(f_obj)
    for row in r:
        print(row)
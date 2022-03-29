print("2023闫文博")
import csv
csvfile = "实验八/detal.csv"
with open(csvfile,'w+',encoding='utf8') as f_obj:
    w = csv.writer(f_obj)
    w.writerow(['China','Japan','Korea','America'])
    w.writerow(['Beijing','Tokyo',"Seoul"])
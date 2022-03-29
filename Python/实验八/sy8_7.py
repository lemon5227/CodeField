print("2023闫文博")
import csv
ls = ["河南科技大学","闫文博","男",'21']
with open('实验八/item.csv','w',encoding='utf8') as f:
    f.write(" ".join(ls))
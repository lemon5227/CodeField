import jieba
import csv
filename = "goods.txt"
txt = open(filename,"r",encoding="utf-8").read()
words = jieba.lcut_for_search(txt)
rows=[][]
for word in words:
    if(word == "，"):
        words.remove(word)

lines = 0
for word in words:
    for i in range(5):
        rows[lines][i]=word
    lines += 1

print(" ".join(words))
print(rows)
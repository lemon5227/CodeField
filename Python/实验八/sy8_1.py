print("2023闫文博")
filename = "实验八/hello.txt"
with open(filename, 'r',encoding='utf-8') as f_obj:
    lines = f_obj.readlines()

for line in lines:
    print(line.strip())
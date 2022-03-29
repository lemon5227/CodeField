with open('test_data\pi_digits.txt') as file_object:
    lines = file_object.readlines()

pi_string = ''
for line in lines:
    #在这个文件中，每行的末尾都有一个看不见的换行符，而
    #print语句也会加上一个换行符，因此每行末尾都有两个换行符：一个来自文件，另一个来自print
    #语句。要消除这些多余的空白行，可在print语句中使用rstrip()：
    pi_string+=line.rstrip()

print(pi_string)
print(len(pi_string))
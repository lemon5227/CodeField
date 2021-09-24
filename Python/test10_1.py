with open("learning_python.txt") as file_obj:
    lines = file_obj.readlines()

learning_string = ''
for line in lines:
    learning_string += line.replace('Python','C')

print(learning_string)
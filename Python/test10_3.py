#10.6
'''print("Enter two numbers")
try:
    first_number = int(input("\nEnter first numbers:"))
except ValueError:
    print("Please enter numbers")
try:
    second_number = int(input("\nEnter second numbers:"))
except ValueError:
    print("Please enter numbers")
all = first_number + second_number
print("Two numbers plus is ",all)
'''
#10.8
try:
    with open("cats.txt") as f_obj1:
        content = f_obj1.read()
    with open("dogs.txt") as f_obj2:
        content1 = f_obj2.read()
except FileNotFoundError:
    print("file no exists")
print(content)
print(content1)
'''
message = input("Tell me something ,and I will repeat it back to you:")
print(message)
'''
"""name = input("Please enter your name: ")
print("Hello " + name + "!")"""

'''prompt = "If you tell who you are, we can personalize the message you see."
prompt += "\nWhat is your first name? " 
name = input(prompt)
print("\nHello, "+name + "!")'''

'''height = input("How tall are you,in inches?")
height = int(height)
if height >= 36:
    print("\nYou're tall enough to ride!")
else:
    print("\nYou'll be able to ride when you're a little older.")'''

'''number = input("Enter a number,and I'll tell you if it's even or odd:")
number = int(number)

if number %2 ==0:
    print("\nThe number "+str(number)+" is even.")
else:
    print("\nThe number "+str(number)+" is odd.")
'''

'''car = input("What are your needs?")
print("\nLet me see if I can find you a "+car)
'''

'''current_number = 1
while current_number <=5:
    print(current_number)
    current_number+=1
'''

prompt = "\nTell me something, and I will repeat it back to you:"
prompt += "\nEnter 'quit' to end the program."

#利用break
'''while True:
    city = input(prompt)

    if city == 'quit':
        break
    else:
        print("I'd love to go to "+city.title()+"!")
'''
#利用标志改进
'''active = True
while active:
    message = input(prompt)
    if message == 'quit':
        active = False
    else:
        print(message)
'''

#出版
'''message = ""
while message != 'quit':
    message = input(prompt)
    if message !='quit':
        print(message)'''

#循环中使用continue
current_number = 0
while current_number < 10:
    current_number += 1
    if current_number %2 == 0:
        continue

    print(current_number)

x = 1
while x <=5:
    print(x)
    x +=1
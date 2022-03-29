def get_formatted_name(first,last):
    """Generate a neatly formatted fully name"""
    full_name = first+" "+last
    return full_name.title()

print("Enter 'q'  at any time to quit.")
while True:
    first = input("\nPlesae give me  a first name\n")
    if first == 'q':
        break
    last = input("\nPlesae give me a last name\n")
    if last == 'q':
        break

    formatted_name = get_formatted_name(first,last)
    print("\t Neatly formatted name: "+formatted_name+".")
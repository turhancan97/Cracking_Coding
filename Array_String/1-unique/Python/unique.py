def is_unique_chars(string):
    if len(string) > 128:
        return False

    char_set = [False for _ in range(128)]
    for char in string:
        val = ord(char)
        if char_set[val]:
            return False
        char_set[val] = True
    return True

input_string = input("Enter a string: ")

if is_unique_chars(input_string):
    print("All characters in the string are unique.")
else:
    print("There are duplicate characters in the string.")

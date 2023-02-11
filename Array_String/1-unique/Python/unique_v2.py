def isUniqueChars(string):
    checker = 0
    for char in string:
        val = ord(char) - ord('a')
        if checker & (1 << val) > 0:
            return False # already found this character in the string
        checker |= (1 << val)
    return True

if __name__ == '__main__':    
    input_string = input("Enter a string: ")
    if isUniqueChars(input_string):
        print("All characters in the string are unique.")
    else:
        print("There are duplicate characters in the string.")

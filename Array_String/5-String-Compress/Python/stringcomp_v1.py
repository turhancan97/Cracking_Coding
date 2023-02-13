def stringCompression(string):
    string = string.lower() # .replace(" ", "")  # ignore spaces and make all lowercase
    string = string + ' ' # add space to the end of string to include last elements
    compressed_string = ''
    count_consecutive = 0
    for i in range(len(string)-1):
        if string[i] == string[i+1]:
            count_consecutive += 1
        else:
            compressed_string += string[i]
            compressed_string += str(count_consecutive + 1)
            count_consecutive = 0

    if len(string) <= len(compressed_string):
        return string
    return compressed_string

if __name__ == "__main__":
    print(stringCompression('ab'))
    
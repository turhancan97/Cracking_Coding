def replace_spaces(str, true_length):
    number_of_spaces = count_of_char(str, 0, true_length, ' ')
    new_index = true_length - 1 + number_of_spaces * 2

    if new_index + 1 < len(str):
        str[new_index + 1] = '\0'

    for old_index in range(true_length - 1, -1, -1):
        
        if str[old_index] == ' ':
            str[new_index] = '0'
            str[new_index - 1] = '2'
            str[new_index - 2] = '%'
            new_index -= 3
        else:
            str[new_index] = str[old_index]
            new_index -= 1
    return str

def count_of_char(str, start, end, target):
    count = 0
    for i in range(start, end):
        if str[i] == target:
            count += 1
    return count

if __name__ == '__main__':
    str = list("Mr John Smith    ")
    true_length = 13
    print(''.join(replace_spaces(str, true_length)))

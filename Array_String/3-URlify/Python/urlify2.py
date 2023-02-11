def replace_spaces(s, true_length):
    result = ''
    for i in range(true_length):
        if s[i] == ' ':
            result += '%20'
        else:
            result += s[i]
    return result

my_string = input('Lütfen bir karakter dizisi girin: ')
string_length = int(input('Lütfen bu karakter dizinin uzunluğunu girin: '))

print(replace_spaces(my_string, string_length))
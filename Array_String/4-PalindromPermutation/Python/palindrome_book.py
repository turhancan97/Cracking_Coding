def is_permutation_of_palindrome(phrase):
    table = build_char_frequency_table(phrase)
    return check_max_one_odd(table)

def check_max_one_odd(table):
    odd_count = 0
    for count in table:
        if count % 2 == 1:
            odd_count += 1
        if odd_count > 1:
            return False
    return True

def build_char_frequency_table(phrase):
    table = [0] * 26
    for c in phrase:
        x = get_char_number(c)
        if x != -1:
            table[x] += 1
    return table

def get_char_number(c):
    a = ord('a')
    z = ord('z')
    A = ord('A')
    Z = ord('Z')
    val = ord(c)
    if a <= val <= z:
        return val - a
    elif A <= val <= Z:
        return val - A
    return -1

phrase = input("Enter a string: ")
print(is_permutation_of_palindrome(phrase))
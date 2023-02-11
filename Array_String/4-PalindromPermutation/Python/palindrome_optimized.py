def is_permutation_of_palindrome(phrase):
    count_odd = 0
    table = [0] * (ord('z') - ord('a') + 1)
    for c in phrase:
        x = get_char_number(c)
        if x != -1:
            table[x] += 1
            if table[x] % 2 == 1:
                count_odd += 1
            else:
                count_odd -= 1
    return count_odd <= 1

def get_char_number(c):
    a = ord('a')
    z = ord('z')
    val = ord(c)
    if a <= val <= z:
        return val - a
    return -1

phrase = input("Enter a string: ")
if is_permutation_of_palindrome(phrase):
    print("The string is a permutation of a palindrome")
else:
    print("The string is not a permutation of a palindrome")

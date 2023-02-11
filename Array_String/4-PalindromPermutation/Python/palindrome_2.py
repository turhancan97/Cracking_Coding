def is_permutation_palindrome(string):
    string = string.lower().replace(" ", "")  # ignore spaces and make all lowercase
    char_counts = {}
    for char in string:
        char_counts[char] = char_counts.get(char, 0) + 1
    odd_count = 0
    for char_count in char_counts.values():
        if char_count % 2 != 0:
            odd_count += 1
        if odd_count > 1:
            return False
    return True

my_string = input("Enter a string: ")
print(is_permutation_palindrome(my_string))

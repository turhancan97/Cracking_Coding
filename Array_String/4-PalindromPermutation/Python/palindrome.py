def palindrome(string):
    string = string.lower()
    freq = [0 for _ in range(26)]
    for c in string:
        if c.isalpha():
            freq[ord(c) - ord('a')] += 1
    odd_count = 0
    for count in freq:
        if count % 2 == 1:
            odd_count += 1
    return odd_count <= 1

my_string = input('Enter a string: ')
print(palindrome(my_string))
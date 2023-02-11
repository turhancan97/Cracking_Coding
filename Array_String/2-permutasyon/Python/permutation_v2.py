def checkPermutation(s, t):
    if len(s) != len(t):
        return False
    letters = [0] * 128
    for i in range(len(s)):
        letters[ord(s[i])] += 1
    for i in range(len(t)):
        letters[ord(t[i])] -= 1
        if letters[ord(t[i])] < 0:
            return False
    return True

s = input("Enter the first string: ")
t = input("Enter the second string: ")

if checkPermutation(s, t):
    print("The strings are permutations of each other.")
else:
    print("The strings are not permutations of each other.")

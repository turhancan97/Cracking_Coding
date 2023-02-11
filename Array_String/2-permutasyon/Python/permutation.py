def checkPermutation(s, t):
    if len(s) != len(t):
        return False
    return sorted(s) == sorted(t)

s = input("Enter the first string: ")
t = input("Enter the second string: ")

if __name__ == "__main__":
    if checkPermutation(s, t):
        print("The strings are permutations of each other.")
    else:
        print("The strings are not permutations of each other.")

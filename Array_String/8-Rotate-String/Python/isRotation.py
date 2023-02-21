def isSubstring(s1, s2):
    return s2 in s1

def isRotation(s1, s2):
    length = len(s1)
    # Check that s1 and s2 are equal length and not empty
    if length == len(s2) and length > 0:
        # Concatenate s1 and s1 within new buffer
        s1s1 = s1 + s1
        return isSubstring(s1s1, s2)
    return False

def main():
    s1 = "waterbottle"
    s2 = "erbottlewat"
    print(isRotation(s1, s2))  # Output: True

if __name__ == "__main__":
    main()
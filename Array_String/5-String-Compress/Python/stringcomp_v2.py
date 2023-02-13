def compress_bad(s):
    compressed = ""
    count_consecutive = 0
    for i in range(len(s)):
        count_consecutive += 1
        if i + 1 >= len(s) or s[i] != s[i + 1]:
            compressed += s[i] + str(count_consecutive)
            count_consecutive = 0
    return compressed if len(compressed) < len(s) else s

print(compress_bad("aabcccccaaawweewweewweed")) # Output: "a2b1c5a3"
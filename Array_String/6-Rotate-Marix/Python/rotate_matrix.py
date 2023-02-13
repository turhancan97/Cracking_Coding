def rotate(matrix):
    n = len(matrix)
    if n == 0 or n != len(matrix[0]):
        raise Exception('Please enter a Square Matrix')

    for layer in range(n // 2):
        first = layer
        last = n - 1 - layer
        for i in range(first, last):
            offset = i - first
            top = matrix[first][i]  # save top

            # left -> top
            matrix[first][i] = matrix[last - offset][first]

            # bottom -> left
            matrix[last - offset][first] = matrix[last][last - offset]

            # right -> bottom
            matrix[last][last - offset] = matrix[i][last]

            # top -> right
            matrix[i][last] = top  # right <- saved top

matrix = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]

print("Before rotation:")
for row in matrix:
    print(row)

rotate(matrix)

print("After rotation:")
for row in matrix:
    print(row)

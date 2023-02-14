def setZeros(matrix):
    rows = set()
    cols = set()

    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            if matrix[i][j] == 0:
                rows.add(i)
                cols.add(j)

    for row in rows:
        matrix[row] = [0] * len(matrix[0])

    for i in range(len(matrix)):
        for col in cols:
            matrix[i][col] = 0
    return matrix

matrix = [[1, 0, 3, 4,0], [5, 6, 7, 8,1], [9, 10, 11, 12,2], [13, 14, 0, 16,3]]
for i in matrix:
    print(i)
print('--------------------------------')
setZeros(matrix)
for i in matrix:
    print(i)
import numpy as np
def zeroMatrix(matrix):
    temp_matrix = matrix.copy()
    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            if matrix[i][j] == 0:
                temp_matrix[i] = 0
                for k in range(len(matrix)):
                    temp_matrix[k][j] = 0
    return temp_matrix
matrix = np.ones([16,21])
for i in range(len(matrix)):
    for j in range(len(matrix[0])):
        if i % 5 == 0 and j % 5 == 0:
            matrix[i][j] = 0
print(matrix)
print('----------------------------------------------------------------')
print(zeroMatrix(matrix))
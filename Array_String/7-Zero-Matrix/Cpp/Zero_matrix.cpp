#include <iostream>
using namespace std;

const int ROWS = 4;
const int COLS = 5;

void setZeros(int matrix[ROWS][COLS]) {
bool row[ROWS] = {0};
bool column[COLS] = {0};

// Store the row and column index with values 0
for (int i = 0; i < ROWS; i++)
{
    for (int j = 0; j < COLS; j++)
    {
        if (matrix[i][j] == 0)
        {
            row[i] = true;
            column[j] = true;
        }
    }
}
// Nullify rows
for (int i = 0; i < ROWS; i++)
{
    if (row[i])
    {
        for (int j = 0; j < COLS; j++) {
            matrix[i][j] = 0;
        }
    }
}
// Nullify columns
for (int j = 0; j < COLS; j++)
{
    if (column[j])
    {
        for (int i = 0; i < ROWS; i++) {
            matrix[i][j] = 0;
        }
    }
}

}

int main() {
int matrix[ROWS][COLS] = {{1, 2, 3, 4,0}, {5, 6, 7, 8, 2}, {9, 4, 0, 1,2}, {3, 1, 5, 6,7}};

cout << "Before setting zeros: " << endl;
for (int i = 0; i < ROWS; i++) {
    for (int j = 0; j < COLS; j++) {
        cout << matrix[i][j] << " ";
    }
    cout << endl;
}

setZeros(matrix);

cout << "After setting zeros: " << endl;
for (int i = 0; i < ROWS; i++) {
    for (int j = 0; j < COLS; j++) {
        cout << matrix[i][j] << " ";
    }
    cout << endl;
}

return 0;
}
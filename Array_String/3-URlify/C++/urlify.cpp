#include <iostream>
#include <cstring>

using namespace std;

int countOfChar(char str[], int start, int end, char target) {
    int count = 0;
    for (int i = start; i < end; i++) {
        if (str[i] == target) {
            count++;
        }
    }
    return count;
}

void replaceSpaces(char str[], int trueLength) {
    int numberOfSpaces = countOfChar(str, 0, trueLength, ' ');
    int newIndex = trueLength - 1 + numberOfSpaces * 2;
    if (newIndex + 1 < strlen(str)) {
        str[newIndex + 1] = '\0';
}
for (int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex--) {
    if (str[oldIndex] == ' ') {
        str[newIndex] = '0';
        str[newIndex - 1] = '2';
        str[newIndex - 2] = '%';
        newIndex -= 3;
    } else {
        str[newIndex] = str[oldIndex];
        newIndex--;
    }
}
}

int main() {
    char str[] = "Mr John Smith ";
    int trueLength = 13;
    replaceSpaces(str, trueLength);
    cout << str << endl;
    return 0;
}
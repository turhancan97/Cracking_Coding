#include <iostream>
#include <string>
using namespace std;

bool isUniqueChars(string str) {
    int checker = 0;

    for (int i = 0; i < str.length(); i++) {
        int val = str[i] - 'a';

        if ((checker & (1 << val)) > 0) return false; // already found this character in the string

        checker |= (1 << val);
    }
    return true;
}

int main() {
    string inputString;
    cout << "Enter a string: ";
    cin >> inputString;

    if (isUniqueChars(inputString)) {
        cout << "All characters in the string are unique." << endl;
    }
    else {
        cout << "There are duplicate characters in the string." << endl;
    }
    return 0;
}

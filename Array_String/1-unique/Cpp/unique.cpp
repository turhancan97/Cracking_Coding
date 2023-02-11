#include <iostream>
#include <string>

using namespace std;

bool isUniqueChars(string str) {
    if (str.length() > 128) return false; // Assume ASCII character set

    bool char_set[128] = { false }; // Initialize all elements to false
    for (int i = 0; i < str.length(); i++) {
        int val = str[i];
        if (char_set[val]) return false; // Already found this character in the string

        char_set[val] = true;
    }
    return true;
}

int main() {
    string inputString;
    cout << "Enter a string: ";
    getline(cin, inputString);

    if (isUniqueChars(inputString)) {
        cout << "All characters in the string are unique." << endl;
    } else {
        cout << "There are duplicate characters in the string." << endl;
    }

    return 0;
}

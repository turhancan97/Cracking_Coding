#include <iostream>
using namespace std;

bool checkPermutation(string s, string t) {
    if (s.length() != t.length()) {
        return false;
    }
    int letters[128] = {0};
    for (int i = 0; i < s.length(); i++) {
        letters[s[i]]++;
    }
    for (int i = 0; i < t.length(); i++) {
        letters[t[i]]--;
        if (letters[t[i]] < 0) {
            return false;
        }
    }
    return true; // letters has no neg values, and therefore no pos values either
}

int main() {
    string s, t;
    cout << "Enter the first string: ";
    cin >> s;
    cout << "Enter the second string: ";
    cin >> t;

    if (checkPermutation(s, t)) {
        cout << "The strings are permutations of each other." << endl;
    }
    else {
        cout << "The strings are not permutations of each other." << endl;
    }
    return 0;
}

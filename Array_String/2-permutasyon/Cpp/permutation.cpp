#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

string sortString(string s) {
    sort(s.begin(), s.end());
    return s;
}

bool checkPermutation(string s, string t) {
    if (s.length() != t.length()) {
        return false;
    }
    return sortString(s) == sortString(t);
}

int main() {
    string s,t;
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

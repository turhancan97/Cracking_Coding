#include <iostream>
using namespace std;

bool isSubstring(string str1, string str2) {
    // Check if str2 is a substring of str1
    return str1.find(str2) != string::npos;
}

bool isRotation(string str1, string str2) {
    int len = str1.length();
    /* Check that str1 and str2 are equal length and not empty */
    if (len == str2.length() && len > 0) {
        /* Concatenate str1 and str1 within new buffer */
        string str1str1 = str1 + str1;
        return isSubstring(str1str1, str2);
    }
    return false;
}

int main() {
    string s1 = "waterbottle";
    string s2 = "erbottlewat";

    if (isRotation(s1, s2)) {
        cout << s2 << " is a rotation of " << s1 << endl;
    }
    else {
        cout << s2 << " is not a rotation of " << s1 << endl;
    }

    return 0;
}

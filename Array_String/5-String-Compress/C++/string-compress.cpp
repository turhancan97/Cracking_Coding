#include <iostream>
#include <string>

using namespace std;

string compressBad(string str) {
    string compressedString = "";
    int countConsecutive = 0;
    for (int i = 0; i < str.length(); i++) {
    countConsecutive += 1;

    if (i + 1 >= str.length() || str.at(i) != str.at(i+1)) {
        compressedString += str.at(i) + to_string(countConsecutive);
        countConsecutive = 0;
    }
}
return compressedString.length() < str.length() ? compressedString : str;
}

int main() {
    string str;
    cout << "Enter a string: ";
    cin >> str;
    cout << "Compressed string: " << compressBad(str) << endl;
    return 0;
}
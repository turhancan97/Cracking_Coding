#include <iostream>
#include <string>

using namespace std;

const int NUM_LETTERS = 26;

int getCharNumber(char c) {
    int a = 'a';
    int z = 'z';
    int val = tolower(c);
    if (a <= val && val <= z) {
        return val - a;
    }
    return -1;
}

void buildCharFrequencyTable(string phrase, int *table) {
    for (unsigned int i = 0; i < phrase.length(); i++) {
        int x = getCharNumber(phrase[i]);
        if (x != -1) {
            table[x]++;
        }
    }
}

bool checkMaxOneOdd(int *table) {
    bool foundOdd = false;
    for (int i = 0; i < NUM_LETTERS; i++) {
        if (table[i] % 2 == 1) {
            if (foundOdd) {
                return false;
            }
            foundOdd = true;
        }
    }
    return true;
}

bool isPermutationOfPalindrome(string phrase) {
    int table[NUM_LETTERS] = {0};
    buildCharFrequencyTable(phrase, table);
    return checkMaxOneOdd(table);
}

int main() {
    string phrase;
    cout << "Enter a string: ";
    getline(cin, phrase);
    if (isPermutationOfPalindrome(phrase)) {
        cout << "It's a permutation of a palindrome" << endl;
    } else {
        cout << "It's not a permutation of a palindrome" << endl;
    }
    return 0;
}

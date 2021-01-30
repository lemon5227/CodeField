#include <iostream>

void f(int& num, unsigned long long mod) {
    if (num % mod != num) {
        f(num, mod * mod);
        if (num % mod == 0) {
            num /= mod;
        }
    }
}
bool isUgly(int num) {
    f(num, 2);
    f(num, 3);
    f(num, 5);
    f(num, 7);
    return num == 1;
}

int main() {
    int c, num;
    std::cin >> c;
    while (c--) {
        std::cin >> num;
        std::cout << (isUgly(num) ? "Yes" : "No") << std::endl;
    }
    return 0;
}
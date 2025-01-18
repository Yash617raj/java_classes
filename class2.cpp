#include <iostream>
#include <unordered_map>
using namespace std;

const long long MOD = 1000000007LL;

struct TotalWays {
    long long width1; // Stores the total number of ways with block width 1
    long long width2; // Stores the total number of ways with block width 2

    TotalWays(long long width1, long long width2) : width1(width1), width2(width2) {}
};

unordered_map<long long, TotalWays> dp; // Memoization map

TotalWays solve(long long n) {
    if (n == 1) return TotalWays(1, 1);

    // Memoization
    if (dp.find(n) != dp.end()) {
        return dp[n];
    }

    TotalWays prev = solve(n - 1); // Solve for height n-1
    long long withWidth1 = (prev.width1 * 4 + prev.width2) % MOD;
    long long withWidth2 = (prev.width1 + prev.width2 * 2) % MOD;

    TotalWays res(withWidth1, withWidth2);
    dp[n] = res;
    return res;
}

int main() {
    long long n = 2; // Change this value to test for different heights
    TotalWays res = solve(n);
    cout << (res.width1 + res.width2) % MOD << endl;

    return 0;
}
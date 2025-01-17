#include <bits/stdc++.h>
using namespace std;

int main(){
    long long n;cin>>n;
    vector<long long> arr(n);
    for(auto&it :arr) cin>>it;

    long long sum = 0;

    for(long long i=1;i<n;i++){
        if(arr[i]>arr[i-1]) continue;
        else {
            int diff = arr[i-1] - arr[i];
            sum += diff;
            arr[i] += diff;
        }
    }
    cout<<sum<<endl;
}

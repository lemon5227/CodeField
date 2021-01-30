#include "iostream"
using namespace std;
int main(){

}
int BinarySearch(int a[],int size,int p){
    int L = 0;
    int R = size -1;
    while(L <= R){
        int mid = L+(R-L)/2;
        if(p == a[mid])
            return mid;
        else if(p>a[mid])
            L=mid+1;
        else
            R=mid-1;
    }
    return -1;
}
/*查找比给定整数p小的，
下标最大的元素。找到则返回其下标
，找不到则返回-1*/
int LowerBound(int a[], int size,int p){
    int L = 0;
    int R = size -1;
    int lastPos = -1;
    while(L <= R){
        int mid = L+(R-L)/2;
        if(a[mid]>=p)   
            R = mid-1;
        else
        {
            lastPos = mid;
            L = mid+1;
        }
    }
    return lastPos;
}
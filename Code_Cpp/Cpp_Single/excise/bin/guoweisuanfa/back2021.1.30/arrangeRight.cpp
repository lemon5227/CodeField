#include "iostream"
using namespace std;
int a[10] = {13,27,19,2,8,12,2,8,30,89};
void QuickSort(int a[],int s,int e);
void swap(int &a, int &b) {
    int tmp=a;
    a=b;
    b=tmp;
}
void arrange(int m){
    int i=0,j=9;
    int k=a[0];
    while(i!=j) {
        while(j>i && a[j]>k)
            j--;
        swap(a[i],a[j]);
        while(j>i && a[i]<k)
            i++;
        swap(a[i],a[j]);
    }
    if((10-i)==m)
    return;
    if((10-j)>m){
        QuickSort(a,i+1,9);
    return;  
    }
    if((10-i)<m){
        QuickSort(a,0,i-1);
    return;
    }

}
void QuickSort(int a[],int s,int e){
    int i,j;
    int k=a[s];
    i=s,j=e;
    if(s>=e)
    return;
    while(i!=j) {
        while(j>i && a[j]>k)
            j--;
        swap(a[i],a[j]);
        while(j>i && a[i]<k)
            i++;
        swap(a[i],a[j]);
    }
    QuickSort(a,s,i-1);
    QuickSort(a,i+1,e);    
    return;
}

int main(){
    int c;
    arrange(5);
    for(c=9;c>=5;c--)
        printf("%d ",a[c]);
    cout << endl;
    return 0;
}
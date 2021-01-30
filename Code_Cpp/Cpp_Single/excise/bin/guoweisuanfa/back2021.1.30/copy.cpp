#include"iostream"
#include<stdio.h>
#define max 100050
using namespace std;
int ori[max] = {};
int a[10] = {13,27,19,2,8,12,2,8,30,89};
long long ct = 0;

void count_f(int *start_a, int *end_a, int *start_b, int *end_b){
   int temp[max] = {};
   int i = 0;
   int *a=start_a;
   int *b=start_b;
   while (a<=end_a && b<=end_b){
       if(*a <= *b) temp[i++] = *(a++);
       else {
           ct += (end_a - a + 1);//逆序数
           temp[i++] = *(b++);
       }
   }
   while (a<=end_a) {
       temp[i++] = *(a++);
   }
   while (b<=end_b) {
       temp[i++] = *(b++);
   }
   for(int *j=start_a;j<=end_b;j++)
       *j = temp[j-start_a];
   return ;
}

void Merge_sort(int *start, int *end){//从小到大排列
   if(start<end) {
       int mid;
       mid = (int) (end - start) / 2;
       Merge_sort(start, start + mid);
       Merge_sort(start + mid + 1, end);
       count_f(start, start + mid, start + mid + 1, end);
       return ;
   }
}
int main() {
   Merge_sort(a,a+10-1);
   printf("%lld\n",ct);
   return 0;
}
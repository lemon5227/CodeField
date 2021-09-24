/*
小明同学正在学习一种新的语言。在该语言中，如果出现了一次wa或者一次aw，则代表出现了一个警告。如果出现了连续的wa或者连续的aw，则代表出现了一个错误。小明由于学习比较粗心，所以他想要知道自己刚刚写完的作业中一共出现了多少处警告和错误。下面是小明刚刚写完的作业，请你帮助小明找到他一共出现了多少次警告和多少次错误。

abcwaawawawa中出现了一次警告(wa)和一次错误(awawaw)
abcdefg中没有出现一次警告和错误
waawwaawwawa中出现了四次警告(两次wa和两次aw)和一次错误(wawa)
awawwawa中只出现了两次错误(awaw和wawa)*/
//示例输入在b.txt中
#include<bits/stdc++.h>
using namespace std;
int main(){
    string s1;
    getline(cin,s1);
    //cout << s1.length();
    int wrongs=0,warnings=0;
    int turns=0;
    int j;
    for(int i=0;i<s1.length();i++){
        turns=0;
        if(s1[i]=='a'&& s1[i+1]=='w' || s1[i]=='w'&& s1[i+1]=='a'){
            turns++;
            if(s1[i]=='a'&& s1[i+1]=='w'){
                for(j=2;s1[i+j]=='a'&& s1[i+j+1]=='w';j+=2){
                    turns++;
                }
                i=i+j;
            }
            else{
                for(j=2;s1[i+j]=='w'&& s1[i+j+1]=='a';j+=2){
                    turns++;
                }
                i=i+j;
            }
            i--;
            if(turns==1) warnings++;
            if(turns>1)  wrongs++;
        }
    }
    cout << warnings<< endl;
    cout << wrongs;
}
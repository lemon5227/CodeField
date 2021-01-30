#include "iostream"
#include "cstring"
#include<algorithm>
using namespace std;
bool cmp(int x, int y);
struct documents{
    int grade;
    string name;
    char type_stu;
    string num;
};
string tmp[100000];
int pos[100000];
struct documents GRA[100000];
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
        cin >>  GRA[i].name >> GRA[i].grade >> GRA[i].type_stu >> GRA[i].num;
    int x;
    scanf("%d",&x);
        while(x--){
            int mode;
            scanf("%d",&mode);
            if(mode ==1){
                string str;
                cin >> str;
                for(int i=0;i<n;i++)
                    if(GRA[i].name==str)
                cout << GRA[i].grade <<" " << GRA[i].num <<" "<< GRA[i].type_stu;
                
            }
            if(mode ==2){
                int y;
                int ct=0;
                scanf("%d",&y);
                for(int i=0;i<n;i++)
                    if(y==GRA[i].grade){
                        pos[ct]=ct;
                        tmp[ct++]=GRA[i].name;
                    }
                sort(pos,pos+ct,cmp);
                for(int i=0;i<ct;i++)
                cout << tmp[pos[i]]<<endl;
            }
        }
}

bool cmp(int x, int y) { //按照姓名的字典大小对pos数组进行排序
	return tmp[x]<tmp[y];
}

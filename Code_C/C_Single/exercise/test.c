#include "stdio.h"
#include "string.h"
int main(){
    char a[30];
    struct Book {
        char *bookname;
    };
    struct Book tushu;
    tushu.bookname ="aaa    1";
    scanf("%s",a);
    if(strcmp(tushu.bookname,a)==0){
        printf("yes");
    }
return 0;
    
}
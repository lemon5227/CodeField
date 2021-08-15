#include <stdio.h>
char from_hex(char ch) {
  return isdigit(ch) ? ch - '0' : tolower(ch) - 'a' + 10;
}
int main()
{
    /*char name[10];
    printf("Input your name: ");
    scanf("%s",name);
    printf("Hello,%s,this is your vscode!\n",name);
    return 0;*/
    char input1 = 'M';
    char input2 = '2';
    char str[10];
    str[0] = from_hex(input2) << 4 | from_hex(input1);
    str[1] = '\0';
    printf("%s",str);
}
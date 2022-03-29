
#include <iostream>
using namespace std;

int main(void)
{
	char data[8] = {0x68,0x04, 0x43,0x00,0x00,0x00}; 
	for (int i=0;i<8;i++)
	{
		cout << hex << data[i] << endl;
	}
	
   return 0;
}

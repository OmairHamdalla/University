#include <iostream>
using namespace std;
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
class crew{
	public:
		int id = 10001;
		string role;
};

class passenger{
	public:
		int id = 22100;
		int fee = 100;
};

class ticket{
	public:
		
};

template <typename T>
bool checkCrew(T obj){
	if(obj.id == 10001) return true;
	return false;
}

void print(){
	cout<<"Access granted, Have a good flight!";
}


int main(int argc, char** argv) {
	crew c;
	passenger p;
	int answer;
	
	cout<<"please enter your id\n";
	cin>>answer;
	
	if(check())
	return 0;
}

#include <iostream>
using namespace std;


int static const x = 5;
int static const y = 5;

int matrix[x][y]=  {{0, 5 , 777 , 0 , 22 },
					{0, 2 , 1 , 93 , 16},
					{0, 0, 5 , 0 , 0},
					{3 , 0 , 0 , 0 , 21},
					{1000 , 0 , 4 , 0 , 505}};
					
struct node{
	int value;
	node *next;
};

class linked_list{
	public:
		linked_list(){
			head = NULL;
			tail = NULL;}
			
		void newNode(int);
		void display();
		void creator();
		
	private:
		node *head;
		node *tail;
};


void linked_list::newNode(int num){
			node *temp;
			temp = new node;
			temp->value = num;
			temp->next  = NULL;
			
			if(head == NULL){
				head = temp;
				tail = temp;
			}
			
			else{
				tail->next = temp;
				tail = temp;
			}
}



void linked_list::creator(){
	for (int i=0; i < x; i++){
		for (int j=0 ; j < y ; j++){
			if(matrix[i][j] != 0)  
				newNode(matrix[i][j]);
		}
	}
	display();
}



void linked_list::display(){
	node *temp = head;		
		while(1){				
			cout<< temp->value << " , ";
			if(temp->next == NULL)	break; else temp = temp->next;
		}
}



int main() {
	
	linked_list Array;
	Array.creator();
}

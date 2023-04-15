#include <iostream>
using namespace std;

class Player{
	public:
		Player(int n){healthBar=n;}
		int healthBar;
};

class Enemy{
	public:
		Enemy(int n){healthBar=n;}
		int healthBar;
};

Player player(100);
Player *playerPtr = &player;

Enemy robber(200);
Enemy *robberPtr = &robber;

template <typename T> 
void attack(T& attacked , int damage ){
	attacked->healthBar -= damage;
}

	
int main(int argc, char** argv) {
	cout<<player.healthBar<<"  "<<robber.healthBar<<endl;
	attack(playerPtr,60);
	attack(robberPtr,30);
	cout<<player.healthBar<<"  "<<robber.healthBar<<endl;
}






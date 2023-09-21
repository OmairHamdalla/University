import random
import time

shapes = ['Spade', 'Heart', 'Diamond', 'Club']
values = list(range(1, 15))

random.shuffle(values)

players = []
playerNum = 2

for _ in range(playerNum):
    hand = []
    
    
    for shape in shapes:
        card = random.choice([value for value in values if value not in hand])
        hand.append(card)
    
    while len(hand) < len(shapes):
        card = random.choice(values)
        hand.append(card)

    players.append(hand)

total_values = [sum(player) for player in players]

AI_Player = 0
Player1 = 0

counter = 0

for player in players:
    print(f"Player {'1' if player == players[0] else 'Ai'} cards : {player} ")


for card in range(4):
        if players[0][card] > players[1][card]:
            print(f"AI wins on {shapes[card]}")
            AI_Player = AI_Player + 1

        elif players[0][card] < players[1][card]:
            print(f"Player 1 wins on {shapes[card]}")
            Player1 = Player1 + 1

        elif players[0][card] == players[1][card]:
             print(f"Draw on {shapes[card]}")
        
for player in players: print(f"Player {'Ai' if player == players[0] else '1'} points : {AI_Player if player == players[0] else Player1} ")

if AI_Player == Player1 : print("Its a draw !")
elif Player1 > AI_Player : print("Player 1 is the winner: ")
else: print("AI is the winner: ")


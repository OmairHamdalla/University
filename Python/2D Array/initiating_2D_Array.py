# Create an empty 2D array
array_2d = []

row1 = [1, 2, 3]
array_2d.append(row1)

row2 = [4, 5, 6]
array_2d.append(row2)

print(array_2d[0][1])  # Output: 2
print(array_2d[1][2])  # Output: 6

for row in array_2d:
    print(row)

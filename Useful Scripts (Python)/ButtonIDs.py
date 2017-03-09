names = ""
for x in range(7):
    for y in range(9):
        names+=('"' + 'button' + str(x) + str(y) + '", ')
        
print(names)

f1 = open('ButtonIDs.txt', 'w')
f1.write(str(names))
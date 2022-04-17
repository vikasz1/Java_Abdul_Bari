ops = ["5","-2","4","C","D","9","+","+"]
record = []
for i in range(len(ops)):
    if ops[i].lstrip("-").isnumeric():
        record.append(int(ops[i]))
    elif ops[i] == "C":
        record.pop()
    elif ops[i]=="D":
        record.append(int(record[-1])*2)
    elif ops[i]=="+":
        record.append(int(record[-1])+int(record[-2]))
print(sum(record))
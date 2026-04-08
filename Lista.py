programadores = ['Rosa Alves','Pedro da silva','ana souza','luis pires','Sandra Rios']
salario = [1200, 1345, 9000, 5500, 9000]         
print(type(programadores))
print(len(programadores))
print(programadores[0],salario[0])
print(programadores[1],salario[1]) 
print(programadores[2],salario[2])
print(programadores[3],salario[3]) 
print(programadores[4],salario[4])

maior = max(salario)

for i in range(len(salario)):
    if salario[i] == maior:
        print("Maior Salário", programadores[i], "-", salario[i])
print('\t ---- sequencia de fibonacci ---- ')
termos = int(input("digite a quantidadde de termos para calcular : "))

num1=1 
num2=1
num3=0
contador = 1
while contador <= termos:
    num3 = num1 + num2
    print ( contador, ' ',num1)
    
    
num1 = num2
num2 = num3  
contador += 1 
import math

while True:
    z = float(input('Enter Value: \n'))
    if z > 0.0001:
        break
		
def divide_by_3(x):
	print('Value:',x,'\n')
	while x > 0.0001:
			x = x / 3
			print(x ,' ')
			if x<=0.0001:
				print('completed')
				break

divide_by_3(z)
import math

while True:
    z = float(input('Enter Value: \n'))
    if z > 0.0001:
        break

def divide_by_3(x):
	#if x > 0.0001
	print('Value:',x,'\n')
		while x > 0.0001:
			x = x / 3
			print(x ,' ')
			if x<=0.0001:
				print(“Completed”)
				break

divide_by_3(z)
#Derrick Murphy
#10/24/16
#Programming Languages

#manual sort call reorder(n1)
#1 = ['-1' , '2' ,'-3' ,'4' ,'-5','6']


print('Print numbers in order from negative in front of sequence and positive in rear of sequence \n')

x=0;l1=[]
while x < 7:
	l1.append(input('Enter number:'))
	x+=1

l2 =[]
def reorder(ro):
	count = 0
	index = 0
	while index < len(ro):
		turn = ro[index]
		l2.append(turn)
		index = index + 1
		l2.sort()
		
	print(ro)
	print(l2)

reorder(l1)



#1 = ['-1' , '2' ,'-3' ,'4' ,'-5','6']


print('Print numbers in order from negative in front of sequence and positive in rear of sequence \n')

x=0;l=[]
while x < 7:
	l.append(input('Enter String:'))
	x+=1

l2 =[]
def oneormoredigits(ro):
	count = 0
	count2 = 0
	index = 0
	index2 = 0
	while index < len(ro):
		turn = ro[index]
			while index2 < len(turn):
				q = turn[index2]
					if q == 1 or q == 2 or q == 3 or q == 4 or q == 5 or q == 6 or q == 7 or q == 8 or q == 9 or q == 0 :
						l2.append(turn)
						break
						
				index2 = index2 + 1		
			
		index = index + 1
		
	print(ro)
	print(l2)

oneormoredigits(l)


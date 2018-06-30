#Derrick Murphy
#10/20/16
#Programming Languages

#manual sort call l or l2
#l = ['josh' , 'ben' ,'lawrence' ,'tim' ,'oz','richard']
#l2 = ['123888' , '12' ,'lab17' ,'pi' ,'1,000,000','245']


print('Print containing 3 or Less characters from a list \n')

x=0;wordstr=[]
while x < 6:
	wordstr.append(input('Enter word:'))
	x+=1

newl =[]
def threeorless(less):
	count = 0
	index = 0
	while index < len(less):
		word = less[index]
		#for next in punctuations :
		if len(word) < 4:
			newl.append(word)
		index = index + 1
		
	print(less)
	print(newl)

threeorless(wordstr)


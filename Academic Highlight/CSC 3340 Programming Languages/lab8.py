x=0
y = 0
z = 0
wordstr1=[]
while x < 6:
	wordstr.append(input('Enter word:'))
	x+=1
wordstr2=[]
while y < 2:
	wordstr.append(input('Enter word:'))
	y+=1
wordstr3=[]	
while z < 2:
	wordstr.append(input('Enter word:'))
	z+=1	

for q in wordstr3:
	if q in wordstr1:
	

def threeorless(l):
	count = 0
	index = 0
	while index < len(l):
		word = l[index]
		#for next in punctuations :
		if len(word) < 4:
			newl.append(word)
		index = index + 1
		
	print(l)
	print(newl)

threeorless(wordstr1)
#derrick Murphy
#Midterm


def  vowel (statement):
	count=0
	index=0
	
	while index<len(statement):
		if statement [index] == 'a' or statement [index] == 'e' or statement [index] == 'i' or statement [index] == 'o' or statement [index] == "u" or statement [index] == "y":
			count = count + 1
			count = count +1
		index = index +1
	return count
	
a=input("Enter the word \n")
print(vowel(a))
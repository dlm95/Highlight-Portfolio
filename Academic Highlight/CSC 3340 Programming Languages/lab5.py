import math
import socket


while True:
    p = float(input('Enter Original Investment \n'))
    if p > 0:
        break
    print (p)

while True:
    r = float(input('Enter Annual Interest Rate \n')) / 100
    if r >= 0:
        break
    print (r)

while True:
    n = int(input('Enter years \n'))
    if n > 0 or n< 70:
        break
    print (n)

def calculate(p,r,n):
	a = p( 1 + r ) ** n
	print('Amount you will have in your account is ' , a)

calculate(p,r,n)
.data 
prompt: .asciiz "Please enter the number of customers \n ”
prompt2: .asciiz "Processing Customers \n
prompt3: .asciiz "What is the amount of your purchase \n ” 
prompt4: .asciiz " How much did you pay \n
prompt5: .asciiz "Your change is \n
prompt6: .asciiz "\n **** Goodbye **** \n” 

.text 
	la $a0, prompt 
	li $v0, 4 	
	syscall 	
	
	li $v0,5
	syscall
	
	move $t1,$v0
	
main:
	la $a0, prompt2 	
	li $v0, 4	 
	syscall 

	
	move $a0,$t1

	li $v0,1
	syscall
	
	la $a0,prompt3
	li $v0,4
	syscall
	
	move $t2,$v0

	la $a0, prompt4
	li,$v0,4
	syscall
	
	li $v0,5
	syscall
	
	move $t3,$v0
	
	sub $t2,$t3,$t2
	
	la $a0, prompt5
	li $v0,4
	syscall
	
	move $a0,$t2
	
	li, $v0,1
	syscall
	
	la $a0, prompt6
	li $v0, 4
	syscall
	



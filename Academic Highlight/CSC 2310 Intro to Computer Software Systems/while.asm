.text
main:
	li $t2, 5
	li $t1, 12

L1:  

  	bge  $t1, $t2, EXIT   # branch if ! ( i < k )
  	addi $t3, $t3, 1      # k++
 	add  $t1, $t1, 2    # i = i * 2 
	
	
 	
 	li $v0, 10
 	syscall 
 	
   	j    L1               # jump back to top of loop 
EXIT: 
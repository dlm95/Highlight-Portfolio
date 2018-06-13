.text 
main:
la $a0, Name
la $t0, Thoughts

li $v0, 4
syscall

move $a0, $t0
li $v0, 4
syscall


li $v0, 10
syscall

.data
Name: .asciiz "My name is: Adrian James Williams "
Thoughts: .asciiz "And I am AWESOME!"
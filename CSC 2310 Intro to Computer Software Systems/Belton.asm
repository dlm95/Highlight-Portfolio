.data
prompt1: .asciiz" Total Amount of Purchase: "
prompt2: .asciiz "Amount Customer Paid: "
result: .asciiz "Customers Change: "
end:  .asciiz "\n Have a Great Day!"

.text

main:


    li $v0, 4 #syscall to print string
        la $a0, prompt1  #address of string to print
        syscall

        li $v0, 5 #syscall to read an integer
        syscall
        move $t0, $v0  #move the number to read into $t0

    #second number
    li $v0, 4
    la $a0, prompt2
    syscall

    li $v0,5       
        syscall
    move $t1,$v0
    sub $t2, $t1, $t0 #compute the diff

    #print out diff of $t2
    li $v0, 4
    la $a0, result
    syscall
   li $v0, 1      # load syscall print int into $v0
    move $a0, $t2   #move the number to print into $a0
    syscall


Done:
   li $v0, 4
    la $a0, end
    syscall
    li $v0, 10    #syscall to exit
   
        syscall


.text
li $t0, 0x10010000

RunLoop:
beq $t0, 0x10010013, EndLoop
lb $a0, ($t0)
li $v0, 11
syscall

addi $t0, $t0, 0x01
j RunLoop



EndLoop:
li $v0, 10
syscall

.data
Sentence: .ascii "My Name Is A.J"



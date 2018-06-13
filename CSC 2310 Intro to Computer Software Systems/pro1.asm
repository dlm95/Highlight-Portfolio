#  Becky Caldwell  - CSC 2310
# add.asm – A program that computes the sum of
# 1 and 2 leaving the result in register $t0.
# Registers used:
#             t0 – used to hold the first number
#      t1 – used to hold the second number
#      t2 – used to hold the sum
#      v0 – syscall parameter and return value
#      a0 -  syscall parameter
 
main:                            #SPIM starts execution at main
        # get the first number from user, put into $t0
        # get the second  number from user, put into $t1
 
          li     $t1, 1             # load  1 into $t1
        add $t0, $t1, 2      # compute the sum of $t1 and 2,   and  put it in $t0
         li    $v0, 10          # syscall code 10 is for exit
         syscall                 # make the syscall
# end of add.asm
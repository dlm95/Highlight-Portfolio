111,444,1500
222,555,2000
333,666,2500

Derrick Murphy
CSC 1311
2/9/14

ATM

1.	Start Algorithm
2.	Display Welcome Screen
3.	Allow user to slide card
a.	Simulate card sliding by asking user to enter account number
i.	Check account number against valid account numbers
–	If number is invalid allow three attempts then print error message – Please contact your financial institution
–	If number is valid proceed to Step 4.
4.	Allow user to enter personal identification number (PIN)
a.	Simulate by asking user to enter account number
i.	Check PIN against valid PINs.
–	If number is invalid allow three attempts then print error message – Please contact your financial institution
–	If number is valid proceed to Step 5.
5.	Display the main menu
a.	Balance Inquiry
b.	Fast Cash
c.	Withdrawal 
d.	Deposit
e.	Quit
6.	Allow user to choose from menu – Assume MyATM is an object.
a.	 If choice = a proceed to the method to get the balance  (i.e. MyATM.getBalance()) .  
b.	If choice = b proceed to the method to get the fast cash  (i.e. MyATM.getFastCash()) .  
c.	If choice = c proceed to the method to withdraw cash  (i.e. MyATM.getWithdrawal()) .  
i.	Ask user for amount of withdrawal
ii.	If the balance > withdrawal amount proceed with transaction
–	Subtract withdrawal.
–	Update balance.
iii.	If the balance < withdrawal announce insufficient funds and end transaction
iv.	If the balance = withdrawal amount display warning message about balance and end transaction
d.	If choice = d proceed to the method to accept the deposit (i.e. MyATM.getDeposit()) 
i.	Ask user for amount of deposit
ii.	Update balance
e.	If choice = e proceed to the method to end the transaction(i.e. MyATM.endTranaction()) 
i.	Print receipt if requested
ii.	Print Thank You message to customer
7.	Stop Algorithm


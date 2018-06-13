age(brian, 18).
age(whitney, 23).
age(james, 22).
age(lyssa, 21).
age(lance, 27).
age(brooke, 25).

elegible(Person, can_drink_wine)  :- age(Person, Age),  (Age > 20).


has(jason, car(nissan,2,5750)).
has(aaron, car(ford,5,6200)).
has(whitney, car(toyota,9,2000)).
has(lance, car(mazda,4,4500)).
has(noelle, car(hyundai,11,2800)).
has(brian, car(ford,2,6000)).
has(tiffany, car(chevrolet,5,7000)).
has(lyssa, car(toyota,3,9000)).




person_data(name('Smith', 'John'), date_of_birth(28, feb, 1973),  
  contact_info(address('2615 Amesbury Rd', 'Winston Salem'), 
      tel(7652478), email('smithj@wssu.edu'))).

person_data(name('James', 'Tom'), date_of_birth(1, nov, 1965),  
  contact_info(address('3424 Hause Dr', 'Tigard'), 
      tel(4562131), email('jamest@wssu.edu'))).
	  
person_data(name('Miller', 'Shawn'), date_of_birth(3, mar, 1988),  
  contact_info(address('1234 James Rd', 'Winston Salem'), 
      tel(5345287), email('millers@wssu.edu'))).

person_data(name('Parker', 'Mark'), date_of_birth(7, feb, 1985),  
  contact_info(address('4234 Burns Rd', 'Tigard'), 
      tel(6455478), email('parkerm@wssu.edu'))).

person_data(name('Nicolaysen', 'Anthony'), date_of_birth(24, jan, 1922),  
  contact_info(address('3332 Duck Rd', 'Chicago'), 
      tel(1222331), email('nicolaysena@wssu.edu'))).
	  
person_data(name('Frunza', 'Victor'), date_of_birth(5, dec, 1989),  
  contact_info(address('1332 Thatcher Rd', 'Raliegh'), 
      tel(5325231), email('frunzav@wssu.edu'))).

	  
	  
same_city(City, Lastname, Lastname2) :-   person_data(name(Lastname, Firstname), 
											date_of_birth(_, _, _),  
											contact_info(address(_, City), tel(_), email(_))) ,
											
											person_data(name(Lastname2, Firstname2), 
											date_of_birth(_, _, _),  
											contact_info(address(_, City), tel(_), email(_))),											
											
											Lastname \= Lastname2.
												


											
											
older_than_29(Lastname, Firstname) :- 	person_data(name(Lastname, Firstname), 
											date_of_birth(_, _, Year),  
											contact_info(address(_, _), tel(_), email(_))), (Year < 1977).	

family_name_Smith(Firstname) :-     person_data(name('Smith', Firstname), 
											date_of_birth(_, _, _),  
											contact_info(address(_, _), tel(_), email(_))) .	 									
											
											
											
							



